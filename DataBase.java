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
    public static void changeinfo(String id, String name, String password) throws SQLException
    {
        final String DB_USERNAME = "postgres"; //З
        final String DB_PASSWORD = "12345";
        final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        String sql = "insert into example (id, mail, password) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, String.valueOf(id));
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, String.valueOf(password));

                preparedStatement.executeUpdate();
    }
    public static void updateuser(int id, String name, int password, int n) throws SQLException
    {
        final String DB_USERNAME = "postgres";
        final String DB_PASSWORD = "12345";
        final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Statement statement = connection.createStatement();
        String SQL_SELECT_PERSON = "select * from example";
        ResultSet result = statement.executeQuery(SQL_SELECT_PERSON);
        while (result.next())
        {
            String login = result.getString("id");
            String pass = result.getString("mail");
            String id1 = result.getString("password");
                String updateSql = "UPDATE example SET id = ?, mail = ?, password = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql))
                {
                    preparedStatement.setString(1, String.valueOf(cm[n].ID));
                    preparedStatement.setString(2, name);
                    preparedStatement.setString(3, String.valueOf(cm[n].password));
                    preparedStatement.executeUpdate();
                }

        }
    }
    public static void deleteuser(int id, String name, int password) throws SQLException {
        final String DB_USERNAME = "postgres";
        final String DB_PASSWORD = "12345";
        final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Statement statement = connection.createStatement();
        String SQL_SELECT_PERSON = "select * from example";
        ResultSet result = statement.executeQuery(SQL_SELECT_PERSON);

        while (result.next())
        {
                String id1 =result.getString("id");

                String deleteSql = "delete from example where id = ? and mail = ? and password = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setString(1, "111");
            preparedStatement.setString(2, "111");
            preparedStatement.setString(3, "111");
            preparedStatement.executeUpdate();

            preparedStatement.executeUpdate();
                System.out.println("The User has deleted.");
        }
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
    public void changeinfo(int ID, String name, int password) throws SQLException
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
    }
}
