package com.thinkswift.balkandate.models.repo;

/**
 * Author : Sourav Modak
 */

import com.thinkswift.balkandate.models.entities.Content;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContentRepository extends JpaRepository<Content, UUID> {
    Page<Content> findByUniqueId(String uniqueId, Pageable pageable);
    List<Content> findByUniqueId(String uniqueId);

}
