/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class CallsParticipantsAddRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public CallsParticipantsAddApplicationJSON requestBody;

    public CallsParticipantsAddRequest withRequestBody(CallsParticipantsAddApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `calls:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public CallsParticipantsAddRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public CallsParticipantsAddRequest(@JsonProperty("RequestBody") CallsParticipantsAddApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
