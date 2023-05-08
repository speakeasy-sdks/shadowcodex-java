/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsergroupsUsersListRequest {
    /**
     * Allow results that involve disabled User Groups.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_disabled")
    public Boolean includeDisabled;
    public UsergroupsUsersListRequest withIncludeDisabled(Boolean includeDisabled) {
        this.includeDisabled = includeDisabled;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `usergroups:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public UsergroupsUsersListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * The encoded ID of the User Group to update.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=usergroup")
    public String usergroup;
    public UsergroupsUsersListRequest withUsergroup(String usergroup) {
        this.usergroup = usergroup;
        return this;
    }
    
    public UsergroupsUsersListRequest(@JsonProperty("token") String token, @JsonProperty("usergroup") String usergroup) {
        this.token = token;
        this.usergroup = usergroup;
  }
}
