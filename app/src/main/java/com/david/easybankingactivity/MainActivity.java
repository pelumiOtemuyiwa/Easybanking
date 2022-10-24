package com.david.easybankingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        ImageView imagefourbtn = findViewById(R.id.fourthimage);
        imagefourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectToBankEasyActivity();
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // scope ! return type ! name of method ! (......)
    public void checkfourthbtn(){

    }
    public void redirectToBankEasyActivity(){
        Intent intent = new Intent(MainActivity.this,BankEasyActivity.class);
        startActivity(intent);
    }
}