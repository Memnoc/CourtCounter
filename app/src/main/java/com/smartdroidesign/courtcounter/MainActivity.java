package com.smartdroidesign.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamA;
    TextView teamB;

    EditText scoreA;
    EditText scoreB;

    Button teamA3points;
    Button teamA2points;
    Button teamAThrow;

    Button teamB3points;
    Button teamB2points;
    Button teamBThrow;

    Button reset;

    public int scoreForA = 0;
    public int scoreForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Views declaration

        teamA = findViewById(R.id.teamAtxt);
        teamB = findViewById(R.id.teamBtxt);

        scoreA = findViewById(R.id.teamAScore);
        scoreB = findViewById(R.id.teamBScore);

        teamA3points = findViewById(R.id.teamABtn3);
        teamA2points = findViewById(R.id.teamABtn2);
        teamAThrow = findViewById(R.id.teamAThrow);

        teamB3points = findViewById(R.id.teamBBtn3);
        teamB2points = findViewById(R.id.teamBBtn2);
        teamBThrow = findViewById(R.id.teamBBtnThrow);

        reset = findViewById(R.id.resetBtn);

        // Initial set up

        scoreA.setText("0");
        scoreB.setText("0");

        // onClick set up

        teamA3points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusThreePointsA();
            }
        });

        teamA2points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusTwoPointsA();
            }
        });

        teamAThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeThrowA();
            }
        });

        teamB3points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusThreePointsB();
            }
        });

        teamB2points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plusTwoPointsB();
            }
        });

        teamBThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                freeThrowB();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScore();
            }
        });

    }

    public void plusThreePointsA() {
        scoreForA += 3;
        scoreA.setText(String.valueOf(scoreForA));
    }

    public void plusTwoPointsA() {
        scoreForA += 2;
        scoreA.setText(String.valueOf(scoreForA));
    }

    public void freeThrowA() {
        scoreForA += 2;
        scoreA.setText(String.valueOf(scoreForA));
    }

    public void plusThreePointsB() {
        scoreForB += 3;
        scoreB.setText(String.valueOf(scoreForB));
    }

    public void plusTwoPointsB() {
        scoreForB += 2;
        scoreB.setText(String.valueOf(scoreForB));
    }

    public void freeThrowB() {
        scoreForB += 2;
        scoreB.setText(String.valueOf(scoreForB));
    }


    public void resetScore() {
        scoreForA = 0;
        scoreForB = 0;
        scoreA.setText("0");
        scoreB.setText("0");
    }

}
