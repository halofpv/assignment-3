import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase extends Superclass
{
    public static void dataBase()
    {
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "12345");
            stmt = con.createStatement();

            rs = stmt.executeQuery("select * from example");

            while (rs.next())
                System.out.println(rs.getString("id") + "  "
                        + rs.getString("mail") + "  " + rs.getString("password"));
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println("Exception occurred while closing the connection: " + e.getMessage());
            }
        }
    }
    public void changeinfo(String name) throws SQLException
    {
        final String DB_USERNAME = "postgres"; //З
        final String DB_PASSWORD = "12345";
        final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        String sql = "insert into example (id, mail, password) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, rand.rID.toString());
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, rand.rPss.toString());
        preparedStatement.executeUpdate();
        System.out.println("U have registered");
    }
}
class Cllient {
    private String name;

    public void Cllient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String getName) {
        this.name = name;
    }
    public void changeinfo(String name) throws SQLException
    {
        final String DB_USERNAME = "postgres"; //З
        final String DB_PASSWORD = "12345";
        final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        String sql = "insert into example (id, mail, password) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //for(int i = 0; i < 4; i++)
        //{
        preparedStatement.setString(1, rand.rID.toString());
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, rand.rPss.toString());
        //}
        preparedStatement.executeUpdate();
        System.out.println("U have registered");
    }

}
