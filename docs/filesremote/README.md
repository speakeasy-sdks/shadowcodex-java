# filesRemote

### Available Operations

* [filesRemoteAdd](#filesremoteadd) - Adds a file from a remote service
* [filesRemoteInfo](#filesremoteinfo) - Retrieve information about a remote file added to Slack
* [filesRemoteList](#filesremotelist) - Retrieve information about a remote file added to Slack
* [filesRemoteRemove](#filesremoteremove) - Remove a remote file.
* [filesRemoteShare](#filesremoteshare) - Share a remote file into a channel.
* [filesRemoteUpdate](#filesremoteupdate) - Updates an existing remote file.

## filesRemoteAdd

Adds a file from a remote service

API method documentation
<https://api.slack.com/methods/files.remote.add>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteAddRequestBody;
import shadowcodex.slack_spec.models.operations.FilesRemoteAddResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteAddSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteAddRequestBody req = new FilesRemoteAddRequestBody() {{
                externalId = "similique";
                externalUrl = "tempora";
                filetype = "aspernatur";
                indexableFileContents = "voluptas";
                previewImage = "voluptas";
                title = "Mrs.";
                token = "minima";
            }};            

            FilesRemoteAddResponse res = sdk.filesRemote.filesRemoteAdd(req, new FilesRemoteAddSecurity("nobis") {{
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

## filesRemoteInfo

Retrieve information about a remote file added to Slack

API method documentation
<https://api.slack.com/methods/files.remote.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteInfoRequest;
import shadowcodex.slack_spec.models.operations.FilesRemoteInfoResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteInfoRequest req = new FilesRemoteInfoRequest() {{
                externalId = "dolorum";
                file = "adipisci";
                token = "minus";
            }};            

            FilesRemoteInfoResponse res = sdk.filesRemote.filesRemoteInfo(req, new FilesRemoteInfoSecurity("dolores") {{
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

## filesRemoteList

Retrieve information about a remote file added to Slack

API method documentation
<https://api.slack.com/methods/files.remote.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteListRequest;
import shadowcodex.slack_spec.models.operations.FilesRemoteListResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteListRequest req = new FilesRemoteListRequest() {{
                channel = "blanditiis";
                cursor = "in";
                limit = 296242L;
                token = "aliquam";
                tsFrom = 8859.63;
                tsTo = 8391.89;
            }};            

            FilesRemoteListResponse res = sdk.filesRemote.filesRemoteList(req, new FilesRemoteListSecurity("ullam") {{
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

## filesRemoteRemove

Remove a remote file.

API method documentation
<https://api.slack.com/methods/files.remote.remove>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteRemoveRequestBody;
import shadowcodex.slack_spec.models.operations.FilesRemoteRemoveResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteRemoveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteRemoveRequestBody req = new FilesRemoteRemoveRequestBody() {{
                externalId = "adipisci";
                file = "cum";
                token = "blanditiis";
            }};            

            FilesRemoteRemoveResponse res = sdk.filesRemote.filesRemoteRemove(req, new FilesRemoteRemoveSecurity("quas") {{
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

## filesRemoteShare

Share a remote file into a channel.

API method documentation
<https://api.slack.com/methods/files.remote.share>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteShareRequest;
import shadowcodex.slack_spec.models.operations.FilesRemoteShareResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteShareSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteShareRequest req = new FilesRemoteShareRequest() {{
                channels = "hic";
                externalId = "nesciunt";
                file = "culpa";
                token = "corrupti";
            }};            

            FilesRemoteShareResponse res = sdk.filesRemote.filesRemoteShare(req, new FilesRemoteShareSecurity("pariatur") {{
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

## filesRemoteUpdate

Updates an existing remote file.

API method documentation
<https://api.slack.com/methods/files.remote.update>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRemoteUpdateRequestBody;
import shadowcodex.slack_spec.models.operations.FilesRemoteUpdateResponse;
import shadowcodex.slack_spec.models.operations.FilesRemoteUpdateSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRemoteUpdateRequestBody req = new FilesRemoteUpdateRequestBody() {{
                externalId = "totam";
                externalUrl = "hic";
                file = "exercitationem";
                filetype = "nobis";
                indexableFileContents = "sit";
                previewImage = "rerum";
                title = "Mr.";
                token = "reiciendis";
            }};            

            FilesRemoteUpdateResponse res = sdk.filesRemote.filesRemoteUpdate(req, new FilesRemoteUpdateSecurity("explicabo") {{
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
