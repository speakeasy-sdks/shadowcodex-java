# adminUsergroups

### Available Operations

* [adminUsergroupsAddChannels](#adminusergroupsaddchannels) - Add one or more default channels to an IDP group.
* [adminUsergroupsAddTeams](#adminusergroupsaddteams) - Associate one or more default workspaces with an organization-wide IDP group.
* [adminUsergroupsListChannels](#adminusergroupslistchannels) - List the channels linked to an org-level IDP group (user group).
* [adminUsergroupsRemoveChannels](#adminusergroupsremovechannels) - Remove one or more default channels from an org-level IDP group (user group).

## adminUsergroupsAddChannels

Add one or more default channels to an IDP group.

API method documentation
<https://api.slack.com/methods/admin.usergroups.addChannels>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddChannelsApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddChannelsRequest;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddChannelsResponse;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddChannelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsergroupsAddChannelsRequest req = new AdminUsergroupsAddChannelsRequest(                new AdminUsergroupsAddChannelsApplicationJSON("at", "quaerat") {{
                                teamId = "tempora";
                            }};, "vel");            

            AdminUsergroupsAddChannelsResponse res = sdk.adminUsergroups.adminUsergroupsAddChannels(req, new AdminUsergroupsAddChannelsSecurity("quod") {{
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

## adminUsergroupsAddTeams

Associate one or more default workspaces with an organization-wide IDP group.

API method documentation
<https://api.slack.com/methods/admin.usergroups.addTeams>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddTeamsApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddTeamsRequest;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddTeamsResponse;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsAddTeamsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsergroupsAddTeamsRequest req = new AdminUsergroupsAddTeamsRequest(                new AdminUsergroupsAddTeamsApplicationJSON("officiis", "qui") {{
                                autoProvision = false;
                            }};, "dolorum");            

            AdminUsergroupsAddTeamsResponse res = sdk.adminUsergroups.adminUsergroupsAddTeams(req, new AdminUsergroupsAddTeamsSecurity("a") {{
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

## adminUsergroupsListChannels

List the channels linked to an org-level IDP group (user group).

API method documentation
<https://api.slack.com/methods/admin.usergroups.listChannels>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsListChannelsRequest;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsListChannelsResponse;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsListChannelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsergroupsListChannelsRequest req = new AdminUsergroupsListChannelsRequest("esse", "harum") {{
                includeNumMembers = false;
                teamId = "iusto";
            }};            

            AdminUsergroupsListChannelsResponse res = sdk.adminUsergroups.adminUsergroupsListChannels(req, new AdminUsergroupsListChannelsSecurity("ipsum") {{
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

## adminUsergroupsRemoveChannels

Remove one or more default channels from an org-level IDP group (user group).

API method documentation
<https://api.slack.com/methods/admin.usergroups.removeChannels>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsRemoveChannelsApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsRemoveChannelsRequest;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsRemoveChannelsResponse;
import shadowcodex.slack_spec.models.operations.AdminUsergroupsRemoveChannelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsergroupsRemoveChannelsRequest req = new AdminUsergroupsRemoveChannelsRequest(                new AdminUsergroupsRemoveChannelsApplicationJSON("quisquam", "tenetur");, "amet");            

            AdminUsergroupsRemoveChannelsResponse res = sdk.adminUsergroups.adminUsergroupsRemoveChannels(req, new AdminUsergroupsRemoveChannelsSecurity("tempore") {{
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
