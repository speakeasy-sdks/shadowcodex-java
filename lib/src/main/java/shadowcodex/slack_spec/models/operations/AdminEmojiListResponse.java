/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class AdminEmojiListResponse {
    
    public String contentType;
    public AdminEmojiListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate;
    public AdminEmojiListResponse withDefaultErrorTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate) {
        this.defaultErrorTemplate = defaultErrorTemplate;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate;
    public AdminEmojiListResponse withDefaultSuccessTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate) {
        this.defaultSuccessTemplate = defaultSuccessTemplate;
        return this;
    }
    
    
    public Integer statusCode;
    public AdminEmojiListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public AdminEmojiListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public AdminEmojiListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
