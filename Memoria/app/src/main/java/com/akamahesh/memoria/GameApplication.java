package com.akamahesh.memoria;

import android.app.Application;

import com.akamahesh.memoria.utils.FontLoader;

/**
 * Created by captain-neimo on 11/12/17.
 * contact : mckay1718@gmail.com
 */
public class GameApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FontLoader.loadFonts(this);
    }
}
