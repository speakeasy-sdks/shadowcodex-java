/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilesSharedPublicURLApplicationJSON {
    /**
     * File to share
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;

    public FilesSharedPublicURLApplicationJSON withFile(String file) {
        this.file = file;
        return this;
    }
    
    public FilesSharedPublicURLApplicationJSON(){}
}
