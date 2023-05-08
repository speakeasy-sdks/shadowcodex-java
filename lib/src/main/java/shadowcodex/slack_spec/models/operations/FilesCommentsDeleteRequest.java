/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class FilesCommentsDeleteRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public FilesCommentsDeleteApplicationJSON requestBody;
    public FilesCommentsDeleteRequest withRequestBody(FilesCommentsDeleteApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;
    public FilesCommentsDeleteRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public FilesCommentsDeleteRequest(){}
}
