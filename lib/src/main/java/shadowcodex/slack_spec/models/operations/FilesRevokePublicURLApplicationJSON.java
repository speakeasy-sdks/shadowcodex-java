/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilesRevokePublicURLApplicationJSON {
    /**
     * File to revoke
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;

    public FilesRevokePublicURLApplicationJSON withFile(String file) {
        this.file = file;
        return this;
    }
    
    public FilesRevokePublicURLApplicationJSON(){}
}
