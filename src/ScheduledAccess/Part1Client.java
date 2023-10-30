package ScheduledAccess;

public class Part1Client {
    public static void main(String[] args) {
        Part1Proxy proxy = new Part1Proxy();
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
