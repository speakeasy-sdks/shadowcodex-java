/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;
import shadowcodex.slack_spec.utils.HTTPClient;
import shadowcodex.slack_spec.utils.HTTPRequest;
import shadowcodex.slack_spec.utils.JSON;

public class AdminAppsRequests {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public AdminAppsRequests(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * List app requests for a team/workspace.
     * https://api.slack.com/methods/admin.apps.requests.list - API method documentation
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public shadowcodex.slack_spec.models.operations.AdminAppsRequestsListResponse adminAppsRequestsList(shadowcodex.slack_spec.models.operations.AdminAppsRequestsListRequest request, shadowcodex.slack_spec.models.operations.AdminAppsRequestsListSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/admin.apps.requests.list");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.AdminAppsRequestsListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.AdminAppsRequestsListResponse res = new shadowcodex.slack_spec.models.operations.AdminAppsRequestsListResponse(contentType, httpRes.statusCode()) {{
            defaultSuccessTemplate = null;
            defaultErrorTemplate = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.defaultSuccessTemplate = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.defaultErrorTemplate = out;
            }
        }

        return res;
    }
}