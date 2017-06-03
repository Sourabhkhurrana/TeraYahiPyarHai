package com.nougatstudio.terayahipyarhai;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    Button signInButton;
    Button signUpButton;

    EditText userIDText;
    EditText userPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signInButton = (Button) findViewById(R.id.signInButton);
        signUpButton = (Button) findViewById(R.id.signUpButton);

        userIDText = (EditText) findViewById(R.id.userID);
        userPasswordText = (EditText) findViewById(R.id.userPassword);

        signInButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signInButton: {
                if (checkSignInConstrains()) {

                    if ((getString(userIDText).equals("school")) && (getString(userPasswordText).equals("asdf"))) {

                        startActivity(new Intent(this,SchoolAdmin.class));
                    } else if ((getString(userIDText).equals("student")) && (getString(userPasswordText).equals("asdf"))) {
                        startActivity(new Intent(this,StudentAdmin.class));
                    } else if ((getString(userIDText).equals("faculty")) && (getString(userPasswordText).equals("asdf"))) {
                        startActivity(new Intent(this,StudentAdmin.class));
                    }
                    else
                    {
                        customMessage("Invalid Details");
                    }
                }
            }
            break;
            case R.id.signUpButton: {
                startActivity(new Intent(this,StudentRegistration.class));
            }
            break;


        }
    }


    // Custom Methods


    public String getString(EditText text) {
        return text.getText().toString();
    }



    public void customMessage(String message) {
        Snackbar.make(findViewById(R.id.signUpButton), message, Snackbar.LENGTH_SHORT).show();
    }


    public Boolean checkSignInConstrains() {
        Boolean status = true;

        if (userIDText.getText().length() < 2) {
            customMessage(getString(R.string.USER_ID_INVALID));
            status = false;
            return status;
        }
        if (userPasswordText.getText().length() < 3) {
            customMessage(getString(R.string.USER_PASSWORD_LENGTH));
            status = false;
            return status;
        }
        return status;
    }

}
