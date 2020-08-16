package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fogetpassword extends AppCompatActivity {

    public Button ep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fogetpassword);

        ep = (Button) findViewById(R.id.buttone);
        ep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(fogetpassword.this, editprofile.class);
                startActivity(intent);
            }
        });
    }
}