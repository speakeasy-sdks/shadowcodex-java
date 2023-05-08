# dnd

### Available Operations

* [dndEndDnd](#dndenddnd) - Ends the current user's Do Not Disturb session immediately.
* [dndEndSnooze](#dndendsnooze) - Ends the current user's snooze mode immediately.
* [dndInfo](#dndinfo) - Retrieves a user's current Do Not Disturb status.
* [dndSetSnooze](#dndsetsnooze) - Turns on Do Not Disturb mode for the current user, or changes its duration.
* [dndTeamInfo](#dndteaminfo) - Retrieves the Do Not Disturb status for up to 50 users on a team.

## dndEndDnd

Ends the current user's Do Not Disturb session immediately.

API method documentation
<https://api.slack.com/methods/dnd.endDnd>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DndEndDndRequest;
import shadowcodex.slack_spec.models.operations.DndEndDndResponse;
import shadowcodex.slack_spec.models.operations.DndEndDndSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DndEndDndRequest req = new DndEndDndRequest("a");            

            DndEndDndResponse res = sdk.dnd.dndEndDnd(req, new DndEndDndSecurity("error") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.dndEndDndSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## dndEndSnooze

Ends the current user's snooze mode immediately.

API method documentation
<https://api.slack.com/methods/dnd.endSnooze>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DndEndSnoozeRequest;
import shadowcodex.slack_spec.models.operations.DndEndSnoozeResponse;
import shadowcodex.slack_spec.models.operations.DndEndSnoozeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DndEndSnoozeRequest req = new DndEndSnoozeRequest("sint");            

            DndEndSnoozeResponse res = sdk.dnd.dndEndSnooze(req, new DndEndSnoozeSecurity("pariatur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.dndEndSnoozeSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## dndInfo

Retrieves a user's current Do Not Disturb status.

API method documentation
<https://api.slack.com/methods/dnd.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DndInfoRequest;
import shadowcodex.slack_spec.models.operations.DndInfoResponse;
import shadowcodex.slack_spec.models.operations.DndInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DndInfoRequest req = new DndInfoRequest() {{
                token = "possimus";
                user = "quia";
            }};            

            DndInfoResponse res = sdk.dnd.dndInfo(req, new DndInfoSecurity("eveniet") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.dndInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## dndSetSnooze

Turns on Do Not Disturb mode for the current user, or changes its duration.

API method documentation
<https://api.slack.com/methods/dnd.setSnooze>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DndSetSnoozeRequestBody;
import shadowcodex.slack_spec.models.operations.DndSetSnoozeResponse;
import shadowcodex.slack_spec.models.operations.DndSetSnoozeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DndSetSnoozeRequestBody req = new DndSetSnoozeRequestBody("asperiores", "facere");            

            DndSetSnoozeResponse res = sdk.dnd.dndSetSnooze(req, new DndSetSnoozeSecurity("veritatis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.dndSetSnoozeSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## dndTeamInfo

Retrieves the Do Not Disturb status for up to 50 users on a team.

API method documentation
<https://api.slack.com/methods/dnd.teamInfo>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DndTeamInfoRequest;
import shadowcodex.slack_spec.models.operations.DndTeamInfoResponse;
import shadowcodex.slack_spec.models.operations.DndTeamInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DndTeamInfoRequest req = new DndTeamInfoRequest() {{
                token = "consequuntur";
                users = "quasi";
            }};            

            DndTeamInfoResponse res = sdk.dnd.dndTeamInfo(req, new DndTeamInfoSecurity("similique") {{
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
