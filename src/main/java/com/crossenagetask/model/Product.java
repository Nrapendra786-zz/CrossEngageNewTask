package com.crossenagetask.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class Product {
    private LocalDate day;
    private String countryId;
    private int orderId;
    private int productCategoryId;
    private int productId;
    private int quantity;
    private BigDecimal pricePerItem;

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public String getCountryId() {
        return countryId;
    }

    public BigDecimal getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(BigDecimal pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
