package com.example.hp.jai_jai_shree_radhee;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout menu_view =(RelativeLayout)findViewById(R.id.layout_done);
        switch (item.getItemId()){
            case R.id.Hanuman_Chalisa: {
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent i=new Intent(this,Hanumanji.class);
                startActivity(i);
                return true;
            }
            case R.id.ganesha:{
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent j=new Intent(this,ganeshji.class);
                startActivity(j);
                return true;
            }
            case R.id.krishna:{
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent k=new Intent(this,krishanji.class);
                startActivity(k);
                return true;
            }
            case R.id.sherawalimata:{
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent l=new Intent(this,Mataraniji.class);
                startActivity(l);
                return true;
            }
            case R.id.shivji:{
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent m=new Intent(this,shivji.class);
                startActivity(m);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}