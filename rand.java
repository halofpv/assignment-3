public abstract class rand extends main
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
//ниже в комментарри создавались рандомные цены в магазине, но не очень хочется чтобы мебель стоила по цене автомобиля, не так ли?
/*class randPrice extends rand
{
    @Override
    public int rand()
    {
        int a = (int)(Math.random() * 10000000);
        return a;
    }
}*/
//поэтому ниже создан абстрактный класс рандомных цен
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
