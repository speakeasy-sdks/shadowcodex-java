# adminAppsApproved

### Available Operations

* [adminAppsApprovedList](#adminappsapprovedlist) - List approved apps for an org or workspace.

## adminAppsApprovedList

List approved apps for an org or workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.approved.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsApprovedListRequest req = new AdminAppsApprovedListRequest("architecto") {{
                cursor = "magnam";
                enterpriseId = "et";
                limit = 569965L;
                teamId = "ullam";
            }};            

            AdminAppsApprovedListResponse res = sdk.adminAppsApproved.adminAppsApprovedList(req, new AdminAppsApprovedListSecurity("provident") {{
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
