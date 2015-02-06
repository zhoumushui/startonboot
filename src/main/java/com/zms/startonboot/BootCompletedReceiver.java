package com.zms.startonboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver {
    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION)) {
            // Activity
            Intent mIntent = new Intent(context, Main.class);
            mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mIntent);
            // Service
            /*
            Intent serviceIntent = new Intent(context, BootCompletedService.class);
            context.startService(serviceIntent);
            */
        }
    }
}
