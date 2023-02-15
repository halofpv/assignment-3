abstract class closesAbstract extends Superclass
{
    public abstract String jacketInf();
    public abstract String tShirtInf();
    public abstract String sneakersInf();
}

public final class closes extends closesAbstract
{
    public static String jacket = "Italian jacket";
    public static String tShirt = "White T- shirt";
    public static String sneakers = "Old school sneackers";
    public static double jacketPrice = rClP.rand();
    public static double tShirtPrice = rClP.rand();
    public static double sneakersPrice = rClP.rand();

    @Override
    public String jacketInf()
    {
        String uwq = jacket + ". price: " + jacketPrice;
        return uwq;
    }

    @Override
    public String tShirtInf()
    {
        String uwq = tShirt + "only. price: " + tShirtPrice;
        return uwq;
    }

    @Override
    public String sneakersInf()
    {
        String uwq = sneakers + ". price: " + sneakersPrice;
        return uwq;
    }
    public void Closes(int user)
    {
        for(int e = 0; e < 4; e++)
        {
            System.out.println("Find your close:");
            String va = sc.next();
            if (va.equals("jacket") || va.equals("Jacket")) {
                System.out.println(jacketInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,1, 2);
                }
                c.Closes(user);
            }
            else if (va.equals("t-shirt") || va.equals("T-shirt"))
            {
                System.out.println(tShirtInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,2, 2);
                }
                c.Closes(user);
            }
            else if (va.equals("sneakers") || va.equals("Sneakers"))
            {
                System.out.println(sneakersInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user, 3, 2);
                }
                c.Closes(user);
            }
            else if (va.equals("exit") || va.equals("Exit"))
            {
                LogIn.Cabinet(user);
                break;
            }
            else
            {
                System.out.println("Nothing has been founded");
                Closes(user);
                break;
            }
        }
    }
}
