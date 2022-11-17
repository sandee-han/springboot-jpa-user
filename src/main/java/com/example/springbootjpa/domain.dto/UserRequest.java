package com.example.springbootjpa.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String passowrd;

    public User toEntity() {
        User user = User.builder()
                .username(this.username)
                .password(this.passowrd)
                .build();
        return user;
    }
}
