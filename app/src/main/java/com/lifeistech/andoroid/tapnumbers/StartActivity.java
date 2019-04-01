package com.lifeistech.andoroid.tapnumbers;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    TextView textView4;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView4 = findViewById(R.id.textView4);
        textView2 = findViewById(R.id.textView2);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "mikachanALL.ttc");
        textView4.setTypeface(typeface);
        textView2.setTypeface(typeface);
    }

    public void start(View v) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
