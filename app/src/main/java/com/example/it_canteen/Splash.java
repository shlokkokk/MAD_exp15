package com.example.it_canteen;
import android.content.Intent; import android.os.Bundle; import android.os.Handler; import android.os.Looper; import androidx.appcompat.app.AppCompatActivity;
public class Splash extends AppCompatActivity { private static final long SPLASH_DELAY=3000; @Override protected void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_splash);new Handler(Looper.getMainLooper()).postDelayed(()->{startActivity(new Intent(Splash.this,MainActivity.class));finish();},SPLASH_DELAY);} }
