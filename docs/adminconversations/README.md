# adminConversations

### Available Operations

* [adminConversationsArchive](#adminconversationsarchive) - Archive a public or private channel.
* [adminConversationsConvertToPrivate](#adminconversationsconverttoprivate) - Convert a public channel to a private channel.
* [adminConversationsCreate](#adminconversationscreate) - Create a public or private channel-based conversation.
* [adminConversationsDelete](#adminconversationsdelete) - Delete a public or private channel.
* [adminConversationsDisconnectShared](#adminconversationsdisconnectshared) - Disconnect a connected channel from one or more workspaces.
* [adminConversationsGetConversationPrefs](#adminconversationsgetconversationprefs) - Get conversation preferences for a public or private channel.
* [adminConversationsGetTeams](#adminconversationsgetteams) - Get all the workspaces a given public or private channel is connected to within this Enterprise org.
* [adminConversationsInvite](#adminconversationsinvite) - Invite a user to a public or private channel.
* [adminConversationsRename](#adminconversationsrename) - Rename a public or private channel.
* [adminConversationsSearch](#adminconversationssearch) - Search for public or private channels in an Enterprise organization.
* [adminConversationsSetConversationPrefs](#adminconversationssetconversationprefs) - Set the posting permissions for a public or private channel.
* [adminConversationsSetTeams](#adminconversationssetteams) - Set the workspaces in an Enterprise grid org that connect to a public or private channel.
* [adminConversationsUnarchive](#adminconversationsunarchive) - Unarchive a public or private channel.

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

            AdminConversationsArchiveRequest req = new AdminConversationsArchiveRequest(                new AdminConversationsArchiveApplicationJSON("nemo");, "quasi");            

            AdminConversationsArchiveResponse res = sdk.adminConversations.adminConversationsArchive(req, new AdminConversationsArchiveSecurity("iure") {{
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

            AdminConversationsConvertToPrivateRequest req = new AdminConversationsConvertToPrivateRequest(                new AdminConversationsConvertToPrivateApplicationJSON("doloribus");, "debitis");            

            AdminConversationsConvertToPrivateResponse res = sdk.adminConversations.adminConversationsConvertToPrivate(req, new AdminConversationsConvertToPrivateSecurity("eius") {{
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

            AdminConversationsCreateRequest req = new AdminConversationsCreateRequest(                new AdminConversationsCreateApplicationJSON(false, "maxime") {{
                                description = "deleniti";
                                orgWide = false;
                                teamId = "facilis";
                            }};, "in");            

            AdminConversationsCreateResponse res = sdk.adminConversations.adminConversationsCreate(req, new AdminConversationsCreateSecurity("architecto") {{
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

            AdminConversationsDeleteRequest req = new AdminConversationsDeleteRequest(                new AdminConversationsDeleteApplicationJSON("architecto");, "repudiandae");            

            AdminConversationsDeleteResponse res = sdk.adminConversations.adminConversationsDelete(req, new AdminConversationsDeleteSecurity("ullam") {{
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

            AdminConversationsDisconnectSharedRequest req = new AdminConversationsDisconnectSharedRequest(                new AdminConversationsDisconnectSharedApplicationJSON("expedita") {{
                                leavingTeamIds = "nihil";
                            }};, "repellat");            

            AdminConversationsDisconnectSharedResponse res = sdk.adminConversations.adminConversationsDisconnectShared(req, new AdminConversationsDisconnectSharedSecurity("quibusdam") {{
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

            AdminConversationsGetConversationPrefsRequest req = new AdminConversationsGetConversationPrefsRequest("sed", "saepe");            

            AdminConversationsGetConversationPrefsResponse res = sdk.adminConversations.adminConversationsGetConversationPrefs(req, new AdminConversationsGetConversationPrefsSecurity("pariatur") {{
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

            AdminConversationsGetTeamsRequest req = new AdminConversationsGetTeamsRequest("accusantium", "consequuntur") {{
                cursor = "praesentium";
                limit = 615560L;
            }};            

            AdminConversationsGetTeamsResponse res = sdk.adminConversations.adminConversationsGetTeams(req, new AdminConversationsGetTeamsSecurity("magni") {{
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

            AdminConversationsInviteRequest req = new AdminConversationsInviteRequest(                new AdminConversationsInviteApplicationJSON("sunt", "quo");, "illum");            

            AdminConversationsInviteResponse res = sdk.adminConversations.adminConversationsInvite(req, new AdminConversationsInviteSecurity("pariatur") {{
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

            AdminConversationsRenameRequest req = new AdminConversationsRenameRequest(                new AdminConversationsRenameApplicationJSON("maxime", "ea");, "excepturi");            

            AdminConversationsRenameResponse res = sdk.adminConversations.adminConversationsRename(req, new AdminConversationsRenameSecurity("odit") {{
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

            AdminConversationsSearchRequest req = new AdminConversationsSearchRequest("ea") {{
                cursor = "accusantium";
                limit = 69167L;
                query = "maiores";
                searchChannelTypes = "quidem";
                sort = "ipsam";
                sortDir = "voluptate";
                teamIds = "autem";
            }};            

            AdminConversationsSearchResponse res = sdk.adminConversations.adminConversationsSearch(req, new AdminConversationsSearchSecurity("nam") {{
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

            AdminConversationsSetConversationPrefsRequest req = new AdminConversationsSetConversationPrefsRequest(                new AdminConversationsSetConversationPrefsApplicationJSON("eaque", "pariatur");, "nemo");            

            AdminConversationsSetConversationPrefsResponse res = sdk.adminConversations.adminConversationsSetConversationPrefs(req, new AdminConversationsSetConversationPrefsSecurity("voluptatibus") {{
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

            AdminConversationsSetTeamsRequest req = new AdminConversationsSetTeamsRequest(                new AdminConversationsSetTeamsApplicationJSON("perferendis") {{
                                orgChannel = false;
                                targetTeamIds = "fugiat";
                                teamId = "amet";
                            }};, "aut");            

            AdminConversationsSetTeamsResponse res = sdk.adminConversations.adminConversationsSetTeams(req, new AdminConversationsSetTeamsSecurity("cumque") {{
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

            AdminConversationsUnarchiveRequest req = new AdminConversationsUnarchiveRequest(                new AdminConversationsUnarchiveApplicationJSON("corporis");, "hic");            

            AdminConversationsUnarchiveResponse res = sdk.adminConversations.adminConversationsUnarchive(req, new AdminConversationsUnarchiveSecurity("libero") {{
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
