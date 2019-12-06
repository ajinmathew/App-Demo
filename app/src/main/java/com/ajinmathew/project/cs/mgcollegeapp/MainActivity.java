package com.ajinmathew.project.cs.mgcollegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUserName,etPassword;
    Button btnLogin;
    String getUserName,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        etUserName=(EditText)findViewById( R.id.username );
        etPassword=(EditText)findViewById( R.id.password );
        btnLogin=(Button)findViewById( R.id.LoginButton );
        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUserName=etUserName.getText().toString();
                getPassword=etPassword.getText().toString();
                Toast.makeText( getApplicationContext(),getUserName+" "+getPassword,Toast.LENGTH_SHORT).show();


            }
        } );
    }
}
