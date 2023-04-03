package com.example.dialog_box.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.example.dialog_box.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class UtilHelperClass {

    static MaterialAlertDialogBuilder builder;



    public static void  ShowDialog(String msg, Context context){
        builder  =new MaterialAlertDialogBuilder(context);
        LayoutInflater inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.alert_layout, null);

        builder.setView(view);

        builder.setCancelable(false);

        AlertDialog dialog = builder.create();

        TextView textAlert = view.findViewById(R.id.textAlert);
        textAlert.setText(msg);

        dialog.show();
    }


}
