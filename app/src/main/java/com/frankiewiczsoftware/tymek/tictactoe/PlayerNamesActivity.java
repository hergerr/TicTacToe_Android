package com.frankiewiczsoftware.tymek.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerNamesActivity extends Activity {

    String player1_text, player2_text;
    static final String P1 = "1";
    static final String P2 = "2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_names);
    }

    public void onButtonNextClick(View view) {
        EditText player1 = (EditText) findViewById(R.id.player1_edit);
        EditText player2 = (EditText) findViewById(R.id.player2_edit);

        player1_text = player1.getText().toString();
        player2_text = player2.getText().toString();

        Intent intent = new Intent(this, ChooseModeActivity.class);
        intent.putExtra(P1, player1_text);
        intent.putExtra(P2, player2_text);
        startActivity(intent);
    }
}
