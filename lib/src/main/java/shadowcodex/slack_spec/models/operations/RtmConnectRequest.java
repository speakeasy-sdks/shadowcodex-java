/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class RtmConnectRequest {
    /**
     * Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=batch_presence_aware")
    public Boolean batchPresenceAware;

    public RtmConnectRequest withBatchPresenceAware(Boolean batchPresenceAware) {
        this.batchPresenceAware = batchPresenceAware;
        return this;
    }
    
    /**
     * Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=presence_sub")
    public Boolean presenceSub;

    public RtmConnectRequest withPresenceSub(Boolean presenceSub) {
        this.presenceSub = presenceSub;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `rtm:stream`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;

    public RtmConnectRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public RtmConnectRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
