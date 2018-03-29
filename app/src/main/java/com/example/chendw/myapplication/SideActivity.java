package com.example.chendw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.chendw.myapplication.life.DialogActivity;
import com.example.chendw.myapplication.uiwidget.MyViewActivity;

public class SideActivity extends AppCompatActivity {
    private static final String TAG = "SideActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate: ========");
        setContentView(R.layout.activity_side);
        Button normalButton = findViewById(R.id.button2);
        normalButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent data = getIntent();
                        String test = data.getStringExtra("test");

                        Log.e(TAG, "onClick: want to go baidu : " + test);
                        Intent intent = new Intent(SideActivity.this, MyViewActivity.class);
                        startActivity(intent);
                        Log.e(TAG, "onClick: can i go baidu now");
                    }
                }
        );

        Button dialogButton = findViewById(R.id.button3);
        dialogButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SideActivity.this, DialogActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public void onBackPressed() {
        Intent newIntent = new Intent();
        newIntent.putExtra("returnMsg", "hahahaha");
        setResult(RESULT_OK, newIntent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: =======");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ======");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ======");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: =======");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ====");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: ======");
    }
}
