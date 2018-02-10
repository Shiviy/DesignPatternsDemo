package com.demo.leo.designparttens.State;

import android.content.Context;
import android.widget.Toast;

/**
 * 登陆状态
 * Created by leo on 2018/2/10.
 */

public class LoginState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "forward", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "comment", Toast.LENGTH_SHORT).show();
    }
}
