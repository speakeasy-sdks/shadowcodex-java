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

public class Team {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Team(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public shadowcodex.slack_spec.models.operations.TeamAccessLogsResponse teamAccessLogs(shadowcodex.slack_spec.models.operations.TeamAccessLogsRequest request, shadowcodex.slack_spec.models.operations.TeamAccessLogsSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/team.accessLogs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.TeamAccessLogsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.TeamAccessLogsResponse res = new shadowcodex.slack_spec.models.operations.TeamAccessLogsResponse(contentType, httpRes.statusCode()) {{
            teamAccessLogsSchema = null;
            teamAccessLogsErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamAccessLogsSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamAccessLogsErrorSchema = out;
            }
        }

        return res;
    }

    public shadowcodex.slack_spec.models.operations.TeamBillableInfoResponse teamBillableInfo(shadowcodex.slack_spec.models.operations.TeamBillableInfoRequest request, shadowcodex.slack_spec.models.operations.TeamBillableInfoSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/team.billableInfo");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.TeamBillableInfoRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.TeamBillableInfoResponse res = new shadowcodex.slack_spec.models.operations.TeamBillableInfoResponse(contentType, httpRes.statusCode()) {{
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

    public shadowcodex.slack_spec.models.operations.TeamInfoResponse teamInfo(shadowcodex.slack_spec.models.operations.TeamInfoRequest request, shadowcodex.slack_spec.models.operations.TeamInfoSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/team.info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.TeamInfoRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.TeamInfoResponse res = new shadowcodex.slack_spec.models.operations.TeamInfoResponse(contentType, httpRes.statusCode()) {{
            teamInfoSchema = null;
            teamInfoErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamInfoSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamInfoErrorSchema = out;
            }
        }

        return res;
    }

    public shadowcodex.slack_spec.models.operations.TeamIntegrationLogsResponse teamIntegrationLogs(shadowcodex.slack_spec.models.operations.TeamIntegrationLogsRequest request, shadowcodex.slack_spec.models.operations.TeamIntegrationLogsSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/team.integrationLogs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.TeamIntegrationLogsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.TeamIntegrationLogsResponse res = new shadowcodex.slack_spec.models.operations.TeamIntegrationLogsResponse(contentType, httpRes.statusCode()) {{
            teamIntegrationLogsSchema = null;
            teamIntegrationLogsErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamIntegrationLogsSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamIntegrationLogsErrorSchema = out;
            }
        }

        return res;
    }

    public shadowcodex.slack_spec.models.operations.TeamProfileGetResponse teamProfileGet(shadowcodex.slack_spec.models.operations.TeamProfileGetRequest request, shadowcodex.slack_spec.models.operations.TeamProfileGetSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = shadowcodex.slack_spec.utils.Utils.generateURL(baseUrl, "/team.profile.get");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = shadowcodex.slack_spec.utils.Utils.getQueryParams(shadowcodex.slack_spec.models.operations.TeamProfileGetRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = shadowcodex.slack_spec.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        shadowcodex.slack_spec.models.operations.TeamProfileGetResponse res = new shadowcodex.slack_spec.models.operations.TeamProfileGetResponse(contentType, httpRes.statusCode()) {{
            teamProfileGetSuccessSchema = null;
            teamProfileGetErrorSchema = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamProfileGetSuccessSchema = out;
            }
        }
        else {
            if (shadowcodex.slack_spec.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, java.util.Map<String, Object>> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, java.util.Map<String, Object>>>() {});
                res.teamProfileGetErrorSchema = out;
            }
        }

        return res;
    }
}