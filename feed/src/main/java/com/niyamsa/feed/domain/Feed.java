package com.niyamsa.feed.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Feed { //Domain이 entity의 구조를 정의하는 것이 아니다.

    private Long id;
    private String title;
    private String content;
    private String authorId;

    public static Feed createFeed() {
        return Feed.builder()
                .title("title")
                .content("content")
                .authorId("authorId")
                .build();
    }
}
