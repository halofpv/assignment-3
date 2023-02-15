import java.text.SimpleDateFormat;
class Clock
{
    private static Clock instance = null;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
    private static java.util.Date currentTime = new java.util.Date();

    private Clock() {}

    public static Clock getInstance()
    {
        if (instance == null)
        {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(java.util.Date time) {
        currentTime = time;
    }

    public static String getTime() {
        return dateFormat.format(currentTime);
    }
}
class Singleton
{
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("Date: 22.02.2023");
    }
}
