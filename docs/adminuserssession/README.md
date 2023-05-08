# adminUsersSession

### Available Operations

* [adminUsersSessionInvalidate](#adminuserssessioninvalidate) - Invalidate a single session for a user by session_id
* [adminUsersSessionReset](#adminuserssessionreset) - Wipes all valid sessions on all devices for a given user

## adminUsersSessionInvalidate

Invalidate a single session for a user by session_id

API method documentation
<https://api.slack.com/methods/admin.users.session.invalidate>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSessionInvalidateRequest req = new AdminUsersSessionInvalidateRequest(                new AdminUsersSessionInvalidateApplicationJSON(488056, "sunt");, "ullam");            

            AdminUsersSessionInvalidateResponse res = sdk.adminUsersSession.adminUsersSessionInvalidate(req, new AdminUsersSessionInvalidateSecurity("nam") {{
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

## adminUsersSessionReset

Wipes all valid sessions on all devices for a given user

API method documentation
<https://api.slack.com/methods/admin.users.session.reset>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSessionResetRequest req = new AdminUsersSessionResetRequest(                new AdminUsersSessionResetApplicationJSON("hic") {{
                                mobileOnly = false;
                                webOnly = false;
                            }};, "voluptatem");            

            AdminUsersSessionResetResponse res = sdk.adminUsersSession.adminUsersSessionReset(req, new AdminUsersSessionResetSecurity("cumque") {{
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
