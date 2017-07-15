package com.example.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.services_log.AtyLog;
import com.example.services_log.AtyMessage;
import com.example.services_log.AtyPushMessage;
import com.example.services_log.AtyTimeLine;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token=Config.getCatheToken(this);
        startActivity(new Intent(this,AtyPushMessage.class));
        
//        if(token!=null)
//        {
//        	Intent intent=new Intent(this,AtyTimeLine.class);
//        	intent.putExtra(Config.KEY, token);
//        	startActivity(intent);
//        }else
//        {
//        	startActivity(new Intent(this,AtyLog.class));
//        }
        finish();

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    

}
