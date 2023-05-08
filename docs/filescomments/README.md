# filesComments

### Available Operations

* [filesCommentsDelete](#filescommentsdelete) - Deletes an existing comment on a file.

## filesCommentsDelete

Deletes an existing comment on a file.

API method documentation
<https://api.slack.com/methods/files.comments.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteRequest;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteResponse;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesCommentsDeleteRequest req = new FilesCommentsDeleteRequest() {{
                requestBody = new FilesCommentsDeleteApplicationJSON() {{
                    file = "aliquid";
                    id = "0b375ed4-f6fb-4ee4-9f33-317fe35b60eb";
                }};;
                token = "vitae";
            }};            

            FilesCommentsDeleteResponse res = sdk.filesComments.filesCommentsDelete(req, new FilesCommentsDeleteSecurity("accusamus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesCommentsDeleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
