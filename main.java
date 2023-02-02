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
        if(a.equals(cm[0].mail) && (b == cm[0].password))
        {
            outMenu.ac();
            Cabinet(0);
        }
        else if(a.equals(cm[1].mail) && (b == cm[1].password))
        {
            outMenu.ac();
            Cabinet(1);
        }
        else if(a.equals(cm[2].mail) && (b == cm[2].password))
        {
            outMenu.ac();
            Cabinet(2);
        }
        else if(a.equals(cm[3].mail) && (b == cm[3].password))
        {
            outMenu.ac();
            Cabinet(3);
        }
        else
        {
            outMenu.error();
            logIn();
        }
    }
    public static void Cabinet(int i)
    {
        if (i == 0)
        {
            System.out.println(cm[0].getter2());
        }
        else if (i == 1)
        {
            System.out.println(cm[1].getter2());
        }
        else if (i == 2)
        {
            System.out.println(cm[2].getter2());
        }
        else if (i == 3)
        {
            System.out.println(cm[3].getter2());
        }

        outMenu.menu();
        System.out.println(cm[i].getter2());
        String menuWord = sc.next();
        for (int j = 0; j < 4; j++)
        {
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
