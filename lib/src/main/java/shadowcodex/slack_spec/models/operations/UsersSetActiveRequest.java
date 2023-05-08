/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsersSetActiveRequest {
    /**
     * Authentication token. Requires scope: `users:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;
    public UsersSetActiveRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public UsersSetActiveRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
