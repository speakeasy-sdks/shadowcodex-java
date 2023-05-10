# adminInviteRequestsDenied

### Available Operations

* [adminInviteRequestsDeniedList](#admininviterequestsdeniedlist) - List all denied workspace invite requests.

## adminInviteRequestsDeniedList

List all denied workspace invite requests.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.denied.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsDeniedListRequest req = new AdminInviteRequestsDeniedListRequest("numquam") {{
                cursor = "veritatis";
                limit = 58029L;
                teamId = "ipsa";
            }};            

            AdminInviteRequestsDeniedListResponse res = sdk.adminInviteRequestsDenied.adminInviteRequestsDeniedList(req, new AdminInviteRequestsDeniedListSecurity("iure") {{
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
