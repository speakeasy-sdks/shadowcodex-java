/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class TeamProfileGetResponse {
    
    public String contentType;
    public TeamProfileGetResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public TeamProfileGetResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public TeamProfileGetResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> teamProfileGetErrorSchema;
    public TeamProfileGetResponse withTeamProfileGetErrorSchema(java.util.Map<String, java.util.Map<String, Object>> teamProfileGetErrorSchema) {
        this.teamProfileGetErrorSchema = teamProfileGetErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> teamProfileGetSuccessSchema;
    public TeamProfileGetResponse withTeamProfileGetSuccessSchema(java.util.Map<String, java.util.Map<String, Object>> teamProfileGetSuccessSchema) {
        this.teamProfileGetSuccessSchema = teamProfileGetSuccessSchema;
        return this;
    }
    
    public TeamProfileGetResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
