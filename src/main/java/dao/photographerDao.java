package dao;
import domain.foodInfo;
import domain.photographerInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class photographerDao
{
    private static photographerDao photographer;
    private photographerDao()
    {}
    public static photographerDao getInstance()
    {
        if(photographer==null)
            photographer=new photographerDao();
        return photographer;
    }
    public  boolean InsertPhotographer(photographerInfo photographer) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `photographerinfo`(`photographerID`, `photographerName`, `costPerHour`, `type`, `photographerDetail`, `flag`) VALUES (?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, photographer.getphotographerID());
            statement.setString(2, photographer.getphotographerName());
            statement.setDouble(3, photographer.getphotographerCost());
            statement.setString(5, photographer.getphotographerDetail());
            statement.setString(4, photographer.getphotographerType());
            
            
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
    public  boolean deletePhotographer(photographerInfo photographer) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `photographerinfo` SET `flag`=1 WHERE `photographerID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, photographer.getphotographerID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editPhotographer(photographerInfo photographer) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `photographerinfo` SET `photographerName`=?,`costPerHour`=?,`type`=?,`photographerDetail`=?,`flag`=0 WHERE `photographerID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, photographer.getphotographerName());
            statement.setDouble(2, photographer.getphotographerCost());
            statement.setString(4, photographer.getphotographerDetail());
            statement.setString(3, photographer.getphotographerType());
            statement.setString(5,photographer.getphotographerID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  photographerInfo getPhotographerData(String photographerID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `photographerID`, `photographerName`, `costPerHour`, `type`, `photographerDetail`, `flag` FROM `photographerinfo` WHERE `photographerID`=? and `flag`=0";
            System.out.println(photographerID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, photographerID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            photographerInfo photographer=null;
            while (resultSet.next()) 
            {
                photographer=new photographerInfo();
                photographer.setphotographerID(resultSet.getString("photographerID"));
                photographer.setphotographerType(resultSet.getString("type"));
                photographer.setphotographerCost(resultSet.getDouble("costPerHour"));
                photographer.setphotographerDetails(resultSet.getString("photographerDetail"));
                photographer.setphotographerName(resultSet.getString("photographerName"));
                  
                //return photographer;
            }
            
            JdbcConnection.close(statement);
            return photographer;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        
        
    }
    public  photographerInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `photographerID`, `photographerName`, `costPerHour`, `type`, `photographerDetail`, `flag` FROM `photographerinfo` WHERE `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            photographerInfo photographer[]=new photographerInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
                photographer[i]=new photographerInfo();
                photographer[i].setphotographerID(resultSet.getString("photographerID"));
                photographer[i].setphotographerType(resultSet.getString("type"));
                photographer[i].setphotographerCost(resultSet.getDouble("costPerHour"));
                photographer[i].setphotographerDetails(resultSet.getString("photographerDetail"));
                photographer[i].setphotographerName(resultSet.getString("photographerName"));
                  i++;
                //return photographer;
            }
            photographerInfo photographer1[]=new photographerInfo[i];
            for(int j=0;j<i;j++)
            {
                photographer1[j]=photographer[j];
            }
            JdbcConnection.close(statement);
            return photographer1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        
        
    }
}