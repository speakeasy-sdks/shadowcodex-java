/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RemindersCompleteApplicationJSON {
    /**
     * The ID of the reminder to be marked as complete
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reminder")
    public String reminder;
    public RemindersCompleteApplicationJSON withReminder(String reminder) {
        this.reminder = reminder;
        return this;
    }
    
    public RemindersCompleteApplicationJSON(){}
}
