/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminInviteRequestsApproveApplicationJSON {
    /**
     * ID of the request to invite.
     */
    @JsonProperty("invite_request_id")
    public String inviteRequestId;
    public AdminInviteRequestsApproveApplicationJSON withInviteRequestId(String inviteRequestId) {
        this.inviteRequestId = inviteRequestId;
        return this;
    }
    
    /**
     * ID for the workspace where the invite request was made.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("team_id")
    public String teamId;
    public AdminInviteRequestsApproveApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public AdminInviteRequestsApproveApplicationJSON(@JsonProperty("invite_request_id") String inviteRequestId) {
        this.inviteRequestId = inviteRequestId;
  }
}
