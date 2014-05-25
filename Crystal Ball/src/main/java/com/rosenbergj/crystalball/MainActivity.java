package com.rosenbergj.crystalball;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private CrystalBall crystalBall = new CrystalBall();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Declaire our View variables
        final TextView answerLabel = (TextView) findViewById(R.id.textView3);
        //final View activityMainView = (RelativeLayout) findViewById(R.layout.activity_main);
        //final View mainView = activityMainView.getRootView();
        Button getAnswerButton = (Button) findViewById(R.id.button);

        // change background color
        // http://stackoverflow.com/questions/4761686/how-to-set-background-color-of-activity-to-white-programmatically

        getAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //The button was clicked, so update the answer label with an answer
                String answer = crystalBall.getAnAnswer();
                answerLabel.setText(answer);

                // Set Background green
                int answerColor = crystalBall.getAnswerColor(answer);
                //mainView.setBackgroundColor(answerColor);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
