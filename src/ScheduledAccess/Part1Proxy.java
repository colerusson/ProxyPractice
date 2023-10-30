package ScheduledAccess;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

public class Part1Proxy {
    private final Part1RealSubject realSubject;
    public Part1Proxy() {
        this.realSubject = new Part1RealSubject();
    }
    private final int hourLowerBound = 8;
    private final int hourUpperBound = 17;
    private final List<String> allowedDays = List.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY");
    private final LocalDateTime dateTime = LocalDateTime.now();
    private DayOfWeek currentDay = dateTime.getDayOfWeek();
    private int hour = dateTime.getHour();

    public void setCurrentDay(DayOfWeek currentDay) {
        this.currentDay = currentDay;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void doFirstTask() {
        if (this.hour >= this.hourLowerBound && this.hour <= this.hourUpperBound && this.allowedDays.contains(this.currentDay.toString())) {
            this.realSubject.doFirstTask();
        } else {
            throw new RuntimeException("You are not allowed to do this task at this time.");
        }
    }

    public void doSecondTask() {
        if (this.hour >= this.hourLowerBound && this.hour <= this.hourUpperBound && this.allowedDays.contains(this.currentDay.toString())) {
            this.realSubject.doSecondTask();
        } else {
            throw new RuntimeException("You are not allowed to do this task at this time.");
        }
    }

    public void doThirdTask() {
        if (this.hour >= this.hourLowerBound && this.hour <= this.hourUpperBound && this.allowedDays.contains(this.currentDay.toString())) {
            this.realSubject.doThirdTask();
        } else {
            throw new RuntimeException("You are not allowed to do this task at this time.");
        }
    }
}
