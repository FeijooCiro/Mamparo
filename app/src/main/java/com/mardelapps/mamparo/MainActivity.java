package com.mardelapps.mamparo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        user = findViewById(R.id.editTextUser);
        password = findViewById(R.id.editTextTextPassword);
    }

    public void buttonClick(View view){
        String content = name.getText().toString();
        String content2 = user.getText().toString();
        String content3 = password.getText().toString();

        if(content.isEmpty() && content2.isEmpty() && content3.isEmpty()){
            Toast.makeText(this, "Complete los campos, por favor.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Datos recibidos.", Toast.LENGTH_SHORT).show();
        }
    }
}