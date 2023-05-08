/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilesCommentsDeleteApplicationJSON {
    /**
     * File to delete a comment from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;
    public FilesCommentsDeleteApplicationJSON withFile(String file) {
        this.file = file;
        return this;
    }
    
    /**
     * The comment to delete.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public FilesCommentsDeleteApplicationJSON withId(String id) {
        this.id = id;
        return this;
    }
    
    public FilesCommentsDeleteApplicationJSON(){}
}
