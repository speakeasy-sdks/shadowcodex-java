/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FilesUploadResponse {
    
    public String contentType;
    public FilesUploadResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public FilesUploadResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public FilesUploadResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Typical error response
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesUploadErrorSchema;
    public FilesUploadResponse withFilesUploadErrorSchema(java.util.Map<String, java.util.Map<String, Object>> filesUploadErrorSchema) {
        this.filesUploadErrorSchema = filesUploadErrorSchema;
        return this;
    }
    
    /**
     * Success response after uploading a file to a channel with an initial message
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> filesUploadSchema;
    public FilesUploadResponse withFilesUploadSchema(java.util.Map<String, java.util.Map<String, Object>> filesUploadSchema) {
        this.filesUploadSchema = filesUploadSchema;
        return this;
    }
    
    public FilesUploadResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
