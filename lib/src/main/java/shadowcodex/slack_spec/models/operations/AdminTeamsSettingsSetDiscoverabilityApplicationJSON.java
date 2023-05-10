/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminTeamsSettingsSetDiscoverabilityApplicationJSON {
    /**
     * This workspace's discovery setting. It must be set to one of `open`, `invite_only`, `closed`, or `unlisted`.
     */
    @JsonProperty("discoverability")
    public String discoverability;

    public AdminTeamsSettingsSetDiscoverabilityApplicationJSON withDiscoverability(String discoverability) {
        this.discoverability = discoverability;
        return this;
    }
    
    /**
     * The ID of the workspace to set discoverability on.
     */
    @JsonProperty("team_id")
    public String teamId;

    public AdminTeamsSettingsSetDiscoverabilityApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public AdminTeamsSettingsSetDiscoverabilityApplicationJSON(@JsonProperty("discoverability") String discoverability, @JsonProperty("team_id") String teamId) {
        this.discoverability = discoverability;
        this.teamId = teamId;
  }
}
