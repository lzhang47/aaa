package com.lu.cs495.heathu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void buttonOnClick1(View view){

        Intent intent1 =new Intent();
        intent1.setClass(main.this, team.class);
        startActivity(intent1);

    }


    protected void buttonOnClick2(View view) {

        Intent intent2 = new Intent();
        intent2.setClass(main.this, friends.class);
        startActivity(intent2);
    }

    protected void buttonOnClick3(View view) {

        Intent intent3 = new Intent();
        intent3.setClass(main.this, challenge.class);
        startActivity(intent3);
    }

    protected void buttonOnClick4(View view) {

        Intent intent4 = new Intent();
        intent4.setClass(main.this, set.class);
        startActivity(intent4);
    }

    protected void buttonOnClick5(View view) {
        Toast toast = Toast.makeText(this, R.string.clicked, Toast.LENGTH_SHORT);
        toast.show();

        Intent intent5 = new Intent();
        intent5.setClass(main.this, go.class);
        startActivity(intent5);
    }

    protected void buttonOnClick6(View view) {

        Intent intent6 = new Intent();
        intent6.setClass(main.this, link.class);
        startActivity(intent6);
    }
}
