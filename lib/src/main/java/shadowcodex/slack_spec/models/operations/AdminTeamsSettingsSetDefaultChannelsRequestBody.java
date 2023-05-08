/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminTeamsSettingsSetDefaultChannelsRequestBody {
    /**
     * An array of channel IDs.
     */
    @SpeakeasyMetadata("form:name=channel_ids")
    public String channelIds;
    public AdminTeamsSettingsSetDefaultChannelsRequestBody withChannelIds(String channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    
    /**
     * ID for the workspace to set the default channel for.
     */
    @SpeakeasyMetadata("form:name=team_id")
    public String teamId;
    public AdminTeamsSettingsSetDefaultChannelsRequestBody withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.teams:write`
     */
    @SpeakeasyMetadata("form:name=token")
    public String token;
    public AdminTeamsSettingsSetDefaultChannelsRequestBody withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminTeamsSettingsSetDefaultChannelsRequestBody(@JsonProperty("channel_ids") String channelIds, @JsonProperty("team_id") String teamId, @JsonProperty("token") String token) {
        this.channelIds = channelIds;
        this.teamId = teamId;
        this.token = token;
  }
}
