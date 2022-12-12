package com.example.revisioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtxt, pass;
    Button btn;
    TextView txtdef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtxt = this.findViewById(R.id.edtxt);
        pass = this.findViewById(R.id.pass);
        btn = this.findViewById(R.id.btn);
        txtdef = this.findViewById(R.id.def);

        this.txtdef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fr.wiktionary.org/wiki/calculateur"));
                startActivity(i);
            }
        });

        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editText1 = edtxt.getText().toString();
                String editText2 = edtxt.getText().toString();
                if(editText1.equals( "admin") && editText2.equals("admin")){
                Intent i = new Intent(LoginActivity.this,ActivityCalcul.class);
                i.putExtra("login", editText1);
                startActivity(i);
                } else{
                    Toast.makeText(LoginActivity.this, "Login ou Mot de passe Erronés!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}