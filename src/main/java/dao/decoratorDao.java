package dao;
import domain.PackageInfo;
import domain.decorationInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class decoratorDao
{
    private static decoratorDao decorator;
    private decoratorDao()
    {}
    public static decoratorDao getInstance()
    {
        if(decorator==null)
            decorator=new decoratorDao();
        return decorator;
    }
    public  boolean InsertDecorator(decorationInfo decoration) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `decorationinfo`(`decorationID`, `decorationDetails`, `cost`, `decorationType`, `flag`) VALUES (?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, decoration.getdecorationID());
            statement.setDouble(3, decoration.getdecorationCost());
            statement.setString(2, decoration.getdecorationDetail());
            statement.setString(4, decoration.getdecorationType());
            
            
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
    public  boolean deleteDecorator(decorationInfo decoration) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `decorationinfo` SET `flag`=1 WHERE `decorationID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, decoration.getdecorationID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editDecorator(decorationInfo decoration) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `decorationinfo` SET `decorationDetails`=?,`cost`=?,`decorationType`=?,`flag`=0 WHERE `decorationID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            
            statement.setDouble(2, decoration.getdecorationCost());
            statement.setString(1, decoration.getdecorationDetail());
            statement.setString(3, decoration.getdecorationType());
            statement.setString(4,decoration.getdecorationID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  decorationInfo getDecoratorData(String decorationID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `decorationID`, `decorationDetails`, `cost`, `decorationType`, `flag` FROM `decorationinfo` WHERE `flag`=0 and `decorationID`=?";
            System.out.println(decorationID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, decorationID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            decorationInfo decoration=null;
            while (resultSet.next()) 
            {
                decoration=new decorationInfo();
                decoration.setdecorationID(resultSet.getString("decorationID"));
                decoration.setdecorationType(resultSet.getString("decorationType"));
                decoration.setdecorationCost(resultSet.getDouble("cost"));
                decoration.setdecorationDetails(resultSet.getString("decorationDetails"));
                
            }
            JdbcConnection.close(statement);
            return decoration;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
    public  decorationInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `decorationID`, `decorationDetails`, `cost`, `decorationType`, `flag` FROM `decorationinfo` WHERE `flag`=0";
            //System.out.println(decorationID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            //statement.setString(1, decorationID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            decorationInfo decoration[]=new decorationInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
                decoration[i]=new decorationInfo();
                decoration[i].setdecorationID(resultSet.getString("decorationID"));
                decoration[i].setdecorationType(resultSet.getString("decorationType"));
                decoration[i].setdecorationCost(resultSet.getDouble("cost"));
                decoration[i].setdecorationDetails(resultSet.getString("decorationDetails"));
                i++;
                
            }
            decorationInfo decoration1[]=new decorationInfo[i];
            for(int j=0;j<i;j++)
            {
                decoration1[j]=decoration[j];
            }
            JdbcConnection.close(statement);
            return decoration1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
}