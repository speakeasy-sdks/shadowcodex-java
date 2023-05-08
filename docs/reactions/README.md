# reactions

### Available Operations

* [reactionsAdd](#reactionsadd) - Adds a reaction to an item.
* [reactionsGet](#reactionsget) - Gets reactions for an item.
* [reactionsList](#reactionslist) - Lists reactions made by a user.
* [reactionsRemove](#reactionsremove) - Removes a reaction from an item.

## reactionsAdd

Adds a reaction to an item.

API method documentation
<https://api.slack.com/methods/reactions.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ReactionsAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.ReactionsAddRequest;
import shadowcodex.slack_spec.models.operations.ReactionsAddResponse;
import shadowcodex.slack_spec.models.operations.ReactionsAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ReactionsAddRequest req = new ReactionsAddRequest(                new ReactionsAddApplicationJSON("tempora", "voluptate", "reiciendis");, "ex");            

            ReactionsAddResponse res = sdk.reactions.reactionsAdd(req, new ReactionsAddSecurity("sit") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.reactionsAddSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## reactionsGet

Gets reactions for an item.

API method documentation
<https://api.slack.com/methods/reactions.get>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ReactionsGetRequest;
import shadowcodex.slack_spec.models.operations.ReactionsGetResponse;
import shadowcodex.slack_spec.models.operations.ReactionsGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ReactionsGetRequest req = new ReactionsGetRequest("non") {{
                channel = "officiis";
                file = "praesentium";
                fileComment = "facilis";
                full = false;
                timestamp = "quaerat";
            }};            

            ReactionsGetResponse res = sdk.reactions.reactionsGet(req, new ReactionsGetSecurity("incidunt") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.reactionsGetSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## reactionsList

Lists reactions made by a user.

API method documentation
<https://api.slack.com/methods/reactions.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ReactionsListRequest;
import shadowcodex.slack_spec.models.operations.ReactionsListResponse;
import shadowcodex.slack_spec.models.operations.ReactionsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ReactionsListRequest req = new ReactionsListRequest("ipsam") {{
                count = 894864L;
                cursor = "rem";
                full = false;
                limit = 26522L;
                page = 750595L;
                user = "error";
            }};            

            ReactionsListResponse res = sdk.reactions.reactionsList(req, new ReactionsListSecurity("veniam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.reactionsListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## reactionsRemove

Removes a reaction from an item.

API method documentation
<https://api.slack.com/methods/reactions.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ReactionsRemoveApplicationJSON;
import shadowcodex.slack_spec.models.operations.ReactionsRemoveRequest;
import shadowcodex.slack_spec.models.operations.ReactionsRemoveResponse;
import shadowcodex.slack_spec.models.operations.ReactionsRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ReactionsRemoveRequest req = new ReactionsRemoveRequest(                new ReactionsRemoveApplicationJSON("minima") {{
                                channel = "recusandae";
                                file = "reiciendis";
                                fileComment = "nulla";
                                timestamp = "magni";
                            }};, "aperiam");            

            ReactionsRemoveResponse res = sdk.reactions.reactionsRemove(req, new ReactionsRemoveSecurity("saepe") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.reactionsRemoveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
