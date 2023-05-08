/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminUsersSetExpirationApplicationJSON {
    /**
     * Timestamp when guest account should be disabled.
     */
    @JsonProperty("expiration_ts")
    public Integer expirationTs;
    public AdminUsersSetExpirationApplicationJSON withExpirationTs(Integer expirationTs) {
        this.expirationTs = expirationTs;
        return this;
    }
    
    /**
     * The ID (`T1234`) of the workspace.
     */
    @JsonProperty("team_id")
    public String teamId;
    public AdminUsersSetExpirationApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    /**
     * The ID of the user to set an expiration for.
     */
    @JsonProperty("user_id")
    public String userId;
    public AdminUsersSetExpirationApplicationJSON withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public AdminUsersSetExpirationApplicationJSON(@JsonProperty("expiration_ts") Integer expirationTs, @JsonProperty("team_id") String teamId, @JsonProperty("user_id") String userId) {
        this.expirationTs = expirationTs;
        this.teamId = teamId;
        this.userId = userId;
  }
}
