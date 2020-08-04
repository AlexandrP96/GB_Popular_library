package ru.alexbox.gb_popular_l;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ru.alexbox.gb_popular_l.lesson_6.unit.task_1;

import static org.junit.Assert.assertEquals;

public class FirstTaskTest {

    private task_1 task1;

    @Before
    public void before() {
        task1 = new task_1();
    }

    // Положительный сценарий
    @Test
    public void task1IsCorrect() {
        int arg = task1.plusMethod();
        assertEquals(arg, 100);
    }

    // Отрицательный сценарий
    @Test
    public void task1IsWrong() {
        int arg = task1.plusMethod();
        Assert.assertNotEquals(arg, 2);
    }
}
