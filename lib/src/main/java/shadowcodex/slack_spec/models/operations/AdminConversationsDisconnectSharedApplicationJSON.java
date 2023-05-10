/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminConversationsDisconnectSharedApplicationJSON {
    /**
     * The channel to be disconnected from some workspaces.
     */
    @JsonProperty("channel_id")
    public String channelId;

    public AdminConversationsDisconnectSharedApplicationJSON withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    
    /**
     * The team to be removed from the channel. Currently only a single team id can be specified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leaving_team_ids")
    public String leavingTeamIds;

    public AdminConversationsDisconnectSharedApplicationJSON withLeavingTeamIds(String leavingTeamIds) {
        this.leavingTeamIds = leavingTeamIds;
        return this;
    }
    
    public AdminConversationsDisconnectSharedApplicationJSON(@JsonProperty("channel_id") String channelId) {
        this.channelId = channelId;
  }
}
