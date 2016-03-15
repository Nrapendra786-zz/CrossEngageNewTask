package com.crossenagetask.services;

import com.crossenagetask.utils.AppUtil;
import com.crossenagetask.model.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class QuestionReader implements IReader<Question> {

    @Override
    public List<Question> read() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream(AppUtil.APPLICATION_PROPERTY);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        List<Question> questions = new ArrayList<>();
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                Question question = new Question();
                question.setQuestion(line);
                questions.add(question);
            }
        }
        return questions;
    }
}
