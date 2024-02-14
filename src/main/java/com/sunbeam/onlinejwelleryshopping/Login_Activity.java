package com.sunbeam.onlinejwelleryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    CheckBox checkBox;
    EditText editUsername,editPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        checkBox=findViewById(R.id.checkbox);
        editUsername=findViewById(R.id.editusername);
        editPassword=findViewById(R.id.editpassword);
        getSupportActionBar().setTitle("Login");
    }

    public void register(View view){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);
    }

        public void signin(View view){
                if(editUsername.getText().equals(null)){
                    Toast.makeText(this,"invalid username",Toast.LENGTH_SHORT).show();
                } else if (editPassword.getText().equals(null)) {
                    Toast.makeText(this, "invalid password", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(this,MainActivity.class);
                    startActivity(intent);
                }

        }

        public  void cancel(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        }






}