/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class FilesRemoteRemoveRequestBody {
    /**
     * Creator defined GUID for the file.
     */
    @SpeakeasyMetadata("form:name=external_id")
    public String externalId;
    public FilesRemoteRemoveRequestBody withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    /**
     * Specify a file by providing its ID.
     */
    @SpeakeasyMetadata("form:name=file")
    public String file;
    public FilesRemoteRemoveRequestBody withFile(String file) {
        this.file = file;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `remote_files:write`
     */
    @SpeakeasyMetadata("form:name=token")
    public String token;
    public FilesRemoteRemoveRequestBody withToken(String token) {
        this.token = token;
        return this;
    }
    
    public FilesRemoteRemoveRequestBody(){}
}
