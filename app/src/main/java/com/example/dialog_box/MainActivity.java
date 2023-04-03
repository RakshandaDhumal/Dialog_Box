package com.example.dialog_box;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dialog_box.util.UtilHelperClass;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    MaterialAlertDialogBuilder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSupp" + "ress", "LocalSuppress"})
        MaterialButton button = findViewById(R.id.button);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        MaterialButton Errorbutton = findViewById(R.id.errorbutton);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        MaterialButton Msgbutton = findViewById(R.id.Messagebutton);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String response = "Error hai bhai bahaot jyda hai kesa karrhe ho yar ";
                UtilHelperClass.ShowDialog(response, MainActivity.this);
            }
        });
        Errorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Msgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

