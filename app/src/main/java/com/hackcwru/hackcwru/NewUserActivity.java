package com.hackcwru.hackcwru;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class NewUserActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_user, menu);
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

    public void newUserButtonPressed(View view) {
        //Grab all the text fields.
        //Do we hash it before sending it to the backend?
        //query the backend to assert that the login was correct
        //then load the data, and go to a new screen.
        String fullName = ((EditText) findViewById(R.id.newUserFullNameText)).getText().toString();//This may work...
        String email = ((EditText) findViewById(R.id.newUserEmailAddressText)).getText().toString();
        String password = ((EditText) findViewById(R.id.newUserPasswordText)).getText().toString();
        String teamName = ((EditText) findViewById(R.id.newUserTeamNameText)).getText().toString();
    }
}
