package com.crossengagetasktest;

import com.crossenagetask.helpers.CalculateOperation;
import com.crossenagetask.model.Product;
import com.crossenagetask.utils.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class CalculateOperationTest {

    @Test
    public void testCalculateOperation(){
        CalculateOperation calculateOperation = new CalculateOperation();
        Product p1 = new Product();
        p1.setCountryId("DEU");
        p1.setDay(LocalDate.now());
        p1.setPricePerItem(new BigDecimal(10.0));
        p1.setProductCategoryId(1);
        p1.setQuantity(5);
        p1.setOrderId(1);
        p1.setProductId(2);
        Product p2 = new Product();
        p2.setCountryId("DEU");
        p2.setDay(LocalDate.now());
        p2.setPricePerItem(new BigDecimal(10.0));
        p2.setProductCategoryId(1);
        p2.setQuantity(5);
        p2.setOrderId(1);
        p2.setProductId(2);
        Product p3 = new Product();
        p3.setCountryId("DEU");
        p3.setDay(LocalDate.now());
        p3.setPricePerItem(new BigDecimal(10.0));
        p3.setProductCategoryId(1);
        p3.setQuantity(5);
        p3.setOrderId(1);
        p3.setProductId(2);
        Product p4 = new Product();
        p4.setCountryId("DEU");
        p4.setDay(LocalDate.now());
        p4.setPricePerItem(new BigDecimal(10.0));
        p4.setProductCategoryId(1);
        p4.setQuantity(5);
        p4.setOrderId(2);
        p4.setProductId(2);
        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        Assert.assertEquals(MessageUtil.TOTAL_AMOUNT_OF_ORDER + "2",calculateOperation.performCalculation(productList, "1"));
    }
}
