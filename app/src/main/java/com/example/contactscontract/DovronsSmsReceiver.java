package com.example.contactscontract;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DovronsSmsReceiver extends BroadcastReceiver  {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast = Toast.makeText(context.getApplicationContext(),
                "nima gapey!", Toast.LENGTH_SHORT);
        toast.show();
    }
}