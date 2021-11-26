package com.httpserver.http;

import com.httpserver.config.HttpConfigurationException;
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

     void setMethod(String methodName) throws HttpParsingException {
         for (HttpMethod method: HttpMethod.values()){
             if(methodName.equals(method.name())){
                 this.method = method;
                 return;
             }
         }
        throw new HttpParsingException(
                HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED
        );
    }

     void setRequestTarget(String requestTarget) throws HttpParsingException {
         if(requestTarget == null || requestTarget.length() == 0){
             throw new HttpParsingException(HttpStatusCode.SERVER_ERROR_500_INTERNAL_SERVER_ERROR);
         }
         this.requestTarget = requestTarget;
    }

    public String getRequestTarget() {
        return requestTarget;
    }
}
