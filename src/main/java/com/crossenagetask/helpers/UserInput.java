package com.crossenagetask.helpers;

import com.crossenagetask.utils.MessageUtil;
import com.crossenagetask.utils.NumberUtil;
import com.crossenagetask.model.Product;

import java.util.List;
import java.util.Scanner;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class UserInput {

    public void enterInput(List<Product> productList) {
        String input;
        boolean start = true;
        while (start) {
            System.out.println(MessageUtil.PLEASE_ENTER_INPUT);
            Scanner scanner = new Scanner(System.in);
            input = scanner.next();
            if (isValidInput(input)) {
                if(input.equals(MessageUtil.STOP)){
                    start = false;
                    break;
                }
                CalculateOperation calculateOperation = new CalculateOperation();
                System.out.println(calculateOperation.performCalculation(productList, input));
            } else {
                System.out.println(MessageUtil.INVALID_INPUT);
            }
        }
    }

    private boolean isValidInput(String input) {
        return input.equals(String.valueOf(NumberUtil.ONE)) || input.equals(String.valueOf(NumberUtil.TWO)) ||
                input.equals(String.valueOf(NumberUtil.THREE)) ||
                input.equals(String.valueOf(NumberUtil.FOUR)) || input.equals(MessageUtil.STOP);
    }
}
