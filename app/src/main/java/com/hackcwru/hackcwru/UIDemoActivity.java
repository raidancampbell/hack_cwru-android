package com.hackcwru.hackcwru;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class UIDemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uidemo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_uidemo, menu);
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
        }

        return super.onOptionsItemSelected(item);
    }

    public void demoFirstUseActivity(View view){
        startActivity(new Intent(this, FirstUseActivity.class));
    }

    public void demoGuestMainActivity(View view){
        startActivity(new Intent(this, GuestMainActivity.class));
    }

    public void demoHackerMainActivity(View view){
        startActivity(new Intent(this, HackerMainActivity.class));
    }

    public void demoLoginActivity(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void demoMentorMainActivity(View view){
        startActivity(new Intent(this, MentorMainActivity.class));
    }

    public void demoNewMentorActivity(View view){
        startActivity(new Intent(this, NewMentorActivity.class));
    }

    public void demoNewUserActivity(View view){
        startActivity(new Intent(this, NewUserActivity.class));
    }

    public void demoOrganizerMainActivity(View view){
        startActivity(new Intent(this, OrganizerMainActivity.class));
    }
}
