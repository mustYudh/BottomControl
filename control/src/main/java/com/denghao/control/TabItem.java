package com.denghao.control;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author yudneghao
 * @date 2018/6/12
 */

interface TabItem {

  Fragment getCurrentFragment();

  View getView();

  String getTag();

  void setTitleName(String name);

  void setMessageHint(int count);
}
