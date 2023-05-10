/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ConversationsInfoResponse {
    
    public String contentType;

    public ConversationsInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ConversationsInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ConversationsInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response when a channel cannot be found
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsInfoErrorSchema;

    public ConversationsInfoResponse withConversationsInfoErrorSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsInfoErrorSchema) {
        this.conversationsInfoErrorSchema = conversationsInfoErrorSchema;
        return this;
    }
    
    /**
     * Typical success response for a public channel. (Also, a response from a private channel and a multi-party IM is very similar to this example.)
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> conversationsInfoSuccessSchema;

    public ConversationsInfoResponse withConversationsInfoSuccessSchema(java.util.Map<String, java.util.Map<String, Object>> conversationsInfoSuccessSchema) {
        this.conversationsInfoSuccessSchema = conversationsInfoSuccessSchema;
        return this;
    }
    
    public ConversationsInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
