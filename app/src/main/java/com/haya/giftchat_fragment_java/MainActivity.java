package com.haya.giftchat_fragment_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button button1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    button1 = findViewById(R.id.button1);

    Fragment container = findViewById(R.id.container);

//     コードからFragmentを追加
//
//     Fragmentを作成します

    button1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        MainFragment fragment = new MainFragment();

        Fragment container = findViewById(R.id.container);
//
//////     Fragmentの追加や削除といった変更を行う際は、Transactionを利用します
//////    // 新しく追加を行うのでaddを使用します
//////    // 他にも、よく使う操作で、replace removeといったメソッドがあります
//////    // メソッドの1つ目の引数は対象のViewGroupのID、2つ目の引数は追加するfragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
        transaction.remove(container).commit();
//
////    transaction.add(R.id.container, fragment);
//////     最後にcommitを使用することで変更を反映します
//        transaction.commit();
      }
    });


  }
}