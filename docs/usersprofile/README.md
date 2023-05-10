# usersProfile

### Available Operations

* [usersProfileGet](#usersprofileget) - Retrieves a user's profile information.
* [usersProfileSet](#usersprofileset) - Set the profile information for a user.

## usersProfileGet

Retrieves a user's profile information.

API method documentation
<https://api.slack.com/methods/users.profile.get>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersProfileGetRequest;
import shadowcodex.slack_spec.models.operations.UsersProfileGetResponse;
import shadowcodex.slack_spec.models.operations.UsersProfileGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersProfileGetRequest req = new UsersProfileGetRequest("non") {{
                includeLabels = false;
                user = "vero";
            }};            

            UsersProfileGetResponse res = sdk.usersProfile.usersProfileGet(req, new UsersProfileGetSecurity("doloremque") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersProfileGetSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersProfileSet

Set the profile information for a user.

API method documentation
<https://api.slack.com/methods/users.profile.set>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersProfileSetApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsersProfileSetRequest;
import shadowcodex.slack_spec.models.operations.UsersProfileSetResponse;
import shadowcodex.slack_spec.models.operations.UsersProfileSetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersProfileSetRequest req = new UsersProfileSetRequest("iure") {{
                requestBody = new UsersProfileSetApplicationJSON() {{
                    name = "Lena Beier";
                    profile = "qui";
                    user = "cum";
                    value = "iure";
                }};;
            }};            

            UsersProfileSetResponse res = sdk.usersProfile.usersProfileSet(req, new UsersProfileSetSecurity("necessitatibus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersProfileSetSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
