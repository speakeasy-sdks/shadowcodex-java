/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class StarsRemoveResponse {
    
    public String contentType;
    public StarsRemoveResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public StarsRemoveResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public StarsRemoveResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> starsRemoveErrorSchema;
    public StarsRemoveResponse withStarsRemoveErrorSchema(java.util.Map<String, java.util.Map<String, Object>> starsRemoveErrorSchema) {
        this.starsRemoveErrorSchema = starsRemoveErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> starsRemoveSchema;
    public StarsRemoveResponse withStarsRemoveSchema(java.util.Map<String, java.util.Map<String, Object>> starsRemoveSchema) {
        this.starsRemoveSchema = starsRemoveSchema;
        return this;
    }
    
    public StarsRemoveResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
