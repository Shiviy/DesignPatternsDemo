package com.demo.leo.designparttens.State;

import android.content.Context;
import android.content.Intent;

/**
 * 未登陆状态
 * Created by leo on 2018/2/10.
 */

public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
