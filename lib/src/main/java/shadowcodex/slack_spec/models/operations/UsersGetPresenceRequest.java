/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsersGetPresenceRequest {
    /**
     * Authentication token. Requires scope: `users:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public UsersGetPresenceRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * User to get presence info on. Defaults to the authed user.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public UsersGetPresenceRequest withUser(String user) {
        this.user = user;
        return this;
    }
    
    public UsersGetPresenceRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
