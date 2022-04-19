package com.example.appdev_sheet4_exc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


/*
2.2:
px: not densitiy independent & different size on different screens
inches: density independent & same size on different screens
mm: density independent & same size on different screens
pt: density independent & same size on different screens
dp: density independent & different size on different screens
sp: density independent & different size on different screens

2.4:
sp for font sizes because it is scaled by the users font size and preference.
dp for everything else

 */