package com.crossenagetask.services;

import com.crossenagetask.enums.ErrorRepository;
import com.crossenagetask.exceptions.NotFoundException;
import com.crossenagetask.utils.AppUtil;
import com.crossenagetask.utils.NumberUtil;
import com.crossenagetask.model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class CsvFileReader implements IReader<Product> {

    public List<Product> read() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream(AppUtil.CSV_FILE_PATH);
        if (inputStream == null) {
            throw new NotFoundException(ErrorRepository.CSV_FILE_NOT_FOUND);
        }
        List<Product> products = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                String[] records = line.split(AppUtil.COMMA);
                Product product = new Product();
                product.setDay(LocalDate.parse(records[NumberUtil.ZER0], DateTimeFormatter.BASIC_ISO_DATE));
                product.setCountryId(records[NumberUtil.ONE]);
                product.setOrderId(Integer.parseInt(records[NumberUtil.TWO]));
                product.setProductCategoryId(Integer.parseInt(records[NumberUtil.THREE]));
                product.setProductId(Integer.parseInt(records[NumberUtil.FOUR]));
                product.setQuantity(Integer.parseInt(records[NumberUtil.FIVE]));
                product.setPricePerItem(new BigDecimal(records[NumberUtil.SIX]));
                products.add(product);
            }
        }
        return products;
    }
}
