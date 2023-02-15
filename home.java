abstract class homeAbstract extends Superclass
{
    public abstract String bedInf();
    public abstract String WardrobeInf();
    public abstract String KitchenInf();
}

public final class home extends homeAbstract
{
    public static String kitchen = "Swedish";
    public static String wardrobe = "Ikea";
    public static String bed = "Chinese";
    public static double kitchenPrice = rHP.rand();
    public static double wardrobePrice = rHP.rand();
    public static double bedPrice = rHP.rand();

    @Override
    public String KitchenInf()
    {
        String uwq = kitchen + " kitchen only. price: " + kitchenPrice;
        return uwq;
    }

    @Override
    public String WardrobeInf()
    {
        String uwq = wardrobe + " wardrobe only. price: " + wardrobePrice;
        return uwq;
    }

    @Override
    public String bedInf()
    {
        String uwq = bed + " bed. price: " + bedPrice;
        return uwq;
    }

    public void Home(int user)
    {
        for(int e = 0; e < 4; e++)
        {
            System.out.println("Find furniture:");
            String va = sc.next();
            if (va.equals("kitchen") || va.equals("Kitchen")) {
                System.out.println(KitchenInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,1, 1);
                }
                Home(user);
            }
            else if (va.equals("wardrobe") || va.equals("Wardrobe"))
            {
                System.out.println(WardrobeInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,2, 1);
                }
                Home(user);
            }
            else if (va.equals("bed") || va.equals("Bed"))
            {
                System.out.println(bedInf());
                out.condition();
                String te = sc.next();
                if(te.equals("Yes") || te.equals("yes"))
                {
                    m.money(user,3, 1);
                }
                Home(user);
            }
            else if (va.equals("exit") || va.equals("Exit"))
            {
                LogIn.Cabinet(user);
                break;
            }
            else
            {
                System.out.println("Nothing has been founded");
                Home(user);
                break;
            }
        }
    }
}



