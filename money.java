public abstract class money extends Superclass
{
    public abstract void money(int fsdfgdfs, int efdsdgs, int rfdsgdsf);
}
final class Transaction extends money
{
    @Override
    public void money(int num, int predmet, int category)
    {
        for (int y = 1; y <= 4; y++)
        {
            if (category == 1)
            {
                if (predmet == 1)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.kitchenPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                } else if (predmet == 2)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.wardrobePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                } else if (predmet == 3)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.wardrobePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                }
            } else if (category == 2) {
                if (predmet == 1)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.jacketPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                } else if (predmet == 2)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.tShirtPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                } else if (predmet == 3)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.sneakersPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                }
            } else if (category == 3) {
                if (predmet == 1)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.wirePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                } else if (predmet == 2)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.microshemePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                } else if (predmet == 3)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.batteryPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                }
            } else if (category == 4) {
                if (predmet == 1)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= cars.hondaPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    cr.cars(num);
                } else if (predmet == 2)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.microshemePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                } else if (predmet == 3)
                {
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.batteryPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                }
            }
        }
    }
}
