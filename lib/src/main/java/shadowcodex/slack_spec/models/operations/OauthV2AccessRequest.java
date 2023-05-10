/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class OauthV2AccessRequest {
    /**
     * Issued when you created your application.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_id")
    public String clientId;

    public OauthV2AccessRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Issued when you created your application.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=client_secret")
    public String clientSecret;

    public OauthV2AccessRequest withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    
    /**
     * The `code` param returned via the OAuth callback.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=code")
    public String code;

    public OauthV2AccessRequest withCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * This must match the originally submitted URI (if one was sent).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=redirect_uri")
    public String redirectUri;

    public OauthV2AccessRequest withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    
    public OauthV2AccessRequest(@JsonProperty("code") String code) {
        this.code = code;
  }
}
