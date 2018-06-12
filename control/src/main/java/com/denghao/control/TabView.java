package com.denghao.control;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author yudneghao
 * @date 2018/6/12
 */

public class TabView implements TabItem {
  private View mView;
  private Fragment mFragment;


  public TabView(View view, Fragment fragment) {
    mView = view;
    mFragment = fragment;

  }

  @Override public Fragment getCurrentFragment() {
    return mFragment;
  }

  @Override public View getView() {
    return mView;
  }

  @Override public String getTag() {
    return mFragment.getClass().getSimpleName();
  }

  @Override public void setTitleName() {

  }

  @Override public void setMessageHint(int count) {

  }
}
