package com.likelion11.springstudy.service;

import com.likelion11.springstudy.domain.Post;
import com.likelion11.springstudy.dto.PostRequestDto;
import com.likelion11.springstudy.dto.PostResponseDto;
import com.likelion11.springstudy.repository.PostRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public void create(PostRequestDto postRequestDto){
        Post post = new Post(postRequestDto.getTitle(), postRequestDto.getContent());
        postRepository.save(post);
    }

    @Transactional(readOnly = true)
    public PostResponseDto getPost(Long id) {
        Post post = postRepository.findById(id).get();
        return new PostResponseDto(post.getId(), post.getTitle(), post.getContent());

    }
}
