/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class BotsInfoRequest {
    /**
     * Bot user to get info on
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=bot")
    public String bot;
    public BotsInfoRequest withBot(String bot) {
        this.bot = bot;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `users:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public BotsInfoRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public BotsInfoRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
