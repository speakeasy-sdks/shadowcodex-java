# adminInviteRequests

### Available Operations

* [adminInviteRequestsApprove](#admininviterequestsapprove) - Approve a workspace invite request.
* [adminInviteRequestsDeny](#admininviterequestsdeny) - Deny a workspace invite request.
* [adminInviteRequestsList](#admininviterequestslist) - List all pending workspace invite requests.

## adminInviteRequestsApprove

Approve a workspace invite request.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.approve>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApproveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApproveRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApproveResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApproveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsApproveRequest req = new AdminInviteRequestsApproveRequest(                new AdminInviteRequestsApproveApplicationJSON("libero") {{
                                teamId = "delectus";
                            }};, "quaerat");            

            AdminInviteRequestsApproveResponse res = sdk.adminInviteRequests.adminInviteRequestsApprove(req, new AdminInviteRequestsApproveSecurity("quos") {{
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

## adminInviteRequestsDeny

Deny a workspace invite request.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.deny>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDenyApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDenyRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDenyResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDenySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsDenyRequest req = new AdminInviteRequestsDenyRequest(                new AdminInviteRequestsDenyApplicationJSON("aliquid") {{
                                teamId = "dolorem";
                            }};, "dolorem");            

            AdminInviteRequestsDenyResponse res = sdk.adminInviteRequests.adminInviteRequestsDeny(req, new AdminInviteRequestsDenySecurity("dolor") {{
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

## adminInviteRequestsList

List all pending workspace invite requests.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsListRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsListResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsListRequest req = new AdminInviteRequestsListRequest("qui") {{
                cursor = "ipsum";
                limit = 944373L;
                teamId = "excepturi";
            }};            

            AdminInviteRequestsListResponse res = sdk.adminInviteRequests.adminInviteRequestsList(req, new AdminInviteRequestsListSecurity("cum") {{
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
