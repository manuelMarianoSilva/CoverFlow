package com.example.yonoc.coverflow;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    //Variables de Pantalla Login
    private EditText editTextUsernameRegister;
    private EditText editTextPasswordRegister;
    private EditText editTextMailRegister;
    private EditText editTextConfirmPasswordRegister;
    private TextInputLayout textInputLayoutMaildRegister;
    private TextInputLayout textInputLayoutUsernameRegister;
    private TextInputLayout textInputLayoutPasswordRegister;
    private TextInputLayout textInputLayoutConfirmPasswordRegister;
    private Button buttonSingUpRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Intent intentDeBotonLogin = new Intent(this, MainActivity.class);

        editTextUsernameRegister = findViewById(R.id.editTextUsernameRegister);
        editTextPasswordRegister = findViewById(R.id.editTextPasswordRegister);
        editTextMailRegister = findViewById(R.id.editTextMailRegister);
        editTextConfirmPasswordRegister = findViewById(R.id.editTextConfirmPasswordRegister);
        textInputLayoutMaildRegister = findViewById(R.id.textInputLayoutMaildRegister);
        textInputLayoutUsernameRegister = findViewById(R.id.textInputLayoutUsernameRegister);
        textInputLayoutPasswordRegister = findViewById(R.id.textInputLayoutPasswordRegister);
        textInputLayoutConfirmPasswordRegister = findViewById(R.id.textInputLayoutConfirmPasswordRegister);
        buttonSingUpRegister = findViewById(R.id.buttonSingUpRegister);

        buttonSingUpRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentDeBotonLogin);
            }
        });
    }
}
