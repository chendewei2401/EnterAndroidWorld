package com.example.chendw.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RunTimePermissionActivity extends AppCompatActivity {

    private static final String TAG = "RunTimePermissionActivi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_time_permission);

        Button button = findViewById(R.id.myPermission);
        button.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        try {
                            Intent intent = new Intent(Intent.ACTION_CALL);
                            intent.setData(Uri.parse("tel:10086"));
                            startActivity(intent);
                        } catch (SecurityException e) {
                            Log.e(TAG, "onClick: " + e.getMessage() );
                            e.printStackTrace();
                        }
                    }
                }
        );


    }
}
