/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class TeamBillableInfoRequest {
    /**
     * Authentication token. Requires scope: `admin`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;

    public TeamBillableInfoRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * A user to retrieve the billable information for. Defaults to all users.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;

    public TeamBillableInfoRequest withUser(String user) {
        this.user = user;
        return this;
    }
    
    public TeamBillableInfoRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
