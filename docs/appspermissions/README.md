# appsPermissions

### Available Operations

* [appsPermissionsInfo](#appspermissionsinfo) - Returns list of permissions this app has on a team.
* [appsPermissionsRequest](#appspermissionsrequest) - Allows an app to request additional scopes

## appsPermissionsInfo

Returns list of permissions this app has on a team.

API method documentation
<https://api.slack.com/methods/apps.permissions.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsPermissionsInfoRequest;
import shadowcodex.slack_spec.models.operations.AppsPermissionsInfoResponse;
import shadowcodex.slack_spec.models.operations.AppsPermissionsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsPermissionsInfoRequest req = new AppsPermissionsInfoRequest() {{
                token = "cupiditate";
            }};            

            AppsPermissionsInfoResponse res = sdk.appsPermissions.appsPermissionsInfo(req, new AppsPermissionsInfoSecurity("qui") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.appsPermissionsInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## appsPermissionsRequest

Allows an app to request additional scopes

API method documentation
<https://api.slack.com/methods/apps.permissions.request>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsPermissionsRequestRequest;
import shadowcodex.slack_spec.models.operations.AppsPermissionsRequestResponse;
import shadowcodex.slack_spec.models.operations.AppsPermissionsRequestSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsPermissionsRequestRequest req = new AppsPermissionsRequestRequest("quae", "laudantium", "odio");            

            AppsPermissionsRequestResponse res = sdk.appsPermissions.appsPermissionsRequest(req, new AppsPermissionsRequestSecurity("occaecati") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.appsPermissionsRequestSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
