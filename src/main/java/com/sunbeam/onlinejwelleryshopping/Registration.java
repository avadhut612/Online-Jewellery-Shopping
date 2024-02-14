package com.sunbeam.onlinejwelleryshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

        EditText edituname,editmobile,editemail,editpassword,editaddress,editpconfirmpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edituname=findViewById(R.id.editusername);
        editmobile=findViewById(R.id.editmobile);
        editemail=findViewById(R.id.editemail);
        editpassword=findViewById(R.id.editPassword);
        editaddress=findViewById(R.id.editaddress);
        editpconfirmpassword=findViewById(R.id.editconfirmPassword);
        getSupportActionBar().setTitle("Registration");
    }

    public void signup(View view){
        if(edituname.getText().equals(" ")){
            Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show();
        }else if(editmobile.getText().equals(" ")){
            Toast.makeText(this, "Enter mobile number", Toast.LENGTH_SHORT).show();
        }else if(editemail.getText().equals(" ")){
            Toast.makeText(this, "Enter email", Toast.LENGTH_SHORT).show();
        }else if(editpassword.getText().equals(" ")){
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
        } else if (!editpconfirmpassword.getText().equals(editpassword.getText())) {
            Toast.makeText(this,"Password mismatch",Toast.LENGTH_SHORT).show();
        }else {
            Intent intent=new Intent(this,Login_Activity.class);
            startActivity(intent);
        }
    }
}