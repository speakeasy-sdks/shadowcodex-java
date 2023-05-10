<!-- Start SDK Example Usage -->
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

            AdminAppsApproveRequest req = new AdminAppsApproveRequest("corrupti") {{
                requestBody = new AdminAppsApproveApplicationJSON() {{
                    appId = "provident";
                    requestId = "distinctio";
                    teamId = "quibusdam";
                }};;
            }};            

            AdminAppsApproveResponse res = sdk.admin.adminAppsApprove(req, new AdminAppsApproveSecurity("unde") {{
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
<!-- End SDK Example Usage -->