package dao;

import domain.bookingInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.JdbcConnection;

public class bookingDao 
{
    private static bookingDao booking;
    private bookingDao()
    {}
    public static bookingDao getInstance()
    {
        if(booking==null)
            booking=new bookingDao();
        return booking;
    }
    public  boolean InsertDecorator(bookingInfo booking) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `bookinginfo`(`bookingID`, `placeID`, `photographerID`, `foodID`, `packageID`, `transportID`, `DecorationID`, `userID`, `bookingDate`, `startTime`, `endTime`, `cost`, `flag`, `type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,0,?)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, booking.getbookingID());
            statement.setString(2, booking.getPlaceID());
            statement.setString(3, booking.getphotographerID());
            statement.setString(4, booking.getfoodID());
            statement.setString(5, booking.getpackageID());
            statement.setString(6, booking.gettransportID());
            statement.setString(7, booking.getdecorationID());
            statement.setString(8, booking.getuserID());
            statement.setString(9, booking.getDate());
            statement.setString(10, booking.getstartDate());
            statement.setString(11, booking.getEndDate());
            statement.setDouble(12, booking.getbookingCost());
            statement.setString(13, booking.getType());
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
    public int bookingIDgeneration()
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        int length = -1;
        try 
        {
            sql = "SELECT `bookingID`, `placeID`, `photographerID`, `foodID`, `packageID`, `transportID`, `DecorationID`, `userID`, `bookingDate`, `startTime`, `endTime`, `cost`, `flag`, `type` FROM `bookinginfo`";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            length=0;
             while (resultSet.next())
             {
                 length++;
             }
             } catch (SQLException ex) {
            Logger.getLogger(bookingDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            JdbcConnection.close(statement);
            
        
    return length;
    }
    
}
