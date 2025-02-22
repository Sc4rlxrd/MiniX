package com.scarlxrd.minix.entities;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="users_id")
    private UUID id;
    @Column(unique = true)
    private String username;
    private String password;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "tb_users_roles",joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name ="role_id"))
    private Set<Role> role;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
