/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminConversationsDeleteApplicationJSON {
    /**
     * The channel to delete.
     */
    @JsonProperty("channel_id")
    public String channelId;

    public AdminConversationsDeleteApplicationJSON withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    
    public AdminConversationsDeleteApplicationJSON(@JsonProperty("channel_id") String channelId) {
        this.channelId = channelId;
  }
}
