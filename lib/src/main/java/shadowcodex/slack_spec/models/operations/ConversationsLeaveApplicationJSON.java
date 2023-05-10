/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationsLeaveApplicationJSON {
    /**
     * Conversation to leave
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;

    public ConversationsLeaveApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    public ConversationsLeaveApplicationJSON(){}
}
