# adminTeamsAdmins

### Available Operations

* [adminTeamsAdminsList](#adminteamsadminslist) - List all of the admins on a given workspace.

## adminTeamsAdminsList

List all of the admins on a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.admins.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsAdminsListRequest req = new AdminTeamsAdminsListRequest("fugiat", "ab") {{
                cursor = "soluta";
                limit = 679393L;
            }};            

            AdminTeamsAdminsListResponse res = sdk.adminTeamsAdmins.adminTeamsAdminsList(req, new AdminTeamsAdminsListSecurity("iusto") {{
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
