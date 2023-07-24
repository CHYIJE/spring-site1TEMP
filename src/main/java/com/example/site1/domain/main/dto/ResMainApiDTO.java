package com.example.site1.domain.main.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ResMainApiDTO {

    private List<User> userList;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder
    public static class User {
        private Integer idx;
        private String id;
        private String password;
        private List<Post> postList;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder
    public static class Post {
        private Integer idx;
        private String title;
        private String content;

    }
    
}
