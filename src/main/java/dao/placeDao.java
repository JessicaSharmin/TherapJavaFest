package dao;
import domain.PackageInfo;
import domain.placeInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class placeDao
{
    private static placeDao place;
    private placeDao()
    {}
    public static placeDao getInstance()
    {
        if(place==null)
            place=new placeDao();
        return place;
    }
    public boolean InsertPlace(placeInfo place) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `placeinfo`(`placeID`, `placeName`, `placeType`, `placeCost`, `placeDetails`, `placeCapacity`, `flag`) VALUES (?,?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, place.getplaceID());
            statement.setString(2, place.getplaceName());
            statement.setDouble(4, place.getplaceCost());
            statement.setString(5, place.getplaceDetail());
            statement.setInt(6, place.getplaceCapacity());
            statement.setString(3, place.getplaceType());
            
            
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
    public  boolean deletePlace(placeInfo place) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `placeinfo` SET `flag`=1 WHERE `placeID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, place.getplaceID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editPlace(placeInfo place) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `placeinfo` SET `placeName`=?,`placeType`=?,`placeCost`=?,`placeDetails`=?,`placeCapacity`=?,`flag`=0 WHERE `placeID`=?";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, place.getplaceName());
            statement.setDouble(3, place.getplaceCost());
            statement.setString(4, place.getplaceDetail());
            statement.setInt(5,place.getplaceCapacity());
            statement.setString(2, place.getplaceType());
            statement.setString(6,place.getplaceID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  placeInfo getPlaceData(String placeID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `placeID`, `placeName`, `placeCost`, `placeDetails`, `placeCapacity`, `placeType`, `flag` FROM `placeinfo` WHERE `placeID`=? and `flag`=0";
            System.out.println(placeID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, placeID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            while (resultSet.next()) 
            {
                placeInfo place=new placeInfo();
                place.setplaceID(resultSet.getString("placeID"));
                place.setplaceType(resultSet.getString("placeType"));
                place.setplaceCost(resultSet.getDouble("placeCost"));
                place.setplaceDetails(resultSet.getString("placeDetails"));
                place.setplaceCapacity(resultSet.getInt("placeCapacity"));
                place.setplaceName(resultSet.getString("placeName"));
                  try {  
                    Class.forName("com.mysql.jdbc.Driver");  
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eventplanning?place=root&password=");                     
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
                
                return place;
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
    public  placeInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `placeID`, `placeName`, `placeCost`, `placeDetails`, `placeCapacity`, `placeType`, `flag` FROM `placeinfo` WHERE `flag`=0";
           // System.out.println(placeID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            //statement.setString(1, placeID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            placeInfo place[]=new placeInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
                place[i]=new placeInfo();
                place[i].setplaceID(resultSet.getString("placeID"));
                place[i].setplaceType(resultSet.getString("placeType"));
                place[i].setplaceCost(resultSet.getDouble("placeCost"));
                place[i].setplaceDetails(resultSet.getString("placeDetails"));
                place[i].setplaceCapacity(resultSet.getInt("placeCapacity"));
                place[i].setplaceName(resultSet.getString("placeName"));
                  i++;
            }
            placeInfo place1[]=new placeInfo[i];
            for(int j=0;j<i;j++)
            {
                place1[j]=place[j];
            }
            JdbcConnection.close(statement);
            return place1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
}