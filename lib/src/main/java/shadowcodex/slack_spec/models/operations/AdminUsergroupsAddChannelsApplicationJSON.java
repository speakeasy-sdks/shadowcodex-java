/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminUsergroupsAddChannelsApplicationJSON {
    /**
     * Comma separated string of channel IDs.
     */
    @JsonProperty("channel_ids")
    public String channelIds;

    public AdminUsergroupsAddChannelsApplicationJSON withChannelIds(String channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    
    /**
     * The workspace to add default channels in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("team_id")
    public String teamId;

    public AdminUsergroupsAddChannelsApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    /**
     * ID of the IDP group to add default channels for.
     */
    @JsonProperty("usergroup_id")
    public String usergroupId;

    public AdminUsergroupsAddChannelsApplicationJSON withUsergroupId(String usergroupId) {
        this.usergroupId = usergroupId;
        return this;
    }
    
    public AdminUsergroupsAddChannelsApplicationJSON(@JsonProperty("channel_ids") String channelIds, @JsonProperty("usergroup_id") String usergroupId) {
        this.channelIds = channelIds;
        this.usergroupId = usergroupId;
  }
}
