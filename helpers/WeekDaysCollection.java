package chapter10.helpers;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Lyubka on 10/12/2015.
 * This is helper class
 * Collections are setted here - workdays, daysOfWeeek and weekendDays
 */
public class WeekDaysCollection {
    public static Collection<String> workDays = new <String>ArrayList(); //workdays is a variable from ArrayList containing only string; Collection is the interface; ArrayList is the class that implements the Collection interface
    public static Collection <String> daysOfWeek = new <String>ArrayList();
    public static Collection<String> weekendDays = new <String>ArrayList();


    public static void addDaysToWorkdays(){

        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");

    }
    public static void addDaysToWeekends(){

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");
    }

    public static void addDaysToWeek(){

        addDaysToWorkdays();
        addDaysToWeekends();

        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);
    }


}
