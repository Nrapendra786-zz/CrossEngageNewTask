package com.crossenagetask.services;

import com.crossenagetask.model.Product;

import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class CalculateServiceImpl implements CalculateService<Product> {

    @Override
    public long getAmountOfOrder(List<Product> productList) {
        long amountOfOrder = productList.stream().mapToLong((Product p) -> p.getOrderId()).distinct().count();
        return amountOfOrder;
    }

    @Override
    public long getTotalNoOfItemSold(List<Product> productList) {
        int totalNoOfItemSold = productList.stream().mapToInt((Product p) -> p.getQuantity()).sum();
        return totalNoOfItemSold;
    }

    @Override
    public long getAvgNoOfItemPerOrder(List<Product> productList) {
        long totalNoOfItemSold = productList.stream().mapToLong((Product p) -> p.getQuantity()).sum();
        long amountOfOrder = productList.stream().mapToLong((Product p) -> p.getOrderId()).distinct().count();;
        long avgNoOfItemPerOrder = totalNoOfItemSold/amountOfOrder;
        return avgNoOfItemPerOrder;
    }

    @Override
    public long getAvgNoOfOrderPerDay(List<Product> productList) {
        long amountOfOrder = productList.stream().mapToLong((Product p) -> p.getOrderId()).distinct().count();
        long noOfTotaldays = productList.stream().map((Product p) -> (p.getDay())).distinct().count();
        long avgOrderPerDay = amountOfOrder/noOfTotaldays;
        return avgOrderPerDay;
    }
}
