package com.crossenagetask.helpers;

import com.crossenagetask.utils.MessageUtil;
import com.crossenagetask.utils.NumberUtil;
import com.crossenagetask.model.Product;
import com.crossenagetask.services.CalculateService;
import com.crossenagetask.services.CalculateServiceImpl;

import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class CalculateOperation {

    public String performCalculation(List<Product> productList,String input) {
        CalculateService calculateService = new CalculateServiceImpl();
        String result = null;
        if(input.equals(String.valueOf(NumberUtil.ONE))){
            result = MessageUtil.TOTAL_AMOUNT_OF_ORDER + calculateService.getAmountOfOrder(productList);
        }else if(input.equals(String.valueOf(NumberUtil.TWO))){
            result = MessageUtil.TOTAL_NO_ITEM_SOLD + calculateService.getTotalNoOfItemSold(productList);
        }else if(input.equals(String.valueOf(NumberUtil.THREE))){
            result = MessageUtil.AVERAGE_NO_OF_ITEM_PER_ORDER + calculateService.getAvgNoOfItemPerOrder(productList);
        }else if(input.equals(String.valueOf(NumberUtil.FOUR))){
            result = MessageUtil.TOTAL_AMOUNT_OF_ORDER_PER_DAY + calculateService.getAvgNoOfOrderPerDay(productList);
        }
        return result;
    }
}
