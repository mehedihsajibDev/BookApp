package com.example.sajib.namajerdoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doyalist extends AppCompatActivity implements View.OnClickListener{
  private Button fatiha,ikhlas,kaosar,kafirun,lahab,asor,nas,kurais,maun,falak,fil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doyalist);
        fatiha=findViewById(R.id.fatihaid);
        ikhlas=findViewById(R.id.ikhlasid);
        kaosar=findViewById(R.id.kaosarid);
        kafirun=findViewById(R.id.kafirunid);
        lahab=findViewById(R.id.lahabid);
        asor=findViewById(R.id.asorid);
        nas=findViewById(R.id.nasid);
        kurais=findViewById(R.id.kuraisid);
        maun=findViewById(R.id.maunid);
        falak=findViewById(R.id.falakid);
        fil=findViewById(R.id.filidiid);

        fatiha.setOnClickListener(this);
        ikhlas.setOnClickListener(this);
        kaosar.setOnClickListener(this);
        kafirun.setOnClickListener(this);
        lahab.setOnClickListener(this);
        asor.setOnClickListener(this);
        nas.setOnClickListener(this);
        kurais.setOnClickListener(this);
        maun.setOnClickListener(this);
        falak.setOnClickListener(this);
        fil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     if(v.getId()==R.id.fatihaid){
         Intent intent=new Intent(Doyalist.this,Fatiha.class);
         startActivity(intent);
     }
     else if(v.getId()==R.id.ikhlasid){
         Intent intent=new Intent(Doyalist.this,Ikhlas.class);
         startActivity(intent);
     } else if(v.getId()==R.id.kaosarid){
         Intent intent=new Intent(Doyalist.this,Kaosar.class);
         startActivity(intent);
     }else if(v.getId()==R.id.kafirunid){
         Intent intent=new Intent(Doyalist.this,Kafirun.class);
         startActivity(intent);
     }else if(v.getId()==R.id.lahabid){
         Intent intent=new Intent(Doyalist.this,Lahab.class);
         startActivity(intent);
     }else if(v.getId()==R.id.asorid){
         Intent intent=new Intent(Doyalist.this,Asor.class);
         startActivity(intent);
     }else if(v.getId()==R.id.nasid){
         Intent intent=new Intent(Doyalist.this,Nas.class);
         startActivity(intent);
     }else if(v.getId()==R.id.kuraisid){
         Intent intent=new Intent(Doyalist.this,Kurais.class);
         startActivity(intent);
     }else if(v.getId()==R.id.maunid){
         Intent intent=new Intent(Doyalist.this,Maun.class);
         startActivity(intent);
     }else if(v.getId()==R.id.falakid){
         Intent intent=new Intent(Doyalist.this,Falak.class);
         startActivity(intent);
     }else if(v.getId()==R.id.filidiid){
         Intent intent=new Intent(Doyalist.this,Fil.class);
         startActivity(intent);
     }
    }
}
