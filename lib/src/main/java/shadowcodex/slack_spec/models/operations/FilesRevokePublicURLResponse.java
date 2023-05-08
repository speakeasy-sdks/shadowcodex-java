/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FilesRevokePublicURLResponse {
    
    public String contentType;
    public FilesRevokePublicURLResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public FilesRevokePublicURLResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public FilesRevokePublicURLResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesRevokePublicURLErrorSchema;
    public FilesRevokePublicURLResponse withFilesRevokePublicURLErrorSchema(java.util.Map<String, java.util.Map<String, Object>> filesRevokePublicURLErrorSchema) {
        this.filesRevokePublicURLErrorSchema = filesRevokePublicURLErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesRevokePublicURLSchema;
    public FilesRevokePublicURLResponse withFilesRevokePublicURLSchema(java.util.Map<String, java.util.Map<String, Object>> filesRevokePublicURLSchema) {
        this.filesRevokePublicURLSchema = filesRevokePublicURLSchema;
        return this;
    }
    
    public FilesRevokePublicURLResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
