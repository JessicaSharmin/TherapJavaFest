package dao;
import domain.PackageInfo;
import domain.transportInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class transportDao
{
    private static transportDao transport;
    private transportDao()
    {}
    public static transportDao getInstance()
    {
        if(transport==null)
            transport=new transportDao();
        return transport;
    }
    public  boolean InsertTransport(transportInfo transport) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `transportinfo`(`transportID`, `transportName`, `costPerTransport`, `transportDetails`, `transportCapacity`, `transportType`, `flag`) VALUES (?,?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, transport.gettransportID());
            statement.setString(2, transport.gettransportName());
            statement.setDouble(3, transport.gettransportCost());
            statement.setString(4, transport.gettransportDetail());
            statement.setInt(5, transport.gettransportCapacity());
            statement.setString(6, transport.gettransportType());
            
            
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
    public  boolean deleteTransport(transportInfo transport) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `transportinfo` SET `flag`=1 WHERE `transportID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, transport.gettransportID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editTransport(transportInfo transport) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `transportinfo` SET `transportName`=?,`costPerTransport`=?,`transportDetails`=?,`transportCapacity`=?,`transportType`=?,`flag`=0 WHERE `transportID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, transport.gettransportName());
            statement.setDouble(2, transport.gettransportCost());
            statement.setString(3, transport.gettransportDetail());
            statement.setInt(4,transport.gettransportCapacity());
            statement.setString(5, transport.gettransportType());
            statement.setString(6,transport.gettransportID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  transportInfo getTransportData(String transportID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `transportID`, `transportName`, `costPerTransport`, `transportDetails`, `transportCapacity`, `transportType`, `flag` FROM `transportinfo` WHERE `transportID`=? and `flag`=0";
            System.out.println(transportID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, transportID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            transportInfo transport=null;
            while (resultSet.next()) 
            {
                transport=new transportInfo();
                transport.settransportID(resultSet.getString("transportID"));
                transport.settransportType(resultSet.getString("transportType"));
                transport.settransportCost(resultSet.getDouble("costPerTransport"));
                transport.settransportDetails(resultSet.getString("transportDetails"));
                transport.settransportCapacity(resultSet.getInt("transportCapacity"));
                transport.settransportName(resultSet.getString("transportName"));
                  
                //return transport;
            }
            
            JdbcConnection.close(statement);
            return transport;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        
        
    }
    public  transportInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `transportID`, `transportName`, `costPerTransport`, `transportDetails`, `transportCapacity`, `transportType`, `flag` FROM `transportinfo` WHERE `flag`=0";
            //System.out.println(transportID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            //statement.setString(1, transportID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            transportInfo transport[]=new transportInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
             transport[i]=new transportInfo();   
                transport[i].settransportID(resultSet.getString("transportID"));
                transport[i].settransportType(resultSet.getString("transportType"));
                transport[i].settransportCost(resultSet.getDouble("costPerTransport"));
                transport[i].settransportDetails(resultSet.getString("transportDetails"));
                transport[i].settransportCapacity(resultSet.getInt("transportCapacity"));
                transport[i].settransportName(resultSet.getString("transportName"));
                i++;
                  
                //return transport;
            }
            transportInfo transport1[]=new transportInfo[i];
            for(int j=0;j<i;j++)
            {
                transport1[j]=transport[j];
            }
            JdbcConnection.close(statement);
            return transport1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        
        
    }
}