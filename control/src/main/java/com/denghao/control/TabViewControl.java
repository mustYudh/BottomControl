package com.denghao.control;

import android.app.Activity;
import android.view.View;

/**
 * @author yudneghao
 * @date 2018/6/11
 */

public interface TabViewControl {
  /**
   * 初始化View
   * @param activity
   */
  void init(Activity activity);
  /**
   * 添加TabVie
   *
   * @param view TabView
   */
  void addView(View view);
}
