# users

### Available Operations

* [usersConversations](#usersconversations) - List conversations the calling user may access.
* [usersDeletePhoto](#usersdeletephoto) - Delete the user profile photo
* [usersGetPresence](#usersgetpresence) - Gets user presence information.
* [usersIdentity](#usersidentity) - Get a user's identity.
* [usersInfo](#usersinfo) - Gets information about a user.
* [usersList](#userslist) - Lists all users in a Slack team.
* [usersLookupByEmail](#userslookupbyemail) - Find a user with an email address.
* [usersProfileGet](#usersprofileget) - Retrieves a user's profile information.
* [usersProfileSet](#usersprofileset) - Set the profile information for a user.
* [usersSetActive](#userssetactive) - Marked a user as active. Deprecated and non-functional.
* [usersSetPhoto](#userssetphoto) - Set the user profile photo
* [usersSetPresence](#userssetpresence) - Manually sets user presence.

## usersConversations

List conversations the calling user may access.

API method documentation
<https://api.slack.com/methods/users.conversations>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersConversationsRequest;
import shadowcodex.slack_spec.models.operations.UsersConversationsResponse;
import shadowcodex.slack_spec.models.operations.UsersConversationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersConversationsRequest req = new UsersConversationsRequest() {{
                cursor = "ex";
                excludeArchived = false;
                limit = 980581L;
                token = "corrupti";
                types = "at";
                user = "error";
            }};            

            UsersConversationsResponse res = sdk.users.usersConversations(req, new UsersConversationsSecurity("blanditiis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersConversationsSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersDeletePhoto

Delete the user profile photo

API method documentation
<https://api.slack.com/methods/users.deletePhoto>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersDeletePhotoRequestBody;
import shadowcodex.slack_spec.models.operations.UsersDeletePhotoResponse;
import shadowcodex.slack_spec.models.operations.UsersDeletePhotoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersDeletePhotoRequestBody req = new UsersDeletePhotoRequestBody("suscipit");            

            UsersDeletePhotoResponse res = sdk.users.usersDeletePhoto(req, new UsersDeletePhotoSecurity("repudiandae") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersDeletePhotoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersGetPresence

Gets user presence information.

API method documentation
<https://api.slack.com/methods/users.getPresence>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersGetPresenceRequest;
import shadowcodex.slack_spec.models.operations.UsersGetPresenceResponse;
import shadowcodex.slack_spec.models.operations.UsersGetPresenceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersGetPresenceRequest req = new UsersGetPresenceRequest("atque") {{
                user = "atque";
            }};            

            UsersGetPresenceResponse res = sdk.users.usersGetPresence(req, new UsersGetPresenceSecurity("sunt") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.apiMethodUsersGetPresence != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersIdentity

Get a user's identity.

API method documentation
<https://api.slack.com/methods/users.identity>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersIdentityRequest;
import shadowcodex.slack_spec.models.operations.UsersIdentityResponse;
import shadowcodex.slack_spec.models.operations.UsersIdentitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersIdentityRequest req = new UsersIdentityRequest() {{
                token = "recusandae";
            }};            

            UsersIdentityResponse res = sdk.users.usersIdentity(req, new UsersIdentitySecurity("dolorum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersIdentitySchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersInfo

Gets information about a user.

API method documentation
<https://api.slack.com/methods/users.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersInfoRequest;
import shadowcodex.slack_spec.models.operations.UsersInfoResponse;
import shadowcodex.slack_spec.models.operations.UsersInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersInfoRequest req = new UsersInfoRequest("repellendus") {{
                includeLocale = false;
                user = "labore";
            }};            

            UsersInfoResponse res = sdk.users.usersInfo(req, new UsersInfoSecurity("reiciendis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersInfoSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersList

Lists all users in a Slack team.

API method documentation
<https://api.slack.com/methods/users.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersListRequest;
import shadowcodex.slack_spec.models.operations.UsersListResponse;
import shadowcodex.slack_spec.models.operations.UsersListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersListRequest req = new UsersListRequest() {{
                cursor = "doloremque";
                includeLocale = false;
                limit = 919783L;
                token = "dicta";
            }};            

            UsersListResponse res = sdk.users.usersList(req, new UsersListSecurity("accusantium") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersLookupByEmail

Find a user with an email address.

API method documentation
<https://api.slack.com/methods/users.lookupByEmail>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersLookupByEmailRequest;
import shadowcodex.slack_spec.models.operations.UsersLookupByEmailResponse;
import shadowcodex.slack_spec.models.operations.UsersLookupByEmailSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersLookupByEmailRequest req = new UsersLookupByEmailRequest("beatae", "dolores");            

            UsersLookupByEmailResponse res = sdk.users.usersLookupByEmail(req, new UsersLookupByEmailSecurity("enim") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersLookupByEmailSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersProfileGet

Retrieves a user's profile information.

API method documentation
<https://api.slack.com/methods/users.profile.get>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersProfileGetRequest;
import shadowcodex.slack_spec.models.operations.UsersProfileGetResponse;
import shadowcodex.slack_spec.models.operations.UsersProfileGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersProfileGetRequest req = new UsersProfileGetRequest("laboriosam") {{
                includeLabels = false;
                user = "velit";
            }};            

            UsersProfileGetResponse res = sdk.users.usersProfileGet(req, new UsersProfileGetSecurity("a") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersProfileGetSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersProfileSet

Set the profile information for a user.

API method documentation
<https://api.slack.com/methods/users.profile.set>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersProfileSetApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsersProfileSetRequest;
import shadowcodex.slack_spec.models.operations.UsersProfileSetResponse;
import shadowcodex.slack_spec.models.operations.UsersProfileSetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersProfileSetRequest req = new UsersProfileSetRequest("molestias") {{
                requestBody = new UsersProfileSetApplicationJSON() {{
                    name = "Tricia Cronin";
                    profile = "perspiciatis";
                    user = "in";
                    value = "adipisci";
                }};;
            }};            

            UsersProfileSetResponse res = sdk.users.usersProfileSet(req, new UsersProfileSetSecurity("eveniet") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersProfileSetSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersSetActive

Marked a user as active. Deprecated and non-functional.

API method documentation
<https://api.slack.com/methods/users.setActive>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersSetActiveRequest;
import shadowcodex.slack_spec.models.operations.UsersSetActiveResponse;
import shadowcodex.slack_spec.models.operations.UsersSetActiveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersSetActiveRequest req = new UsersSetActiveRequest("occaecati");            

            UsersSetActiveResponse res = sdk.users.usersSetActive(req, new UsersSetActiveSecurity("consequuntur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersSetActiveSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersSetPhoto

Set the user profile photo

API method documentation
<https://api.slack.com/methods/users.setPhoto>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersSetPhotoRequestBody;
import shadowcodex.slack_spec.models.operations.UsersSetPhotoResponse;
import shadowcodex.slack_spec.models.operations.UsersSetPhotoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersSetPhotoRequestBody req = new UsersSetPhotoRequestBody("fugit") {{
                cropW = "id";
                cropX = "quis";
                cropY = "reprehenderit";
                image = "error";
            }};            

            UsersSetPhotoResponse res = sdk.users.usersSetPhoto(req, new UsersSetPhotoSecurity("illo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersSetPhotoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## usersSetPresence

Manually sets user presence.

API method documentation
<https://api.slack.com/methods/users.setPresence>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.UsersSetPresenceApplicationJSON;
import shadowcodex.slack_spec.models.operations.UsersSetPresenceRequest;
import shadowcodex.slack_spec.models.operations.UsersSetPresenceResponse;
import shadowcodex.slack_spec.models.operations.UsersSetPresenceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            UsersSetPresenceRequest req = new UsersSetPresenceRequest(                new UsersSetPresenceApplicationJSON("corporis");, "quidem");            

            UsersSetPresenceResponse res = sdk.users.usersSetPresence(req, new UsersSetPresenceSecurity("eveniet") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.usersSetPresenceSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
