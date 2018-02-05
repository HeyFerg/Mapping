package com.example.a2ferga42.mapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 2ferga42 on 05/02/2018.
 */

public class MapChooseActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);

        Button regularBtn = (Button)findViewById(R.id.btnRegular),
                hikeBikeBtn = (Button)findViewById(R.id.btnHikeBikeMap);

        regularBtn.setOnClickListener(this);
        hikeBikeBtn.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        boolean hikeBike = false;
        if(view.getId() == R.id.btnHikeBikeMap)
        {
            hikeBike = true;
        }
        Intent intent = new Intent();
        Bundle returnedData = new Bundle();
        returnedData.putBoolean("com.example.whitelegg_n.mapping.hikebike", hikeBike);
        intent.putExtras(returnedData);
        setResult(RESULT_OK, intent);
        finish();
    }
}
