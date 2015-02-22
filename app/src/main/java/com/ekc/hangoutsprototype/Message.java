package com.ekc.hangoutsprototype;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by erickchang on 2/17/15.
 */
public class Message {

    public static final String[] DATES = { "Today", "Yesterday", "This month"};

    String mDate;
    String mFrom;
    String mText;
    int mPicResourceId;

    public Message(String date, String from, String text, Integer picResourceId) {
        mDate = date;
        mFrom = from;
        mText = text;
        if (picResourceId == null) {
            mPicResourceId = R.drawable.person_image_empty;
        } else {
            mPicResourceId = picResourceId;
        }
    }

    public static final Message[] MESSAGES = {
            new Message(DATES[0],"Andrew Clark", null, R.drawable.emilio_estevez),
            new Message(DATES[1],"Molly Ringwald",null, R.drawable.claire_standish),
            new Message(DATES[2],"Brian Johnson", null, R.drawable.anthony_michael_hall),
            new Message(DATES[0],"John Bender", null, R.drawable.judd_nelson),
            new Message(DATES[0],"Allison Reynolds", null, R.drawable.ally_sheedy),
            new Message(DATES[2],"Richard Vernon", null, R.drawable.paul_gleason),
            new Message(DATES[2],"Carl", null, R.drawable.john_kapelos),
            new Message(DATES[2],"Anonymous", null, null)
    };
}

