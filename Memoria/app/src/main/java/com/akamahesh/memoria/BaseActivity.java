package com.akamahesh.memoria;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.akamahesh.memoria.common.Shared;
import com.akamahesh.memoria.engine.Engine;
import com.akamahesh.memoria.engine.ScreenController;
import com.akamahesh.memoria.events.EventBus;
import com.akamahesh.memoria.events.ui.BackGameEvent;
import com.akamahesh.memoria.ui.PopupManager;
import com.akamahesh.memoria.utils.Utils;


public class BaseActivity extends FragmentActivity {

    private ImageView mBackgoundImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        Shared.context = getApplicationContext();
        Shared.engine = Engine.getInstance();
        Shared.eventBus = EventBus.getInstance();

        setContentView(R.layout.activity_main);
        mBackgoundImage = findViewById(R.id.background_image);

        Shared.activity = this;
        Shared.engine.start();
        Shared.engine.setBackgroundImageView(mBackgoundImage);

        //set background
        setBackgroundImage();

        //set menu
        ScreenController.getInstance().openScreen(ScreenController.Screen.MENU);

    }

    @Override
    protected void onDestroy() {
        Shared.engine.stop();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (PopupManager.isShown()) {
            PopupManager.closePopup();
            if (ScreenController.getLastScreen() == ScreenController.Screen.GAME) {
                Shared.eventBus.notify(new BackGameEvent());
            }
        } else if (ScreenController.getInstance().onBack()) {
            super.onBackPressed();
        }
    }

    private void setBackgroundImage() {
        Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
        bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
        bitmap = Utils.downscaleBitmap(bitmap, 2);
        mBackgoundImage.setImageBitmap(bitmap);
    }
}
