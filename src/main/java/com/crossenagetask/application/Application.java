package com.crossenagetask.application;

import com.crossenagetask.helpers.DisplayQuestions;
import com.crossenagetask.helpers.UserInput;
import com.crossenagetask.model.Product;
import com.crossenagetask.model.Question;
import com.crossenagetask.services.CsvFileReader;
import com.crossenagetask.services.IReader;
import com.crossenagetask.services.QuestionReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        IReader fileReader = new CsvFileReader();
        List<Product> productList = fileReader.read();
        IReader questionReader = new QuestionReader();
        List<Question> questionList = questionReader.read();
        new DisplayQuestions().display(questionList);
        UserInput userInput = new UserInput();
        userInput.enterInput(productList);

    }
}
