package com.br.elit.elitConsumer.exception;

import javax.servlet.http.HttpServletRequest;

public class ApiException {
    private String errorMessage;
    private String method;
    private String path;
    private Object errorDetail;

    public ApiException(HttpServletRequest request, String errorMessage, Object errorDetail) {
        this.method = request.getMethod();
        this.path = request.getRequestURI();
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(Object errorDetail) {
        this.errorDetail = errorDetail;
    }
}
