package ru.alexbox.gb_popular_l.espresso;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import ru.alexbox.gb_popular_l.R;
import ru.alexbox.gb_popular_l.lesson_7.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class TaskTwoTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onViewCheck() {
        onView(withId(R.id.btnTaskTwo)).perform(click());
        onView(withId(R.id.taskTwoView)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }

    @Test
    public void onTextCheck() {
        onView(withId(R.id.btnTaskTwo)).perform(click());
        onView(withId(R.id.taskTwoView)).check(matches(withText("Espresso")));
    }
}
