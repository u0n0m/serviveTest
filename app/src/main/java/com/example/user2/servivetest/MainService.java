package com.example.user2.servivetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MainService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "onStartCommand~", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "onBind", Toast.LENGTH_SHORT).show();
        new thread1().start();
        return null;
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    public class thread1 extends  Thread{
        @Override
        public void run() {
            while(true){
                Toast.makeText(getApplicationContext(), "aaaaa", Toast.LENGTH_SHORT).show();
            }
        }
    }
}