public class consumer
{
    public int ID;
    public String name;
    public String mail;
    public int password;
    public double bank;
    public consumer(int id_, String name_, String mail_, int password_, double bank_)
    {
        ID = id_;
        name = name_;
        mail = mail_;
        password = password_;
        bank = bank_;
    }
    public String getter()
    {
        return "ID: " + ID + " - eMail: " + mail + " Password: " + password + "\n";
    }
    public String getter2()
    {
        String gt = "You are logged as: " + name;
        String ut = "\nYour bank account: " + bank;
        return gt + ut;
    }
}
