package com.example.designpatterndemo.templatepattern;

import android.util.Log;

public class OW extends Game {
    private static final String TAG = "OW";

    @Override
    void endPlay() {
        Log.d(TAG, "endPlay: " + "结束OW游戏");
    }

    @Override
    void initialize() {
        Log.d(TAG, "endPlay: " + "初始化OW游戏");
    }

    @Override
    void startPlay() {
        Log.d(TAG, "endPlay: " + "开始OW游戏");
    }


}
