package com.Suraj.BookNest.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;


public enum BusinessErrorCodes {

    NO_CODE(0, NOT_IMPLEMENTED, "No Code"),
    INCORRECT_CURRENT_PASSWORD(300, BAD_REQUEST, "Current Password is Incorrect"),
    NEW_PASSWORD_NOT_MATCH(301, BAD_REQUEST, "New Password does not match"),
    ACCOUNT_LOCKED(302, FORBIDDEN, "User Account is Locked"),
    ACCOUNT_DISABLED(303, FORBIDDEN, "User Account is Disabled"),
    BAD_CREDENTIALS(304, FORBIDDEN, "User Email or Password is Incorrect"),
    ;
    @Getter
    private final int code;

    @Getter
    private final HttpStatus httpStatus;

    @Getter
    private final String description;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.description = description;
    }
}
