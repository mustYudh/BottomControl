package com.denghao.control;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author yudneghao
 * @date 2018/6/11
 */

public class BottomNavigationControl extends LinearLayout {

  public BottomNavigationControl(Context context) {
    this(context, null);
  }

  public BottomNavigationControl(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public BottomNavigationControl(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    View.inflate(context, R.layout.bottom_navigation_control_view, this);
  }

  public void setHeight(int height) {
    LinearLayout tabControl = (LinearLayout) findViewById(R.id.tab_control);
    LinearLayout.LayoutParams params =
        new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    params.height = dip2px(height);
    tabControl.setLayoutParams(params);
  }

  private int dip2px(float dp) {
    float density = Resources.getSystem().getDisplayMetrics().density;
    return (int) (dp * density + 0.5);
  }
}
