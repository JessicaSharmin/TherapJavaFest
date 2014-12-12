package dao;
import domain.queryInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.JdbcConnection;
public class queryDao
{
    private static queryDao query;
    private queryDao()
    {}
    public static queryDao getInstance()
    {
        if(query==null)
            query=new queryDao();
        return query;
    }
    public boolean InsertPlace(queryInfo query) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "INSERT INTO `queryclient`(`queryno`, `userName`, `fullName`, `email`, `subject`, `message`, `flag`) VALUES (?,?,?,?,?,?,0)";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            queryInfo a[]=getQueryForcheckValue() ;
            statement.setInt(1, a.length+1);
            statement.setString(2, query.getclientUsername());
            statement.setString(3, query.getclientName());
            statement.setString(4, query.getemail());
            statement.setString(5, query.getquerySubject());
            statement.setString(6, query.getqueryMessage());
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
    public  boolean deletePlace(queryInfo query) 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try 
        {
            sql = "UPDATE `flag`=1 WHERE `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            JdbcConnection.close(statement);
            } catch (SQLException e) {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return false;
        }
        return true;
    }
    
    public  queryInfo[] getQuery() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `queryno`, `userName`, `fullName`, `email`, `subject`, `message`, `flag` FROM `queryclient` WHERE `flag`=0";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            queryInfo query[]=new queryInfo[100];
            int i=0;
            while (resultSet.next()) 
            {
                query[i]=new queryInfo();
                query[i].setclientName("fullName");
                query[i].setclientUsername("userName");
                query[i].setemail("email");
                query[i].setmessage("message");
                query[i].setquerySubject("subject");
                i++;
               
            }
            int j;
            queryInfo q[]=new queryInfo[i];
            for(j=0;j<i;j++)
            {
                q[j]=query[j];
            }
            JdbcConnection.close(statement);
            
                return q;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
    public  queryInfo[] getQueryForcheckValue() 
    {
        String sql = null;
        PreparedStatement statement = null;
        Connection connection = JdbcConnection.getConnection();
        try {
            sql = "SELECT `queryno`, `userName`, `fullName`, `email`, `subject`, `message`, `flag` FROM `queryclient`";
            statement = connection.prepareStatement(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet;
            resultSet =  statement.executeQuery();
            queryInfo query[]=new queryInfo[100];
            int i=0;
            while (resultSet.next()) 
            {
                query[i]=new queryInfo();
                query[i].setclientName("fullName");
                query[i].setclientUsername("userName");
                query[i].setemail("email");
                query[i].setmessage("message");
                query[i].setquerySubject("subject");
                i++;
                 
            }
            int j;
            queryInfo q[]=new queryInfo[i];
            for(j=0;j<i;j++)
            {
                q[j]=query[j];
            }
            JdbcConnection.close(statement);
            
                return q;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            JdbcConnection.close(statement);
            return null;
        }
    }
}