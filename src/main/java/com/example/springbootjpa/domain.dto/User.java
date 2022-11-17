package com.example.springbootjpa.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="User")
@Getter
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public static UserResponse of(User user) {
        return new UserResponse(user.getId(), user.getUsername(), user.getPassword());
    }

}
