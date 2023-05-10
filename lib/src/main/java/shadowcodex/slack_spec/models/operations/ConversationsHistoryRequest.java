/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class ConversationsHistoryRequest {
    /**
     * Conversation ID to fetch history for.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=channel")
    public String channel;

    public ConversationsHistoryRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first "page" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;

    public ConversationsHistoryRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=inclusive")
    public Boolean inclusive;

    public ConversationsHistoryRequest withInclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }
    
    /**
     * End of time range of messages to include in results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=latest")
    public Double latest;

    public ConversationsHistoryRequest withLatest(Double latest) {
        this.latest = latest;
        return this;
    }
    
    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public ConversationsHistoryRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Start of time range of messages to include in results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=oldest")
    public Double oldest;

    public ConversationsHistoryRequest withOldest(Double oldest) {
        this.oldest = oldest;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;

    public ConversationsHistoryRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public ConversationsHistoryRequest(){}
}
