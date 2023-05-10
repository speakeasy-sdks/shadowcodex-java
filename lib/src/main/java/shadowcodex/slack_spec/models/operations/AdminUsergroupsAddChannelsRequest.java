/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminUsergroupsAddChannelsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public AdminUsergroupsAddChannelsApplicationJSON requestBody;

    public AdminUsergroupsAddChannelsRequest withRequestBody(AdminUsergroupsAddChannelsApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.usergroups:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public AdminUsergroupsAddChannelsRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminUsergroupsAddChannelsRequest(@JsonProperty("RequestBody") AdminUsergroupsAddChannelsApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
