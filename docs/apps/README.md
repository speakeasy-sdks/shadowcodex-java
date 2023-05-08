# apps

### Available Operations

* [appsEventAuthorizationsList](#appseventauthorizationslist) - Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.
* [appsPermissionsInfo](#appspermissionsinfo) - Returns list of permissions this app has on a team.
* [appsPermissionsRequest](#appspermissionsrequest) - Allows an app to request additional scopes
* [appsPermissionsResourcesList](#appspermissionsresourceslist) - Returns list of resource grants this app has on a team.
* [appsPermissionsScopesList](#appspermissionsscopeslist) - Returns list of scopes this app has on a team.
* [appsUninstall](#appsuninstall) - Uninstalls your app from a workspace.

## appsEventAuthorizationsList

Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

API method documentation
<https://api.slack.com/methods/apps.event.authorizations.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsEventAuthorizationsListRequest;
import shadowcodex.slack_spec.models.operations.AppsEventAuthorizationsListResponse;
import shadowcodex.slack_spec.models.operations.AppsEventAuthorizationsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsEventAuthorizationsListRequest req = new AppsEventAuthorizationsListRequest("saepe", "ipsum") {{
                cursor = "veritatis";
                limit = 749255L;
            }};            

            AppsEventAuthorizationsListResponse res = sdk.apps.appsEventAuthorizationsList(req, new AppsEventAuthorizationsListSecurity("quos") {{
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
                token = "tempore";
            }};            

            AppsPermissionsInfoResponse res = sdk.apps.appsPermissionsInfo(req, new AppsPermissionsInfoSecurity("cupiditate") {{
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

            AppsPermissionsRequestRequest req = new AppsPermissionsRequestRequest("aperiam", "delectus", "dolorem");            

            AppsPermissionsRequestResponse res = sdk.apps.appsPermissionsRequest(req, new AppsPermissionsRequestSecurity("dolore") {{
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

            AppsPermissionsResourcesListRequest req = new AppsPermissionsResourcesListRequest("labore") {{
                cursor = "adipisci";
                limit = 677263L;
            }};            

            AppsPermissionsResourcesListResponse res = sdk.apps.appsPermissionsResourcesList(req, new AppsPermissionsResourcesListSecurity("architecto") {{
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

            AppsPermissionsScopesListRequest req = new AppsPermissionsScopesListRequest("quae");            

            AppsPermissionsScopesListResponse res = sdk.apps.appsPermissionsScopesList(req, new AppsPermissionsScopesListSecurity("aut") {{
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

## appsUninstall

Uninstalls your app from a workspace.

API method documentation
<https://api.slack.com/methods/apps.uninstall>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AppsUninstallRequest;
import shadowcodex.slack_spec.models.operations.AppsUninstallResponse;
import shadowcodex.slack_spec.models.operations.AppsUninstallSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AppsUninstallRequest req = new AppsUninstallRequest() {{
                clientId = "quas";
                clientSecret = "itaque";
                token = "consequatur";
            }};            

            AppsUninstallResponse res = sdk.apps.appsUninstall(req, new AppsUninstallSecurity("est") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.appsUninstallSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
