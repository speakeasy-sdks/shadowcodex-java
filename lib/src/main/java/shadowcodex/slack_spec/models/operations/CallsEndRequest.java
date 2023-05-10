/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class CallsEndRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public CallsEndApplicationJSON requestBody;

    public CallsEndRequest withRequestBody(CallsEndApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `calls:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public CallsEndRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public CallsEndRequest(@JsonProperty("RequestBody") CallsEndApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
