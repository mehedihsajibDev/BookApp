package com.example.sajib.namajerdoya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Niyatlist extends AppCompatActivity implements View.OnClickListener{
private Button fojor,johor,asor,magrib,esa,biter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niyatlist);
        this.setTitle("");
        fojor=findViewById(R.id.fozorid);
        johor=findViewById(R.id.johorerid);
        asor=findViewById(R.id.asoreniyatid);
        magrib=findViewById(R.id.magribid);
        esa=findViewById(R.id.esaid);
        biter=findViewById(R.id.biterid);

        fojor.setOnClickListener(this);
        johor.setOnClickListener(this);
        asor.setOnClickListener(this);
        magrib.setOnClickListener(this);
        esa.setOnClickListener(this);
        biter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.fozorid){
            Intent intent=new Intent(Niyatlist.this,Fojor.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.johorerid){
            Intent intent=new Intent(Niyatlist.this,Johor.class);
            startActivity(intent);
        }  else if(v.getId()==R.id.johorerid){
            Intent intent=new Intent(Niyatlist.this,Johor.class);
            startActivity(intent);
        }  else if(v.getId()==R.id.asoreniyatid){
            Intent intent=new Intent(Niyatlist.this,Asorerniyat.class);
            startActivity(intent);
        }  else if(v.getId()==R.id.magribid){
            Intent intent=new Intent(Niyatlist.this,Magrib.class);
            startActivity(intent);
        }else if(v.getId()==R.id.esaid){
            Intent intent=new Intent(Niyatlist.this,Esa.class);
            startActivity(intent);
        }else if(v.getId()==R.id.biterid){
            Intent intent=new Intent(Niyatlist.this,Bitore.class);
            startActivity(intent);
        }
    }
}
