/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ConversationsCreateResponse {
    
    public String contentType;

    public ConversationsCreateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ConversationsCreateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ConversationsCreateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response when name already in use
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsCreateErrorSchema;

    public ConversationsCreateResponse withConversationsCreateErrorSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsCreateErrorSchema) {
        this.conversationsCreateErrorSchema = conversationsCreateErrorSchema;
        return this;
    }
    
    /**
     * If successful, the command returns a rather stark [conversation object](/types/conversation)
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsCreateSuccessSchema;

    public ConversationsCreateResponse withConversationsCreateSuccessSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsCreateSuccessSchema) {
        this.conversationsCreateSuccessSchema = conversationsCreateSuccessSchema;
        return this;
    }
    
    public ConversationsCreateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
