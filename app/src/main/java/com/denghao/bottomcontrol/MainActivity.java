package com.denghao.bottomcontrol;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.denghao.control.TabItem;
import com.denghao.control.TabView;
import com.denghao.control.TabViewControl;
import com.denghao.control.view.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);
    List<TabItem> items = new ArrayList<TabItem>();
    TestFragment fragment1 = new TestFragment();
    TestFragment2 fragment2 = new TestFragment2();
    TestFragment3 fragment3 = new TestFragment3();
    TestFragment4 fragment4 = new TestFragment4();
    TestFragment5 fragment5 = new TestFragment5();
    items.add(new TabView(getView("1"), fragment1));
    items.add(new TabView(getView("2"), fragment2));
    items.add(new TabView(getView("3"), fragment3));
    items.add(new TabView(getView("4"), fragment4));
    items.add(new TabView(getView("4"), fragment5));
    navigationView.initControl(this).setPagerView(items, 0);
    navigationView.getNavgation().setTabControlHeight(60);
    navigationView.getControl().setOnTabClickListener(new TabViewControl.TabClickListener() {
      @Override public void onTabClickListener(int position, View view) {
        Log.e("======>",position + "");
      }
    });
  }

  @NonNull private View getView(String text) {
    View view1 = View.inflate(this, R.layout.tab_view, null);
//    TextView textView = (TextView) view1.findViewById(R.id.test);
//    textView.setText(text);
    return view1;
  }
}
