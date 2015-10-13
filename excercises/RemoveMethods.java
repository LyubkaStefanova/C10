package chapter10.excercises;

import chapter10.helpers.WeekDaysCollection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


/**
 * Created by Lyubka on 10/12/2015.
 */
public class RemoveMethods {//extends WeekDaysCollection {

    @Test
    public void removeElement() {
        WeekDaysCollection.addDaysToWeekends();

        WeekDaysCollection.weekendDays.remove("Sunday");

        assertFalse(WeekDaysCollection.weekendDays.contains("Sunday"));
        assertEquals(1, WeekDaysCollection.weekendDays.size());
        System.out.println("Remove test passes");

    }

}


