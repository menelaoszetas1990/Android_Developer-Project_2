package com.example.android.scorekeeperapp_americanfootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 6 points to Team A for touchdown
     */
    public void touchdownTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 1 point to Team A for extra point
     */
    public void extraPointTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 2 points to Team A for 2 point conversion
     */
    public void twoPointConversionTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 3 points to Team A for firld goal
     */
    public void fieldGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 2 points to Team A for 2 safety
     */
    public void safetyTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 6 points to Team A for touchdown
     */
    public void touchdownTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 1 point to Team A for extra point
     */
    public void extraPointTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 2 points to Team A for 2 point conversion
     */
    public void twoPointConversionTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 3 points to Team A for firld goal
     */
    public void fieldGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 2 points to Team A for 2 safety
     */
    public void safetyTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets score
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}