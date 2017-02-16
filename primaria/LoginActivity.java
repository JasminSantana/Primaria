package mx.edu.utng.primaria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private Button login;
    private Button register;
    private EditText etEmail;
    private EditText etPassword;
    private DbHelper db;
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DbHelper(this);
        session = new Session(this);
        login = (Button)findViewById(R.id.bt_login);
        register = (Button)findViewById(R.id.bt_register);
        etEmail = (EditText)findViewById(R.id.et_email);
        etPassword = (EditText)findViewById(R.id.et_password);
        login.setOnClickListener(this);
        register.setOnClickListener(this);

        if(session.loggedin()){
            PrefManager prefManager = new PrefManager(getApplicationContext());

            // make first time launch TRUE
            prefManager.setFirstTimeLaunch(true);
            startActivity(new Intent(LoginActivity.this,WelcomeActivity.class));
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bt_login:
                login();
                break;
            case R.id.bt_register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
            default:

        }
    }

    private void login(){
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        if(db.getUser(email,password)){
            session.setLoggedin(true);
            PrefManager prefManager = new PrefManager(getApplicationContext());

            // make first time launch TRUE
            prefManager.setFirstTimeLaunch(true);
            startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong email/password", Toast.LENGTH_SHORT).show();
        }
    }
}
