/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package shadowcodex.slack_spec.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import shadowcodex.slack_spec.utils.SpeakeasyMetadata;

public class UsersSetPhotoRequestBody {
    /**
     * Width/height of crop box (always square)
     */
    @SpeakeasyMetadata("form:name=crop_w")
    public String cropW;
    public UsersSetPhotoRequestBody withCropW(String cropW) {
        this.cropW = cropW;
        return this;
    }
    
    /**
     * X coordinate of top-left corner of crop box
     */
    @SpeakeasyMetadata("form:name=crop_x")
    public String cropX;
    public UsersSetPhotoRequestBody withCropX(String cropX) {
        this.cropX = cropX;
        return this;
    }
    
    /**
     * Y coordinate of top-left corner of crop box
     */
    @SpeakeasyMetadata("form:name=crop_y")
    public String cropY;
    public UsersSetPhotoRequestBody withCropY(String cropY) {
        this.cropY = cropY;
        return this;
    }
    
    /**
     * File contents via `multipart/form-data`.
     */
    @SpeakeasyMetadata("form:name=image")
    public String image;
    public UsersSetPhotoRequestBody withImage(String image) {
        this.image = image;
        return this;
    }
    
    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    @SpeakeasyMetadata("form:name=token")
    public String token;
    public UsersSetPhotoRequestBody withToken(String token) {
        this.token = token;
        return this;
    }
    
    public UsersSetPhotoRequestBody(@JsonProperty("token") String token) {
        this.token = token;
  }
}
