package com.lifeistech.andoroid.tapnumbers;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] hairetu;
    String mondai;
    int seikai;
    TextView textView;
    TextView timerText;
    SimpleDateFormat dataFormat;
    CountDown countDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        timerText = (TextView) findViewById(R.id.timerText);
        dataFormat = new SimpleDateFormat("s.SS", Locale.US);
        timerText.setText(dataFormat.format(0));
        long countNumber = 3000;
        long interval = 10;
        countDown = new CountDown(countNumber, interval);
        start();
    }

    public void start(){
        hairetu = new int[9];
        Random rand = new Random();
        hairetu[0] = rand.nextInt(9) + 1;
        hairetu[1] = rand.nextInt(9) + 1;
        hairetu[2] = rand.nextInt(9) + 1;
        hairetu[3] = rand.nextInt(9) + 1;
        hairetu[4] = rand.nextInt(9) + 1;
        hairetu[5] = rand.nextInt(9) + 1;
        hairetu[6] = rand.nextInt(9) + 1;
        hairetu[7] = rand.nextInt(9) + 1;
        hairetu[8] = rand.nextInt(9) + 1;
        mondai = Integer.toString(hairetu[0])
                +Integer.toString(hairetu[1])
                +Integer.toString(hairetu[2])
                +Integer.toString(hairetu[3]);
        textView.setText(mondai);
        seikai = 0;
        countDown.start();
    }

    public void number1(View v){
        if(hairetu[seikai] == 1){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number2(View v){
        if(hairetu[seikai] == 2) {
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4) {
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number3(View v){
        if(hairetu[seikai] == 3){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4) {
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number4(View v){
        if(hairetu[seikai] == 4){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number5(View v){
        if(hairetu[seikai] == 5){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number6(View v){
        if(hairetu[seikai] == 6){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number7(View v){
        if(hairetu[seikai] == 7){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number8(View v){
        if(hairetu[seikai] == 8){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }

    public void number9(View v){
        if(hairetu[seikai] == 9){
            mondai = mondai.substring(1);
            textView.setText(mondai);
            seikai = seikai + 1;
            if (seikai == 4){
                start();
            }
        } else {Toast.makeText(this,"数字が違うよ！",Toast.LENGTH_SHORT).show(); }
    }
    class CountDown extends CountDownTimer {

        CountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            Intent intent=new Intent(getApplicationContext(),FaildActivity.class);
            startActivity(intent);
            finish();
        }

        @Override
        public void onTick(long millisUntilFinished) {
            timerText.setText(dataFormat.format(millisUntilFinished));
        }
    }
}
