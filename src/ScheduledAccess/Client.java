package ScheduledAccess;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.doFirstTask();
        proxy.doSecondTask();
        proxy.doThirdTask();

        proxy.setCurrentDay(java.time.DayOfWeek.SATURDAY);
        proxy.setHour(18);
        proxy.doFirstTask();
        proxy.doSecondTask();
        proxy.doThirdTask();
    }
}
