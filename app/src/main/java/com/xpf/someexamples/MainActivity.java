package com.xpf.someexamples;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    UnlockUtil.wakeUpAndUnlock(mContext);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        Log.e("TAG", "onCreate()");
        handler.sendEmptyMessageDelayed(1, 10000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "onDestroy()");
        handler.removeCallbacksAndMessages(null);
    }
}
