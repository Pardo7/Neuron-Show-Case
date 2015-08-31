package com.appneuron.neuron;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //Display out toast message
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void buttonClicked(View view) {
        if(view.getId() == R.id.media_streamer) {
            toastMsg("This Button Will Launch The Spotify App!");
        } else if (view.getId() == R.id.super_duo1) {
            toastMsg("This Button Will Launch The Scores App!");
        } else if (view.getId() == R.id.super_duo2) {
            toastMsg("This Button Will Launch The Library App!");
        } else if (view.getId() == R.id.ant_terminator) {
            toastMsg("This Button Will Launch The Build It Bigger App!");
        } else if (view.getId() == R.id.materialize) {
            toastMsg("This Button Will Launch The Bacon Reader App!");
        } else if (view.getId() == R.id.capstone) {
            toastMsg("This Button Will Launch My Personal App!");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
