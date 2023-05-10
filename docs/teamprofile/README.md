# teamProfile

### Available Operations

* [teamProfileGet](#teamprofileget) - Retrieve a team's profile.

## teamProfileGet

Retrieve a team's profile.

API method documentation
<https://api.slack.com/methods/team.profile.get>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamProfileGetRequest;
import shadowcodex.slack_spec.models.operations.TeamProfileGetResponse;
import shadowcodex.slack_spec.models.operations.TeamProfileGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamProfileGetRequest req = new TeamProfileGetRequest("amet") {{
                visibility = "deserunt";
            }};            

            TeamProfileGetResponse res = sdk.teamProfile.teamProfileGet(req, new TeamProfileGetSecurity("voluptate") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.teamProfileGetSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
