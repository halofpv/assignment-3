import java.util.Scanner;
import java.util.ArrayList;

public class Superclass
{
    public static void main(String[] args)
    {
        DataBase.dataBase();
        ArrayList<String> list = new ArrayList<String>();

        int Num = sc.nextInt();
        for(int userNum = 0; userNum < Num; userNum++)
        {
            String name = sc.next();
            cm[userNum] = new consumer(rID.rand(), name, getLow(name) + "@mail", rPss.rand(), rM.rand());
            list.add(cm[userNum].getter());
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
