/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationsSetTopicApplicationJSON {
    /**
     * Conversation to set the topic of
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;
    public ConversationsSetTopicApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * The new topic string. Does not support formatting or linkification.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("topic")
    public String topic;
    public ConversationsSetTopicApplicationJSON withTopic(String topic) {
        this.topic = topic;
        return this;
    }
    
    public ConversationsSetTopicApplicationJSON(){}
}
