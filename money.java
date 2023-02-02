public abstract class money extends main
{
    public abstract void money(int fsdfgdfs, int efdsdgs, int rfdsgdsf);
}
final class Transaction extends money
{
    @Override
    public void money(int num, int predmet, int category)
    {
        for (int y = 1; y <= 4; y++) {
            if (category == 1)
            {
                if (predmet == 1)
                {
                    if(cm[num].bank<home.kitchenPrice)
                    {
                        out.errorM();
                        h.Home(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.kitchenPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                } else if (predmet == 2)
                {
                    if(cm[num].bank<home.wardrobePrice)
                    {
                        out.errorM();
                        h.Home(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.wardrobePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                } else if (predmet == 3)
                {
                    if(cm[num].bank<home.bedPrice)
                    {
                        out.errorM();
                        h.Home(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= home.bedPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    h.Home(num);
                }
            } else if (category == 2) {
                if (predmet == 1)
                {
                    if(cm[num].bank<closes.jacketPrice)
                    {
                        out.errorM();
                        c.Closes(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.jacketPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                } else if (predmet == 2)
                {
                    if(cm[num].bank<closes.tShirtPrice)
                    {
                        out.errorM();
                        c.Closes(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.tShirtPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                } else if (predmet == 3)
                {
                    if(cm[num].bank<closes.sneakersPrice)
                    {
                        out.errorM();
                        c.Closes(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= closes.sneakersPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    c.Closes(num);
                }
            } else if (category == 3) {
                if (predmet == 1)
                {
                    System.out.println(rCrP.rand());
                    if(cm[num].bank<electronics.wirePrice)
                    {
                        out.errorM();
                        e.Electro(num);
                    }
                    out.waiting();
                    cm[num].bank -= electronics.wirePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                } else if (predmet == 2)
                {
                    if(cm[num].bank<electronics.microshemePrice)
                    {
                        out.errorM();
                        e.Electro(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.microshemePrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                } else if (predmet == 3)
                {
                    if(cm[num].bank<electronics.batteryPrice)
                    {
                        out.errorM();
                        e.Electro(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= electronics.batteryPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    e.Electro(num);
                }
            } else if (category == 4) {
                if (predmet == 1)
                {
                    if(cm[num].bank<cars.hondaPrice)
                    {
                        out.errorM();
                        cr.cars(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= cars.hondaPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    cr.cars(num);
                } else if (predmet == 2)
                {

                    if(cm[num].bank<cars.ladaPrice)
                    {
                        out.errorM();
                        cr.cars(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= cars.ladaPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    cr.cars(num);
                } else if (predmet == 3)
                {
                    if(cm[num].bank<cars.fordPrice)
                    {
                        out.errorM();
                        cr.cars(num);
                    }
                    out.waiting();
                    System.out.println(rCrP.rand());
                    cm[num].bank -= cars.fordPrice;
                    System.out.println("Your cash: " + cm[num].bank);
                    cr.cars(num);
                }
            }
        }
    }
}
