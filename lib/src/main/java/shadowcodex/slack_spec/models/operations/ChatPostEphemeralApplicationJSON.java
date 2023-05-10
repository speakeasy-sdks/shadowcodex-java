/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatPostEphemeralApplicationJSON {
    /**
     * Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("as_user")
    public Boolean asUser;

    public ChatPostEphemeralApplicationJSON withAsUser(Boolean asUser) {
        this.asUser = asUser;
        return this;
    }
    
    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachments")
    public String attachments;

    public ChatPostEphemeralApplicationJSON withAttachments(String attachments) {
        this.attachments = attachments;
        return this;
    }
    
    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blocks")
    public String blocks;

    public ChatPostEphemeralApplicationJSON withBlocks(String blocks) {
        this.blocks = blocks;
        return this;
    }
    
    /**
     * Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
     */
    @JsonProperty("channel")
    public String channel;

    public ChatPostEphemeralApplicationJSON withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon_emoji")
    public String iconEmoji;

    public ChatPostEphemeralApplicationJSON withIconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
        return this;
    }
    
    /**
     * URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon_url")
    public String iconUrl;

    public ChatPostEphemeralApplicationJSON withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    
    /**
     * Find and link channel names and usernames.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_names")
    public Boolean linkNames;

    public ChatPostEphemeralApplicationJSON withLinkNames(Boolean linkNames) {
        this.linkNames = linkNames;
        return this;
    }
    
    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parse")
    public String parse;

    public ChatPostEphemeralApplicationJSON withParse(String parse) {
        this.parse = parse;
        return this;
    }
    
    /**
     * How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    public String text;

    public ChatPostEphemeralApplicationJSON withText(String text) {
        this.text = text;
        return this;
    }
    
    /**
     * Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thread_ts")
    public String threadTs;

    public ChatPostEphemeralApplicationJSON withThreadTs(String threadTs) {
        this.threadTs = threadTs;
        return this;
    }
    
    /**
     * `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
     */
    @JsonProperty("user")
    public String user;

    public ChatPostEphemeralApplicationJSON withUser(String user) {
        this.user = user;
        return this;
    }
    
    /**
     * Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    public String username;

    public ChatPostEphemeralApplicationJSON withUsername(String username) {
        this.username = username;
        return this;
    }
    
    public ChatPostEphemeralApplicationJSON(@JsonProperty("channel") String channel, @JsonProperty("user") String user) {
        this.channel = channel;
        this.user = user;
  }
}
