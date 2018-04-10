package com.example.chendw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.chendw.myapplication.broadcast.NetWorkBroadcast;

public class ButtonActivity extends AppCompatActivity {

    private static final String TAG = "ButtonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);

        Log.e(TAG, "onCreate: something good just happen");

        // toast happen
        Button myButton = findViewById(R.id.button1);
        myButton.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ButtonActivity.this, "DID YOU JUST CLICK THE BUTTON", Toast.LENGTH_LONG).show();
                        Log.e(TAG, "onClick: you are finished");

//                        Intent intent = new Intent(ButtonActivity.this, SideActivity.class);

//                        Intent intent = new Intent(ButtonActivity.this, NetWorkBroadcast.class);
//                        intent.putExtra("test", "gotcha");
//                        startActivityForResult(intent, 1);

                        Intent intent = new Intent(ButtonActivity.this, RunTimePermissionActivity.class);
                        startActivity(intent);

                        Log.e(TAG, "onClick: you finished me");
                    }
                }
        );
        Log.e(TAG, "onCreate: you do click the button");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "you click add item button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you click the remove button", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnStr = data.getStringExtra("returnMsg");
                    Log.e(TAG, "onActivityResult: returnStr=" + returnStr);
                }
            default:
        }
    }
}
