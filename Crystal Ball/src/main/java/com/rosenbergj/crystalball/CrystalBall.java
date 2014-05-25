package com.rosenbergj.crystalball;

import android.graphics.Color;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Created by jonathanrosenberg on 5/24/14.
 */
public class CrystalBall {
    private Random randomGenerator = new Random();
    private HashMap<String, Integer> answerSet = new HashMap<String, Integer>();

    private String[] answers;

    CrystalBall() {
        answerSet.put("Defenitly", Color.RED);
        answerSet.put("Heck no", Color.GREEN);
        answerSet.put("Don't say that, don't even think it", Color.BLACK);
        answerSet.put("Trust me, you don't want to know", Color.YELLOW);
        answerSet.put("Let's just pretend you didn't ask that", Color.WHITE);
        answerSet.put("It's pretty likely", Color.RED);
        answerSet.put("What! Think and ask again", Color.MAGENTA);
        answerSet.put("Sorry, your still drunk", Color.BLUE);
        answers = answerSet.keySet().toArray(new String[answerSet.size()]);
    }

    public String getAnAnswer() {
        int randomNumber = randomGenerator.nextInt(answers.length);
        return answers[randomNumber];
    }

    public int getAnswerColor(String answer) {
        return answerSet.get(answer);
    }
}
