/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class UsersSetPhotoResponse {
    
    public String contentType;
    public UsersSetPhotoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public UsersSetPhotoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public UsersSetPhotoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usersSetPhotoErrorSchema;
    public UsersSetPhotoResponse withUsersSetPhotoErrorSchema(java.util.Map<String, java.util.Map<String, Object>> usersSetPhotoErrorSchema) {
        this.usersSetPhotoErrorSchema = usersSetPhotoErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> usersSetPhotoSchema;
    public UsersSetPhotoResponse withUsersSetPhotoSchema(java.util.Map<String, java.util.Map<String, Object>> usersSetPhotoSchema) {
        this.usersSetPhotoSchema = usersSetPhotoSchema;
        return this;
    }
    
    public UsersSetPhotoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
