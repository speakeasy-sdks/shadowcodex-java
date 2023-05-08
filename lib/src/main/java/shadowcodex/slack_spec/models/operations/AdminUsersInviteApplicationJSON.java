/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminUsersInviteApplicationJSON {
    /**
     * A comma-separated list of `channel_id`s for this user to join. At least one channel is required.
     */
    @JsonProperty("channel_ids")
    public String channelIds;
    public AdminUsersInviteApplicationJSON withChannelIds(String channelIds) {
        this.channelIds = channelIds;
        return this;
    }
    
    /**
     * An optional message to send to the user in the invite email.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_message")
    public String customMessage;
    public AdminUsersInviteApplicationJSON withCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    
    /**
     * The email address of the person to invite.
     */
    @JsonProperty("email")
    public String email;
    public AdminUsersInviteApplicationJSON withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * Timestamp when guest account should be disabled. Only include this timestamp if you are inviting a guest user and you want their account to expire on a certain date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guest_expiration_ts")
    public String guestExpirationTs;
    public AdminUsersInviteApplicationJSON withGuestExpirationTs(String guestExpirationTs) {
        this.guestExpirationTs = guestExpirationTs;
        return this;
    }
    
    /**
     * Is this user a multi-channel guest user? (default: false)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_restricted")
    public Boolean isRestricted;
    public AdminUsersInviteApplicationJSON withIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
        return this;
    }
    
    /**
     * Is this user a single channel guest user? (default: false)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_ultra_restricted")
    public Boolean isUltraRestricted;
    public AdminUsersInviteApplicationJSON withIsUltraRestricted(Boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
        return this;
    }
    
    /**
     * Full name of the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("real_name")
    public String realName;
    public AdminUsersInviteApplicationJSON withRealName(String realName) {
        this.realName = realName;
        return this;
    }
    
    /**
     * Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resend")
    public Boolean resend;
    public AdminUsersInviteApplicationJSON withResend(Boolean resend) {
        this.resend = resend;
        return this;
    }
    
    /**
     * The ID (`T1234`) of the workspace.
     */
    @JsonProperty("team_id")
    public String teamId;
    public AdminUsersInviteApplicationJSON withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public AdminUsersInviteApplicationJSON(@JsonProperty("channel_ids") String channelIds, @JsonProperty("email") String email, @JsonProperty("team_id") String teamId) {
        this.channelIds = channelIds;
        this.email = email;
        this.teamId = teamId;
  }
}
