package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalkanDateProfileMediaUrlsRepo extends JpaRepository<BalkanDateProfileMedia, String> {
    List<BalkanDateProfileMedia> findByUsername(String username);

    default BalkanDateProfileMedia save(BalkanDateProfileMedia media) {
        BalkanDateProfileMedia newMedia = new BalkanDateProfileMedia(media);
        return saveAndFlush(newMedia);
    }

    List<BalkanDateProfileMedia> findByUsernameAndHiddenFalseOrderByUploadTimeStampDesc(String username);

    void deleteByMediaUrl(String mediaUrl);

    public int deleteByUsernameAndMediaUrl(String username, String profileMediaUrl);

    public List<BalkanDateProfileMedia> findByUsernameAndHiddenFalse(String username);

    public List<BalkanDateProfileMedia> findByUsernameAndHidden(String username, boolean hidden);

    BalkanDateProfileMedia findByUsernameAndMediaUrl(String username, String mediaUrl);
}
