/*
 * Created by Storm Zhang, Feb 11, 2014.
 */

package me.storm.volley;

import android.app.Application;

import me.storm.volley.data.RequestManager;

public class VolleyApp extends Application {
	@Override
    public void onCreate() {
        super.onCreate();
        init();
    }


    private void init() {
        RequestManager.init(this);
    }
}
