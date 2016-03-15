package com.crossenagetask.helpers;

import com.crossenagetask.model.Question;

import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class DisplayQuestions implements Display<Question> {

    @Override
    public void display(List<Question> questions) {
        for(Question question : questions){
            System.out.println(question.getQuestion());
        }
    }
}
