package com.example.init;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facebook);
    }

    //meotodo que te lleva al menu
    public void a_menu(View view)
    {
        Intent a_menu = new Intent(this, home.class);
        startActivity(a_menu);
    }
}
