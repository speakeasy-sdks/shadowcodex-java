# reminders

### Available Operations

* [remindersAdd](#remindersadd) - Creates a reminder.
* [remindersComplete](#reminderscomplete) - Marks a reminder as complete.
* [remindersDelete](#remindersdelete) - Deletes a reminder.
* [remindersInfo](#remindersinfo) - Gets information about a reminder.
* [remindersList](#reminderslist) - Lists all reminders created by or for a given user.

## remindersAdd

Creates a reminder.

API method documentation
<https://api.slack.com/methods/reminders.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RemindersAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.RemindersAddRequest;
import shadowcodex.slack_spec.models.operations.RemindersAddResponse;
import shadowcodex.slack_spec.models.operations.RemindersAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RemindersAddRequest req = new RemindersAddRequest(                new RemindersAddApplicationJSON("numquam", "veniam") {{
                                user = "in";
                            }};, "officiis");            

            RemindersAddResponse res = sdk.reminders.remindersAdd(req, new RemindersAddSecurity("beatae") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.remindersAddSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## remindersComplete

Marks a reminder as complete.

API method documentation
<https://api.slack.com/methods/reminders.complete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RemindersCompleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.RemindersCompleteRequest;
import shadowcodex.slack_spec.models.operations.RemindersCompleteResponse;
import shadowcodex.slack_spec.models.operations.RemindersCompleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RemindersCompleteRequest req = new RemindersCompleteRequest() {{
                requestBody = new RemindersCompleteApplicationJSON() {{
                    reminder = "laudantium";
                }};;
                token = "exercitationem";
            }};            

            RemindersCompleteResponse res = sdk.reminders.remindersComplete(req, new RemindersCompleteSecurity("praesentium") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.remindersCompleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## remindersDelete

Deletes a reminder.

API method documentation
<https://api.slack.com/methods/reminders.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RemindersDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.RemindersDeleteRequest;
import shadowcodex.slack_spec.models.operations.RemindersDeleteResponse;
import shadowcodex.slack_spec.models.operations.RemindersDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RemindersDeleteRequest req = new RemindersDeleteRequest() {{
                requestBody = new RemindersDeleteApplicationJSON() {{
                    reminder = "cum";
                }};;
                token = "laboriosam";
            }};            

            RemindersDeleteResponse res = sdk.reminders.remindersDelete(req, new RemindersDeleteSecurity("dolorum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.remindersDeleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## remindersInfo

Gets information about a reminder.

API method documentation
<https://api.slack.com/methods/reminders.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RemindersInfoRequest;
import shadowcodex.slack_spec.models.operations.RemindersInfoResponse;
import shadowcodex.slack_spec.models.operations.RemindersInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RemindersInfoRequest req = new RemindersInfoRequest() {{
                reminder = "voluptatum";
                token = "error";
            }};            

            RemindersInfoResponse res = sdk.reminders.remindersInfo(req, new RemindersInfoSecurity("hic") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.remindersInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## remindersList

Lists all reminders created by or for a given user.

API method documentation
<https://api.slack.com/methods/reminders.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.RemindersListRequest;
import shadowcodex.slack_spec.models.operations.RemindersListResponse;
import shadowcodex.slack_spec.models.operations.RemindersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            RemindersListRequest req = new RemindersListRequest() {{
                token = "expedita";
            }};            

            RemindersListResponse res = sdk.reminders.remindersList(req, new RemindersListSecurity("debitis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.remindersListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
