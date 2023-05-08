# workflows

### Available Operations

* [workflowsStepCompleted](#workflowsstepcompleted) - Indicate that an app's step in a workflow completed execution.
* [workflowsStepFailed](#workflowsstepfailed) - Indicate that an app's step in a workflow failed to execute.
* [workflowsUpdateStep](#workflowsupdatestep) - Update the configuration for a workflow extension step.

## workflowsStepCompleted

Indicate that an app's step in a workflow completed execution.

API method documentation
<https://api.slack.com/methods/workflows.stepCompleted>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.WorkflowsStepCompletedRequest;
import shadowcodex.slack_spec.models.operations.WorkflowsStepCompletedResponse;
import shadowcodex.slack_spec.models.operations.WorkflowsStepCompletedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            WorkflowsStepCompletedRequest req = new WorkflowsStepCompletedRequest("minima", "dolore") {{
                outputs = "dolorum";
            }};            

            WorkflowsStepCompletedResponse res = sdk.workflows.workflowsStepCompleted(req, new WorkflowsStepCompletedSecurity("nesciunt") {{
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

## workflowsStepFailed

Indicate that an app's step in a workflow failed to execute.

API method documentation
<https://api.slack.com/methods/workflows.stepFailed>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.WorkflowsStepFailedRequest;
import shadowcodex.slack_spec.models.operations.WorkflowsStepFailedResponse;
import shadowcodex.slack_spec.models.operations.WorkflowsStepFailedSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            WorkflowsStepFailedRequest req = new WorkflowsStepFailedRequest("quae", "recusandae", "omnis");            

            WorkflowsStepFailedResponse res = sdk.workflows.workflowsStepFailed(req, new WorkflowsStepFailedSecurity("quaerat") {{
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

## workflowsUpdateStep

Update the configuration for a workflow extension step.

API method documentation
<https://api.slack.com/methods/workflows.updateStep>

### Example Usage

```java
package hello.world;

import shadowcodex.slack_spec.SlackSpec;
import shadowcodex.slack_spec.models.operations.WorkflowsUpdateStepRequest;
import shadowcodex.slack_spec.models.operations.WorkflowsUpdateStepResponse;
import shadowcodex.slack_spec.models.operations.WorkflowsUpdateStepSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SlackSpec sdk = SlackSpec.builder()
                .build();

            WorkflowsUpdateStepRequest req = new WorkflowsUpdateStepRequest("molestiae", "ex") {{
                inputs = "ut";
                outputs = "culpa";
                stepImageUrl = "adipisci";
                stepName = "debitis";
            }};            

            WorkflowsUpdateStepResponse res = sdk.workflows.workflowsUpdateStep(req, new WorkflowsUpdateStepSecurity("laudantium") {{
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
