/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class AdminConversationsDisconnectSharedResponse {
    
    public String contentType;
    public AdminConversationsDisconnectSharedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public AdminConversationsDisconnectSharedResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public AdminConversationsDisconnectSharedResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> adminConversationsDisconnectSharedErrorSchema;
    public AdminConversationsDisconnectSharedResponse withAdminConversationsDisconnectSharedErrorSchema(java.util.Map<String, java.util.Map<String, Object>> adminConversationsDisconnectSharedErrorSchema) {
        this.adminConversationsDisconnectSharedErrorSchema = adminConversationsDisconnectSharedErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> adminConversationsRenameSchema;
    public AdminConversationsDisconnectSharedResponse withAdminConversationsRenameSchema(java.util.Map<String, java.util.Map<String, Object>> adminConversationsRenameSchema) {
        this.adminConversationsRenameSchema = adminConversationsRenameSchema;
        return this;
    }
    
    public AdminConversationsDisconnectSharedResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
