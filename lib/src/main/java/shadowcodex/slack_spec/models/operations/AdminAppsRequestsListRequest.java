/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminAppsRequestsListRequest {
    /**
     * Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public AdminAppsRequestsListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * The maximum number of items to return. Must be between 1 - 1000 both inclusive.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public AdminAppsRequestsListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=team_id")
    public String teamId;
    public AdminAppsRequestsListRequest withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.apps:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public AdminAppsRequestsListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminAppsRequestsListRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
