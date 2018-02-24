package com.example.android.soccermatch;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int goalScoreA = 0;
    int goalScoreB = 0;
    int penaltyScoreA = 0;
    int penaltyScoreB = 0;
    int foulScoreA = 0;
    int foulScoreB = 0;
    int cornerKickScoreA = 0;
    int cornerKickScoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method displays the given Score value on the screen.
     */
    private void displayScore(int score, int tag) {

        TextView scoreTextView = null;

        switch (tag) {
            case 1:
                scoreTextView = (TextView) findViewById(R.id.goalScoreA);
                break;
            case 2:
                scoreTextView = (TextView) findViewById(R.id.penaltyScoreA);
                break;
            case 3:
                scoreTextView = (TextView) findViewById(R.id.foulScoreA);
                break;
            case 4:
                scoreTextView = (TextView) findViewById(R.id.cornerKickScoreA);
                break;
            case 5:
                scoreTextView = (TextView) findViewById(R.id.goalScoreB);
                break;
            case 6:
                scoreTextView = (TextView) findViewById(R.id.penaltyScoreB);
                break;
            case 7:
                scoreTextView = (TextView) findViewById(R.id.foulScoreB);
                break;
            case 8:
                scoreTextView = (TextView) findViewById(R.id.cornerKickScoreB);
                break;
        }

        scoreTextView.setText(NumberFormat.getIntegerInstance().format(score));

    }

    /**
     * This method add Goal, Foul, Penalty or Corner Kick to the Score
     */
    public void addScore(View view) {

        int tag = Integer.parseInt(view.getTag().toString());

        switch (tag) {
            case 1:
                this.goalScoreA += 1;
                displayScore(this.goalScoreA, tag);
                break;
            case 2:
                this.penaltyScoreA += 1;
                displayScore(this.penaltyScoreA, tag);
                break;
            case 3:
                this.foulScoreA += 1;
                displayScore(this.foulScoreA, tag);
                break;
            case 4:
                this.cornerKickScoreA += 1;
                displayScore(this.cornerKickScoreA, tag);
                break;
            case 5:
                this.goalScoreB += 1;
                displayScore(this.goalScoreB, tag);
                break;
            case 6:
                this.penaltyScoreB += 1;
                displayScore(this.penaltyScoreB, tag);
                break;
            case 7:
                this.foulScoreB += 1;
                displayScore(this.foulScoreB, tag);
                break;
            case 8:
                this.cornerKickScoreB += 1;
                displayScore(this.cornerKickScoreB, tag);
                break;
        }
    }

    public void resetScore(View view) {

        for (int i = 1; i <= 8; i++) {
            displayScore(0, i);
        }

        goalScoreA = 0;
        goalScoreB = 0;
        penaltyScoreA = 0;
        penaltyScoreB = 0;
        foulScoreA = 0;
        foulScoreB = 0;
        cornerKickScoreA = 0;
        cornerKickScoreB = 0;

    }

}
