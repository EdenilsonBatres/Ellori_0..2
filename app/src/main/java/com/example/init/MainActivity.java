package com.example.init;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //objeto a la pantalla loguin

    public void a_login(View view)
    {
        Intent a_login = new Intent(this, loguin.class);
        startActivity(a_login);
    }
}
