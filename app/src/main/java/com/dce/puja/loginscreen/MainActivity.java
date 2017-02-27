package com.dce.puja.loginscreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main Activity", "Create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main Activity", "start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main Activity", "Resume");
    }
    protected void OnPause() {
        super.onPause();
        Log.i("Main Activity", "Pause");
    }


    protected void OnStop() {
        super.onStop();
        Log.i("Main Activity", "Stop");
    }
    protected void OnDistroy() {
        super.onDestroy();
        Log.i("Main Activity", "Distroy");
    }

    public void click(View v) {
        int id = v.getId();
        switch (id) {



            case R.id.btn2:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, secondActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
                break;
        }
    }

    public void openbrowser(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
}



