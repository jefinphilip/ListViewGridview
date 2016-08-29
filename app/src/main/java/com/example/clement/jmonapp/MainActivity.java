package com.example.clement.jmonapp;

import android.app.Activity;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

/**
 * Created by CLemENt on 3/17/2016.
 */
public class MainActivity extends Activity {


    public String[] Countries = new String[]{
        "india", "Brazil", "USA", "Canada", "UK", "Sri Lenka", "Pakistan", "china","Russia"


    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button BtnHit=(Button)findViewById(R.id.btnHit);
       // final TextView tvData=(TextView)findViewById(R.id.JsonItem);
        Button click =(Button)findViewById(R.id.click);
        final EditText emessage = (EditText)findViewById(R.id.editText);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // tvData.setText("Hi Friend");
                //tvData.setText(emessage.getText().toString());
                Toast.makeText(getApplicationContext(),"Welcome "+emessage.getText().toString() +" to OUR Project",Toast.LENGTH_LONG).show();

            }

        });

        final ListView List = (ListView)findViewById(R.id.listView);
        GridView gridView = (GridView)findViewById(R.id.gridView);


        ArrayAdapter adapter;
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,Countries);
        List.setAdapter(adapter);

                List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),"You select the country :"+Countries[position]+"\n Position :"+position,Toast.LENGTH_LONG).show();
                    }
                });
        ArrayAdapter adapter1;
        adapter1 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_gallery_item,Countries);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You select the country :" + Countries[position] + "\n Position :" + position, Toast.LENGTH_LONG).show();
            }
        });


        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this,"CLicked on action settings" , Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }




    }

