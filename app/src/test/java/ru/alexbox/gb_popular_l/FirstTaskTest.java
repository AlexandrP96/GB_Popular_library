package ru.alexbox.gb_popular_l;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ru.alexbox.gb_popular_l.lesson_7.unit.task_1;

public class FirstTaskTest {

    private task_1 task1;

    @Before
    public void before() {
        task1 = new task_1();
    }

    @Test
    public void firstTaskPositive() {
        int arg = task1.plusArgs(30, 70);
        Assert.assertEquals(arg, 100);
    }

    @Test
    public void firstTaskNegative() {
        int arg = task1.plusArgs(30, 70);
        Assert.assertNotEquals(arg, 2);
    }
}
