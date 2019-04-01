package com.lifeistech.andoroid.tapnumbers;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FaildActivity extends AppCompatActivity {
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faild);
        textView3 = findViewById(R.id.textView3);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "mikachanALL.ttc");
        textView3.setTypeface(typeface);
    }

    public void faild(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}