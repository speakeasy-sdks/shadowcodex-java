# rtm

### Available Operations

* [rtmConnect](#rtmconnect) - Starts a Real Time Messaging session.

## rtmConnect

Starts a Real Time Messaging session.

API method documentation
<https://api.slack.com/methods/rtm.connect>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RtmConnectRequest;
import shadowcodex.slack_spec.models.operations.RtmConnectResponse;
import shadowcodex.slack_spec.models.operations.RtmConnectSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RtmConnectRequest req = new RtmConnectRequest("neque") {{
                batchPresenceAware = false;
                presenceSub = false;
            }};            

            RtmConnectResponse res = sdk.rtm.rtmConnect(req, new RtmConnectSecurity("dolorum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.rtmConnectSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
