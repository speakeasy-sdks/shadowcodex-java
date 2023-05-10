/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class ViewsPushRequest {
    /**
     * Authentication token. Requires scope: `none`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public ViewsPushRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * Exchange a trigger to post to the user.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=trigger_id")
    public String triggerId;

    public ViewsPushRequest withTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    
    /**
     * A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=view")
    public String view;

    public ViewsPushRequest withView(String view) {
        this.view = view;
        return this;
    }
    
    public ViewsPushRequest(@JsonProperty("token") String token, @JsonProperty("trigger_id") String triggerId, @JsonProperty("view") String view) {
        this.token = token;
        this.triggerId = triggerId;
        this.view = view;
  }
}
