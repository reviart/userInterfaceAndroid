package com.revicere.learninterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    //defined List bahasa is list view beacuse we connect with ativity_list.xml
    ListView ListBahasa;
    String bahasaArray[] = {"java", "python", "dll"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListBahasa = (ListView) findViewById(R.id.list_bahasa);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.txtView, bahasaArray);
        ListBahasa.setAdapter(arrayAdapter);

        ListBahasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {
                String selection = bahasaArray[arg2];
                //Log.d("selection", selection);
                Intent passingSist = new Intent(ListActivity.this, InfoActivity.class);
                passingSist.putExtra("nama", selection);
                startActivity(passingSist);
            }
        });
    }
}
