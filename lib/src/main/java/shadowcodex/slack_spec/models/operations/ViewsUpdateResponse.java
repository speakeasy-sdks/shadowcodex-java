/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ViewsUpdateResponse {
    
    public String contentType;

    public ViewsUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Typical error response.
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate;

    public ViewsUpdateResponse withDefaultErrorTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultErrorTemplate) {
        this.defaultErrorTemplate = defaultErrorTemplate;
        return this;
    }
    
    /**
     * Typical success response includes the updated view payload.
     */
    
    public java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate;

    public ViewsUpdateResponse withDefaultSuccessTemplate(java.util.Map<String, java.util.Map<String, Object>> defaultSuccessTemplate) {
        this.defaultSuccessTemplate = defaultSuccessTemplate;
        return this;
    }
    
    
    public Integer statusCode;

    public ViewsUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ViewsUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ViewsUpdateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
