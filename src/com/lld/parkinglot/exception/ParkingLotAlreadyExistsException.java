package com.lld.parkinglot.exception;

import com.lld.parkinglot.model.ExitGate;

public class ParkingLotAlreadyExistsException extends Exception {

    public ParkingLotAlreadyExistsException() {
    }

    public ParkingLotAlreadyExistsException(String message) {
        super(message);
    }

    public ParkingLotAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingLotAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public ParkingLotAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
