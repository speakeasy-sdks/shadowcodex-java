# oauthV2

### Available Operations

* [oauthV2Access](#oauthv2access) - Exchanges a temporary OAuth verifier code for an access token.

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

            OauthV2AccessRequest req = new OauthV2AccessRequest("illo") {{
                clientId = "reiciendis";
                clientSecret = "perferendis";
                redirectUri = "corrupti";
            }};            

            OauthV2AccessResponse res = sdk.oauthV2.oauthV2Access(req, new OauthV2AccessSecurity("maiores") {{
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
