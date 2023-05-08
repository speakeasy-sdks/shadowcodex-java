# files

### Available Operations

* [filesCommentsDelete](#filescommentsdelete) - Deletes an existing comment on a file.
* [filesDelete](#filesdelete) - Deletes a file.
* [filesInfo](#filesinfo) - Gets information about a file.
* [filesList](#fileslist) - List for a team, in a channel, or from a user with applied filters.
* [filesRemoteAdd](#filesremoteadd) - Adds a file from a remote service
* [filesRemoteInfo](#filesremoteinfo) - Retrieve information about a remote file added to Slack
* [filesRemoteList](#filesremotelist) - Retrieve information about a remote file added to Slack
* [filesRemoteRemove](#filesremoteremove) - Remove a remote file.
* [filesRemoteShare](#filesremoteshare) - Share a remote file into a channel.
* [filesRemoteUpdate](#filesremoteupdate) - Updates an existing remote file.
* [filesRevokePublicURL](#filesrevokepublicurl) - Revokes public/external sharing access for a file
* [filesSharedPublicURL](#filessharedpublicurl) - Enables a file for public/external sharing.
* [filesUpload](#filesupload) - Uploads or creates a file.

## filesCommentsDelete

Deletes an existing comment on a file.

API method documentation
<https://api.slack.com/methods/files.comments.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteRequest;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteResponse;
import shadowcodex.slack_spec.models.operations.FilesCommentsDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesCommentsDeleteRequest req = new FilesCommentsDeleteRequest() {{
                requestBody = new FilesCommentsDeleteApplicationJSON() {{
                    file = "tenetur";
                    id = "1e674bdb-04f1-4575-a082-d68ea19f1d17";
                }};;
                token = "ipsa";
            }};            

            FilesCommentsDeleteResponse res = sdk.files.filesCommentsDelete(req, new FilesCommentsDeleteSecurity("minima") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesCommentsDeleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## filesDelete

Deletes a file.

API method documentation
<https://api.slack.com/methods/files.delete>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesDeleteApplicationJSON;
import shadowcodex.slack_spec.models.operations.FilesDeleteRequest;
import shadowcodex.slack_spec.models.operations.FilesDeleteResponse;
import shadowcodex.slack_spec.models.operations.FilesDeleteSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesDeleteRequest req = new FilesDeleteRequest() {{
                requestBody = new FilesDeleteApplicationJSON() {{
                    file = "veritatis";
                }};;
                token = "consectetur";
            }};            

            FilesDeleteResponse res = sdk.files.filesDelete(req, new FilesDeleteSecurity("adipisci") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesDeleteSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## filesInfo

Gets information about a file.

API method documentation
<https://api.slack.com/methods/files.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesInfoRequest;
import shadowcodex.slack_spec.models.operations.FilesInfoResponse;
import shadowcodex.slack_spec.models.operations.FilesInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesInfoRequest req = new FilesInfoRequest() {{
                count = "iste";
                cursor = "temporibus";
                file = "accusantium";
                limit = 522371L;
                page = "aut";
                token = "laudantium";
            }};            

            FilesInfoResponse res = sdk.files.filesInfo(req, new FilesInfoSecurity("eum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## filesList

List for a team, in a channel, or from a user with applied filters.

API method documentation
<https://api.slack.com/methods/files.list>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesListRequest;
import shadowcodex.slack_spec.models.operations.FilesListResponse;
import shadowcodex.slack_spec.models.operations.FilesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesListRequest req = new FilesListRequest() {{
                channel = "mollitia";
                count = "ab";
                page = "corrupti";
                showFilesHiddenByLimit = false;
                token = "non";
                tsFrom = 324.65;
                tsTo = 2211.61;
                types = "occaecati";
                user = "numquam";
            }};            

            FilesListResponse res = sdk.files.filesList(req, new FilesListSecurity("impedit") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesListSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                externalId = "explicabo";
                externalUrl = "voluptas";
                filetype = "aut";
                indexableFileContents = "dignissimos";
                previewImage = "dicta";
                title = "Dr.";
                token = "natus";
            }};            

            FilesRemoteAddResponse res = sdk.files.filesRemoteAdd(req, new FilesRemoteAddSecurity("velit") {{
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
                externalId = "voluptatibus";
                file = "voluptas";
                token = "asperiores";
            }};            

            FilesRemoteInfoResponse res = sdk.files.filesRemoteInfo(req, new FilesRemoteInfoSecurity("aperiam") {{
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
                channel = "ea";
                cursor = "quaerat";
                limit = 162954L;
                token = "repellendus";
                tsFrom = 6387.62;
                tsTo = 8070.23;
            }};            

            FilesRemoteListResponse res = sdk.files.filesRemoteList(req, new FilesRemoteListSecurity("dignissimos") {{
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
                externalId = "officia";
                file = "asperiores";
                token = "nemo";
            }};            

            FilesRemoteRemoveResponse res = sdk.files.filesRemoteRemove(req, new FilesRemoteRemoveSecurity("quae") {{
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
                channels = "quaerat";
                externalId = "porro";
                file = "quod";
                token = "labore";
            }};            

            FilesRemoteShareResponse res = sdk.files.filesRemoteShare(req, new FilesRemoteShareSecurity("ab") {{
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
                externalId = "adipisci";
                externalUrl = "fuga";
                file = "id";
                filetype = "suscipit";
                indexableFileContents = "velit";
                previewImage = "culpa";
                title = "Miss";
                token = "recusandae";
            }};            

            FilesRemoteUpdateResponse res = sdk.files.filesRemoteUpdate(req, new FilesRemoteUpdateSecurity("totam") {{
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

## filesRevokePublicURL

Revokes public/external sharing access for a file

API method documentation
<https://api.slack.com/methods/files.revokePublicURL>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesRevokePublicURLApplicationJSON;
import shadowcodex.slack_spec.models.operations.FilesRevokePublicURLRequest;
import shadowcodex.slack_spec.models.operations.FilesRevokePublicURLResponse;
import shadowcodex.slack_spec.models.operations.FilesRevokePublicURLSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesRevokePublicURLRequest req = new FilesRevokePublicURLRequest() {{
                requestBody = new FilesRevokePublicURLApplicationJSON() {{
                    file = "fugiat";
                }};;
                token = "vel";
            }};            

            FilesRevokePublicURLResponse res = sdk.files.filesRevokePublicURL(req, new FilesRevokePublicURLSecurity("ducimus") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesRevokePublicURLSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## filesSharedPublicURL

Enables a file for public/external sharing.

API method documentation
<https://api.slack.com/methods/files.sharedPublicURL>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesSharedPublicURLApplicationJSON;
import shadowcodex.slack_spec.models.operations.FilesSharedPublicURLRequest;
import shadowcodex.slack_spec.models.operations.FilesSharedPublicURLResponse;
import shadowcodex.slack_spec.models.operations.FilesSharedPublicURLSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesSharedPublicURLRequest req = new FilesSharedPublicURLRequest() {{
                requestBody = new FilesSharedPublicURLApplicationJSON() {{
                    file = "quos";
                }};;
                token = "vel";
            }};            

            FilesSharedPublicURLResponse res = sdk.files.filesSharedPublicURL(req, new FilesSharedPublicURLSecurity("labore") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesSharedPublicURLSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## filesUpload

Uploads or creates a file.

API method documentation
<https://api.slack.com/methods/files.upload>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.FilesUploadRequestBody;
import shadowcodex.slack_spec.models.operations.FilesUploadResponse;
import shadowcodex.slack_spec.models.operations.FilesUploadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            FilesUploadRequestBody req = new FilesUploadRequestBody() {{
                channels = "possimus";
                content = "facilis";
                file = "cum";
                filename = "commodi";
                filetype = "in";
                initialComment = "corporis";
                threadTs = 9689.04;
                title = "Dr.";
                token = "nemo";
            }};            

            FilesUploadResponse res = sdk.files.filesUpload(req, new FilesUploadSecurity("recusandae") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.filesUploadSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
