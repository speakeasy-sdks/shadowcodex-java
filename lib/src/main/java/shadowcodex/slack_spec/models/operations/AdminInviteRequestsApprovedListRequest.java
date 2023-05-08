/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminInviteRequestsApprovedListRequest {
    /**
     * Value of the `next_cursor` field sent as part of the previous API response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public AdminInviteRequestsApprovedListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * The number of results that will be returned by the API on each invocation. Must be between 1 - 1000, both inclusive
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public AdminInviteRequestsApprovedListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * ID for the workspace where the invite requests were made.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=team_id")
    public String teamId;
    public AdminInviteRequestsApprovedListRequest withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.invites:read`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;
    public AdminInviteRequestsApprovedListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminInviteRequestsApprovedListRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
