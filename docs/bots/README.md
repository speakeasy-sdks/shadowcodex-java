# bots

### Available Operations

* [botsInfo](#botsinfo) - Gets information about a bot user.

## botsInfo

Gets information about a bot user.

API method documentation
<https://api.slack.com/methods/bots.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.BotsInfoRequest;
import shadowcodex.slack_spec.models.operations.BotsInfoResponse;
import shadowcodex.slack_spec.models.operations.BotsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            BotsInfoRequest req = new BotsInfoRequest("tenetur") {{
                bot = "dignissimos";
            }};            

            BotsInfoResponse res = sdk.bots.botsInfo(req, new BotsInfoSecurity("hic") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.botsInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
