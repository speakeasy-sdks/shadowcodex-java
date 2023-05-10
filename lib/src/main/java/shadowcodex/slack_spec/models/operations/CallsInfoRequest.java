/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class CallsInfoRequest {
    /**
     * `id` of the Call returned by the [`calls.add`](/methods/calls.add) method.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;

    public CallsInfoRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `calls:read`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public CallsInfoRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public CallsInfoRequest(@JsonProperty("id") String id, @JsonProperty("token") String token) {
        this.id = id;
        this.token = token;
  }
}
