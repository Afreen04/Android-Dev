package com.example.afreen.currencyconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertRupees(View view)
    {
        EditText rupee = (EditText) findViewById(R.id.currencyInRupees);
        float rials = 0;
        rials  = Float.parseFloat(rupee.getText().toString());
        rials *= 0.054;
        String riyals = Float.toString(rials);

            Toast.makeText(getApplicationContext(), "QR." + riyals, Toast.LENGTH_LONG).show();

    }

    public void convertRials(View view)
    {
        EditText riyalsString = (EditText) findViewById(R.id.currencyInRiyals);
        float rupees = 0;
        rupees = Float.parseFloat(riyalsString.getText().toString());
        rupees *= 18.04;
        String rupeeString = Float.toString(rupees);
        Toast.makeText(getApplicationContext(),"INR." + rupeeString,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
