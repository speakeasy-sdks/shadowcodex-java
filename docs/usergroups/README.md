# usergroups

### Available Operations

* [usergroupsCreate](#usergroupscreate) - Create a User Group
* [usergroupsDisable](#usergroupsdisable) - Disable an existing User Group
* [usergroupsEnable](#usergroupsenable) - Enable a User Group
* [usergroupsList](#usergroupslist) - List all User Groups for a team
* [usergroupsUpdate](#usergroupsupdate) - Update an existing User Group
* [usergroupsUsersList](#usergroupsuserslist) - List all users in a User Group
* [usergroupsUsersUpdate](#usergroupsusersupdate) - Update the list of users for a User Group

## usergroupsCreate

Create a User Group

API method documentation
<https://api.slack.com/methods/usergroups.create>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsCreateApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsCreateRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsCreateResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsCreateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsCreateRequest req = new UsergroupsCreateRequest(                new UsergroupsCreateApplicationJSON("unde") {{
                                channels = "reiciendis";
                                description = "provident";
                                handle = "repellendus";
                                includeCount = false;
                            }};, "delectus");            

            UsergroupsCreateResponse res = sdk.usergroups.usergroupsCreate(req, new UsergroupsCreateSecurity("voluptates") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsCreateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsDisable

Disable an existing User Group

API method documentation
<https://api.slack.com/methods/usergroups.disable>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsDisableApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsDisableRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsDisableResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsDisableSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsDisableRequest req = new UsergroupsDisableRequest(                new UsergroupsDisableApplicationJSON("perferendis") {{
                                includeCount = false;
                            }};, "est");            

            UsergroupsDisableResponse res = sdk.usergroups.usergroupsDisable(req, new UsergroupsDisableSecurity("quidem") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsDisableSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsEnable

Enable a User Group

API method documentation
<https://api.slack.com/methods/usergroups.enable>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsEnableApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsEnableRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsEnableResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsEnableSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsEnableRequest req = new UsergroupsEnableRequest(                new UsergroupsEnableApplicationJSON("reprehenderit") {{
                                includeCount = false;
                            }};, "facere");            

            UsergroupsEnableResponse res = sdk.usergroups.usergroupsEnable(req, new UsergroupsEnableSecurity("fuga") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsEnableSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsList

List all User Groups for a team

API method documentation
<https://api.slack.com/methods/usergroups.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsListRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsListResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsListRequest req = new UsergroupsListRequest("praesentium") {{
                includeCount = false;
                includeDisabled = false;
                includeUsers = false;
            }};            

            UsergroupsListResponse res = sdk.usergroups.usergroupsList(req, new UsergroupsListSecurity("mollitia") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsUpdate

Update an existing User Group

API method documentation
<https://api.slack.com/methods/usergroups.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsUpdateApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsUpdateRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsUpdateResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsUpdateRequest req = new UsergroupsUpdateRequest(                new UsergroupsUpdateApplicationJSON("veniam") {{
                                channels = "voluptatem";
                                description = "quisquam";
                                handle = "repudiandae";
                                includeCount = false;
                                name = "Kay Kihn";
                            }};, "suscipit");            

            UsergroupsUpdateResponse res = sdk.usergroups.usergroupsUpdate(req, new UsergroupsUpdateSecurity("quidem") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsUpdateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsUsersList

List all users in a User Group

API method documentation
<https://api.slack.com/methods/usergroups.users.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsUsersListRequest req = new UsergroupsUsersListRequest("maxime", "et") {{
                includeDisabled = false;
            }};            

            UsergroupsUsersListResponse res = sdk.usergroups.usergroupsUsersList(req, new UsergroupsUsersListSecurity("esse") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsUsersListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usergroupsUsersUpdate

Update the list of users for a User Group

API method documentation
<https://api.slack.com/methods/usergroups.users.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateRequest;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateResponse;
import shadowcodex.slack_spec.models.operations.UsergroupsUsersUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsergroupsUsersUpdateRequest req = new UsergroupsUsersUpdateRequest(                new UsergroupsUsersUpdateApplicationJSON("amet", "assumenda") {{
                                includeCount = false;
                            }};, "ea");            

            UsergroupsUsersUpdateResponse res = sdk.usergroups.usergroupsUsersUpdate(req, new UsergroupsUsersUpdateSecurity("atque") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usergroupsUsersUpdateSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
