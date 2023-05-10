# views

### Available Operations

* [viewsOpen](#viewsopen) - Open a view for a user.
* [viewsPublish](#viewspublish) - Publish a static view for a User.
* [viewsPush](#viewspush) - Push a view onto the stack of a root view.
* [viewsUpdate](#viewsupdate) - Update an existing view.

## viewsOpen

Open a view for a user.

API method documentation
<https://api.slack.com/methods/views.open>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ViewsOpenRequest;
import shadowcodex.slack_spec.models.operations.ViewsOpenResponse;
import shadowcodex.slack_spec.models.operations.ViewsOpenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ViewsOpenRequest req = new ViewsOpenRequest("ratione", "laborum", "distinctio");            

            ViewsOpenResponse res = sdk.views.viewsOpen(req, new ViewsOpenSecurity("voluptatum") {{
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

## viewsPublish

Publish a static view for a User.

API method documentation
<https://api.slack.com/methods/views.publish>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ViewsPublishRequest;
import shadowcodex.slack_spec.models.operations.ViewsPublishResponse;
import shadowcodex.slack_spec.models.operations.ViewsPublishSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ViewsPublishRequest req = new ViewsPublishRequest("rem", "aliquam", "ad") {{
                hash = "repellat";
            }};            

            ViewsPublishResponse res = sdk.views.viewsPublish(req, new ViewsPublishSecurity("alias") {{
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

## viewsPush

Push a view onto the stack of a root view.

API method documentation
<https://api.slack.com/methods/views.push>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ViewsPushRequest;
import shadowcodex.slack_spec.models.operations.ViewsPushResponse;
import shadowcodex.slack_spec.models.operations.ViewsPushSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ViewsPushRequest req = new ViewsPushRequest("corporis", "perspiciatis", "nihil");            

            ViewsPushResponse res = sdk.views.viewsPush(req, new ViewsPushSecurity("mollitia") {{
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

## viewsUpdate

Update an existing view.

API method documentation
<https://api.slack.com/methods/views.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ViewsUpdateRequest;
import shadowcodex.slack_spec.models.operations.ViewsUpdateResponse;
import shadowcodex.slack_spec.models.operations.ViewsUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ViewsUpdateRequest req = new ViewsUpdateRequest("voluptas") {{
                externalId = "alias";
                hash = "maiores";
                view = "reiciendis";
                viewId = "dolores";
            }};            

            ViewsUpdateResponse res = sdk.views.viewsUpdate(req, new ViewsUpdateSecurity("id") {{
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
