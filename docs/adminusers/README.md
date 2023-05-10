# adminUsers

### Available Operations

* [adminUsersAssign](#adminusersassign) - Add an Enterprise user to a workspace.
* [adminUsersInvite](#adminusersinvite) - Invite a user to a workspace.
* [adminUsersList](#adminuserslist) - List users on a workspace
* [adminUsersRemove](#adminusersremove) - Remove a user from a workspace.
* [adminUsersSetAdmin](#adminuserssetadmin) - Set an existing guest, regular user, or owner to be an admin user.
* [adminUsersSetExpiration](#adminuserssetexpiration) - Set an expiration for a guest user
* [adminUsersSetOwner](#adminuserssetowner) - Set an existing guest, regular user, or admin user to be a workspace owner.
* [adminUsersSetRegular](#adminuserssetregular) - Set an existing guest user, admin user, or owner to be a regular user.

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

            AdminUsersAssignRequest req = new AdminUsersAssignRequest(                new AdminUsersAssignApplicationJSON("accusamus", "numquam") {{
                                channelIds = "enim";
                                isRestricted = false;
                                isUltraRestricted = false;
                            }};, "dolorem");            

            AdminUsersAssignResponse res = sdk.adminUsers.adminUsersAssign(req, new AdminUsersAssignSecurity("sapiente") {{
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

            AdminUsersInviteRequest req = new AdminUsersInviteRequest(                new AdminUsersInviteApplicationJSON("totam", "nihil", "sit") {{
                                customMessage = "expedita";
                                guestExpirationTs = "neque";
                                isRestricted = false;
                                isUltraRestricted = false;
                                realName = "sed";
                                resend = false;
                            }};, "vel");            

            AdminUsersInviteResponse res = sdk.adminUsers.adminUsersInvite(req, new AdminUsersInviteSecurity("libero") {{
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

            AdminUsersListRequest req = new AdminUsersListRequest("voluptas", "deserunt") {{
                cursor = "quam";
                limit = 214880L;
            }};            

            AdminUsersListResponse res = sdk.adminUsers.adminUsersList(req, new AdminUsersListSecurity("incidunt") {{
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

            AdminUsersRemoveRequest req = new AdminUsersRemoveRequest(                new AdminUsersRemoveApplicationJSON("qui", "cupiditate");, "maxime");            

            AdminUsersRemoveResponse res = sdk.adminUsers.adminUsersRemove(req, new AdminUsersRemoveSecurity("pariatur") {{
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

            AdminUsersSetAdminRequest req = new AdminUsersSetAdminRequest(                new AdminUsersSetAdminApplicationJSON("soluta", "dicta");, "laborum");            

            AdminUsersSetAdminResponse res = sdk.adminUsers.adminUsersSetAdmin(req, new AdminUsersSetAdminSecurity("totam") {{
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

            AdminUsersSetExpirationRequest req = new AdminUsersSetExpirationRequest(                new AdminUsersSetExpirationApplicationJSON(276894, "aspernatur", "dolores");, "distinctio");            

            AdminUsersSetExpirationResponse res = sdk.adminUsers.adminUsersSetExpiration(req, new AdminUsersSetExpirationSecurity("facilis") {{
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

            AdminUsersSetOwnerRequest req = new AdminUsersSetOwnerRequest(                new AdminUsersSetOwnerApplicationJSON("aliquid", "quam");, "molestias");            

            AdminUsersSetOwnerResponse res = sdk.adminUsers.adminUsersSetOwner(req, new AdminUsersSetOwnerSecurity("temporibus") {{
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

            AdminUsersSetRegularRequest req = new AdminUsersSetRegularRequest(                new AdminUsersSetRegularApplicationJSON("qui", "neque");, "fugit");            

            AdminUsersSetRegularResponse res = sdk.adminUsers.adminUsersSetRegular(req, new AdminUsersSetRegularSecurity("magni") {{
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
