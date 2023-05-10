# dialog

### Available Operations

* [dialogOpen](#dialogopen) - Open a dialog with a user

## dialogOpen

Open a dialog with a user

API method documentation
<https://api.slack.com/methods/dialog.open>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.DialogOpenRequest;
import shadowcodex.slack_spec.models.operations.DialogOpenResponse;
import shadowcodex.slack_spec.models.operations.DialogOpenSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            DialogOpenRequest req = new DialogOpenRequest("nulla", "quas", "esse");            

            DialogOpenResponse res = sdk.dialog.dialogOpen(req, new DialogOpenSecurity("quasi") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.dialogOpenSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
