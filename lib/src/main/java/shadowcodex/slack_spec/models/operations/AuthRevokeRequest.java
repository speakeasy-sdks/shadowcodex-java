/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AuthRevokeRequest {
    /**
     * Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=test")
    public Boolean test;

    public AuthRevokeRequest withTest(Boolean test) {
        this.test = test;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `none`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;

    public AuthRevokeRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AuthRevokeRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
