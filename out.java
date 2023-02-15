public interface out
{
    static void waiting()
    {
        System.out.println("Transaction in process...");
        System.out.print("Thank you! Wait a delivery. Your post code is: ");
    }
    static void condition()
    {
        System.out.println("Do you want buy this?");
        System.out.println(">Yes");
        System.out.println(">No");
    }
    static void cancel()
    {
        System.out.println("Purchase has been declined");
    }
    static void car()
    {
        System.out.println("Find your car below: ");
    }
}
