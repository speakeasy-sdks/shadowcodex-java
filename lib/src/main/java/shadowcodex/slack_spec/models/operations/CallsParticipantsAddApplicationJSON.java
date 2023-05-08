/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallsParticipantsAddApplicationJSON {
    /**
     * `id` returned by the [`calls.add`](/methods/calls.add) method.
     */
    @JsonProperty("id")
    public String id;
    public CallsParticipantsAddApplicationJSON withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     */
    @JsonProperty("users")
    public String users;
    public CallsParticipantsAddApplicationJSON withUsers(String users) {
        this.users = users;
        return this;
    }
    
    public CallsParticipantsAddApplicationJSON(@JsonProperty("id") String id, @JsonProperty("users") String users) {
        this.id = id;
        this.users = users;
  }
}
