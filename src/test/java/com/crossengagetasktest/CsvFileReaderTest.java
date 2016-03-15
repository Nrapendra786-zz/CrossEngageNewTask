package com.crossengagetasktest;

import com.crossenagetask.model.Product;
import com.crossenagetask.model.Question;
import com.crossenagetask.services.CsvFileReader;
import com.crossenagetask.services.QuestionReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class CsvFileReaderTest {
    @Test
    public void testQuestionRead() throws IOException {
        CsvFileReader csvFileReader = new CsvFileReader();
        List<Product> products = csvFileReader.read();
        Assert.assertEquals(products.size(), 4);
    }
}
