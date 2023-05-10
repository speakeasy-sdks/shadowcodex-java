# adminAppsRequests

### Available Operations

* [adminAppsRequestsList](#adminappsrequestslist) - List app requests for a team/workspace.

## adminAppsRequestsList

List app requests for a team/workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.requests.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRequestsListRequest req = new AdminAppsRequestsListRequest("quos") {{
                cursor = "sint";
                limit = 33625L;
                teamId = "mollitia";
            }};            

            AdminAppsRequestsListResponse res = sdk.adminAppsRequests.adminAppsRequestsList(req, new AdminAppsRequestsListSecurity("reiciendis") {{
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
