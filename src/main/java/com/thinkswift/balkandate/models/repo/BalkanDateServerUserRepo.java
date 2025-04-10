package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDateServerUser;
import com.thinkswift.balkandate.models.entities.BalkanDateUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Author : Sourav Modak
 * Date : 15-Feb-2025
 * Place : Toronto, ON
 */

@Repository
public interface BalkanDateServerUserRepo extends JpaRepository<BalkanDateServerUser, Long> {
    public BalkanDateServerUser findByUsername(String username);
    default BalkanDateServerUser findByUsernameMasked(String username) {
        BalkanDateServerUser user = findByUsername(username);
        if (user != null) {
            user.setPassword("****");
        }
        return user;
    }
}
