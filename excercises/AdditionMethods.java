package chapter10.excercises;


import chapter10.helpers.WeekDaysCollection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lyubka on 10/12/2015.
 */

public class AdditionMethods extends WeekDaysCollection {


    @Test
    public void addElement(){
        addDaysToWorkdays();

        assertEquals(5, workDays.size());

        System.out.println(" add Element Test passes");

    }

    @Test
    public void addAll(){
        addDaysToWorkdays();

        daysOfWeek.addAll(workDays);

        assertEquals(workDays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workDays));

        System.out.println(" addAll Element Test passes");

    }





}
