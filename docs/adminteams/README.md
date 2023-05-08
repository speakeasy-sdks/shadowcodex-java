# adminTeams

### Available Operations

* [adminTeamsCreate](#adminteamscreate) - Create an Enterprise team.
* [adminTeamsList](#adminteamslist) - List all teams on an Enterprise organization

## adminTeamsCreate

Create an Enterprise team.

API method documentation
<https://api.slack.com/methods/admin.teams.create>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsCreateRequest req = new AdminTeamsCreateRequest(                new AdminTeamsCreateApplicationJSON("odio", "quaerat") {{
                                teamDescription = "accusamus";
                                teamDiscoverability = "quidem";
                            }};, "voluptatibus");            

            AdminTeamsCreateResponse res = sdk.adminTeams.adminTeamsCreate(req, new AdminTeamsCreateSecurity("voluptas") {{
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

## adminTeamsList

List all teams on an Enterprise organization

API method documentation
<https://api.slack.com/methods/admin.teams.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsListRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsListResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsListRequest req = new AdminTeamsListRequest("natus") {{
                cursor = "eos";
                limit = 542499L;
            }};            

            AdminTeamsListResponse res = sdk.adminTeams.adminTeamsList(req, new AdminTeamsListSecurity("sit") {{
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
