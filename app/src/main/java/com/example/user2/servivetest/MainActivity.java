package com.example.user2.servivetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void startServiceMethod(View v){
        EditText editText1;
        editText1 = (EditText) findViewById(R.id.editText1);
        Intent Service = new Intent(this, MainService.class);
        Service.putExtra("FilePath", editText1.getText().toString());
        startService(Service);
    }
}
