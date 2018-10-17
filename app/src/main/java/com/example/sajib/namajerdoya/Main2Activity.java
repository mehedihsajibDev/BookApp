package com.example.sajib.namajerdoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
     private Button doya,hadis,niyot,amol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        doya=findViewById(R.id.doyaid);
        hadis=findViewById(R.id.hadissid);
        niyot=findViewById(R.id.niyotid);
        amol=findViewById(R.id.amolid);
        doya.setOnClickListener(this);
        hadis.setOnClickListener(this);
        niyot.setOnClickListener(this);
        amol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.doyaid){
            Intent intent=new Intent(Main2Activity.this,Doyalist.class);
            startActivity(intent);
        }else if(v.getId()==R.id.hadissid){
            Intent intent=new Intent(Main2Activity.this,NamajerHadis.class);
            startActivity(intent);
        }else if(v.getId()==R.id.niyotid){
            Intent intent=new Intent(Main2Activity.this,Niyatlist.class);
            startActivity(intent);
        }else if(v.getId()==R.id.amolid){
            Intent intent=new Intent(Main2Activity.this,Amol.class);
            startActivity(intent);
        }
    }
}
