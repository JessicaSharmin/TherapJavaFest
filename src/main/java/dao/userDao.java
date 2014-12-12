package dao;
import domain.userInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class userDao
{
    private static userDao user;
    private userDao()
    {}
    public static userDao getInstance()
    {
        if(user==null)
            user=new userDao();
        return user;
    }
    public boolean InsertUser(userInfo user) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `userinfo`(`userID`, `userName`, `password`, `mobile`, `email`, `bankName`, `bankAccount`, `flag`) VALUES (?,?,?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getuserID());
            statement.setString(2, user.getuserName());
            statement.setString(3, user.getuserPassword());
            statement.setString(4, user.getuserMobile());
            statement.setString(5, user.getuserEmail());
            statement.setString(6, user.getuserBankName());
            statement.setString(7, user.getuserBankAccountNumber());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) 
            {
                e.printStackTrace();
                JdbcConnection.close(statement);
                return false;
            }
        return true;
    }
    public boolean deleteUser(userInfo user) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `userinfo` SET `flag`=1 WHERE `userID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getuserID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public boolean editUser(userInfo user) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `userinfo` SET `userName`=?,`password`=?,`mobile`=?,`email`=?,`bankName`=?,`bankAccount`=?,`flag`=0 WHERE `userID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getuserName());
            statement.setString(2, user.getuserPassword());
            statement.setString(3, user.getuserMobile());
            statement.setString(4,user.getuserEmail());
            statement.setString(5, user.getuserBankName());
            statement.setString(6,user.getuserBankAccountNumber());
            statement.setString(7,user.getuserID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public userInfo verifyUser(String user_name,String password) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `userID`, `userName`, `password`, `mobile`, `email`, `bankName`, `bankAccount`, `flag` FROM `userinfo` WHERE `userID`=? and `password`=? and `flag`=0";
            System.out.println(user_name);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user_name);
            statement.setString(2, password);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            //User user=new User[100];
            while (resultSet.next()) 
            {
                userInfo user=new userInfo();
                user.setuserID(resultSet.getString("userID"));
                user.setuserPassword("");
                user.setuserMobile(resultSet.getString("mobile"));
                user.setuserEmail(resultSet.getString("email"));
                user.setuserBankName(resultSet.getString("bankName"));
                user.setuserBankAccount(resultSet.getString("bankAccount"));
                user.setuserName(resultSet.getString("userName"));
                  try {  
                    Class.forName("com.mysql.jdbc.Driver");  
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eventplanning?user=root&password=");                     
                }
                catch (SQLException s) 
                {  
                    System.out.println("SQL Exception: "+ s.toString());  
                    return null;
                }  
                catch (ClassNotFoundException cE) 
                {  
                    System.out.println("Class Not Found Exception: "+ cE.toString());  
                    return null;
                }   
                
                return user;
            }
            JdbcConnection.close(statement);
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        return null;
    }
    public boolean userCheck(String user_name) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `userID`, `userName`, `password`, `mobile`, `email`, `bankName`, `bankAccount`, `flag` FROM `userinfo` WHERE `userID`=? and `flag`=0";
            System.out.println(user_name);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user_name);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            //User user=new User[100];
            userInfo user = null;
            while (resultSet.next()) 
            {
                user=new userInfo();
                user.setuserID(resultSet.getString("userID"));
                user.setuserPassword("");
                user.setuserMobile(resultSet.getString("mobile"));
                user.setuserEmail(resultSet.getString("email"));
                user.setuserBankName(resultSet.getString("bankName"));
                user.setuserBankAccount(resultSet.getString("bankAccount"));
                user.setuserName(resultSet.getString("userName"));
                  try {  
                        Class.forName("com.mysql.jdbc.Driver");  
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eventplanning?user=root&password=");                     
                }
                catch (SQLException s) 
                {  
                    System.out.println("SQL Exception: "+ s.toString());  
                    //return false;
                }  
                catch (ClassNotFoundException cE) 
                {  
                    System.out.println("Class Not Found Exception: "+ cE.toString());  
                    //return false;
                }   
                
                        
            }
            JdbcConnection.close(statement);
            if(user==null)
                    return true;
                else
                    return false;
            
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
           
        }
        return false;
    }
}