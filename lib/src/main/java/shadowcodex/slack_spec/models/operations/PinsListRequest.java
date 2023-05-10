/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class PinsListRequest {
    /**
     * Channel to get pinned items for.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=channel")
    public String channel;

    public PinsListRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `pins:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;

    public PinsListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public PinsListRequest(@JsonProperty("channel") String channel, @JsonProperty("token") String token) {
        this.channel = channel;
        this.token = token;
  }
}
