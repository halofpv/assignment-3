import java.text.SimpleDateFormat;
class Clock
{
    private static Clock instance = null;//статическая переменная instance хранит экземпляр класса
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
    private static java.util.Date currentTime = new java.util.Date();

    private Clock() {}

    public static Clock getInstance()//метод getInstance гарантирует что экземпляр единственный
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
