/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminConversationsUnarchiveRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public AdminConversationsUnarchiveApplicationJSON requestBody;

    public AdminConversationsUnarchiveRequest withRequestBody(AdminConversationsUnarchiveApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.conversations:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public AdminConversationsUnarchiveRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminConversationsUnarchiveRequest(@JsonProperty("RequestBody") AdminConversationsUnarchiveApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
