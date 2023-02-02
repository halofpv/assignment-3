public interface outMenu {
    static void menu()
    {
        System.out.println("This is your catalog");
        System.out.println("\nPlease, choose an option below: ");
        System.out.println(">\nElectronics");
        System.out.println(">Closes");
        System.out.println(">Home");
        System.out.println(">Cars");
        System.out.println(">Exit");
    }
    static void lmn()
    {
        System.out.println("Your password:");
    }
    static void ac()
    {
        System.out.println("Accessed!");
    }
    static void error()
    {
        System.out.println("Error! Please try it again.");
    }
    static void errorMenu()
    {
        System.out.println("You were logged out due to suspicious actions");
    }
    static void lm()
    {
        System.out.println("Welcome to eMarket");
        System.out.println("Your eMail:");
    }
}
