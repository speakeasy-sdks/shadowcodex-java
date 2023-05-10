# chat

### Available Operations

* [chatDelete](#chatdelete) - Deletes a message.
* [chatDeleteScheduledMessage](#chatdeletescheduledmessage) - Deletes a pending scheduled message from the queue.
* [chatGetPermalink](#chatgetpermalink) - Retrieve a permalink URL for a specific extant message
* [chatMeMessage](#chatmemessage) - Share a me message into a channel.
* [chatPostEphemeral](#chatpostephemeral) - Sends an ephemeral message to a user in a channel.
* [chatPostMessage](#chatpostmessage) - Sends a message to a channel.
* [chatScheduleMessage](#chatschedulemessage) - Schedules a message to be sent to a channel.
* [chatScheduledMessagesList](#chatscheduledmessageslist) - Returns a list of scheduled messages.
* [chatUnfurl](#chatunfurl) - Provide custom unfurl behavior for user-posted URLs
* [chatUpdate](#chatupdate) - Updates a message.

## chatDelete

Deletes a message.

API method documentation
<https://api.slack.com/methods/chat.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatDeleteRequest;
import shadowcodex.slack_spec.models.operations.ChatDeleteResponse;
import shadowcodex.slack_spec.models.operations.ChatDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatDeleteRequest req = new ChatDeleteRequest() {{
                requestBody = new ChatDeleteApplicationJSON() {{
                    asUser = false;
                    channel = "quasi";
                    ts = 4061.2;
                }};;
                token = "nulla";
            }};            

            ChatDeleteResponse res = sdk.chat.chatDelete(req, new ChatDeleteSecurity("excepturi") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatDeleteSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatDeleteScheduledMessage

Deletes a pending scheduled message from the queue.

API method documentation
<https://api.slack.com/methods/chat.deleteScheduledMessage>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatDeleteScheduledMessageApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatDeleteScheduledMessageRequest;
import shadowcodex.slack_spec.models.operations.ChatDeleteScheduledMessageResponse;
import shadowcodex.slack_spec.models.operations.ChatDeleteScheduledMessageSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatDeleteScheduledMessageRequest req = new ChatDeleteScheduledMessageRequest(                new ChatDeleteScheduledMessageApplicationJSON("voluptatibus", "nostrum") {{
                                asUser = false;
                            }};, "sapiente");            

            ChatDeleteScheduledMessageResponse res = sdk.chat.chatDeleteScheduledMessage(req, new ChatDeleteScheduledMessageSecurity("quisquam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatDeleteScheduledMessageSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatGetPermalink

Retrieve a permalink URL for a specific extant message

API method documentation
<https://api.slack.com/methods/chat.getPermalink>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatGetPermalinkRequest;
import shadowcodex.slack_spec.models.operations.ChatGetPermalinkResponse;
import shadowcodex.slack_spec.models.operations.ChatGetPermalinkSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatGetPermalinkRequest req = new ChatGetPermalinkRequest("saepe", "ea", "impedit");            

            ChatGetPermalinkResponse res = sdk.chat.chatGetPermalink(req, new ChatGetPermalinkSecurity("corporis") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatGetPermalinkSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatMeMessage

Share a me message into a channel.

API method documentation
<https://api.slack.com/methods/chat.meMessage>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatMeMessageApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatMeMessageRequest;
import shadowcodex.slack_spec.models.operations.ChatMeMessageResponse;
import shadowcodex.slack_spec.models.operations.ChatMeMessageSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatMeMessageRequest req = new ChatMeMessageRequest() {{
                requestBody = new ChatMeMessageApplicationJSON() {{
                    channel = "veniam";
                    text = "aliquid";
                }};;
                token = "inventore";
            }};            

            ChatMeMessageResponse res = sdk.chat.chatMeMessage(req, new ChatMeMessageSecurity("magnam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatMeMessageSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatPostEphemeral

Sends an ephemeral message to a user in a channel.

API method documentation
<https://api.slack.com/methods/chat.postEphemeral>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatPostEphemeralApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatPostEphemeralRequest;
import shadowcodex.slack_spec.models.operations.ChatPostEphemeralResponse;
import shadowcodex.slack_spec.models.operations.ChatPostEphemeralSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatPostEphemeralRequest req = new ChatPostEphemeralRequest(                new ChatPostEphemeralApplicationJSON("ea", "quo") {{
                                asUser = false;
                                attachments = "consectetur";
                                blocks = "recusandae";
                                iconEmoji = "aspernatur";
                                iconUrl = "minima";
                                linkNames = false;
                                parse = "eaque";
                                text = "a";
                                threadTs = "libero";
                                username = "Adrian_Anderson";
                            }};, "aliquam");            

            ChatPostEphemeralResponse res = sdk.chat.chatPostEphemeral(req, new ChatPostEphemeralSecurity("fugit") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatPostEphemeralSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatPostMessage

Sends a message to a channel.

API method documentation
<https://api.slack.com/methods/chat.postMessage>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatPostMessageApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatPostMessageRequest;
import shadowcodex.slack_spec.models.operations.ChatPostMessageResponse;
import shadowcodex.slack_spec.models.operations.ChatPostMessageSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatPostMessageRequest req = new ChatPostMessageRequest(                new ChatPostMessageApplicationJSON("accusamus") {{
                                asUser = "inventore";
                                attachments = "non";
                                blocks = "et";
                                iconEmoji = "dolorum";
                                iconUrl = "laborum";
                                linkNames = false;
                                mrkdwn = false;
                                parse = "placeat";
                                replyBroadcast = false;
                                text = "velit";
                                threadTs = "eum";
                                unfurlLinks = false;
                                unfurlMedia = false;
                                username = "Helen_Rolfson";
                            }};, "nulla");            

            ChatPostMessageResponse res = sdk.chat.chatPostMessage(req, new ChatPostMessageSecurity("voluptas") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatPostMessageSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatScheduleMessage

Schedules a message to be sent to a channel.

API method documentation
<https://api.slack.com/methods/chat.scheduleMessage>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatScheduleMessageApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatScheduleMessageRequest;
import shadowcodex.slack_spec.models.operations.ChatScheduleMessageResponse;
import shadowcodex.slack_spec.models.operations.ChatScheduleMessageSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatScheduleMessageRequest req = new ChatScheduleMessageRequest() {{
                requestBody = new ChatScheduleMessageApplicationJSON() {{
                    asUser = false;
                    attachments = "libero";
                    blocks = "quasi";
                    channel = "tempora";
                    linkNames = false;
                    parse = "numquam";
                    postAt = "explicabo";
                    replyBroadcast = false;
                    text = "provident";
                    threadTs = 553.74;
                    unfurlLinks = false;
                    unfurlMedia = false;
                }};;
                token = "molestiae";
            }};            

            ChatScheduleMessageResponse res = sdk.chat.chatScheduleMessage(req, new ChatScheduleMessageSecurity("magnam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatScheduleMessageSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatScheduledMessagesList

Returns a list of scheduled messages.

API method documentation
<https://api.slack.com/methods/chat.scheduledMessages.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListRequest;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListResponse;
import shadowcodex.slack_spec.models.operations.ChatScheduledMessagesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatScheduledMessagesListRequest req = new ChatScheduledMessagesListRequest() {{
                channel = "odio";
                cursor = "eius";
                latest = 4585.15;
                limit = 456141L;
                oldest = 5245.93;
                token = "fuga";
            }};            

            ChatScheduledMessagesListResponse res = sdk.chat.chatScheduledMessagesList(req, new ChatScheduledMessagesListSecurity("reprehenderit") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatScheduledMessagesListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatUnfurl

Provide custom unfurl behavior for user-posted URLs

API method documentation
<https://api.slack.com/methods/chat.unfurl>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatUnfurlApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatUnfurlRequest;
import shadowcodex.slack_spec.models.operations.ChatUnfurlResponse;
import shadowcodex.slack_spec.models.operations.ChatUnfurlSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatUnfurlRequest req = new ChatUnfurlRequest(                new ChatUnfurlApplicationJSON("quidem", "fugiat") {{
                                unfurls = "ut";
                                userAuthMessage = "eum";
                                userAuthRequired = false;
                                userAuthUrl = "suscipit";
                            }};, "assumenda");            

            ChatUnfurlResponse res = sdk.chat.chatUnfurl(req, new ChatUnfurlSecurity("eos") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatUnfurlSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## chatUpdate

Updates a message.

API method documentation
<https://api.slack.com/methods/chat.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.ChatUpdateApplicationJSON;
import shadowcodex.slack_spec.models.operations.ChatUpdateRequest;
import shadowcodex.slack_spec.models.operations.ChatUpdateResponse;
import shadowcodex.slack_spec.models.operations.ChatUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            ChatUpdateRequest req = new ChatUpdateRequest(                new ChatUpdateApplicationJSON("praesentium", "quisquam") {{
                                asUser = "veritatis";
                                attachments = "ipsa";
                                blocks = "id";
                                linkNames = "quidem";
                                parse = "neque";
                                text = "quo";
                            }};, "illum");            

            ChatUpdateResponse res = sdk.chat.chatUpdate(req, new ChatUpdateSecurity("quo") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.chatUpdateSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
