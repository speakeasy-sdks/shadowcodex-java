/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class FilesRemoteListRequest {
    /**
     * Filter files appearing in a specific channel, indicated by its ID.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=channel")
    public String channel;
    public FilesRemoteListRequest withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first "page" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public FilesRemoteListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * The maximum number of items to return.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public FilesRemoteListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `remote_files:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public FilesRemoteListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    /**
     * Filter files created after this timestamp (inclusive).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ts_from")
    public Double tsFrom;
    public FilesRemoteListRequest withTsFrom(Double tsFrom) {
        this.tsFrom = tsFrom;
        return this;
    }
    
    /**
     * Filter files created before this timestamp (inclusive).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ts_to")
    public Double tsTo;
    public FilesRemoteListRequest withTsTo(Double tsTo) {
        this.tsTo = tsTo;
        return this;
    }
    
    public FilesRemoteListRequest(){}
}
