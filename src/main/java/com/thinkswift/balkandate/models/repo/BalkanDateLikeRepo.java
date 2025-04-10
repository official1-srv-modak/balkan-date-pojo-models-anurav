package com.thinkswift.balkandate.models.repo;

import com.thinkswift.balkandate.models.entities.BalkanDateLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BalkanDateLikeRepo extends JpaRepository<BalkanDateLike, BalkanDateLike.LikeId> {

    List<BalkanDateLike> findByLikerUsername(String likerUsername);
    List<BalkanDateLike> findByLikedUsername(String likedUsername);
    BalkanDateLike findByLikerUsernameAndLikedUsername(String username, String likedUsername);

    @Query("SELECT l1.likedUsername FROM BalkanDateLike l1 JOIN BalkanDateLike l2 ON l1.likedUsername = l2.likerUsername AND l1.likerUsername = l2.likedUsername WHERE l1.likerUsername = :username")
    List<String> findMutualLikes(@Param("username") String username);
}
