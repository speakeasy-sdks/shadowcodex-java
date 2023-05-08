/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ChatMeMessageResponse {
    
    public String contentType;
    public ChatMeMessageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public ChatMeMessageResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ChatMeMessageResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> chatMeMessageErrorSchema;
    public ChatMeMessageResponse withChatMeMessageErrorSchema(java.util.Map<String, java.util.Map<String, Object>> chatMeMessageErrorSchema) {
        this.chatMeMessageErrorSchema = chatMeMessageErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> chatMeMessageSchema;
    public ChatMeMessageResponse withChatMeMessageSchema(java.util.Map<String, java.util.Map<String, Object>> chatMeMessageSchema) {
        this.chatMeMessageSchema = chatMeMessageSchema;
        return this;
    }
    
    public ChatMeMessageResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
