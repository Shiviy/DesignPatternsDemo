package com.demo.leo.designparttens.State;

import android.content.Context;

/**
 * 用户状态
 * Created by leo on 2018/2/10.
 */

public interface UserState {
    //forward
    void forward(Context context);

    //comment
    void comment(Context context);

}
