# adminConversationsRestrictAccess

### Available Operations

* [adminConversationsRestrictAccessAddGroup](#adminconversationsrestrictaccessaddgroup) - Add an allowlist of IDP groups for accessing a channel
* [adminConversationsRestrictAccessListGroups](#adminconversationsrestrictaccesslistgroups) - List all IDP Groups linked to a channel
* [adminConversationsRestrictAccessRemoveGroup](#adminconversationsrestrictaccessremovegroup) - Remove a linked IDP group linked from a private channel

## adminConversationsRestrictAccessAddGroup

Add an allowlist of IDP groups for accessing a channel

API method documentation
<https://api.slack.com/methods/admin.conversations.restrictAccess.addGroup>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessAddGroupRequestBody;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessAddGroupResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessAddGroupSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsRestrictAccessAddGroupRequestBody req = new AdminConversationsRestrictAccessAddGroupRequestBody("quis", "nesciunt", "eos") {{
                teamId = "perferendis";
            }};            

            AdminConversationsRestrictAccessAddGroupResponse res = sdk.adminConversationsRestrictAccess.adminConversationsRestrictAccessAddGroup(req, new AdminConversationsRestrictAccessAddGroupSecurity("dolores") {{
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

## adminConversationsRestrictAccessListGroups

List all IDP Groups linked to a channel

API method documentation
<https://api.slack.com/methods/admin.conversations.restrictAccess.listGroups>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessListGroupsRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessListGroupsResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessListGroupsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsRestrictAccessListGroupsRequest req = new AdminConversationsRestrictAccessListGroupsRequest("minus", "quam") {{
                teamId = "dolor";
            }};            

            AdminConversationsRestrictAccessListGroupsResponse res = sdk.adminConversationsRestrictAccess.adminConversationsRestrictAccessListGroups(req, new AdminConversationsRestrictAccessListGroupsSecurity("vero") {{
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

## adminConversationsRestrictAccessRemoveGroup

Remove a linked IDP group linked from a private channel

API method documentation
<https://api.slack.com/methods/admin.conversations.restrictAccess.removeGroup>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessRemoveGroupRequestBody;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessRemoveGroupResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsRestrictAccessRemoveGroupSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsRestrictAccessRemoveGroupRequestBody req = new AdminConversationsRestrictAccessRemoveGroupRequestBody("nostrum", "hic", "recusandae", "omnis");            

            AdminConversationsRestrictAccessRemoveGroupResponse res = sdk.adminConversationsRestrictAccess.adminConversationsRestrictAccessRemoveGroup(req, new AdminConversationsRestrictAccessRemoveGroupSecurity("facilis") {{
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
