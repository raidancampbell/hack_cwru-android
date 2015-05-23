package com.hackcwru.hackcwru;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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


    public void cancelButtonPressed(View view) {
        //user pressed the cancel button.  I should kill myself
        finish();
    }

    public void newUserButtonPressed(View view){
        //user is new, and wants to create an account.  Grab the text
        //from the username and password field, and do database magic.


    }

    public void loginButtonPressed(View view){
        //user already exists.  Grab the text from the username and password field.
        //Do we hash it before sending it to the backend?
        //query the backend to assert that the login was correct
        //then load the data, and go to a new screen.

    }
}
