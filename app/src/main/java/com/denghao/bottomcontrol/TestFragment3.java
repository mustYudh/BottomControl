package com.denghao.bottomcontrol;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.denghao.control.view.utils.UpdataCurrentFragment;

/**
 * @author yudneghao
 * @date 2018/6/12
 */

public class TestFragment3 extends Fragment implements UpdataCurrentFragment {
  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = View.inflate(getActivity(), R.layout.test_fragment2, null);
    return view;
  }

  @Override
  public void onResume() {
    super.onResume();
    update(getArguments());

  }
  @Override
  public void update(Bundle bundle) {
    Toast.makeText(getActivity(),   "点击3", Toast.LENGTH_SHORT).show();
    Log.e("======>", "update: 3");
  }
}
