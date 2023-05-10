/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationsUnarchiveApplicationJSON {
    /**
     * ID of conversation to unarchive
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;

    public ConversationsUnarchiveApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    public ConversationsUnarchiveApplicationJSON(){}
}
