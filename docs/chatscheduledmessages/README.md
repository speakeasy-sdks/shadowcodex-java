# chatScheduledMessages

### Available Operations

* [chatScheduledMessagesList](#chatscheduledmessageslist) - Returns a list of scheduled messages.

## chatScheduledMessagesList

Returns a list of scheduled messages.

API method documentation
<https://api.slack.com/methods/chat.scheduledMessages.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListRequest;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListResponse;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatScheduledMessagesListRequest req = new ChatScheduledMessagesListRequest() {{
                channel = "fuga";
                cursor = "eius";
                latest = 1783.67;
                limit = 373813L;
                oldest = 698.59;
                token = "cupiditate";
            }};            

            ChatScheduledMessagesListResponse res = sdk.chatScheduledMessages.chatScheduledMessagesList(req, new ChatScheduledMessagesListSecurity("consequatur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatScheduledMessagesListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
