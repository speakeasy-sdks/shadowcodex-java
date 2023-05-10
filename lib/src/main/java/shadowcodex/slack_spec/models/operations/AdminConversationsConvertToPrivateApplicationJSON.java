/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminConversationsConvertToPrivateApplicationJSON {
    /**
     * The channel to convert to private.
     */
    @JsonProperty("channel_id")
    public String channelId;

    public AdminConversationsConvertToPrivateApplicationJSON withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    
    public AdminConversationsConvertToPrivateApplicationJSON(@JsonProperty("channel_id") String channelId) {
        this.channelId = channelId;
  }
}
