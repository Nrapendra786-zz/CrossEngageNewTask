package com.crossenagetask.services;

import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */

public interface CalculateService<T> {
    public long getAmountOfOrder(List<T> list);
    public long getTotalNoOfItemSold(List<T> list);
    public long getAvgNoOfItemPerOrder(List<T> list);
    public long getAvgNoOfOrderPerDay(List<T> list);
}
