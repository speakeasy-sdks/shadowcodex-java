# appsEventAuthorizations

### Available Operations

* [appsEventAuthorizationsList](#appseventauthorizationslist) - Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

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

            AppsEventAuthorizationsListRequest req = new AppsEventAuthorizationsListRequest("repellendus", "porro") {{
                cursor = "doloribus";
                limit = 281730L;
            }};            

            AppsEventAuthorizationsListResponse res = sdk.appsEventAuthorizations.appsEventAuthorizationsList(req, new AppsEventAuthorizationsListSecurity("facilis") {{
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
