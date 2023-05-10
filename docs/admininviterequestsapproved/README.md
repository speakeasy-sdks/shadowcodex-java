# adminInviteRequestsApproved

### Available Operations

* [adminInviteRequestsApprovedList](#admininviterequestsapprovedlist) - List all approved workspace invite requests.

## adminInviteRequestsApprovedList

List all approved workspace invite requests.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.approved.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsApprovedListRequest req = new AdminInviteRequestsApprovedListRequest("voluptate") {{
                cursor = "dignissimos";
                limit = 970237L;
                teamId = "amet";
            }};            

            AdminInviteRequestsApprovedListResponse res = sdk.adminInviteRequestsApproved.adminInviteRequestsApprovedList(req, new AdminInviteRequestsApprovedListSecurity("dolorum") {{
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
