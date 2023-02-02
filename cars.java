abstract class carAbstract extends main
{
    public abstract String hondaInf();
    public abstract String ladaInf();
    public abstract String fordInf();
}

public class cars extends carAbstract
{
    public static String honda = "Honda CR-Z";
    public static String lada = "Lada Priora";
    public static String ford = "Ford Fiesta";
    public static double hondaPrice = rCrP.rand();
    public static double ladaPrice = rCrP.rand();
    public static double fordPrice = rCrP.rand();

    @Override
    public String hondaInf()
    {
        String uwq = honda + ": " + hondaPrice;
        return uwq;
    }

    @Override
    public String ladaInf()
    {
        String uwq = lada + ": " + ladaPrice;
        return uwq;
    }

    @Override
    public String fordInf()
    {
        String uwq = ford + ": " + fordPrice;
        return uwq;
    }

    public void cars(int user)
    {
        for(int e = 0; e < 4; e++)
        {
            System.out.println("Find your car mark:");
            String va = sc.next();
            if (va.equals("honda") || va.equals("Honda")) {
                System.out.println(hondaInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user, 1, 4);
                }
                cars(user);
            }
            else if (va.equals("lada") || va.equals("Lada"))
            {
                System.out.println(ladaInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,2, 4);
                }
                cars(user);
            }
            else if (va.equals("ford") || va.equals("Ford"))
            {
                System.out.println(fordInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,3, 4);
                }
                cars(user);
            }
            else if (va.equals("exit") || va.equals("Exit"))
            {
                Cabinet(user);
                break;
            }
            else
            {
                System.out.println("Nothing has been founded");
                cars(user);
                break;
            }
        }
    }
}
