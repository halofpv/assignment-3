import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
}
