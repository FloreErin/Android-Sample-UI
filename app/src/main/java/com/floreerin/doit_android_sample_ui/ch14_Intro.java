package com.floreerin.doit_android_sample_ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ch14_Intro extends AppCompatActivity {
    Button OkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch14_intro);

        OkBtn = findViewById(R.id.okBtn_5th_point);

        OkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ch14_MapsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout); // 화면 전환시 페이드 인, 아웃 효과

                finish();
            }
        });
    }

    public void BackTitle(View view) { // Back 버튼 클릭시
        finish(); // 엑티비티 종료 후 메인화면으로 이동

        overridePendingTransition(R.anim.fadein, R.anim.fadeout); // 화면 전환시 페이드 인, 아웃 효과
    }
}
