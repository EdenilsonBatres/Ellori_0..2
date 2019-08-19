package com.example.init;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loguin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
    }

    //este metodo te envia a la pantalla de loguin con facebook
    public void a_fb(View view)
    {
        Intent a_fb = new Intent(this, login_facebook.class);
        startActivity(a_fb);
    }

    public void a_registro(View view)
    {
        Intent a_registro = new Intent(this, registro.class);
        startActivity(a_registro);
    }

    public void a_menu(View view)
    {
        Intent a_menu = new Intent(this, home.class);
        startActivity(a_menu);
    }
}
