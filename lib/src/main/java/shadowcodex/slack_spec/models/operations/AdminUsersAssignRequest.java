/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminUsersAssignRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public AdminUsersAssignApplicationJSON requestBody;
    public AdminUsersAssignRequest withRequestBody(AdminUsersAssignApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.users:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;
    public AdminUsersAssignRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminUsersAssignRequest(@JsonProperty("RequestBody") AdminUsersAssignApplicationJSON requestBody, @JsonProperty("token") String token) {
        this.requestBody = requestBody;
        this.token = token;
  }
}
