# api

### Available Operations

* [apiTest](#apitest) - Checks API calling code.

## apiTest

Checks API calling code.

API method documentation
<https://api.slack.com/methods/api.test>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ApiTestRequest;
import shadowcodex.slack_spec.models.operations.ApiTestResponse;
import shadowcodex.slack_spec.models.operations.ApiTestSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ApiTestRequest req = new ApiTestRequest() {{
                error = "soluta";
                foo = "nobis";
            }};            

            ApiTestResponse res = sdk.api.apiTest(req, new ApiTestSecurity("et") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.apiTestSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
