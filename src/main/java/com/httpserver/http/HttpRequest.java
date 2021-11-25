package com.httpserver.http;

import com.httpserver.http.HttpMessage;

public class HttpRequest extends HttpMessage {



    private HttpMethod method;
    private String requestTarget;
    private String httpVersion;


     HttpRequest() {
    }


    public HttpMethod getMethod() {
        return method;
    }

     void setMethod(HttpMethod method) {
        this.method = method;
    }
}
