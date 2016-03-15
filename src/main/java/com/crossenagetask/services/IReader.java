package com.crossenagetask.services;

import java.io.IOException;
import java.util.List;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public interface IReader<T> {
    public List<T> read() throws IOException;
}
