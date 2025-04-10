package com.thinkswift.balkandate.models.nonentities.response.usermanagement;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileMedia;
import com.thinkswift.balkandate.models.entities.BalkanDatePublicProfile;
import com.thinkswift.balkandate.models.nonentities.response.BalkanDateBaseResponse;

import java.util.List;

public class BalkanDateGetPublicProfileResponse extends BalkanDateBaseResponse {
    BalkanDatePublicProfile publicProfile;

    public BalkanDateGetPublicProfileResponse(BalkanDatePublicProfile publicProfile) {
        this.publicProfile = publicProfile;
    }

    public BalkanDateGetPublicProfileResponse() {
    }

    public BalkanDatePublicProfile getPublicProfile() {
        return publicProfile;
    }

    public void setPublicProfile(BalkanDatePublicProfile publicProfile) {
        this.publicProfile = publicProfile;
    }
}
