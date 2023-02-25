import java.sql.SQLException;

public class LogIn extends Superclass
{

    public static void logIn()
    {
        outMenu.lm();
        String a = sc.next();
        if(a.equals("Exit")||a.equals("exit"))
        {
        System.out.println("Stopped");
        return;
        }
        outMenu.lmn();
        int b = sc.nextInt();
        for(int i = 0; i < 10; i++)
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

        System.out.println("Time: " + Clock.getTime());
        singelton.setUp();
        middleCarPrice pbank = new middleCarPrice();
        pbank.getBalance();
        middleCarPriceAdapter abank = new middleCarPriceAdapter(new middleClosePrice());
        abank.getBalance();

        middleHomePrice mhprice = new middleHomePrice();
        mhprice.getBalanc();
        PBankAdapter meprice = new PBankAdapter(new middleElectronicPrice());
        meprice.getBalanc();
        for(int j= 0; j < 100; j++)
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
        }
        else if (menuWord.equals("Cars") || menuWord.equals("cars"))
        {
            cr.cars(i);
            Cabinet(i);
        }
        else if (menuWord.equals("Home") || menuWord.equals("home"))
        {
            h.Home(i);
            Cabinet(i);
        }
        else if (menuWord.equals("Closes") || menuWord.equals("closes"))
        {
            c.Closes(i);
            Cabinet(i);
        }
        else if (menuWord.equals("Exit") || menuWord.equals("exit"))
        {
            logIn();
        }
        else
        {
            outMenu.errorMenu();
            logIn();
        }
    }
}
