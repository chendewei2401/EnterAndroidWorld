package com.example.chendw.myapplication.uiwidget;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.chendw.myapplication.R;

public class MyViewActivity extends AppCompatActivity {

    private static final String TAG = "MyViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_view);

        final EditText editText = findViewById(R.id.myEditText);
        final ImageView image = findViewById(R.id.myImage);
        final ProgressBar bar = findViewById(R.id.myProgress);
        Button button = findViewById(R.id.myButton);
        button.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Log.e(TAG, "onClick: =======");

//                        String text = editText.getText().toString();
//                        Toast.makeText(MyViewActivity.this, text, Toast.LENGTH_SHORT).show();

//                        image.setImageResource(R.drawable.ic_launcher_foreground);

//                        if (bar.getVisibility() == View.GONE) {
//                            bar.setVisibility(View.VISIBLE);
//                        } else {
//                            bar.setVisibility(View.GONE);
//                        }

//                        int progress = bar.getProgress();
//                        if (progress >= 100) {
//                            bar.setProgress(0);
//                        } else {
//                            bar.setProgress(progress + 10);
//                        }

//                        AlertDialog.Builder dialog = new AlertDialog.Builder(MyViewActivity.this);
//                        dialog.setTitle("this is a alert");
//                        dialog.setMessage("this is a message");
//                        dialog.setCancelable(false);
//                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MyViewActivity.this, "you click ok", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                        dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MyViewActivity.this, "you click cancle", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                        dialog.show();

                        Intent intent = new Intent(MyViewActivity.this, ListViewActivity.class);
                        startActivity(intent);

                    }
                }
        );
    }
}
