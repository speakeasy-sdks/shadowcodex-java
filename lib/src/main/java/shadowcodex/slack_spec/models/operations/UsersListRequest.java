/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsersListRequest {
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first "page" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    public String cursor;
    public UsersListRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    /**
     * Set this to `true` to receive the locale for users. Defaults to `false`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_locale")
    public Boolean includeLocale;
    public UsersListRequest withIncludeLocale(Boolean includeLocale) {
        this.includeLocale = includeLocale;
        return this;
    }
    
    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public UsersListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `users:read`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=token")
    public String token;
    public UsersListRequest withToken(String token) {
        this.token = token;
        return this;
    }
    
    public UsersListRequest(){}
}
