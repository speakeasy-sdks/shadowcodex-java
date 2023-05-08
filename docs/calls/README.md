# calls

### Available Operations

* [callsAdd](#callsadd) - Registers a new Call.
* [callsEnd](#callsend) - Ends a Call.
* [callsInfo](#callsinfo) - Returns information about a Call.
* [callsParticipantsAdd](#callsparticipantsadd) - Registers new participants added to a Call.
* [callsParticipantsRemove](#callsparticipantsremove) - Registers participants removed from a Call.
* [callsUpdate](#callsupdate) - Updates information about a Call.

## callsAdd

Registers a new Call.

API method documentation
<https://api.slack.com/methods/calls.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsAddApplicationJSON;
import shadowcodex.slack_spec.models.operations.CallsAddRequest;
import shadowcodex.slack_spec.models.operations.CallsAddResponse;
import shadowcodex.slack_spec.models.operations.CallsAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsAddRequest req = new CallsAddRequest(                new CallsAddApplicationJSON("distinctio", "quod") {{
                                createdBy = "odio";
                                dateStart = 630448;
                                desktopAppJoinUrl = "facilis";
                                externalDisplayId = "vero";
                                title = "Ms.";
                                users = "dolore";
                            }};, "quibusdam");            

            CallsAddResponse res = sdk.calls.callsAdd(req, new CallsAddSecurity("illum") {{
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

## callsEnd

Ends a Call.

API method documentation
<https://api.slack.com/methods/calls.end>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsEndApplicationJSON;
import shadowcodex.slack_spec.models.operations.CallsEndRequest;
import shadowcodex.slack_spec.models.operations.CallsEndResponse;
import shadowcodex.slack_spec.models.operations.CallsEndSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsEndRequest req = new CallsEndRequest(                new CallsEndApplicationJSON("sequi") {{
                                duration = 617877;
                            }};, "impedit");            

            CallsEndResponse res = sdk.calls.callsEnd(req, new CallsEndSecurity("aut") {{
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

## callsInfo

Returns information about a Call.

API method documentation
<https://api.slack.com/methods/calls.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsInfoRequest;
import shadowcodex.slack_spec.models.operations.CallsInfoResponse;
import shadowcodex.slack_spec.models.operations.CallsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsInfoRequest req = new CallsInfoRequest("voluptatibus", "exercitationem");            

            CallsInfoResponse res = sdk.calls.callsInfo(req, new CallsInfoSecurity("nulla") {{
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

            CallsParticipantsAddRequest req = new CallsParticipantsAddRequest(                new CallsParticipantsAddApplicationJSON("fugit", "porro");, "maiores");            

            CallsParticipantsAddResponse res = sdk.calls.callsParticipantsAdd(req, new CallsParticipantsAddSecurity("doloribus") {{
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

            CallsParticipantsRemoveRequest req = new CallsParticipantsRemoveRequest(                new CallsParticipantsRemoveApplicationJSON("iusto", "eligendi");, "ducimus");            

            CallsParticipantsRemoveResponse res = sdk.calls.callsParticipantsRemove(req, new CallsParticipantsRemoveSecurity("alias") {{
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

## callsUpdate

Updates information about a Call.

API method documentation
<https://api.slack.com/methods/calls.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.CallsUpdateApplicationJSON;
import shadowcodex.slack_spec.models.operations.CallsUpdateRequest;
import shadowcodex.slack_spec.models.operations.CallsUpdateResponse;
import shadowcodex.slack_spec.models.operations.CallsUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            CallsUpdateRequest req = new CallsUpdateRequest(                new CallsUpdateApplicationJSON("officia") {{
                                desktopAppJoinUrl = "tempora";
                                joinUrl = "ipsam";
                                title = "Ms.";
                            }};, "aspernatur");            

            CallsUpdateResponse res = sdk.calls.callsUpdate(req, new CallsUpdateSecurity("vel") {{
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
