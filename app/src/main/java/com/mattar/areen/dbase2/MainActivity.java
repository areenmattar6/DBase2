package com.mattar.areen.dbase2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText name;
EditText city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edName);
        city=findViewById(R.id.edCity);
    }
    public void saveD(View v){
        Dal dal=new Dal(MainActivity.this);
        dal.addData(name.getText().toString(),city.getText().toString());
    }
}
