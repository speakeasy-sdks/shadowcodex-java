/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class FilesDeleteRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public FilesDeleteApplicationJSON requestBody;

    public FilesDeleteRequest withRequestBody(FilesDeleteApplicationJSON requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=token")
    public String token;

    public FilesDeleteRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public FilesDeleteRequest(){}
}
