# adminConversationsEkm

### Available Operations

* [adminConversationsEkmListOriginalConnectedChannelInfo](#adminconversationsekmlistoriginalconnectedchannelinfo) - List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.

## adminConversationsEkmListOriginalConnectedChannelInfo

List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.

API method documentation
<https://api.slack.com/methods/admin.conversations.ekm.listOriginalConnectedChannelInfo>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsEkmListOriginalConnectedChannelInfoRequest req = new AdminConversationsEkmListOriginalConnectedChannelInfoRequest("nobis") {{
                channelIds = "dolores";
                cursor = "quis";
                limit = 521037L;
                teamIds = "dignissimos";
            }};            

            AdminConversationsEkmListOriginalConnectedChannelInfoResponse res = sdk.adminConversationsEkm.adminConversationsEkmListOriginalConnectedChannelInfo(req, new AdminConversationsEkmListOriginalConnectedChannelInfoSecurity("eaque") {{
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
