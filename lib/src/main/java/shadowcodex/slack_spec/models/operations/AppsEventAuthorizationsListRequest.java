/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AppsEventAuthorizationsListRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public AppsEventAuthorizationsListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=event_context")
    public String eventContext;
    public AppsEventAuthorizationsListRequest withEventContext(String eventContext) {
        this.eventContext = eventContext;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public AppsEventAuthorizationsListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `authorizations:read`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;
    public AppsEventAuthorizationsListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AppsEventAuthorizationsListRequest(@JsonProperty("event_context") String eventContext, @JsonProperty("token") String token) {
        this.eventContext = eventContext;
        this.token = token;
  }
}
