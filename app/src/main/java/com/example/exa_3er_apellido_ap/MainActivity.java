package com.example.exa_3er_apellido_ap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etUsuario,etPassword;
    public Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario=findViewById(R.id.etUsuario);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsuario.getText().toString().equals("usuario") && etPassword.getText().toString().equals("123")){
                    Intent intent1 = new Intent(view.getContext(),menu.class);
                    /*startActivity(intent1);*/
                    startActivityForResult(intent1,0);
                    /*Toast.makeText(MainActivity.this,"OKI",Toast.LENGTH_LONG).show();*/
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Usuario y/o Contraseña incorrectos\nVerifica!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}