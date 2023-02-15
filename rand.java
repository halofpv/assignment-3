public abstract class rand extends Superclass
{

    public abstract int rand();
}

class randPassword extends rand
{
    @Override
    public int rand()
    {
        return (int)(Math.random() * 1000000);

    }
}
class randBank extends rand
{
    @Override
    public int rand()
    {
        return (int)(Math.random() * 10000000);

    }
}

class randID extends rand
{
    @Override
    public int rand()
    {
        return (int) (Math.random() * 100000);
    }
}
class middleCarPrice {
    private int balance;
    public middleCarPrice() { balance = randCarPrice.rCrP.rand(); }
    public void getBalance() {
        System.out.println("Middle cost of our cars: " + balance);
    }
}
class middleClosePrice {
    private int balance;
    public middleClosePrice() { balance = randClosesPrice.rClP.rand(); }
    public void getBalance() {
        System.out.println("Middle cost of closes: " + balance);
    }
}
class middleCarPriceAdapter extends middleCarPrice {
    private middleClosePrice abank;
    public middleCarPriceAdapter(middleClosePrice abank) {
        this.abank = abank;
    }
    public void getBalance() {
        abank.getBalance();
    }
}
//
class middleHomePrice {
    private int balance;
    public middleHomePrice() { balance = randHomePrice.rHP.rand(); }
    public void getBalanc() {
        System.out.println("Furniture cost commonly: " + balance);
    }
}
class middleElectronicPrice {
    private int balance;
    public middleElectronicPrice() { balance = randElectronicsPrice.rEP.rand(); }
    public void getBalanc() {
        System.out.println("You can find electronics by the middle price: " + balance);
    }
}
class PBankAdapter extends middleHomePrice {
    private middleElectronicPrice meprice;
    public PBankAdapter(middleElectronicPrice meprice) {
        this.meprice = meprice;
    }
    public void getBalanc() {
        meprice.getBalanc();
    }
}
//
abstract class randPrice extends rand
{
    public abstract int rand();
}
class randCarPrice extends randPrice
{
    @Override
    public int rand()
    {
        return (int) (Math.random() * 10000000);
    }
}
class randHomePrice extends randPrice
{
    @Override
    public int rand()
    {
        return (int) (Math.random() * 1000000);
    }
}
class randElectronicsPrice extends randPrice
{
    @Override
    public int rand()
    {
        return (int) (Math.random() * 100000);
    }
}
class randClosesPrice extends randPrice
{
    @Override
    public int rand()
    {
        return (int) (Math.random() * 10000);
    }
}
