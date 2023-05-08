/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class UsergroupsUpdateResponse {
    
    public String contentType;
    public UsergroupsUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public UsergroupsUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public UsergroupsUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usergroupsUpdateErrorSchema;
    public UsergroupsUpdateResponse withUsergroupsUpdateErrorSchema(java.util.Map<String, java.util.Map<String, Object>> usergroupsUpdateErrorSchema) {
        this.usergroupsUpdateErrorSchema = usergroupsUpdateErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usergroupsUpdateSchema;
    public UsergroupsUpdateResponse withUsergroupsUpdateSchema(java.util.Map<String, java.util.Map<String, Object>> usergroupsUpdateSchema) {
        this.usergroupsUpdateSchema = usergroupsUpdateSchema;
        return this;
    }
    
    public UsergroupsUpdateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
