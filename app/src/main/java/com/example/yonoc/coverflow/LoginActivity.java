package com.example.yonoc.coverflow;


import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    //Variables de Pantalla Login
    private EditText editTextUsername;
    private EditText editTextPassword;
    private TextInputLayout textInputLayoutUsername;
    private TextInputLayout textInputLayoutPassword;
    private Button botonLogin;
    private Button buttonSingUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //voy a crear un Intent para llegar a Pantalla principal
        final Intent intentDeBotonLogin = new Intent(this, MainActivity.class);

        //voy a crear un Intent para llegar a Pantalla principal
        final Intent intentDeBotonSingUp = new Intent(this, RegisterActivity.class);



        //Busco la variable en el Layout
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        textInputLayoutUsername = findViewById(R.id.textImputLayoutUsername);
        textInputLayoutPassword = findViewById(R.id.textImputLayoutPassword);
        botonLogin = findViewById(R.id.buttonLogin);
        buttonSingUp = findViewById(R.id.buttonSingUp);



        //OnClickListener para el boton LOGIN
        botonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentDeBotonLogin);
            }
        });

        //OnClickListener para el boton Sing Up
        buttonSingUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentDeBotonSingUp);
            }
        });


    }
}
