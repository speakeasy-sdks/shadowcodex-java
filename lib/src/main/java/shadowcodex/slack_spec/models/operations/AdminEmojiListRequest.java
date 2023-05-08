/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class AdminEmojiListRequest {
    /**
     * Set `cursor` to `next_cursor` returned by the previous call to list items in the next page
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public AdminEmojiListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * The maximum number of items to return. Must be between 1 - 1000 both inclusive.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public AdminEmojiListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `admin.teams:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public AdminEmojiListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public AdminEmojiListRequest(@JsonProperty("token") String token) {
        this.token = token;
  }
}
