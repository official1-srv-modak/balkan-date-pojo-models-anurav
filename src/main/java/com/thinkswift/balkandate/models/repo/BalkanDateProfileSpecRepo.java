package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDateProfileSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BalkanDateProfileSpecRepo extends JpaRepository<BalkanDateProfileSpecification, String> {
    Optional<BalkanDateProfileSpecification> findByUsername(String username);
}
