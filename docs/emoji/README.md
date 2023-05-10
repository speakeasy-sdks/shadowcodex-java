# emoji

### Available Operations

* [emojiList](#emojilist) - Lists custom emoji for a team.

## emojiList

Lists custom emoji for a team.

API method documentation
<https://api.slack.com/methods/emoji.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.EmojiListRequest;
import shadowcodex.slack_spec.models.operations.EmojiListResponse;
import shadowcodex.slack_spec.models.operations.EmojiListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            EmojiListRequest req = new EmojiListRequest("culpa");            

            EmojiListResponse res = sdk.emoji.emojiList(req, new EmojiListSecurity("aliquid") {{
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
