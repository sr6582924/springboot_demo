package com.example.demo.models;

public  class  Response <T> {

    public Response(int code, String msg, T body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
    }

    private int code;
    private String msg;

    private T body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
