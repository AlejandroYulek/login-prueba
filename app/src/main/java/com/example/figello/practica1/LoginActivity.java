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
}
