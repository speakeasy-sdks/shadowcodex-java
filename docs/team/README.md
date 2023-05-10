# team

### Available Operations

* [teamAccessLogs](#teamaccesslogs) - Gets the access logs for the current team.
* [teamBillableInfo](#teambillableinfo) - Gets billable users information for the current team.
* [teamInfo](#teaminfo) - Gets information about the current team.
* [teamIntegrationLogs](#teamintegrationlogs) - Gets the integration logs for the current team.
* [teamProfileGet](#teamprofileget) - Retrieve a team's profile.

## teamAccessLogs

Gets the access logs for the current team.

API method documentation
<https://api.slack.com/methods/team.accessLogs>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamAccessLogsRequest;
import shadowcodex.slack_spec.models.operations.TeamAccessLogsResponse;
import shadowcodex.slack_spec.models.operations.TeamAccessLogsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamAccessLogsRequest req = new TeamAccessLogsRequest("sed") {{
                before = "sit";
                count = "vel";
                page = "nostrum";
            }};            

            TeamAccessLogsResponse res = sdk.team.teamAccessLogs(req, new TeamAccessLogsSecurity("saepe") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.teamAccessLogsSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## teamBillableInfo

Gets billable users information for the current team.

API method documentation
<https://api.slack.com/methods/team.billableInfo>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamBillableInfoRequest;
import shadowcodex.slack_spec.models.operations.TeamBillableInfoResponse;
import shadowcodex.slack_spec.models.operations.TeamBillableInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamBillableInfoRequest req = new TeamBillableInfoRequest("error") {{
                user = "consequatur";
            }};            

            TeamBillableInfoResponse res = sdk.team.teamBillableInfo(req, new TeamBillableInfoSecurity("incidunt") {{
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

## teamInfo

Gets information about the current team.

API method documentation
<https://api.slack.com/methods/team.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamInfoRequest;
import shadowcodex.slack_spec.models.operations.TeamInfoResponse;
import shadowcodex.slack_spec.models.operations.TeamInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamInfoRequest req = new TeamInfoRequest("reiciendis") {{
                team = "dolorem";
            }};            

            TeamInfoResponse res = sdk.team.teamInfo(req, new TeamInfoSecurity("harum") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.teamInfoSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## teamIntegrationLogs

Gets the integration logs for the current team.

API method documentation
<https://api.slack.com/methods/team.integrationLogs>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamIntegrationLogsRequest;
import shadowcodex.slack_spec.models.operations.TeamIntegrationLogsResponse;
import shadowcodex.slack_spec.models.operations.TeamIntegrationLogsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamIntegrationLogsRequest req = new TeamIntegrationLogsRequest("dicta") {{
                appId = "architecto";
                changeType = "occaecati";
                count = "labore";
                page = "quidem";
                serviceId = "atque";
                user = "laborum";
            }};            

            TeamIntegrationLogsResponse res = sdk.team.teamIntegrationLogs(req, new TeamIntegrationLogsSecurity("nam") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.teamIntegrationLogsSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## teamProfileGet

Retrieve a team's profile.

API method documentation
<https://api.slack.com/methods/team.profile.get>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.TeamProfileGetRequest;
import shadowcodex.slack_spec.models.operations.TeamProfileGetResponse;
import shadowcodex.slack_spec.models.operations.TeamProfileGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            TeamProfileGetRequest req = new TeamProfileGetRequest("tenetur") {{
                visibility = "laboriosam";
            }};            

            TeamProfileGetResponse res = sdk.team.teamProfileGet(req, new TeamProfileGetSecurity("alias") {{
                slackAuth = "Bearer YOUR_ACCESS_TOKEN_HERE";
            }});

            if (res.teamProfileGetSuccessSchema != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
