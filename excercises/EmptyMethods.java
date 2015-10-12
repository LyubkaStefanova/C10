package chapter10.excercises;

import chapter10.helpers.WeekDaysCollection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lyubka on 10/12/2015.
 */
public class EmptyMethods extends WeekDaysCollection {

    @Test
    public void clear(){
//        addDaysToWeekends();
//        addDaysToWorkdays();
//        daysOfWeek.addAll(workDays);
//        daysOfWeek.addAll(weekendDays);

        addDaysToWeek();
        assertEquals(7, daysOfWeek.size());
    }
}
