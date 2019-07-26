package com.example.designpatterndemo.templatepattern;

import android.util.Log;

public class LoL extends Game {
    private static final String TAG = "LoL";

    @Override
    void endPlay() {
        Log.d(TAG, "endPlay: " + "结束LOL游戏");
    }

    @Override
    void startPlay() {
        Log.d(TAG, "endPlay: " + "开始LOL游戏");
    }


    @Override
    void initialize() {
        Log.d(TAG, "endPlay: " + "初始化LOL游戏");
    }
}
