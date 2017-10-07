package com.example.figello.practica1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class LoginActivity extends BaseActivity {
    private static final String TAG= LoginActivity.class.getName();
    @BindView(R.id.edt_email)
    EditText email;
    @BindView(R.id.text_email)
    TextInputLayout text_email;
    @BindView(R.id.edt_password)
    TextInputLayout textPassword;


    private Toolbar toolbar;
    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }
    protected void initView(){
        super.initView();
        initConfigToolbar();
    }
    private void initConfigToolbar(){
        toolbar=getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }

    @onClick(R.id.btn_entrar)
    public void onClickLogin(){{

    }

    private boolean isValidLogin(){
        boolean valid=true;
        text_email.setError(null);
        textPassword.setError(null);
        text_email.setErrorEnable(false);
        textPassword.setErrorEnable(false);
        if (email.getText().toString().isEmpty){
            valid=false;
            text_email.setError(getString(R.string.login_text_error_is_empty_email));
        }

        if (password.getText().toString().isEmpty) {
            valid = false;
            text_password.setError(getString(R.string.login_text_error_is_empty_password));
        }

        if (!isEmailValid(email.getText()).toString()){
            valid=false;
            text_email.setError(getString(R.string.login_text_error_is_valid_email));
        }
        return valid;
    }

    private boolean isEmailValid(CharSequence charSequence){
    if (TextUtils.isEmpty(charSequence)){
        return false;
    }else{
        return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }
    }
}
}
