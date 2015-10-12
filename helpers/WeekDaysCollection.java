package chapter10.helpers;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Lyubka on 10/12/2015.
 * This is helper class
 * Collections are setted here - workdays, daysOfWeeek and weekendDays
 */
public class WeekDaysCollection {
    protected Collection<String> workDays = new <String>ArrayList(); //workdays is a variable from ArrayList containing only string; Collection is the interface; ArrayList is the class that implements the Collection interface
    protected Collection <String> daysOfWeek = new <String>ArrayList();
    protected Collection<String> weekendDays = new <String>ArrayList();


    public void addDaysToWorkdays(){

        this.workDays.add("Monday");
        this.workDays.add("Tuesday");
        this.workDays.add("Wednesday");
        this.workDays.add("Thursday");
        this.workDays.add("Friday");

    }
    public void addDaysToWeekends(){

        this.weekendDays.add("Saturday");
        this.weekendDays.add("Sunday");
    }

    public void addDaysToWeek(){

        addDaysToWorkdays();
        addDaysToWeekends();

        this.daysOfWeek.addAll(workDays);
        this.daysOfWeek.addAll(weekendDays);
    }


}
