# adminEmoji

### Available Operations

* [adminEmojiAdd](#adminemojiadd) - Add an emoji.
* [adminEmojiAddAlias](#adminemojiaddalias) - Add an emoji alias.
* [adminEmojiList](#adminemojilist) - List emoji for an Enterprise Grid organization.
* [adminEmojiRemove](#adminemojiremove) - Remove an emoji across an Enterprise Grid organization
* [adminEmojiRename](#adminemojirename) - Rename an emoji.

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

            AdminEmojiAddRequestBody req = new AdminEmojiAddRequestBody("perspiciatis", "voluptatem", "porro");            

            AdminEmojiAddResponse res = sdk.adminEmoji.adminEmojiAdd(req, new AdminEmojiAddSecurity("consequuntur") {{
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

            AdminEmojiAddAliasRequestBody req = new AdminEmojiAddAliasRequestBody("blanditiis", "error", "eaque");            

            AdminEmojiAddAliasResponse res = sdk.adminEmoji.adminEmojiAddAlias(req, new AdminEmojiAddAliasSecurity("occaecati") {{
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

            AdminEmojiListRequest req = new AdminEmojiListRequest("rerum") {{
                cursor = "adipisci";
                limit = 992397L;
            }};            

            AdminEmojiListResponse res = sdk.adminEmoji.adminEmojiList(req, new AdminEmojiListSecurity("earum") {{
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

            AdminEmojiRemoveRequestBody req = new AdminEmojiRemoveRequestBody("modi", "iste");            

            AdminEmojiRemoveResponse res = sdk.adminEmoji.adminEmojiRemove(req, new AdminEmojiRemoveSecurity("dolorum") {{
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

            AdminEmojiRenameRequestBody req = new AdminEmojiRenameRequestBody("deleniti", "pariatur", "provident");            

            AdminEmojiRenameResponse res = sdk.adminEmoji.adminEmojiRename(req, new AdminEmojiRenameSecurity("nobis") {{
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
