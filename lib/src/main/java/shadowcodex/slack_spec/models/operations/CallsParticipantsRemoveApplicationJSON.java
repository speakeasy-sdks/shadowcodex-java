/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallsParticipantsRemoveApplicationJSON {
    /**
     * `id` returned by the [`calls.add`](/methods/calls.add) method.
     */
    @JsonProperty("id")
    public String id;

    public CallsParticipantsRemoveApplicationJSON withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).
     */
    @JsonProperty("users")
    public String users;

    public CallsParticipantsRemoveApplicationJSON withUsers(String users) {
        this.users = users;
        return this;
    }
    
    public CallsParticipantsRemoveApplicationJSON(@JsonProperty("id") String id, @JsonProperty("users") String users) {
        this.id = id;
        this.users = users;
  }
}
