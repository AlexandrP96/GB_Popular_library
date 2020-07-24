package ru.alexbox.gb_popular_l.task_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GsonData {
    @Expose
    @SerializedName("time_of_year")
    public String time_of_year;

    @Expose
    @SerializedName("year")
    public String year;

}
