package com.delaroystudios.alarmreminder;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main1Activity extends AppCompatActivity{

     public Button btn;

    public void init(){

           btn=(Button)findViewById(R.id.btn);
          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent toy = new Intent(Main1Activity.this,MainActivity.class);
                  startActivity(toy);
              }
          });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);

        init();
    }


}
