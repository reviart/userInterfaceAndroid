package com.revicere.learninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String parameter;
        String tampungTitle = null;
        String tampungDesc = null;
        parameter = getIntent().getStringExtra("nama");

        ImageView logo = (ImageView) findViewById(R.id.img_logo);
        TextView title = (TextView) findViewById(R.id.txt_title_info);
        TextView desc = (TextView) findViewById(R.id.txt_desc_info);

        if (parameter.equals("java")){
            tampungTitle= "Java";
            tampungDesc = "Java adalah bla bla bla";
            logo.setImageResource(R.drawable.javalogo);
        }
        else if (parameter.equals("python")){
            tampungTitle = "Python";
            tampungDesc = "Python adalah bla bla bla";
            logo.setImageResource(R.drawable.pythonlogo);
        }
        else if (parameter.equals("dll")){
            tampungTitle = "Dll";
            tampungDesc = "Dll adalah bla bla bla";
            logo.setImageResource(R.drawable.dlllogo);
        }
        else{
            tampungTitle = "Title pada array tidak tersedia";
            tampungDesc = "Desc adalah bla bla bla";
            logo.setImageResource(R.drawable.trashlogo);
        }

        title.setText(tampungTitle);
        desc.setText(tampungDesc);

    }
}
