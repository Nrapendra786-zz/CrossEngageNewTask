package com.crossenagetask.exceptions;

import com.crossenagetask.enums.ErrorRepository;

/**
 * Created by NrapendraKumar on 14-03-2016.
 */
public class NotFoundException extends RuntimeException {

    private String message;

    public NotFoundException() {
        super();
    }

    public NotFoundException(ErrorRepository errorRepository) {
        super(errorRepository.getDescription());
        this.message = errorRepository.getDescription();
    }

    @Override
    public String toString() {
        return message;
    }
}
