import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.ArrayList;

public class main
{
    public static void logIn()
    {
        outMenu.lm();
        String a = sc.next();
        outMenu.lmn();
        int b = sc.nextInt();
        for(int i = 0; i < 4; i++)
        {
            if(a.equals(cm[i].mail) && (b == cm[i].password))
            {
                outMenu.ac();
                Cabinet(i);
            }
        }
            outMenu.error();
            logIn();
    }
    public static void Cabinet(int i)
    {
        for(int j= 0; j < 4; j++)
        {
            if(j==i)
            {
                System.out.println(cm[i].getter2());
            }
        }
        outMenu.menu();
        System.out.println(cm[i].getter2());
        String menuWord = sc.next();
            if (menuWord.equals("Electronics") || menuWord.equals("electronics")) {
                e.Electro(i);
                Cabinet(i);
            } else if (menuWord.equals("Cars") || menuWord.equals("cars")) {
                cr.cars(i);
                Cabinet(i);
            } else if (menuWord.equals("Home") || menuWord.equals("home")) {
                h.Home(i);
                Cabinet(i);
            } else if (menuWord.equals("Closes") || menuWord.equals("closes")) {
                c.Closes(i);
                Cabinet(i);
            } else if (menuWord.equals("Exit") || menuWord.equals("exit"))
            {
                logIn();
            } else {
                outMenu.errorMenu();
                logIn();
            }
    }
    static consumer[] cm = new consumer[5];
    static Scanner sc = new Scanner(System.in);

    static randPassword rPss = new randPassword();
    static randID rID = new randID();
    static randBank rM = new randBank();
    static randCarPrice rCrP = new randCarPrice();
    static randClosesPrice rClP = new randClosesPrice();
    static randHomePrice rHP = new randHomePrice();
    static randElectronicsPrice rEP = new randElectronicsPrice();

    static Transaction m = new Transaction();
    static electronics e = new electronics();
    static home h = new home();
    static closes c = new closes();
    static cars cr = new cars();

    public static void main(String[] args)
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
        cm[0] = new consumer(rID.rand(), "Roman", "roman@mail", rPss.rand(), rM.rand());
        cm[1] = new consumer(rID.rand(), "Khaknazar", "khaknazar@mail", rPss.rand(), rM.rand());
        cm[2] = new consumer(rID.rand(), "Erlen", "erlen@mail", rPss.rand(), rM.rand());
        cm[3] = new consumer(rID.rand(), "Nurasyl", "nurasyl@mail", rPss.rand(), rM.rand());
        ArrayList<String> list = new ArrayList<String>();
        list.add(cm[0].getter());
        list.add(cm[1].getter());
        list.add(cm[2].getter());
        list.add(cm[3].getter());
        System.out.println(list);
        logIn();
    }
}

