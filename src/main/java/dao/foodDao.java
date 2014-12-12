package dao;
import domain.foodInfo;
import domain.foodInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class foodDao
{
    private static foodDao food;
    private foodDao()
    {}
    public static foodDao getInstance()
    {
        if(food==null)
            food=new foodDao();
        return food;
    }
    public  boolean InsertFood(foodInfo food) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `foodinfo`(`foodID`, `foodName`, `foodType`, `cost`, `foodDetails`, `flag`) VALUES (?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, food.getfoodID());
            statement.setString(2, food.getfoodName());
            statement.setDouble(4, food.getfoodCost());
            statement.setString(5, food.getfoodDetail());
            statement.setString(3, food.getfoodType());
            
            
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
    public  boolean deleteFood(foodInfo food) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `foodinfo` SET `flag`=1 WHERE `foodID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, food.getfoodID());
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  boolean editFood(foodInfo food) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `foodinfo` SET `foodName`=?,`foodType`=?,`cost`=?,`foodDetails`=?,`flag`=0 WHERE `foodID`=? and `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, food.getfoodName());
            statement.setDouble(3, food.getfoodCost());
            statement.setString(4, food.getfoodDetail());
            statement.setString(2, food.getfoodType());
            statement.setString(5,food.getfoodID());
            
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    public  foodInfo getFoodData(String foodID) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `foodID`, `foodName`, `foodType`, `cost`, `foodDetails`, `flag` FROM `foodinfo` WHERE `flag`=0 and `foodID`=?";
            System.out.println(foodID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.setString(1, foodID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            foodInfo food=null;
            while (resultSet.next()) 
            {
                food=new foodInfo();
                food.setfoodID(resultSet.getString("foodID"));
                food.setfoodType(resultSet.getString("foodType"));
                food.setfoodCost(resultSet.getDouble("cost"));
                food.setfoodDetails(resultSet.getString("foodDetails"));
                food.setfoodName(resultSet.getString("foodName"));
                
            }
            JdbcConnection.close(statement);
            return food;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
    public  foodInfo[] getData() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `foodID`, `foodName`, `foodType`, `cost`, `foodDetails`, `flag` FROM `foodinfo` WHERE `flag`=0";
            //System.out.println(foodID);
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            //statement.setString(1, foodID);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            foodInfo food[]=new foodInfo[1000];
            int i=0;
            while (resultSet.next()) 
            {
                food[i]=new foodInfo();
                food[i].setfoodID(resultSet.getString("foodID"));
                food[i].setfoodType(resultSet.getString("foodType"));
                food[i].setfoodCost(resultSet.getDouble("cost"));
                food[i].setfoodDetails(resultSet.getString("foodDetails"));
                food[i].setfoodName(resultSet.getString("foodName"));
                i++;
            }
            foodInfo food1[]=new foodInfo[i];
            for(int j=0;j<i;j++)
            {
                food1[j]=food[j];
            }
            JdbcConnection.close(statement);
            return food1;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
}