package com.aila.simulasi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aila.simulasi2.Auth.Login;
import com.aila.simulasi2.Auth.Registrasi;

public class MainParent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_parent);
    }
    public void activityregistrasi(View view){
        Intent in=new Intent(getBaseContext(), Registrasi.class);
        startActivity(in);
    }
    public void activitylogin(View view){
        Intent in=new Intent(getBaseContext(), Login.class);
        startActivity(in);
    }
}
