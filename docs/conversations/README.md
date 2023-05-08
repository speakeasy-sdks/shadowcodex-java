# conversations

### Available Operations

* [conversationsArchive](#conversationsarchive) - Archives a conversation.
* [conversationsClose](#conversationsclose) - Closes a direct message or multi-person direct message.
* [conversationsCreate](#conversationscreate) - Initiates a public or private channel-based conversation
* [conversationsHistory](#conversationshistory) - Fetches a conversation's history of messages and events.
* [conversationsInfo](#conversationsinfo) - Retrieve information about a conversation.
* [conversationsInvite](#conversationsinvite) - Invites users to a channel.
* [conversationsJoin](#conversationsjoin) - Joins an existing conversation.
* [conversationsKick](#conversationskick) - Removes a user from a conversation.
* [conversationsLeave](#conversationsleave) - Leaves a conversation.
* [conversationsList](#conversationslist) - Lists all channels in a Slack team.
* [conversationsMark](#conversationsmark) - Sets the read cursor in a channel.
* [conversationsMembers](#conversationsmembers) - Retrieve members of a conversation.
* [conversationsOpen](#conversationsopen) - Opens or resumes a direct message or multi-person direct message.
* [conversationsRename](#conversationsrename) - Renames a conversation.
* [conversationsReplies](#conversationsreplies) - Retrieve a thread of messages posted to a conversation
* [conversationsSetPurpose](#conversationssetpurpose) - Sets the purpose for a conversation.
* [conversationsSetTopic](#conversationssettopic) - Sets the topic for a conversation.
* [conversationsUnarchive](#conversationsunarchive) - Reverses conversation archival.

## conversationsArchive

Archives a conversation.

API method documentation
<https://api.slack.com/methods/conversations.archive>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsArchiveApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsArchiveRequest;
import shadowcodex.slack_spec.models.operations.ConversationsArchiveResponse;
import shadowcodex.slack_spec.models.operations.ConversationsArchiveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsArchiveRequest req = new ConversationsArchiveRequest() {{
                requestBody = new ConversationsArchiveApplicationJSON() {{
                    channel = "tempora";
                }};;
                token = "debitis";
            }};            

            ConversationsArchiveResponse res = sdk.conversations.conversationsArchive(req, new ConversationsArchiveSecurity("ipsam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsArchiveSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsClose

Closes a direct message or multi-person direct message.

API method documentation
<https://api.slack.com/methods/conversations.close>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsCloseApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsCloseRequest;
import shadowcodex.slack_spec.models.operations.ConversationsCloseResponse;
import shadowcodex.slack_spec.models.operations.ConversationsCloseSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsCloseRequest req = new ConversationsCloseRequest() {{
                requestBody = new ConversationsCloseApplicationJSON() {{
                    channel = "aspernatur";
                }};;
                token = "sequi";
            }};            

            ConversationsCloseResponse res = sdk.conversations.conversationsClose(req, new ConversationsCloseSecurity("quo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsCloseSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsCreate

Initiates a public or private channel-based conversation

API method documentation
<https://api.slack.com/methods/conversations.create>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsCreateApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsCreateRequest;
import shadowcodex.slack_spec.models.operations.ConversationsCreateResponse;
import shadowcodex.slack_spec.models.operations.ConversationsCreateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsCreateRequest req = new ConversationsCreateRequest() {{
                requestBody = new ConversationsCreateApplicationJSON() {{
                    isPrivate = false;
                    name = "Sophie Bayer";
                }};;
                token = "dignissimos";
            }};            

            ConversationsCreateResponse res = sdk.conversations.conversationsCreate(req, new ConversationsCreateSecurity("inventore") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsCreateSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsHistory

Fetches a conversation's history of messages and events.

API method documentation
<https://api.slack.com/methods/conversations.history>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsHistoryRequest;
import shadowcodex.slack_spec.models.operations.ConversationsHistoryResponse;
import shadowcodex.slack_spec.models.operations.ConversationsHistorySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsHistoryRequest req = new ConversationsHistoryRequest() {{
                channel = "nihil";
                cursor = "totam";
                inclusive = false;
                latest = 8827.1;
                limit = 306810L;
                oldest = 4884.1;
                token = "occaecati";
            }};            

            ConversationsHistoryResponse res = sdk.conversations.conversationsHistory(req, new ConversationsHistorySecurity("commodi") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsHistorySuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsInfo

Retrieve information about a conversation.

API method documentation
<https://api.slack.com/methods/conversations.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsInfoRequest;
import shadowcodex.slack_spec.models.operations.ConversationsInfoResponse;
import shadowcodex.slack_spec.models.operations.ConversationsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsInfoRequest req = new ConversationsInfoRequest() {{
                channel = "sapiente";
                includeLocale = false;
                includeNumMembers = false;
                token = "dolores";
            }};            

            ConversationsInfoResponse res = sdk.conversations.conversationsInfo(req, new ConversationsInfoSecurity("deserunt") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsInfoSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsInvite

Invites users to a channel.

API method documentation
<https://api.slack.com/methods/conversations.invite>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsInviteApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsInviteRequest;
import shadowcodex.slack_spec.models.operations.ConversationsInviteResponse;
import shadowcodex.slack_spec.models.operations.ConversationsInviteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsInviteRequest req = new ConversationsInviteRequest() {{
                requestBody = new ConversationsInviteApplicationJSON() {{
                    channel = "molestiae";
                    users = "accusantium";
                }};;
                token = "porro";
            }};            

            ConversationsInviteResponse res = sdk.conversations.conversationsInvite(req, new ConversationsInviteSecurity("eum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsInviteErrorSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsJoin

Joins an existing conversation.

API method documentation
<https://api.slack.com/methods/conversations.join>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsJoinApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsJoinRequest;
import shadowcodex.slack_spec.models.operations.ConversationsJoinResponse;
import shadowcodex.slack_spec.models.operations.ConversationsJoinSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsJoinRequest req = new ConversationsJoinRequest() {{
                requestBody = new ConversationsJoinApplicationJSON() {{
                    channel = "quas";
                }};;
                token = "praesentium";
            }};            

            ConversationsJoinResponse res = sdk.conversations.conversationsJoin(req, new ConversationsJoinSecurity("consequuntur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsJoinSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsKick

Removes a user from a conversation.

API method documentation
<https://api.slack.com/methods/conversations.kick>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsKickApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsKickRequest;
import shadowcodex.slack_spec.models.operations.ConversationsKickResponse;
import shadowcodex.slack_spec.models.operations.ConversationsKickSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsKickRequest req = new ConversationsKickRequest() {{
                requestBody = new ConversationsKickApplicationJSON() {{
                    channel = "deleniti";
                    user = "fugit";
                }};;
                token = "fuga";
            }};            

            ConversationsKickResponse res = sdk.conversations.conversationsKick(req, new ConversationsKickSecurity("mollitia") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsKickSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsLeave

Leaves a conversation.

API method documentation
<https://api.slack.com/methods/conversations.leave>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsLeaveApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsLeaveRequest;
import shadowcodex.slack_spec.models.operations.ConversationsLeaveResponse;
import shadowcodex.slack_spec.models.operations.ConversationsLeaveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsLeaveRequest req = new ConversationsLeaveRequest() {{
                requestBody = new ConversationsLeaveApplicationJSON() {{
                    channel = "incidunt";
                }};;
                token = "atque";
            }};            

            ConversationsLeaveResponse res = sdk.conversations.conversationsLeave(req, new ConversationsLeaveSecurity("explicabo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsLeaveSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsList

Lists all channels in a Slack team.

API method documentation
<https://api.slack.com/methods/conversations.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsListRequest;
import shadowcodex.slack_spec.models.operations.ConversationsListResponse;
import shadowcodex.slack_spec.models.operations.ConversationsListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsListRequest req = new ConversationsListRequest() {{
                cursor = "minima";
                excludeArchived = false;
                limit = 392676L;
                token = "fugit";
                types = "sapiente";
            }};            

            ConversationsListResponse res = sdk.conversations.conversationsList(req, new ConversationsListSecurity("consequuntur") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsListSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsMark

Sets the read cursor in a channel.

API method documentation
<https://api.slack.com/methods/conversations.mark>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsMarkApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsMarkRequest;
import shadowcodex.slack_spec.models.operations.ConversationsMarkResponse;
import shadowcodex.slack_spec.models.operations.ConversationsMarkSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsMarkRequest req = new ConversationsMarkRequest() {{
                requestBody = new ConversationsMarkApplicationJSON() {{
                    channel = "ratione";
                    ts = 1294.12;
                }};;
                token = "saepe";
            }};            

            ConversationsMarkResponse res = sdk.conversations.conversationsMark(req, new ConversationsMarkSecurity("occaecati") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsMarkSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsMembers

Retrieve members of a conversation.

API method documentation
<https://api.slack.com/methods/conversations.members>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsMembersRequest;
import shadowcodex.slack_spec.models.operations.ConversationsMembersResponse;
import shadowcodex.slack_spec.models.operations.ConversationsMembersSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsMembersRequest req = new ConversationsMembersRequest() {{
                channel = "atque";
                cursor = "et";
                limit = 456911L;
                token = "eveniet";
            }};            

            ConversationsMembersResponse res = sdk.conversations.conversationsMembers(req, new ConversationsMembersSecurity("accusamus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsMembersSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsOpen

Opens or resumes a direct message or multi-person direct message.

API method documentation
<https://api.slack.com/methods/conversations.open>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsOpenApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsOpenRequest;
import shadowcodex.slack_spec.models.operations.ConversationsOpenResponse;
import shadowcodex.slack_spec.models.operations.ConversationsOpenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsOpenRequest req = new ConversationsOpenRequest() {{
                requestBody = new ConversationsOpenApplicationJSON() {{
                    channel = "veritatis";
                    returnIm = false;
                    users = "esse";
                }};;
                token = "quod";
            }};            

            ConversationsOpenResponse res = sdk.conversations.conversationsOpen(req, new ConversationsOpenSecurity("nam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsOpenSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsRename

Renames a conversation.

API method documentation
<https://api.slack.com/methods/conversations.rename>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsRenameApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsRenameRequest;
import shadowcodex.slack_spec.models.operations.ConversationsRenameResponse;
import shadowcodex.slack_spec.models.operations.ConversationsRenameSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsRenameRequest req = new ConversationsRenameRequest() {{
                requestBody = new ConversationsRenameApplicationJSON() {{
                    channel = "vero";
                    name = "Frances Turner";
                }};;
                token = "molestiae";
            }};            

            ConversationsRenameResponse res = sdk.conversations.conversationsRename(req, new ConversationsRenameSecurity("rerum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsRenameSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsReplies

Retrieve a thread of messages posted to a conversation

API method documentation
<https://api.slack.com/methods/conversations.replies>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsRepliesRequest;
import shadowcodex.slack_spec.models.operations.ConversationsRepliesResponse;
import shadowcodex.slack_spec.models.operations.ConversationsRepliesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsRepliesRequest req = new ConversationsRepliesRequest() {{
                channel = "occaecati";
                cursor = "minima";
                inclusive = false;
                latest = 7162.44;
                limit = 756779L;
                oldest = 270.69;
                token = "culpa";
                ts = 7313.98;
            }};            

            ConversationsRepliesResponse res = sdk.conversations.conversationsReplies(req, new ConversationsRepliesSecurity("adipisci") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsRepliesSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsSetPurpose

Sets the purpose for a conversation.

API method documentation
<https://api.slack.com/methods/conversations.setPurpose>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsSetPurposeApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsSetPurposeRequest;
import shadowcodex.slack_spec.models.operations.ConversationsSetPurposeResponse;
import shadowcodex.slack_spec.models.operations.ConversationsSetPurposeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsSetPurposeRequest req = new ConversationsSetPurposeRequest() {{
                requestBody = new ConversationsSetPurposeApplicationJSON() {{
                    channel = "cumque";
                    purpose = "consequuntur";
                }};;
                token = "consequatur";
            }};            

            ConversationsSetPurposeResponse res = sdk.conversations.conversationsSetPurpose(req, new ConversationsSetPurposeSecurity("minus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsSetPurposeSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsSetTopic

Sets the topic for a conversation.

API method documentation
<https://api.slack.com/methods/conversations.setTopic>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsSetTopicApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsSetTopicRequest;
import shadowcodex.slack_spec.models.operations.ConversationsSetTopicResponse;
import shadowcodex.slack_spec.models.operations.ConversationsSetTopicSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsSetTopicRequest req = new ConversationsSetTopicRequest() {{
                requestBody = new ConversationsSetTopicApplicationJSON() {{
                    channel = "quaerat";
                    topic = "sapiente";
                }};;
                token = "consectetur";
            }};            

            ConversationsSetTopicResponse res = sdk.conversations.conversationsSetTopic(req, new ConversationsSetTopicSecurity("esse") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsSetTopicSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conversationsUnarchive

Reverses conversation archival.

API method documentation
<https://api.slack.com/methods/conversations.unarchive>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ConversationsUnarchiveApplicationJSON;
import shadowcodex.slack_spec.models.operations.ConversationsUnarchiveRequest;
import shadowcodex.slack_spec.models.operations.ConversationsUnarchiveResponse;
import shadowcodex.slack_spec.models.operations.ConversationsUnarchiveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ConversationsUnarchiveRequest req = new ConversationsUnarchiveRequest() {{
                requestBody = new ConversationsUnarchiveApplicationJSON() {{
                    channel = "blanditiis";
                }};;
                token = "provident";
            }};            

            ConversationsUnarchiveResponse res = sdk.conversations.conversationsUnarchive(req, new ConversationsUnarchiveSecurity("a") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.conversationsUnarchiveSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
