/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class UsergroupsEnableResponse {
    
    public String contentType;

    public UsergroupsEnableResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public UsergroupsEnableResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public UsergroupsEnableResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usergroupsEnableErrorSchema;

    public UsergroupsEnableResponse withUsergroupsEnableErrorSchema(java.util.Map<String, java.util.Map<String, Object>> usergroupsEnableErrorSchema) {
        this.usergroupsEnableErrorSchema = usergroupsEnableErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usergroupsEnableSchema;

    public UsergroupsEnableResponse withUsergroupsEnableSchema(java.util.Map<String, java.util.Map<String, Object>> usergroupsEnableSchema) {
        this.usergroupsEnableSchema = usergroupsEnableSchema;
        return this;
    }
    
    public UsergroupsEnableResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
