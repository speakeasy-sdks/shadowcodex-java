# admin

### Available Operations

* [adminAppsApprove](#adminappsapprove) - Approve an app for installation on a workspace.
* [adminAppsApprovedList](#adminappsapprovedlist) - List approved apps for an org or workspace.
* [adminAppsRequestsList](#adminappsrequestslist) - List app requests for a team/workspace.
* [adminAppsRestrict](#adminappsrestrict) - Restrict an app for installation on a workspace.
* [adminAppsRestrictedList](#adminappsrestrictedlist) - List restricted apps for an org or workspace.
* [adminConversationsArchive](#adminconversationsarchive) - Archive a public or private channel.
* [adminConversationsConvertToPrivate](#adminconversationsconverttoprivate) - Convert a public channel to a private channel.
* [adminConversationsCreate](#adminconversationscreate) - Create a public or private channel-based conversation.
* [adminConversationsDelete](#adminconversationsdelete) - Delete a public or private channel.
* [adminConversationsDisconnectShared](#adminconversationsdisconnectshared) - Disconnect a connected channel from one or more workspaces.
* [adminConversationsEkmListOriginalConnectedChannelInfo](#adminconversationsekmlistoriginalconnectedchannelinfo) - List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.
* [adminConversationsGetConversationPrefs](#adminconversationsgetconversationprefs) - Get conversation preferences for a public or private channel.
* [adminConversationsGetTeams](#adminconversationsgetteams) - Get all the workspaces a given public or private channel is connected to within this Enterprise org.
* [adminConversationsInvite](#adminconversationsinvite) - Invite a user to a public or private channel.
* [adminConversationsRename](#adminconversationsrename) - Rename a public or private channel.
* [adminConversationsRestrictAccessAddGroup](#adminconversationsrestrictaccessaddgroup) - Add an allowlist of IDP groups for accessing a channel
* [adminConversationsRestrictAccessListGroups](#adminconversationsrestrictaccesslistgroups) - List all IDP Groups linked to a channel
* [adminConversationsRestrictAccessRemoveGroup](#adminconversationsrestrictaccessremovegroup) - Remove a linked IDP group linked from a private channel
* [adminConversationsSearch](#adminconversationssearch) - Search for public or private channels in an Enterprise organization.
* [adminConversationsSetConversationPrefs](#adminconversationssetconversationprefs) - Set the posting permissions for a public or private channel.
* [adminConversationsSetTeams](#adminconversationssetteams) - Set the workspaces in an Enterprise grid org that connect to a public or private channel.
* [adminConversationsUnarchive](#adminconversationsunarchive) - Unarchive a public or private channel.
* [adminEmojiAdd](#adminemojiadd) - Add an emoji.
* [adminEmojiAddAlias](#adminemojiaddalias) - Add an emoji alias.
* [adminEmojiList](#adminemojilist) - List emoji for an Enterprise Grid organization.
* [adminEmojiRemove](#adminemojiremove) - Remove an emoji across an Enterprise Grid organization
* [adminEmojiRename](#adminemojirename) - Rename an emoji.
* [adminInviteRequestsApprove](#admininviterequestsapprove) - Approve a workspace invite request.
* [adminInviteRequestsApprovedList](#admininviterequestsapprovedlist) - List all approved workspace invite requests.
* [adminInviteRequestsDeniedList](#admininviterequestsdeniedlist) - List all denied workspace invite requests.
* [adminInviteRequestsDeny](#admininviterequestsdeny) - Deny a workspace invite request.
* [adminInviteRequestsList](#admininviterequestslist) - List all pending workspace invite requests.
* [adminTeamsAdminsList](#adminteamsadminslist) - List all of the admins on a given workspace.
* [adminTeamsCreate](#adminteamscreate) - Create an Enterprise team.
* [adminTeamsList](#adminteamslist) - List all teams on an Enterprise organization
* [adminTeamsOwnersList](#adminteamsownerslist) - List all of the owners on a given workspace.
* [adminTeamsSettingsInfo](#adminteamssettingsinfo) - Fetch information about settings in a workspace
* [adminTeamsSettingsSetDefaultChannels](#adminteamssettingssetdefaultchannels) - Set the default channels of a workspace.
* [adminTeamsSettingsSetDescription](#adminteamssettingssetdescription) - Set the description of a given workspace.
* [adminTeamsSettingsSetDiscoverability](#adminteamssettingssetdiscoverability) - An API method that allows admins to set the discoverability of a given workspace
* [adminTeamsSettingsSetIcon](#adminteamssettingsseticon) - Sets the icon of a workspace.
* [adminTeamsSettingsSetName](#adminteamssettingssetname) - Set the name of a given workspace.
* [adminUsergroupsAddChannels](#adminusergroupsaddchannels) - Add one or more default channels to an IDP group.
* [adminUsergroupsAddTeams](#adminusergroupsaddteams) - Associate one or more default workspaces with an organization-wide IDP group.
* [adminUsergroupsListChannels](#adminusergroupslistchannels) - List the channels linked to an org-level IDP group (user group).
* [adminUsergroupsRemoveChannels](#adminusergroupsremovechannels) - Remove one or more default channels from an org-level IDP group (user group).
* [adminUsersAssign](#adminusersassign) - Add an Enterprise user to a workspace.
* [adminUsersInvite](#adminusersinvite) - Invite a user to a workspace.
* [adminUsersList](#adminuserslist) - List users on a workspace
* [adminUsersRemove](#adminusersremove) - Remove a user from a workspace.
* [adminUsersSessionInvalidate](#adminuserssessioninvalidate) - Invalidate a single session for a user by session_id
* [adminUsersSessionReset](#adminuserssessionreset) - Wipes all valid sessions on all devices for a given user
* [adminUsersSetAdmin](#adminuserssetadmin) - Set an existing guest, regular user, or owner to be an admin user.
* [adminUsersSetExpiration](#adminuserssetexpiration) - Set an expiration for a guest user
* [adminUsersSetOwner](#adminuserssetowner) - Set an existing guest, regular user, or admin user to be a workspace owner.
* [adminUsersSetRegular](#adminuserssetregular) - Set an existing guest user, admin user, or owner to be a regular user.

## adminAppsApprove

Approve an app for installation on a workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.approve>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsApproveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsApproveRequest req = new AdminAppsApproveRequest("nulla") {{
                requestBody = new AdminAppsApproveApplicationJSON() {{
                    appId = "corrupti";
                    requestId = "illum";
                    teamId = "vel";
                }};;
            }};            

            AdminAppsApproveResponse res = sdk.admin.adminAppsApprove(req, new AdminAppsApproveSecurity("error") {{
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

## adminAppsApprovedList

List approved apps for an org or workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.approved.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsApprovedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsApprovedListRequest req = new AdminAppsApprovedListRequest("deserunt") {{
                cursor = "suscipit";
                enterpriseId = "iure";
                limit = 297534L;
                teamId = "debitis";
            }};            

            AdminAppsApprovedListResponse res = sdk.admin.adminAppsApprovedList(req, new AdminAppsApprovedListSecurity("ipsa") {{
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

## adminAppsRequestsList

List app requests for a team/workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.requests.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRequestsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRequestsListRequest req = new AdminAppsRequestsListRequest("delectus") {{
                cursor = "tempora";
                limit = 383441L;
                teamId = "molestiae";
            }};            

            AdminAppsRequestsListResponse res = sdk.admin.adminAppsRequestsList(req, new AdminAppsRequestsListSecurity("minus") {{
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

## adminAppsRestrict

Restrict an app for installation on a workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.restrict>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRestrictRequest req = new AdminAppsRestrictRequest("placeat") {{
                requestBody = new AdminAppsRestrictApplicationJSON() {{
                    appId = "voluptatum";
                    requestId = "iusto";
                    teamId = "excepturi";
                }};;
            }};            

            AdminAppsRestrictResponse res = sdk.admin.adminAppsRestrict(req, new AdminAppsRestrictSecurity("nisi") {{
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

## adminAppsRestrictedList

List restricted apps for an org or workspace.

API method documentation
<https://api.slack.com/methods/admin.apps.restricted.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListRequest;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListResponse;
import shadowcodex.slack_spec.models.operations.AdminAppsRestrictedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminAppsRestrictedListRequest req = new AdminAppsRestrictedListRequest("recusandae") {{
                cursor = "temporibus";
                enterpriseId = "ab";
                limit = 337396L;
                teamId = "veritatis";
            }};            

            AdminAppsRestrictedListResponse res = sdk.admin.adminAppsRestrictedList(req, new AdminAppsRestrictedListSecurity("deserunt") {{
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

## adminConversationsArchive

Archive a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.archive>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsArchiveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsArchiveRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsArchiveResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsArchiveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsArchiveRequest req = new AdminConversationsArchiveRequest(                new AdminConversationsArchiveApplicationJSON("perferendis");, "ipsam");            

            AdminConversationsArchiveResponse res = sdk.admin.adminConversationsArchive(req, new AdminConversationsArchiveSecurity("repellendus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsArchiveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsConvertToPrivate

Convert a public channel to a private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.convertToPrivate>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsConvertToPrivateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsConvertToPrivateRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsConvertToPrivateResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsConvertToPrivateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsConvertToPrivateRequest req = new AdminConversationsConvertToPrivateRequest(                new AdminConversationsConvertToPrivateApplicationJSON("sapiente");, "quo");            

            AdminConversationsConvertToPrivateResponse res = sdk.admin.adminConversationsConvertToPrivate(req, new AdminConversationsConvertToPrivateSecurity("odit") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsConvertToPrivateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsCreate

Create a public or private channel-based conversation.

API method documentation
<https://api.slack.com/methods/admin.conversations.create>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsCreateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsCreateRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsCreateResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsCreateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsCreateRequest req = new AdminConversationsCreateRequest(                new AdminConversationsCreateApplicationJSON(false, "at") {{
                                description = "at";
                                orgWide = false;
                                teamId = "maiores";
                            }};, "molestiae");            

            AdminConversationsCreateResponse res = sdk.admin.adminConversationsCreate(req, new AdminConversationsCreateSecurity("quod") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsCreateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsDelete

Delete a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsDeleteRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsDeleteResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsDeleteRequest req = new AdminConversationsDeleteRequest(                new AdminConversationsDeleteApplicationJSON("quod");, "esse");            

            AdminConversationsDeleteResponse res = sdk.admin.adminConversationsDelete(req, new AdminConversationsDeleteSecurity("totam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsDeleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsDisconnectShared

Disconnect a connected channel from one or more workspaces.

API method documentation
<https://api.slack.com/methods/admin.conversations.disconnectShared>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsDisconnectSharedApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsDisconnectSharedRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsDisconnectSharedResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsDisconnectSharedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsDisconnectSharedRequest req = new AdminConversationsDisconnectSharedRequest(                new AdminConversationsDisconnectSharedApplicationJSON("porro") {{
                                leavingTeamIds = "dolorum";
                            }};, "dicta");            

            AdminConversationsDisconnectSharedResponse res = sdk.admin.adminConversationsDisconnectShared(req, new AdminConversationsDisconnectSharedSecurity("nam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsRenameSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsEkmListOriginalConnectedChannelInfo

List all disconnected channels—i.e., channels that were once connected to other workspaces and then disconnected—and the corresponding original channel IDs for key revocation with EKM.

API method documentation
<https://api.slack.com/methods/admin.conversations.ekm.listOriginalConnectedChannelInfo>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsEkmListOriginalConnectedChannelInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsEkmListOriginalConnectedChannelInfoRequest req = new AdminConversationsEkmListOriginalConnectedChannelInfoRequest("officia") {{
                channelIds = "occaecati";
                cursor = "fugit";
                limit = 537373L;
                teamIds = "hic";
            }};            

            AdminConversationsEkmListOriginalConnectedChannelInfoResponse res = sdk.admin.adminConversationsEkmListOriginalConnectedChannelInfo(req, new AdminConversationsEkmListOriginalConnectedChannelInfoSecurity("optio") {{
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

## adminConversationsGetConversationPrefs

Get conversation preferences for a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.getConversationPrefs>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetConversationPrefsRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetConversationPrefsResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetConversationPrefsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsGetConversationPrefsRequest req = new AdminConversationsGetConversationPrefsRequest("totam", "beatae");            

            AdminConversationsGetConversationPrefsResponse res = sdk.admin.adminConversationsGetConversationPrefs(req, new AdminConversationsGetConversationPrefsSecurity("commodi") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsGetConversationPrefsSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsGetTeams

Get all the workspaces a given public or private channel is connected to within this Enterprise org.

API method documentation
<https://api.slack.com/methods/admin.conversations.getTeams>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetTeamsRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetTeamsResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsGetTeamsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsGetTeamsRequest req = new AdminConversationsGetTeamsRequest("molestiae", "modi") {{
                cursor = "qui";
                limit = 774234L;
            }};            

            AdminConversationsGetTeamsResponse res = sdk.admin.adminConversationsGetTeams(req, new AdminConversationsGetTeamsSecurity("cum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsGetTeamsSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsInvite

Invite a user to a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.invite>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsInviteApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsInviteRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsInviteResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsInviteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsInviteRequest req = new AdminConversationsInviteRequest(                new AdminConversationsInviteApplicationJSON("esse", "ipsum");, "excepturi");            

            AdminConversationsInviteResponse res = sdk.admin.adminConversationsInvite(req, new AdminConversationsInviteSecurity("aspernatur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsInviteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsRename

Rename a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.rename>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsRenameApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsRenameRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsRenameResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsRenameSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsRenameRequest req = new AdminConversationsRenameRequest(                new AdminConversationsRenameApplicationJSON("perferendis", "ad");, "natus");            

            AdminConversationsRenameResponse res = sdk.admin.adminConversationsRename(req, new AdminConversationsRenameSecurity("sed") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsRenameSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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

            AdminConversationsRestrictAccessAddGroupRequestBody req = new AdminConversationsRestrictAccessAddGroupRequestBody("iste", "dolor", "natus") {{
                teamId = "laboriosam";
            }};            

            AdminConversationsRestrictAccessAddGroupResponse res = sdk.admin.adminConversationsRestrictAccessAddGroup(req, new AdminConversationsRestrictAccessAddGroupSecurity("hic") {{
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

            AdminConversationsRestrictAccessListGroupsRequest req = new AdminConversationsRestrictAccessListGroupsRequest("saepe", "fuga") {{
                teamId = "in";
            }};            

            AdminConversationsRestrictAccessListGroupsResponse res = sdk.admin.adminConversationsRestrictAccessListGroups(req, new AdminConversationsRestrictAccessListGroupsSecurity("corporis") {{
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

            AdminConversationsRestrictAccessRemoveGroupRequestBody req = new AdminConversationsRestrictAccessRemoveGroupRequestBody("iste", "iure", "saepe", "quidem");            

            AdminConversationsRestrictAccessRemoveGroupResponse res = sdk.admin.adminConversationsRestrictAccessRemoveGroup(req, new AdminConversationsRestrictAccessRemoveGroupSecurity("architecto") {{
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

## adminConversationsSearch

Search for public or private channels in an Enterprise organization.

API method documentation
<https://api.slack.com/methods/admin.conversations.search>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsSearchRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsSearchResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsSearchSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsSearchRequest req = new AdminConversationsSearchRequest("ipsa") {{
                cursor = "reiciendis";
                limit = 666767L;
                query = "mollitia";
                searchChannelTypes = "laborum";
                sort = "dolores";
                sortDir = "dolorem";
                teamIds = "corporis";
            }};            

            AdminConversationsSearchResponse res = sdk.admin.adminConversationsSearch(req, new AdminConversationsSearchSecurity("explicabo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsSearchSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsSetConversationPrefs

Set the posting permissions for a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.setConversationPrefs>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetConversationPrefsApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetConversationPrefsRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetConversationPrefsResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetConversationPrefsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsSetConversationPrefsRequest req = new AdminConversationsSetConversationPrefsRequest(                new AdminConversationsSetConversationPrefsApplicationJSON("nobis", "enim");, "omnis");            

            AdminConversationsSetConversationPrefsResponse res = sdk.admin.adminConversationsSetConversationPrefs(req, new AdminConversationsSetConversationPrefsSecurity("nemo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsSetConversationPrefsSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminConversationsSetTeams

Set the workspaces in an Enterprise grid org that connect to a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.setTeams>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetTeamsApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetTeamsRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetTeamsResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsSetTeamsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsSetTeamsRequest req = new AdminConversationsSetTeamsRequest(                new AdminConversationsSetTeamsApplicationJSON("minima") {{
                                orgChannel = false;
                                targetTeamIds = "excepturi";
                                teamId = "accusantium";
                            }};, "iure");            

            AdminConversationsSetTeamsResponse res = sdk.admin.adminConversationsSetTeams(req, new AdminConversationsSetTeamsSecurity("culpa") {{
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

## adminConversationsUnarchive

Unarchive a public or private channel.

API method documentation
<https://api.slack.com/methods/admin.conversations.unarchive>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminConversationsUnarchiveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminConversationsUnarchiveRequest;
import shadowcodex.slack_spec.models.operations.AdminConversationsUnarchiveResponse;
import shadowcodex.slack_spec.models.operations.AdminConversationsUnarchiveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminConversationsUnarchiveRequest req = new AdminConversationsUnarchiveRequest(                new AdminConversationsUnarchiveApplicationJSON("doloribus");, "sapiente");            

            AdminConversationsUnarchiveResponse res = sdk.admin.adminConversationsUnarchive(req, new AdminConversationsUnarchiveSecurity("architecto") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.adminConversationsUnarchiveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## adminEmojiAdd

Add an emoji.

API method documentation
<https://api.slack.com/methods/admin.emoji.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddRequestBody;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddResponse;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminEmojiAddRequestBody req = new AdminEmojiAddRequestBody("mollitia", "dolorem", "culpa");            

            AdminEmojiAddResponse res = sdk.admin.adminEmojiAdd(req, new AdminEmojiAddSecurity("consequuntur") {{
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

## adminEmojiAddAlias

Add an emoji alias.

API method documentation
<https://api.slack.com/methods/admin.emoji.addAlias>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddAliasRequestBody;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddAliasResponse;
import shadowcodex.slack_spec.models.operations.AdminEmojiAddAliasSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminEmojiAddAliasRequestBody req = new AdminEmojiAddAliasRequestBody("repellat", "mollitia", "occaecati");            

            AdminEmojiAddAliasResponse res = sdk.admin.adminEmojiAddAlias(req, new AdminEmojiAddAliasSecurity("numquam") {{
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

## adminEmojiList

List emoji for an Enterprise Grid organization.

API method documentation
<https://api.slack.com/methods/admin.emoji.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminEmojiListRequest;
import shadowcodex.slack_spec.models.operations.AdminEmojiListResponse;
import shadowcodex.slack_spec.models.operations.AdminEmojiListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminEmojiListRequest req = new AdminEmojiListRequest("commodi") {{
                cursor = "quam";
                limit = 474697L;
            }};            

            AdminEmojiListResponse res = sdk.admin.adminEmojiList(req, new AdminEmojiListSecurity("velit") {{
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

## adminEmojiRemove

Remove an emoji across an Enterprise Grid organization

API method documentation
<https://api.slack.com/methods/admin.emoji.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminEmojiRemoveRequestBody;
import shadowcodex.slack_spec.models.operations.AdminEmojiRemoveResponse;
import shadowcodex.slack_spec.models.operations.AdminEmojiRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminEmojiRemoveRequestBody req = new AdminEmojiRemoveRequestBody("error", "quia");            

            AdminEmojiRemoveResponse res = sdk.admin.adminEmojiRemove(req, new AdminEmojiRemoveSecurity("quis") {{
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

## adminEmojiRename

Rename an emoji.

API method documentation
<https://api.slack.com/methods/admin.emoji.rename>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminEmojiRenameRequestBody;
import shadowcodex.slack_spec.models.operations.AdminEmojiRenameResponse;
import shadowcodex.slack_spec.models.operations.AdminEmojiRenameSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminEmojiRenameRequestBody req = new AdminEmojiRenameRequestBody("vitae", "laborum", "animi");            

            AdminEmojiRenameResponse res = sdk.admin.adminEmojiRename(req, new AdminEmojiRenameSecurity("enim") {{
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

            AdminInviteRequestsApproveRequest req = new AdminInviteRequestsApproveRequest(                new AdminInviteRequestsApproveApplicationJSON("odit") {{
                                teamId = "quo";
                            }};, "sequi");            

            AdminInviteRequestsApproveResponse res = sdk.admin.adminInviteRequestsApprove(req, new AdminInviteRequestsApproveSecurity("tenetur") {{
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

## adminInviteRequestsApprovedList

List all approved workspace invite requests.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.approved.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsApprovedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsApprovedListRequest req = new AdminInviteRequestsApprovedListRequest("ipsam") {{
                cursor = "id";
                limit = 820994L;
                teamId = "aut";
            }};            

            AdminInviteRequestsApprovedListResponse res = sdk.admin.adminInviteRequestsApprovedList(req, new AdminInviteRequestsApprovedListSecurity("quasi") {{
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

## adminInviteRequestsDeniedList

List all denied workspace invite requests.

API method documentation
<https://api.slack.com/methods/admin.inviteRequests.denied.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListRequest;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListResponse;
import shadowcodex.slack_spec.models.operations.AdminInviteRequestsDeniedListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminInviteRequestsDeniedListRequest req = new AdminInviteRequestsDeniedListRequest("error") {{
                cursor = "temporibus";
                limit = 673660L;
                teamId = "quasi";
            }};            

            AdminInviteRequestsDeniedListResponse res = sdk.admin.adminInviteRequestsDeniedList(req, new AdminInviteRequestsDeniedListSecurity("reiciendis") {{
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

            AdminInviteRequestsDenyRequest req = new AdminInviteRequestsDenyRequest(                new AdminInviteRequestsDenyApplicationJSON("voluptatibus") {{
                                teamId = "vero";
                            }};, "nihil");            

            AdminInviteRequestsDenyResponse res = sdk.admin.adminInviteRequestsDeny(req, new AdminInviteRequestsDenySecurity("praesentium") {{
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

            AdminInviteRequestsListRequest req = new AdminInviteRequestsListRequest("voluptatibus") {{
                cursor = "ipsa";
                limit = 604846L;
                teamId = "voluptate";
            }};            

            AdminInviteRequestsListResponse res = sdk.admin.adminInviteRequestsList(req, new AdminInviteRequestsListSecurity("cum") {{
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

## adminTeamsAdminsList

List all of the admins on a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.admins.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsAdminsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsAdminsListRequest req = new AdminTeamsAdminsListRequest("perferendis", "doloremque") {{
                cursor = "reprehenderit";
                limit = 282807L;
            }};            

            AdminTeamsAdminsListResponse res = sdk.admin.adminTeamsAdminsList(req, new AdminTeamsAdminsListSecurity("maiores") {{
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

## adminTeamsCreate

Create an Enterprise team.

API method documentation
<https://api.slack.com/methods/admin.teams.create>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsCreateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsCreateRequest req = new AdminTeamsCreateRequest(                new AdminTeamsCreateApplicationJSON("dicta", "corporis") {{
                                teamDescription = "dolore";
                                teamDiscoverability = "iusto";
                            }};, "dicta");            

            AdminTeamsCreateResponse res = sdk.admin.adminTeamsCreate(req, new AdminTeamsCreateSecurity("harum") {{
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

## adminTeamsList

List all teams on an Enterprise organization

API method documentation
<https://api.slack.com/methods/admin.teams.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsListRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsListResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsListRequest req = new AdminTeamsListRequest("enim") {{
                cursor = "accusamus";
                limit = 414263L;
            }};            

            AdminTeamsListResponse res = sdk.admin.adminTeamsList(req, new AdminTeamsListSecurity("repudiandae") {{
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

## adminTeamsOwnersList

List all of the owners on a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.owners.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsOwnersListRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsOwnersListResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsOwnersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsOwnersListRequest req = new AdminTeamsOwnersListRequest("quae", "ipsum") {{
                cursor = "quidem";
                limit = 565189L;
            }};            

            AdminTeamsOwnersListResponse res = sdk.admin.adminTeamsOwnersList(req, new AdminTeamsOwnersListSecurity("excepturi") {{
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

## adminTeamsSettingsInfo

Fetch information about settings in a workspace

API method documentation
<https://api.slack.com/methods/admin.teams.settings.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsInfoRequest req = new AdminTeamsSettingsInfoRequest("pariatur", "modi");            

            AdminTeamsSettingsInfoResponse res = sdk.admin.adminTeamsSettingsInfo(req, new AdminTeamsSettingsInfoSecurity("praesentium") {{
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

## adminTeamsSettingsSetDefaultChannels

Set the default channels of a workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDefaultChannels>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsRequestBody;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDefaultChannelsRequestBody req = new AdminTeamsSettingsSetDefaultChannelsRequestBody("rem", "voluptates", "quasi");            

            AdminTeamsSettingsSetDefaultChannelsResponse res = sdk.admin.adminTeamsSettingsSetDefaultChannels(req, new AdminTeamsSettingsSetDefaultChannelsSecurity("repudiandae") {{
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

## adminTeamsSettingsSetDescription

Set the description of a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDescription>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDescriptionRequest req = new AdminTeamsSettingsSetDescriptionRequest(                new AdminTeamsSettingsSetDescriptionApplicationJSON("sint", "veritatis");, "itaque");            

            AdminTeamsSettingsSetDescriptionResponse res = sdk.admin.adminTeamsSettingsSetDescription(req, new AdminTeamsSettingsSetDescriptionSecurity("incidunt") {{
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

## adminTeamsSettingsSetDiscoverability

An API method that allows admins to set the discoverability of a given workspace

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDiscoverability>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDiscoverabilityRequest req = new AdminTeamsSettingsSetDiscoverabilityRequest(                new AdminTeamsSettingsSetDiscoverabilityApplicationJSON("enim", "consequatur");, "est");            

            AdminTeamsSettingsSetDiscoverabilityResponse res = sdk.admin.adminTeamsSettingsSetDiscoverability(req, new AdminTeamsSettingsSetDiscoverabilitySecurity("quibusdam") {{
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

## adminTeamsSettingsSetIcon

Sets the icon of a workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setIcon>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconRequestBody;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetIconRequestBody req = new AdminTeamsSettingsSetIconRequestBody("explicabo", "deserunt", "distinctio");            

            AdminTeamsSettingsSetIconResponse res = sdk.admin.adminTeamsSettingsSetIcon(req, new AdminTeamsSettingsSetIconSecurity("quibusdam") {{
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

## adminTeamsSettingsSetName

Set the name of a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setName>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetNameRequest req = new AdminTeamsSettingsSetNameRequest(                new AdminTeamsSettingsSetNameApplicationJSON("labore", "modi");, "qui");            

            AdminTeamsSettingsSetNameResponse res = sdk.admin.adminTeamsSettingsSetName(req, new AdminTeamsSettingsSetNameSecurity("aliquid") {{
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

            AdminUsergroupsAddChannelsRequest req = new AdminUsergroupsAddChannelsRequest(                new AdminUsergroupsAddChannelsApplicationJSON("cupiditate", "quos") {{
                                teamId = "perferendis";
                            }};, "magni");            

            AdminUsergroupsAddChannelsResponse res = sdk.admin.adminUsergroupsAddChannels(req, new AdminUsergroupsAddChannelsSecurity("assumenda") {{
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

            AdminUsergroupsAddTeamsRequest req = new AdminUsergroupsAddTeamsRequest(                new AdminUsergroupsAddTeamsApplicationJSON("ipsam", "alias") {{
                                autoProvision = false;
                            }};, "fugit");            

            AdminUsergroupsAddTeamsResponse res = sdk.admin.adminUsergroupsAddTeams(req, new AdminUsergroupsAddTeamsSecurity("dolorum") {{
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

            AdminUsergroupsListChannelsRequest req = new AdminUsergroupsListChannelsRequest("excepturi", "tempora") {{
                includeNumMembers = false;
                teamId = "facilis";
            }};            

            AdminUsergroupsListChannelsResponse res = sdk.admin.adminUsergroupsListChannels(req, new AdminUsergroupsListChannelsSecurity("tempore") {{
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

            AdminUsergroupsRemoveChannelsRequest req = new AdminUsergroupsRemoveChannelsRequest(                new AdminUsergroupsRemoveChannelsApplicationJSON("labore", "delectus");, "eum");            

            AdminUsergroupsRemoveChannelsResponse res = sdk.admin.adminUsergroupsRemoveChannels(req, new AdminUsergroupsRemoveChannelsSecurity("non") {{
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

## adminUsersAssign

Add an Enterprise user to a workspace.

API method documentation
<https://api.slack.com/methods/admin.users.assign>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersAssignApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersAssignRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersAssignResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersAssignSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersAssignRequest req = new AdminUsersAssignRequest(                new AdminUsersAssignApplicationJSON("eligendi", "sint") {{
                                channelIds = "aliquid";
                                isRestricted = false;
                                isUltraRestricted = false;
                            }};, "provident");            

            AdminUsersAssignResponse res = sdk.admin.adminUsersAssign(req, new AdminUsersAssignSecurity("necessitatibus") {{
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

## adminUsersInvite

Invite a user to a workspace.

API method documentation
<https://api.slack.com/methods/admin.users.invite>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersInviteApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersInviteRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersInviteResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersInviteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersInviteRequest req = new AdminUsersInviteRequest(                new AdminUsersInviteApplicationJSON("sint", "officia", "dolor") {{
                                customMessage = "debitis";
                                guestExpirationTs = "a";
                                isRestricted = false;
                                isUltraRestricted = false;
                                realName = "dolorum";
                                resend = false;
                            }};, "in");            

            AdminUsersInviteResponse res = sdk.admin.adminUsersInvite(req, new AdminUsersInviteSecurity("in") {{
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

## adminUsersList

List users on a workspace

API method documentation
<https://api.slack.com/methods/admin.users.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersListRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersListResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersListRequest req = new AdminUsersListRequest("illum", "maiores") {{
                cursor = "rerum";
                limit = 116202L;
            }};            

            AdminUsersListResponse res = sdk.admin.adminUsersList(req, new AdminUsersListSecurity("magnam") {{
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

## adminUsersRemove

Remove a user from a workspace.

API method documentation
<https://api.slack.com/methods/admin.users.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersRemoveApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersRemoveRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersRemoveResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersRemoveRequest req = new AdminUsersRemoveRequest(                new AdminUsersRemoveApplicationJSON("cumque", "facere");, "ea");            

            AdminUsersRemoveResponse res = sdk.admin.adminUsersRemove(req, new AdminUsersRemoveSecurity("aliquid") {{
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

## adminUsersSessionInvalidate

Invalidate a single session for a user by session_id

API method documentation
<https://api.slack.com/methods/admin.users.session.invalidate>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionInvalidateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSessionInvalidateRequest req = new AdminUsersSessionInvalidateRequest(                new AdminUsersSessionInvalidateApplicationJSON(675439, "accusamus");, "non");            

            AdminUsersSessionInvalidateResponse res = sdk.admin.adminUsersSessionInvalidate(req, new AdminUsersSessionInvalidateSecurity("occaecati") {{
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

## adminUsersSessionReset

Wipes all valid sessions on all devices for a given user

API method documentation
<https://api.slack.com/methods/admin.users.session.reset>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSessionResetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSessionResetRequest req = new AdminUsersSessionResetRequest(                new AdminUsersSessionResetApplicationJSON("enim") {{
                                mobileOnly = false;
                                webOnly = false;
                            }};, "accusamus");            

            AdminUsersSessionResetResponse res = sdk.admin.adminUsersSessionReset(req, new AdminUsersSessionResetSecurity("delectus") {{
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

## adminUsersSetAdmin

Set an existing guest, regular user, or owner to be an admin user.

API method documentation
<https://api.slack.com/methods/admin.users.setAdmin>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSetAdminApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSetAdminRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSetAdminResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSetAdminSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSetAdminRequest req = new AdminUsersSetAdminRequest(                new AdminUsersSetAdminApplicationJSON("quidem", "provident");, "nam");            

            AdminUsersSetAdminResponse res = sdk.admin.adminUsersSetAdmin(req, new AdminUsersSetAdminSecurity("id") {{
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

## adminUsersSetExpiration

Set an expiration for a guest user

API method documentation
<https://api.slack.com/methods/admin.users.setExpiration>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSetExpirationApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSetExpirationRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSetExpirationResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSetExpirationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSetExpirationRequest req = new AdminUsersSetExpirationRequest(                new AdminUsersSetExpirationApplicationJSON(501324, "deleniti", "sapiente");, "amet");            

            AdminUsersSetExpirationResponse res = sdk.admin.adminUsersSetExpiration(req, new AdminUsersSetExpirationSecurity("deserunt") {{
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

## adminUsersSetOwner

Set an existing guest, regular user, or admin user to be a workspace owner.

API method documentation
<https://api.slack.com/methods/admin.users.setOwner>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSetOwnerApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSetOwnerRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSetOwnerResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSetOwnerSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSetOwnerRequest req = new AdminUsersSetOwnerRequest(                new AdminUsersSetOwnerApplicationJSON("nisi", "vel");, "natus");            

            AdminUsersSetOwnerResponse res = sdk.admin.adminUsersSetOwner(req, new AdminUsersSetOwnerSecurity("omnis") {{
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

## adminUsersSetRegular

Set an existing guest user, admin user, or owner to be a regular user.

API method documentation
<https://api.slack.com/methods/admin.users.setRegular>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminUsersSetRegularApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminUsersSetRegularRequest;
import shadowcodex.slack_spec.models.operations.AdminUsersSetRegularResponse;
import shadowcodex.slack_spec.models.operations.AdminUsersSetRegularSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminUsersSetRegularRequest req = new AdminUsersSetRegularRequest(                new AdminUsersSetRegularApplicationJSON("molestiae", "perferendis");, "nihil");            

            AdminUsersSetRegularResponse res = sdk.admin.adminUsersSetRegular(req, new AdminUsersSetRegularSecurity("magnam") {{
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
