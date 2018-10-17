package com.example.sajib.namajerdoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
       private ProgressBar progressBar;
       private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        progressBar=findViewById(R.id.progressbarid);
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                nextpage();
            }
        });
        thread.start();
    }

    private void dowork() {
        for(progress=20;progress<=100;progress=progress
        +20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch (Exception e){
                Toast.makeText(this, "error"+e, Toast.LENGTH_SHORT).show();
            }
        }

    }
    private void nextpage(){
        Intent intent=new Intent(SplashActivity.this,Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
