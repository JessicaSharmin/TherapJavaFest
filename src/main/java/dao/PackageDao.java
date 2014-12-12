package dao;
import domain.PackageInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class PackageDao
{
    private static PackageDao Package;
    private PackageDao()
    {}
    public static PackageDao getInstance()
    {
        if(Package==null)
            Package=new PackageDao();
        return Package;
    }
    public  boolean InsertPackage(PackageInfo Package) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `packageinfo`(`packageID`, `placeID`, `foodItem`, `capacity`, `type`, `cost`, `packageDetail`, `flag`) VALUES (?,?,?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, Package.getPackageID());
            statement.setString(2, Package.getplaceID());
            statement.setString(3, Package.getfoodItem());
            statement.setInt(4, Package.getPackageCapacity());
            statement.setDouble(6, Package.getPackageCost());
            statement.setString(7, Package.getPackageDetail());
            statement.setString(5, Package.getPackageType());
            
            
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
    public  boolean deletePackage(PackageInfo Package) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `packageinfo` SET `flag`=1 WHERE `packageID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, Package.getPackageID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editPackage(PackageInfo Package) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `packageinfo` SET `placeID`=?,`foodItem`=?,`capacity`=?,`type`=?,`cost`=?,`packageDetail`=?,`flag`=0 WHERE `packageID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, Package.getplaceID());
            statement.setString(2, Package.getfoodItem());
            statement.setInt(3, Package.getPackageCapacity());
            statement.setString(4, Package.getPackageType());
            statement.setDouble(5,Package.getPackageCost());
            statement.setString(6, Package.getPackageDetail());
            statement.setString(7,Package.getPackageID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  PackageInfo getPackageData(String PackageID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `packageID`, `placeID`, `foodItem`, `capacity`, `type`, `cost`, `packageDetail`, `flag` FROM `packageinfo` WHERE `packageID`=? and `flag`=0";
            System.out.println(PackageID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, PackageID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            PackageInfo Package=null;
            while (resultSet.next()) 
            {
                Package=new PackageInfo();
                Package.setCapacity(resultSet.getInt("capacity"));
                Package.setplaceID(resultSet.getString("placeID"));
                Package.setfoodItem(resultSet.getString("foodItem"));
                Package.setPackageID(resultSet.getString("packageID"));
                Package.setPackageType(resultSet.getString("type"));
                Package.setPackageCost(resultSet.getDouble("cost"));
                Package.setPackageDetails(resultSet.getString("PackageDetail"));
                  
                //return Package;
            }
            
            JdbcConnection.close(statement);
            return Package;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
        }
        return null;
        
    }
    public  PackageInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `packageID`, `placeID`, `foodItem`, `capacity`, `type`, `cost`, `packageDetail`, `flag` FROM `packageinfo` WHERE `flag`=0";
            
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            //statement.setString(1, PackageID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            PackageInfo Package[]=new PackageInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
                Package[i]=new PackageInfo();
                Package[i].setCapacity(resultSet.getInt("capacity"));
                Package[i].setplaceID(resultSet.getString("placeID"));
                Package[i].setfoodItem(resultSet.getString("foodItem"));
                Package[i].setPackageID(resultSet.getString("packageID"));
                Package[i].setPackageType(resultSet.getString("type"));
                Package[i].setPackageCost(resultSet.getDouble("cost"));
                Package[i].setPackageDetails(resultSet.getString("PackageDetail"));
                i++;
            }
            PackageInfo Package1[]=new PackageInfo[i];
            for(int j=0;j<i;j++)
            {
                Package1[j]=Package[j];
            }
            JdbcConnection.close(statement);
            return Package1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
        
        
    }
}