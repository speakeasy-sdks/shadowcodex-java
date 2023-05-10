/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsergroupsUsersUpdateSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    public String slackAuth;

    public UsergroupsUsersUpdateSecurity withSlackAuth(String slackAuth) {
        this.slackAuth = slackAuth;
        return this;
    }
    
    public UsergroupsUsersUpdateSecurity(@JsonProperty("slackAuth") String slackAuth) {
        this.slackAuth = slackAuth;
  }
}
