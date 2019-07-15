package com.moskaoud.alc40phase1android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myProfile = findViewById(R.id.bt_my_profile);

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myProfile = new Intent(getApplicationContext(),MyProfile.class);
                startActivity(myProfile);
            }
        });

    }

    public void opemWeb(View view) {
        Intent aboutALC =  new Intent(getApplicationContext(),AboutALC.class);
        startActivity(aboutALC);

    }

}
