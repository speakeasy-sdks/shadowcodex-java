# appsPermissionsScopes

### Available Operations

* [appsPermissionsScopesList](#appspermissionsscopeslist) - Returns list of scopes this app has on a team.

## appsPermissionsScopesList

Returns list of scopes this app has on a team.

API method documentation
<https://api.slack.com/methods/apps.permissions.scopes.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsPermissionsScopesListRequest;
import shadowcodex.slack_spec.models.operations.AppsPermissionsScopesListResponse;
import shadowcodex.slack_spec.models.operations.AppsPermissionsScopesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsPermissionsScopesListRequest req = new AppsPermissionsScopesListRequest("quis");            

            AppsPermissionsScopesListResponse res = sdk.appsPermissionsScopes.appsPermissionsScopesList(req, new AppsPermissionsScopesListSecurity("ipsum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.apiPermissionsScopesListSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
