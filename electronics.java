abstract class electronicsAbstract extends Superclass//шаблон для класса
{
    public abstract String wireInf();
    public abstract String microshemeInf();
    public abstract String batteryInf();
}

public final class electronics extends electronicsAbstract
{
    public static String wire = "Fat wire";
    public static String microsheme = "Video board";
    public static String battery = "16.8V 100A";
    public static double wirePrice = rEP.rand();
    public static double microshemePrice = rEP.rand();
    public static double batteryPrice = rEP.rand();


    public String wireInf()
    {
        String uwq = wire + ": " + wirePrice;
        return uwq;
    }

    @Override
    public String microshemeInf()
    {
        String uwq = microsheme + ": " + microshemePrice;
        return uwq;
    }

    @Override
    public String batteryInf()
    {
        String uwq = battery + ": " + batteryPrice;
        return uwq;
    }

    public void Electro(int user)
    {
        for(int e = 0; e < 4; e++)
        {
            System.out.println("Find your electronic component:");
            String va = sc.next();
            if (va.equals("wire") || va.equals("Wire")) {
                System.out.println(wireInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user, 1,3);
                }
                Electro(user);
            }
            else if (va.equals("microsheme") || va.equals("Microsheme"))
            {
                System.out.println(microshemeInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user, 2, 3);
                }
                Electro(user);
            }
            else if (va.equals("battery") || va.equals("Battery"))
            {
                System.out.println(batteryInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user, 3, 3);
                }
                Electro(user);
            }
            else if (va.equals("exit") || va.equals("Exit"))
            {
                LogIn.Cabinet(user);
                break;
            }
            else
            {
                System.out.println("Nothing has been founded");
                Electro(user);
                break;
            }
        }
    }
}
