package com.scarlxrd.minix.repository;

import com.scarlxrd.minix.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
