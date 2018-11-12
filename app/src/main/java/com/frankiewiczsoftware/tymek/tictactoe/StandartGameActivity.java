package com.frankiewiczsoftware.tymek.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static com.frankiewiczsoftware.tymek.tictactoe.PlayerNamesActivity.P1;
import static com.frankiewiczsoftware.tymek.tictactoe.PlayerNamesActivity.P2;


public class StandartGameActivity extends Activity {

    String player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standart_game);

        player1 = getIntent().getStringExtra(P1);
        player2 = getIntent().getStringExtra(P2);
        TextView player1Name = (TextView)findViewById(R.id.player1_name);
        TextView player2Name = (TextView)findViewById(R.id.player2_name);
        player1Name.setText(player1);
        player2Name.setText(player2);

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        TextView nextMoveTextView = (TextView)findViewById(R.id.next_move_name);
        TextView player1Score = (TextView)findViewById(R.id.player1_score);
        TextView player2Score = (TextView)findViewById(R.id.player2_score);

        StandartGameLogic gameLogic = new StandartGameLogic(button1,button1,button1,button1,
                                                            button1,button1,button1,button1,
                                                            button1,nextMoveTextView,player1Score,
                                                            player2Score);



    }
}
