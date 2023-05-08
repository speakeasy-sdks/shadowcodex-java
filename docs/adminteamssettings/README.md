# adminTeamsSettings

### Available Operations

* [adminTeamsSettingsInfo](#adminteamssettingsinfo) - Fetch information about settings in a workspace
* [adminTeamsSettingsSetDefaultChannels](#adminteamssettingssetdefaultchannels) - Set the default channels of a workspace.
* [adminTeamsSettingsSetDescription](#adminteamssettingssetdescription) - Set the description of a given workspace.
* [adminTeamsSettingsSetDiscoverability](#adminteamssettingssetdiscoverability) - An API method that allows admins to set the discoverability of a given workspace
* [adminTeamsSettingsSetIcon](#adminteamssettingsseticon) - Sets the icon of a workspace.
* [adminTeamsSettingsSetName](#adminteamssettingssetname) - Set the name of a given workspace.

## adminTeamsSettingsInfo

Fetch information about settings in a workspace

API method documentation
<https://api.slack.com/methods/admin.teams.settings.info>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsInfoSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsInfoRequest req = new AdminTeamsSettingsInfoRequest("distinctio", "asperiores");            

            AdminTeamsSettingsInfoResponse res = sdk.adminTeamsSettings.adminTeamsSettingsInfo(req, new AdminTeamsSettingsInfoSecurity("nihil") {{
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

## adminTeamsSettingsSetDefaultChannels

Set the default channels of a workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDefaultChannels>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsRequestBody;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDefaultChannelsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDefaultChannelsRequestBody req = new AdminTeamsSettingsSetDefaultChannelsRequestBody("ipsum", "voluptate", "id");            

            AdminTeamsSettingsSetDefaultChannelsResponse res = sdk.adminTeamsSettings.adminTeamsSettingsSetDefaultChannels(req, new AdminTeamsSettingsSetDefaultChannelsSecurity("saepe") {{
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

## adminTeamsSettingsSetDescription

Set the description of a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDescription>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDescriptionSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDescriptionRequest req = new AdminTeamsSettingsSetDescriptionRequest(                new AdminTeamsSettingsSetDescriptionApplicationJSON("eius", "aspernatur");, "perferendis");            

            AdminTeamsSettingsSetDescriptionResponse res = sdk.adminTeamsSettings.adminTeamsSettingsSetDescription(req, new AdminTeamsSettingsSetDescriptionSecurity("amet") {{
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

## adminTeamsSettingsSetDiscoverability

An API method that allows admins to set the discoverability of a given workspace

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setDiscoverability>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilityResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetDiscoverabilitySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetDiscoverabilityRequest req = new AdminTeamsSettingsSetDiscoverabilityRequest(                new AdminTeamsSettingsSetDiscoverabilityApplicationJSON("optio", "accusamus");, "ad");            

            AdminTeamsSettingsSetDiscoverabilityResponse res = sdk.adminTeamsSettings.adminTeamsSettingsSetDiscoverability(req, new AdminTeamsSettingsSetDiscoverabilitySecurity("saepe") {{
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

## adminTeamsSettingsSetIcon

Sets the icon of a workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setIcon>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconRequestBody;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetIconSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetIconRequestBody req = new AdminTeamsSettingsSetIconRequestBody("suscipit", "deserunt", "provident");            

            AdminTeamsSettingsSetIconResponse res = sdk.adminTeamsSettings.adminTeamsSettingsSetIcon(req, new AdminTeamsSettingsSetIconSecurity("minima") {{
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

## adminTeamsSettingsSetName

Set the name of a given workspace.

API method documentation
<https://api.slack.com/methods/admin.teams.settings.setName>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameApplicationJSON;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameRequest;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameResponse;
import shadowcodex.slack_spec.models.operations.AdminTeamsSettingsSetNameSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            AdminTeamsSettingsSetNameRequest req = new AdminTeamsSettingsSetNameRequest(                new AdminTeamsSettingsSetNameApplicationJSON("repellendus", "totam");, "similique");            

            AdminTeamsSettingsSetNameResponse res = sdk.adminTeamsSettings.adminTeamsSettingsSetName(req, new AdminTeamsSettingsSetNameSecurity("alias") {{
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
