# adminApps

### Available Operations

* [adminAppsApprove](#adminappsapprove) - Approve an app for installation on a workspace.
* [adminAppsRestrict](#adminappsrestrict) - Restrict an app for installation on a workspace.

## adminAppsApprove

Approve an app for installation on a workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.approve>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsApproveRequest req = new AdminAppsApproveRequest("distinctio") {{
                requestBody = new AdminAppsApproveApplicationJSON() {{
                    appId = "id";
                    requestId = "labore";
                    teamId = "labore";
                }};;
            }};            

            AdminAppsApproveResponse res = sdk.adminApps.adminAppsApprove(req, new AdminAppsApproveSecurity("suscipit") {{
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

## adminAppsRestrict

Restrict an app for installation on a workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.restrict>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRestrictRequest req = new AdminAppsRestrictRequest("natus") {{
                requestBody = new AdminAppsRestrictApplicationJSON() {{
                    appId = "nobis";
                    requestId = "eum";
                    teamId = "vero";
                }};;
            }};            

            AdminAppsRestrictResponse res = sdk.adminApps.adminAppsRestrict(req, new AdminAppsRestrictSecurity("aspernatur") {{
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
