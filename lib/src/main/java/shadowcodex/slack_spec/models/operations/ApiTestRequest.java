/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class ApiTestRequest {
    /**
     * Error response to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=error")
    public String error;
    public ApiTestRequest withError(String error) {
        this.error = error;
        return this;
    }
    
    /**
     * example property to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=foo")
    public String foo;
    public ApiTestRequest withFoo(String foo) {
        this.foo = foo;
        return this;
    }
    
    public ApiTestRequest(){}
}
