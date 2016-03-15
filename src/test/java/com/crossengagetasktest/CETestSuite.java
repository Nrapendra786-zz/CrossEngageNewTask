package com.crossengagetasktest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculateOperationTest.class,
        CalculateServiceImplTest.class,
        CsvFileReaderTest.class,
        QuestionReaderTest.class
})
public class CETestSuite {
}
