/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsergroupsUpdateApplicationJSON {
    /**
     * A comma separated string of encoded channel IDs for which the User Group uses as a default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channels")
    public String channels;

    public UsergroupsUpdateApplicationJSON withChannels(String channels) {
        this.channels = channels;
        return this;
    }
    
    /**
     * A short description of the User Group.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public UsergroupsUpdateApplicationJSON withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * A mention handle. Must be unique among channels, users and User Groups.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("handle")
    public String handle;

    public UsergroupsUpdateApplicationJSON withHandle(String handle) {
        this.handle = handle;
        return this;
    }
    
    /**
     * Include the number of users in the User Group.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_count")
    public Boolean includeCount;

    public UsergroupsUpdateApplicationJSON withIncludeCount(Boolean includeCount) {
        this.includeCount = includeCount;
        return this;
    }
    
    /**
     * A name for the User Group. Must be unique among User Groups.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public UsergroupsUpdateApplicationJSON withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The encoded ID of the User Group to update.
     */
    @JsonProperty("usergroup")
    public String usergroup;

    public UsergroupsUpdateApplicationJSON withUsergroup(String usergroup) {
        this.usergroup = usergroup;
        return this;
    }
    
    public UsergroupsUpdateApplicationJSON(@JsonProperty("usergroup") String usergroup) {
        this.usergroup = usergroup;
  }
}
