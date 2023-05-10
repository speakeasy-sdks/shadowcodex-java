# appsPermissionsResources

### Available Operations

* [appsPermissionsResourcesList](#appspermissionsresourceslist) - Returns list of resource grants this app has on a team.

## appsPermissionsResourcesList

Returns list of resource grants this app has on a team.

API method documentation
<https://api.slack.com/methods/apps.permissions.resources.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsPermissionsResourcesListRequest;
import shadowcodex.slack_spec.models.operations.AppsPermissionsResourcesListResponse;
import shadowcodex.slack_spec.models.operations.AppsPermissionsResourcesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsPermissionsResourcesListRequest req = new AppsPermissionsResourcesListRequest("voluptatibus") {{
                cursor = "quisquam";
                limit = 876506L;
            }};            

            AppsPermissionsResourcesListResponse res = sdk.appsPermissionsResources.appsPermissionsResourcesList(req, new AppsPermissionsResourcesListSecurity("omnis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.appsPermissionsResourcesListSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
