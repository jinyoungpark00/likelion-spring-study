package com.likelion11.springstudy.domain;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

//lombok 사용

@Entity
@NoArgsConstructor(access = PROTECTED) //빈 생성자
@Table(name = "posts")
@Getter
//setter은 Entity에서 왠만하면 만들지 않는다. --> data가 변경될 수 있어서
public class Post {
    //왜 접근제어자를 private로 했을까

    //PK
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id; //보통 id는 long으로

    private String title;

    @Column(name = "content") //db에 이름을 설정
    private String content;

    public Post( String title, String content) {
        this.title = title;
        this.content = content;
    }
}
