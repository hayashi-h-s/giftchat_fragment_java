package com.haya.giftchat_fragment_java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

  private TextView mTextView;

  // Fragmentで表示するViewを作成するメソッド
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    // 先ほどのレイアウトをここでViewとして作成します
    return inflater.inflate(R.layout.alart_fragment, container, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // TextViewをひも付けます
    mTextView = (TextView) view.findViewById(R.id.textView);
    // Buttonのクリックした時の処理を書きます
  }

}
