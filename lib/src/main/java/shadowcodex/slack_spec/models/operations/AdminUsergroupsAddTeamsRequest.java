/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminUsergroupsAddTeamsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public AdminUsergroupsAddTeamsApplicationJSON requestBody;

    public AdminUsergroupsAddTeamsRequest withRequestBody(AdminUsergroupsAddTeamsApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.teams:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public AdminUsergroupsAddTeamsRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminUsergroupsAddTeamsRequest(@JsonProperty("RequestBody") AdminUsergroupsAddTeamsApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
