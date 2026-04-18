package com.ptithcm.neethgieplus.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {

    // ===== SYSTEM (9xxx) =====
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(9001, "Invalid key", HttpStatus.BAD_REQUEST),
    VALIDATION_ERROR(9002, "Validation failed", HttpStatus.BAD_REQUEST),
    CATEGORY_NOT_DELETED(9003, "Category cannot be deleted because it has child categories or associated books", HttpStatus.BAD_REQUEST),
    CATEGORY_ALREADY_EXISTS(9004, "Category name already exists", HttpStatus.CONFLICT),
    CATEGORY_ALREADY_DELETED(9005, "Category already deleted", HttpStatus.BAD_REQUEST),
    INVALID_PARENT_CATEGORY(9006, "Invalid parent category", HttpStatus.BAD_REQUEST),
    TOKEN_NOT_PROVIDED(9007, "Token not provided", HttpStatus.UNAUTHORIZED),
    // ===== AUTH (1xxx) =====
    UNAUTHENTICATED(1001, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    ACCESS_DENIED(1002, "You do not have permission", HttpStatus.FORBIDDEN);



    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;
    private HttpStatusCode statusCode;
}