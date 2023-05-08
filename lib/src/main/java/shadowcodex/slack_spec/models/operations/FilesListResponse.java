/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FilesListResponse {
    
    public String contentType;
    public FilesListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public FilesListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public FilesListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesListErrorSchema;
    public FilesListResponse withFilesListErrorSchema(java.util.Map<String, java.util.Map<String, Object>> filesListErrorSchema) {
        this.filesListErrorSchema = filesListErrorSchema;
        return this;
    }
    
    /**
     * Typical success response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesListSchema;
    public FilesListResponse withFilesListSchema(java.util.Map<String, java.util.Map<String, Object>> filesListSchema) {
        this.filesListSchema = filesListSchema;
        return this;
    }
    
    public FilesListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
