package com.example.myapplicationdfgfdgdfgdfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button clk1, clk2, clk3;
    MediaPlayer mdx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        clk1 = (Button)findViewById(R.id.playid);
        clk2 = (Button)findViewById(R.id.pauseid);
        clk3 = (Button)findViewById(R.id.stopid);
        mdx = MediaPlayer.create(MainActivity2.this,R.raw.faris);

    }
    public  void clkplay(View v)
    {
        mdx.start();

    }
    public  void clkpause(View v)
    {
        mdx.pause();

    }
    public  void clkstop(View v)
    {
        mdx.stop();
        mdx = MediaPlayer.create(MainActivity2.this,R.raw.faris);

    }
}