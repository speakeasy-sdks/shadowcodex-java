# pins

### Available Operations

* [pinsAdd](#pinsadd) - Pins an item to a channel.
* [pinsList](#pinslist) - Lists items pinned to a channel.
* [pinsRemove](#pinsremove) - Un-pins an item from a channel.

## pinsAdd

Pins an item to a channel.

API method documentation
<https://api.slack.com/methods/pins.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.PinsAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.PinsAddRequest;
import shadowcodex.slack_spec.models.operations.PinsAddResponse;
import shadowcodex.slack_spec.models.operations.PinsAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            PinsAddRequest req = new PinsAddRequest(                new PinsAddApplicationJSON("incidunt") {{
                                timestamp = "sed";
                            }};, "provident");            

            PinsAddResponse res = sdk.pins.pinsAdd(req, new PinsAddSecurity("eius") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.pinsAddSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## pinsList

Lists items pinned to a channel.

API method documentation
<https://api.slack.com/methods/pins.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.PinsListRequest;
import shadowcodex.slack_spec.models.operations.PinsListResponse;
import shadowcodex.slack_spec.models.operations.PinsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            PinsListRequest req = new PinsListRequest("necessitatibus", "ipsum");            

            PinsListResponse res = sdk.pins.pinsList(req, new PinsListSecurity("ea") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.pinsListSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## pinsRemove

Un-pins an item from a channel.

API method documentation
<https://api.slack.com/methods/pins.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.PinsRemoveApplicationJSON;
import shadowcodex.slack_spec.models.operations.PinsRemoveRequest;
import shadowcodex.slack_spec.models.operations.PinsRemoveResponse;
import shadowcodex.slack_spec.models.operations.PinsRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            PinsRemoveRequest req = new PinsRemoveRequest(                new PinsRemoveApplicationJSON("occaecati") {{
                                timestamp = "quos";
                            }};, "voluptatibus");            

            PinsRemoveResponse res = sdk.pins.pinsRemove(req, new PinsRemoveSecurity("tempora") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.pinsRemoveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
