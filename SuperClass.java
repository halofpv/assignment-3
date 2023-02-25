import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class Superclass
{
    static int Num;
    public static void main(String[] args) throws SQLException {

        ArrayList<String> list = new ArrayList<String>();

         Num = sc.nextInt();
        for(int userNum = 0; userNum < Num; userNum++)
        {
            String name = sc.next();
            Cllient c1 = new Cllient();
            cm[userNum] = new consumer(rID.rand(), name, getLow(name) + "@mail", rPss.rand(), rM.rand());
            c1.changeinfo(cm[userNum].ID, name, cm[userNum].password);
            System.out.println("Do you want to change your data?");
            String fdswe = sc.next();
            if(fdswe.equals("Yes")||fdswe.equals("yes"))
            {
                System.out.println("Input new id, name and password: ");
                cm[userNum].ID = sc.nextInt();
                cm[userNum].name = sc.next();
                cm[userNum].password = sc.nextInt();
                DataBase.updateuser(cm[userNum].ID, cm[userNum].name, cm[userNum].password, userNum);
            }
            list.add(cm[userNum].getter());
            DataBase.dataBase();
            DataBase.deleteuser(cm[userNum].ID, name, cm[userNum].password);
        }
        System.out.println(list);
        LogIn.logIn();
    }
    private static String getLow(String n)
    {
        return n.toLowerCase();
    }
    static Singleton singelton = Singleton.getInstance();
    static consumer[] cm = new consumer[10];
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
}
