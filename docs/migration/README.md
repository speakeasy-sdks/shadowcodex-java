# migration

### Available Operations

* [migrationExchange](#migrationexchange) - For Enterprise Grid workspaces, map local user IDs to global user IDs

## migrationExchange

For Enterprise Grid workspaces, map local user IDs to global user IDs

API method documentation
<https://api.slack.com/methods/migration.exchange>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.MigrationExchangeRequest;
import shadowcodex.slack_spec.models.operations.MigrationExchangeResponse;
import shadowcodex.slack_spec.models.operations.MigrationExchangeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            MigrationExchangeRequest req = new MigrationExchangeRequest("asperiores", "facilis") {{
                teamId = "voluptate";
                toOld = false;
            }};            

            MigrationExchangeResponse res = sdk.migration.migrationExchange(req, new MigrationExchangeSecurity("expedita") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.migrationExchangeSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
