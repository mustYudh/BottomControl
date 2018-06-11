package com.denghao.bottomcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.denghao.control.BottomNavigationControl;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationControl control = (BottomNavigationControl) findViewById(R.id.BottomNavigationControl);
    control.setHeight(100);
  }
}