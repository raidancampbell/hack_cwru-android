package com.hackcwru.hackcwru;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class FirstUseActivity extends AppCompatActivity {

    public void hackerSelected(View view) {
        // do some db shit here
        startActivity(new Intent(this, HackerMainActivity.class));
    }

    public void mentorSelected(View view) {
        // do some db shit here
        startActivity(new Intent(this, MentorMainActivity.class));
    }

    public void orgSelected(View view) {
        startActivity(new Intent(this, OrganizerMainActivity.class));
    }

    public void guestSelected(View view) {
        startActivity(new Intent(this, GuestMainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_use);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_use, menu);
        return true;
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
        } else if (id== R.id.ui_demo_settings) {
            //TODO: this is meant for ease of testing.  DO NOT RELEASE THIS.
            startActivity(new Intent(this, UIDemoActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
