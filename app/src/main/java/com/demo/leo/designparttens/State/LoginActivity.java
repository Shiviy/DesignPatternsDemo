package com.demo.leo.designparttens.State;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.demo.leo.designparttens.R;

/**
 * 登陆界面
 * Created by leo on 2018/2/10.
 */

public class LoginActivity extends Activity {
    EditText userNameEditText;
    EditText pwdEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userNameEditText = (EditText) findViewById(R.id.edittext_username);
        pwdEditText = (EditText) findViewById(R.id.edittext_pwd);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
                finish();
            }
        });
    }

    private void login() {
        String userName = userNameEditText.getText().toString().trim();
        String password = pwdEditText.getText().toString().trim();
        //do http request...

        //登陆成功后 修改为已经登陆状态
        LoginContext.getLoginContext().setUserState(new LoginState());
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();

    }
}
