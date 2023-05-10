/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationsSetPurposeApplicationJSON {
    /**
     * Conversation to set the purpose of
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;

    public ConversationsSetPurposeApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * A new, specialer purpose
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("purpose")
    public String purpose;

    public ConversationsSetPurposeApplicationJSON withPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    
    public ConversationsSetPurposeApplicationJSON(){}
}
