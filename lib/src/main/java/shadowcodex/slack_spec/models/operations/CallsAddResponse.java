/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CallsAddResponse {
    
    public String contentType;
    public CallsAddResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate;
    public CallsAddResponse withDefaultErrorTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate) {
        this.defaultErrorTemplate = defaultErrorTemplate;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate;
    public CallsAddResponse withDefaultSuccessTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate) {
        this.defaultSuccessTemplate = defaultSuccessTemplate;
        return this;
    }
    
    
    public Integer statusCode;
    public CallsAddResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public CallsAddResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CallsAddResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
