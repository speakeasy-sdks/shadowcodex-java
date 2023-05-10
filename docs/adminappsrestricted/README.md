# adminAppsRestricted

### Available Operations

* [adminAppsRestrictedList](#adminappsrestrictedlist) - List restricted apps for an org or workspace.

## adminAppsRestrictedList

List restricted apps for an org or workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.restricted.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRestrictedListRequest req = new AdminAppsRestrictedListRequest("mollitia") {{
                cursor = "ad";
                enterpriseId = "eum";
                limit = 221262L;
                teamId = "necessitatibus";
            }};            

            AdminAppsRestrictedListResponse res = sdk.adminAppsRestricted.adminAppsRestrictedList(req, new AdminAppsRestrictedListSecurity("odit") {{
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
