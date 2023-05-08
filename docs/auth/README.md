# auth

### Available Operations

* [authRevoke](#authrevoke) - Revokes a token.
* [authTest](#authtest) - Checks authentication & identity.

## authRevoke

Revokes a token.

API method documentation
<https://api.slack.com/methods/auth.revoke>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AuthRevokeRequest;
import shadowcodex.slack_spec.models.operations.AuthRevokeResponse;
import shadowcodex.slack_spec.models.operations.AuthRevokeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AuthRevokeRequest req = new AuthRevokeRequest("delectus") {{
                test = false;
            }};            

            AuthRevokeResponse res = sdk.auth.authRevoke(req, new AuthRevokeSecurity("voluptate") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.authRevokeSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## authTest

Checks authentication & identity.

API method documentation
<https://api.slack.com/methods/auth.test>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AuthTestRequest;
import shadowcodex.slack_spec.models.operations.AuthTestResponse;
import shadowcodex.slack_spec.models.operations.AuthTestSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AuthTestRequest req = new AuthTestRequest("consectetur");            

            AuthTestResponse res = sdk.auth.authTest(req, new AuthTestSecurity("vero") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.authTestSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
