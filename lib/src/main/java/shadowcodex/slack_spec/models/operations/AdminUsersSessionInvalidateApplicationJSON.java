/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminUsersSessionInvalidateApplicationJSON {
    @JsonProperty("session_id")
    public Integer sessionId;

    public AdminUsersSessionInvalidateApplicationJSON withSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    /**
     * ID of the team that the session belongs to
     */
    @JsonProperty("team_id")
    public String teamId;

    public AdminUsersSessionInvalidateApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public AdminUsersSessionInvalidateApplicationJSON(@JsonProperty("session_id") Integer sessionId, @JsonProperty("team_id") String teamId) {
        this.sessionId = sessionId;
        this.teamId = teamId;
  }
}
