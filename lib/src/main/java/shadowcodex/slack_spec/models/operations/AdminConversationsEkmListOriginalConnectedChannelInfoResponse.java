/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class AdminConversationsEkmListOriginalConnectedChannelInfoResponse {
    
    public String contentType;

    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate;

    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse withDefaultErrorTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate) {
        this.defaultErrorTemplate = defaultErrorTemplate;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate;

    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse withDefaultSuccessTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate) {
        this.defaultSuccessTemplate = defaultSuccessTemplate;
        return this;
    }
    
    
    public Integer statusCode;

    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public AdminConversationsEkmListOriginalConnectedChannelInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
