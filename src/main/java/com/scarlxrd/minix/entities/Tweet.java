package com.scarlxrd.minix.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tb_tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String content;
    @CreationTimestamp
    private Instant creationTimesTamp;

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreationTimesTamp() {
        return creationTimesTamp;
    }

    public void setCreationTimesTamp(Instant creationTimesTamp) {
        this.creationTimesTamp = creationTimesTamp;
    }
}
