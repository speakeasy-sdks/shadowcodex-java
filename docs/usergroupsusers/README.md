# usergroupsUsers

### Available Operations

* [usergroupsUsersList](#usergroupsuserslist) - List all users in a User Group
* [usergroupsUsersUpdate](#usergroupsusersupdate) - Update the list of users for a User Group

## usergroupsUsersList

List all users in a User Group

API method documentation
<https://api.slack.com/methods/usergroups.users.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsUsersListRequest req = new UsergroupsUsersListRequest("error", "officiis") {{
                includeDisabled = false;
            }};            

            UsergroupsUsersListResponse res = sdk.usergroupsUsers.usergroupsUsersList(req, new UsergroupsUsersListSecurity("officiis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsUsersListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsUsersUpdate

Update the list of users for a User Group

API method documentation
<https://api.slack.com/methods/usergroups.users.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsUsersUpdateRequest req = new UsergroupsUsersUpdateRequest(                new UsergroupsUsersUpdateApplicationJSON("accusamus", "natus") {{
                                includeCount = false;
                            }};, "minima");            

            UsergroupsUsersUpdateResponse res = sdk.usergroupsUsers.usergroupsUsersUpdate(req, new UsergroupsUsersUpdateSecurity("aspernatur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsUsersUpdateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
