/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationsOpenApplicationJSON {
    /**
     * Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;
    public ConversationsOpenApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Boolean, indicates you want the full IM channel definition in the response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("return_im")
    public Boolean returnIm;
    public ConversationsOpenApplicationJSON withReturnIm(Boolean returnIm) {
        this.returnIm = returnIm;
        return this;
    }
    
    /**
     * Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("users")
    public String users;
    public ConversationsOpenApplicationJSON withUsers(String users) {
        this.users = users;
        return this;
    }
    
    public ConversationsOpenApplicationJSON(){}
}
