/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AppsPermissionsScopesListRequest {
    /**
     * Authentication token. Requires scope: `none`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public AppsPermissionsScopesListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AppsPermissionsScopesListRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
