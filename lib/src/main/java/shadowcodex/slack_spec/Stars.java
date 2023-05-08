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
import shadowcodex.slack_spec.utils.SerializedBody;

public class Stars {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Stars(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public shadowcodex.slack_spec.models.operations.StarsAddResponse starsAdd(shadowcodex.slack_spec.models.operations.StarsAddRequest request, shadowcodex.slack_spec.models.operations.StarsAddSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/stars.add");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = shadowcodex.slack_spec.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        java.util.Map<String, java.util.List<String>> headers = shadowcodex.slack_spec.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.StarsAddResponse res = new shadowcodex.slack_spec.models.operations.StarsAddResponse(contentType, httpRes.statusCode()) {{
            starsAddSchema = null;
            starsAddErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsAddSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsAddErrorSchema = out;
            }
        }

        return res;
    }

    public shadowcodex.slack_spec.models.operations.StarsListResponse starsList(shadowcodex.slack_spec.models.operations.StarsListRequest request, shadowcodex.slack_spec.models.operations.StarsListSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/stars.list");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.StarsListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.StarsListResponse res = new shadowcodex.slack_spec.models.operations.StarsListResponse(contentType, httpRes.statusCode()) {{
            starsListSchema = null;
            starsListErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsListSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsListErrorSchema = out;
            }
        }

        return res;
    }

    public shadowcodex.slack_spec.models.operations.StarsRemoveResponse starsRemove(shadowcodex.slack_spec.models.operations.StarsRemoveRequest request, shadowcodex.slack_spec.models.operations.StarsRemoveSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/stars.remove");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = shadowcodex.slack_spec.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        java.util.Map<String, java.util.List<String>> headers = shadowcodex.slack_spec.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.StarsRemoveResponse res = new shadowcodex.slack_spec.models.operations.StarsRemoveResponse(contentType, httpRes.statusCode()) {{
            starsRemoveSchema = null;
            starsRemoveErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsRemoveSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.starsRemoveErrorSchema = out;
            }
        }

        return res;
    }
}