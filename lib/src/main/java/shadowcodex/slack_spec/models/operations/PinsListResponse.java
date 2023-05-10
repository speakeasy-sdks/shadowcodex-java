/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PinsListResponse {
    
    public String contentType;

    public PinsListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PinsListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PinsListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> pinsListErrorSchema;

    public PinsListResponse withPinsListErrorSchema(java.util.Map<String, java.util.Map<String, Object>> pinsListErrorSchema) {
        this.pinsListErrorSchema = pinsListErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, Object> pinsListSuccessSchema;

    public PinsListResponse withPinsListSuccessSchema(java.util.Map<String, Object> pinsListSuccessSchema) {
        this.pinsListSuccessSchema = pinsListSuccessSchema;
        return this;
    }
    
    public PinsListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
