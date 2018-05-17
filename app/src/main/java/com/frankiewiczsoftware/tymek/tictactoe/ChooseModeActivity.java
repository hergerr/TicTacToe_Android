package com.frankiewiczsoftware.tymek.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.frankiewiczsoftware.tymek.tictactoe.PlayerNamesActivity.P1;
import static com.frankiewiczsoftware.tymek.tictactoe.PlayerNamesActivity.P2;

public class ChooseModeActivity extends Activity {

    String player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

        //trzeba odebrać wartości z poprzedniej intencji i przesłać je dalej
        player1 = getIntent().getStringExtra(P1);
        player2 = getIntent().getStringExtra(P2);
    }

    public void onStandartGameClick(View view) {
        Intent intent = new Intent(this, StandartGameActivity.class);
        intent.putExtra(P1,StandartGameActivity.class);
        intent.putExtra(P2,StandartGameActivity.class);
        startActivity(intent);
    }

    public void onBiddingGameClick(View view) {
        Intent intent = new Intent(this, BiddingGameActivity.class);
        intent.putExtra(P1,StandartGameActivity.class);
        intent.putExtra(P2,StandartGameActivity.class);
        startActivity(intent);
    }
}
