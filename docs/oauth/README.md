# oauth

### Available Operations

* [oauthAccess](#oauthaccess) - Exchanges a temporary OAuth verifier code for an access token.
* [oauthToken](#oauthtoken) - Exchanges a temporary OAuth verifier code for a workspace token.
* [oauthV2Access](#oauthv2access) - Exchanges a temporary OAuth verifier code for an access token.

## oauthAccess

Exchanges a temporary OAuth verifier code for an access token.

API method documentation
<https://api.slack.com/methods/oauth.access>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.OauthAccessRequest;
import shadowcodex.slack_spec.models.operations.OauthAccessResponse;
import shadowcodex.slack_spec.models.operations.OauthAccessSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            OauthAccessRequest req = new OauthAccessRequest() {{
                clientId = "ab";
                clientSecret = "iste";
                code = "dolore";
                redirectUri = "laborum";
                singleChannel = false;
            }};            

            OauthAccessResponse res = sdk.oauth.oauthAccess(req, new OauthAccessSecurity("sed") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.defaultSuccessTemplate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## oauthToken

Exchanges a temporary OAuth verifier code for a workspace token.

API method documentation
<https://api.slack.com/methods/oauth.token>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.OauthTokenRequest;
import shadowcodex.slack_spec.models.operations.OauthTokenResponse;
import shadowcodex.slack_spec.models.operations.OauthTokenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            OauthTokenRequest req = new OauthTokenRequest() {{
                clientId = "in";
                clientSecret = "commodi";
                code = "quidem";
                redirectUri = "explicabo";
                singleChannel = false;
            }};            

            OauthTokenResponse res = sdk.oauth.oauthToken(req, new OauthTokenSecurity("voluptas") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.defaultSuccessTemplate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## oauthV2Access

Exchanges a temporary OAuth verifier code for an access token.

API method documentation
<https://api.slack.com/methods/oauth.v2.access>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.OauthV2AccessRequest;
import shadowcodex.slack_spec.models.operations.OauthV2AccessResponse;
import shadowcodex.slack_spec.models.operations.OauthV2AccessSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            OauthV2AccessRequest req = new OauthV2AccessRequest("unde") {{
                clientId = "architecto";
                clientSecret = "suscipit";
                redirectUri = "sapiente";
            }};            

            OauthV2AccessResponse res = sdk.oauth.oauthV2Access(req, new OauthV2AccessSecurity("debitis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.defaultSuccessTemplate != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
