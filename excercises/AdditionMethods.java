package chapter10.excercises;


import chapter10.helpers.WeekDaysCollection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lyubka on 10/12/2015.
 */

public class AdditionMethods {//extends WeekDaysCollection {


    @Test
    public void addElement(){
        System.out.println(WeekDaysCollection.workDays);
        WeekDaysCollection.addDaysToWorkdays();

        assertEquals(5, WeekDaysCollection.workDays.size());

        System.out.println(" add Element Test passes");
        System.out.println(WeekDaysCollection.workDays);

    }



    @Test
    public void addAll(){ //@why first this test is executed?

        System.out.println(WeekDaysCollection.workDays);
       // WeekDaysCollection.addDaysToWorkdays();
       // System.out.println(WeekDaysCollection.workDays);
        WeekDaysCollection.daysOfWeek.addAll(WeekDaysCollection.workDays);

        assertEquals(WeekDaysCollection.workDays.size(), WeekDaysCollection.daysOfWeek.size());
        assertTrue(WeekDaysCollection.daysOfWeek.containsAll(WeekDaysCollection.workDays));

        System.out.println(" addAll Element Test passes");
        System.out.println(WeekDaysCollection.workDays);
    }





}
