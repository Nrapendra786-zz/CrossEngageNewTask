package com.crossengagetasktest;

import com.crossenagetask.model.Question;
import com.crossenagetask.services.QuestionReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class QuestionReaderTest {

    @Test
    public void testQuestionRead() throws IOException {
        QuestionReader questionReader = new QuestionReader();
        List<Question> questions = questionReader.read();
        Assert.assertEquals(questions.size(),5);
    }
}
