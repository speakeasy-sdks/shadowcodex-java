# search

### Available Operations

* [searchMessages](#searchmessages) - Searches for messages matching a query.

## searchMessages

Searches for messages matching a query.

API method documentation
<https://api.slack.com/methods/search.messages>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.SearchMessagesRequest;
import shadowcodex.slack_spec.models.operations.SearchMessagesResponse;
import shadowcodex.slack_spec.models.operations.SearchMessagesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            SearchMessagesRequest req = new SearchMessagesRequest("nostrum", "officia") {{
                count = 676243L;
                highlight = false;
                page = 548361L;
                sort = "accusamus";
                sortDir = "tempora";
            }};            

            SearchMessagesResponse res = sdk.search.searchMessages(req, new SearchMessagesSecurity("atque") {{
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
