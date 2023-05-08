# callsParticipants

### Available Operations

* [callsParticipantsAdd](#callsparticipantsadd) - Registers new participants added to a Call.
* [callsParticipantsRemove](#callsparticipantsremove) - Registers participants removed from a Call.

## callsParticipantsAdd

Registers new participants added to a Call.

API method documentation
<https://api.slack.com/methods/calls.participants.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsParticipantsAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.CallsParticipantsAddRequest;
import shadowcodex.slack_spec.models.operations.CallsParticipantsAddResponse;
import shadowcodex.slack_spec.models.operations.CallsParticipantsAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsParticipantsAddRequest req = new CallsParticipantsAddRequest(                new CallsParticipantsAddApplicationJSON("possimus", "magnam");, "ratione");            

            CallsParticipantsAddResponse res = sdk.callsParticipants.callsParticipantsAdd(req, new CallsParticipantsAddSecurity("ex") {{
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

## callsParticipantsRemove

Registers participants removed from a Call.

API method documentation
<https://api.slack.com/methods/calls.participants.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsParticipantsRemoveApplicationJSON;
import shadowcodex.slack_spec.models.operations.CallsParticipantsRemoveRequest;
import shadowcodex.slack_spec.models.operations.CallsParticipantsRemoveResponse;
import shadowcodex.slack_spec.models.operations.CallsParticipantsRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsParticipantsRemoveRequest req = new CallsParticipantsRemoveRequest(                new CallsParticipantsRemoveApplicationJSON("laudantium", "dicta");, "dolor");            

            CallsParticipantsRemoveResponse res = sdk.callsParticipants.callsParticipantsRemove(req, new CallsParticipantsRemoveSecurity("maiores") {{
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
