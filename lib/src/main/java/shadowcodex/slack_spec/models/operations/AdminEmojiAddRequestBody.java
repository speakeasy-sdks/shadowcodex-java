/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminEmojiAddRequestBody {
    /**
     * The name of the emoji to be removed. Colons (`:myemoji:`) around the value are not required, although they may be included.
     */
    @SpeakeasyMetadata("form:name=name")
    public String name;

    public AdminEmojiAddRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.teams:write`
     */
    @SpeakeasyMetadata("form:name=token")
    public String token;

    public AdminEmojiAddRequestBody withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * The URL of a file to use as an image for the emoji. Square images under 128KB and with transparent backgrounds work best.
     */
    @SpeakeasyMetadata("form:name=url")
    public String url;

    public AdminEmojiAddRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public AdminEmojiAddRequestBody(@JsonProperty("name") String name, @JsonProperty("token") String token, @JsonProperty("url") String url) {
        this.name = name;
        this.token = token;
        this.url = url;
  }
}
