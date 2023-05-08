# stars

### Available Operations

* [starsAdd](#starsadd) - Adds a star to an item.
* [starsList](#starslist) - Lists stars for a user.
* [starsRemove](#starsremove) - Removes a star from an item.

## starsAdd

Adds a star to an item.

API method documentation
<https://api.slack.com/methods/stars.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.StarsAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.StarsAddRequest;
import shadowcodex.slack_spec.models.operations.StarsAddResponse;
import shadowcodex.slack_spec.models.operations.StarsAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            StarsAddRequest req = new StarsAddRequest("fugit") {{
                requestBody = new StarsAddApplicationJSON() {{
                    channel = "ut";
                    file = "fugiat";
                    fileComment = "voluptatem";
                    timestamp = "culpa";
                }};;
            }};            

            StarsAddResponse res = sdk.stars.starsAdd(req, new StarsAddSecurity("expedita") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.starsAddSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## starsList

Lists stars for a user.

API method documentation
<https://api.slack.com/methods/stars.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.StarsListRequest;
import shadowcodex.slack_spec.models.operations.StarsListResponse;
import shadowcodex.slack_spec.models.operations.StarsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            StarsListRequest req = new StarsListRequest() {{
                count = "magnam";
                cursor = "consequatur";
                limit = 460220L;
                page = "ipsam";
                token = "sit";
            }};            

            StarsListResponse res = sdk.stars.starsList(req, new StarsListSecurity("voluptatum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.starsListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## starsRemove

Removes a star from an item.

API method documentation
<https://api.slack.com/methods/stars.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.StarsRemoveApplicationJSON;
import shadowcodex.slack_spec.models.operations.StarsRemoveRequest;
import shadowcodex.slack_spec.models.operations.StarsRemoveResponse;
import shadowcodex.slack_spec.models.operations.StarsRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            StarsRemoveRequest req = new StarsRemoveRequest("quas") {{
                requestBody = new StarsRemoveApplicationJSON() {{
                    channel = "repudiandae";
                    file = "corporis";
                    fileComment = "et";
                    timestamp = "blanditiis";
                }};;
            }};            

            StarsRemoveResponse res = sdk.stars.starsRemove(req, new StarsRemoveSecurity("ex") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.starsRemoveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
