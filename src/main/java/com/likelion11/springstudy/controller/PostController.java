package com.likelion11.springstudy.controller;

import com.likelion11.springstudy.dto.PostRequestDto;
import com.likelion11.springstudy.dto.PostResponseDto;
import com.likelion11.springstudy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController//Rest와의 차이점 알아오기
@RequiredArgsConstructor //의존성 주입을 위함(생성자 주입)
@RequestMapping("api/posts")
public class PostController {

    private final PostService postService;

    // 생성 API
    // 생성할 데이터 필요(dto 형식이어야 함)
    @PostMapping("/post")
    public String createPost(@RequestBody PostRequestDto postrequestDto){
        postService.create(postrequestDto);
        return "ok";
    }

    @GetMapping("/post/{postId}")
    public PostResponseDto getPost(@PathVariable("postId") Long id){
        return postService.getPost(id);
    }
}
