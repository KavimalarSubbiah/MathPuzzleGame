package com.example.deltatask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.content.DialogInterface;

public class MainActivity2 extends AppCompatActivity {
    private TextView your_score_is;
    private TextView scores;
    private Button play_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        your_score_is=findViewById(R.id.your_score_is);
        scores=findViewById(R.id.scores);
        Intent receiver_intent=getIntent();
        String received_Value=receiver_intent.getStringExtra("KEY");
        scores.setText(received_Value);
    }
    public void activity1_go_to(View v){
        Intent intent=new Intent((MainActivity2.this),MainActivity.class);
        startActivity(intent);
    }

}