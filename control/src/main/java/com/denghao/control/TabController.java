package com.denghao.control;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import java.util.List;

/**
 * @author yudenghao
 * @deprecated Created by  on 2018/6/11.
 */

public class TabController {

    private TabViewControl tabViewControl;
    private FragmentActivity fragmentActivity;
    private TabViewControl.TabClickListener tabClickListener;


    public TabController(FragmentActivity fragmentActivity, TabViewControl tabViewControl) {
        this.tabViewControl = tabViewControl;
        this.fragmentActivity = fragmentActivity;
        tabViewControl.setOnTabClickListener(new TabViewControl.TabClickListener() {
            @Override
            public void onTabClickListener(int position, View view) {
                if (tabClickListener != null) {
                    tabClickListener.onTabClickListener(position, view);
                }
            }
        });
        fixHuaWeiBug();
    }


    public void setOnTabClickListener(TabViewControl.TabClickListener onTabClickListener) {
        this.tabClickListener = onTabClickListener;
    }

    /**
     * 华为设置权限后会重新执行onCreate ,但是FragmentManager的页面不销毁，这边直接先全部销毁
     */
    private void fixHuaWeiBug() {
        FragmentManager fm = fragmentActivity.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //当前所有fragment
        @SuppressLint("RestrictedApi") List<Fragment> fragments = fm.getFragments();
        if (fragments != null && fragments.size() > 0) {
            for (Fragment f : fragments) {
                if (f != null) {
                    ft.remove(f);
                }
            }
            ft.commitAllowingStateLoss();
        }
    }

}
