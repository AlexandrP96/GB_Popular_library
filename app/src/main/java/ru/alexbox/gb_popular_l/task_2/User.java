package ru.alexbox.gb_popular_l.task_2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @Expose
    @SerializedName("avatar_url")
    public String avatar_url;
}
