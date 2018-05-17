package com.frankiewiczsoftware.tymek.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.frankiewiczsoftware.tymek.tictactoe.ChooseModeActivity.R1;
import static com.frankiewiczsoftware.tymek.tictactoe.ChooseModeActivity.R2;


public class StandartGameActivity extends Activity {

    String player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standart_game);

        player1 = getIntent().getStringExtra(R1);
        player2 = getIntent().getStringExtra(R2);

        TextView player1Name = (TextView)findViewById(R.id.player1_name);
        TextView player2Name = (TextView)findViewById(R.id.player2_name);


        player1Name.setText(player1);
        player2Name.setText(player2);

//        Button button1 = (Button)findViewById(R.id.button1);
    }
}
