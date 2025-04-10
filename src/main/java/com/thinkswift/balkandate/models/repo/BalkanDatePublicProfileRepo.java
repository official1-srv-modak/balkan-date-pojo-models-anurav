package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDatePublicProfile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BalkanDatePublicProfileRepo extends JpaRepository<BalkanDatePublicProfile, String> {
    Optional<BalkanDatePublicProfile> findByUsername(String username);

    Page<BalkanDatePublicProfile> findByUsernameContainingIgnoreCase(String username, Pageable pageable);

    Page<BalkanDatePublicProfile> findByLocationContainingIgnoreCase(String location, Pageable pageable);

    Page<BalkanDatePublicProfile> findByGender(String gender, Pageable pageable);
}
