/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ConversationsMarkResponse {
    
    public String contentType;
    public ConversationsMarkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public ConversationsMarkResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ConversationsMarkResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsMarkErrorSchema;
    public ConversationsMarkResponse withConversationsMarkErrorSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsMarkErrorSchema) {
        this.conversationsMarkErrorSchema = conversationsMarkErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsMarkSuccessSchema;
    public ConversationsMarkResponse withConversationsMarkSuccessSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsMarkSuccessSchema) {
        this.conversationsMarkSuccessSchema = conversationsMarkSuccessSchema;
        return this;
    }
    
    public ConversationsMarkResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
