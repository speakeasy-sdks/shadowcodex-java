/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ChatDeleteResponse {
    
    public String contentType;
    public ChatDeleteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public ChatDeleteResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ChatDeleteResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> chatDeleteErrorSchema;
    public ChatDeleteResponse withChatDeleteErrorSchema(java.util.Map<String, java.util.Map<String, Object>> chatDeleteErrorSchema) {
        this.chatDeleteErrorSchema = chatDeleteErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> chatDeleteSuccessSchema;
    public ChatDeleteResponse withChatDeleteSuccessSchema(java.util.Map<String, java.util.Map<String, Object>> chatDeleteSuccessSchema) {
        this.chatDeleteSuccessSchema = chatDeleteSuccessSchema;
        return this;
    }
    
    public ChatDeleteResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
