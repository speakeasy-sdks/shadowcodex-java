/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class RemindersCompleteRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public RemindersCompleteApplicationJSON requestBody;

    public RemindersCompleteRequest withRequestBody(RemindersCompleteApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public RemindersCompleteRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public RemindersCompleteRequest(){}
}
