package com.galosoft.androidonlinequizzapp.Common;

import com.galosoft.androidonlinequizzapp.Model.Question;
import com.galosoft.androidonlinequizzapp.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static final String STR_PUSH =  "pushNotification";
    public static String categoryId, categoryName;
    public static User currentUser;

    public static List<Question> questionList = new ArrayList<>();
}
