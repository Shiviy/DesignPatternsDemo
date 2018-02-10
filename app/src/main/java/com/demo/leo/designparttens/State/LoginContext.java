package com.demo.leo.designparttens.State;

import android.content.Context;

/**
 * 用户接口和状态管理类
 * Created by leo on 2018/2/10.
 */

public class LoginContext {
    //用户状态 默认为未登陆状态
    UserState userState = new LogoutState();

    //单例
    private LoginContext() {
    }

    public static LoginContext getLoginContext() {
        return SingletonHolder.loginContext;
    }

    private static class SingletonHolder {
        private static final LoginContext loginContext = new LoginContext();
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void forward(Context context) {
        userState.forward(context);
    }

    public void comment(Context context) {
        userState.comment(context);
    }
}
