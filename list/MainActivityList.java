package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivityList extends AppCompatActivity {
    TextView tv;
    ListView lv;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        tv=(TextView)findViewById(R.id.recvdinpt);

        String msg=getIntent().getStringExtra("mykey");
        tv.setText("welcome"+msg);
        lv=(ListView)findViewById(R.id.listview);// display(welcom changing to admin)
        // listvivew operation
        String[] courses={"MCA","MBA","BBA","BCA"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,courses);
        lv.setAdapter(adapter);
    }
}


