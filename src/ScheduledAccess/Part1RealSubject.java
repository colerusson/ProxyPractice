package ScheduledAccess;

import java.util.ArrayList;
import java.util.List;

public class Part1RealSubject implements Part1SubjectInterface {
    @Override
    public void doFirstTask() {
        System.out.println("This is the first task.");
    }

    @Override
    public void doSecondTask() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the second task.");
        }
    }

    @Override
    public void doThirdTask() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        for (Integer integer : list) {
            System.out.println("This is the third task.");
            System.out.print("The current value is: " + integer + "\n");
        }
    }
}
