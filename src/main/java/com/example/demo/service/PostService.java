package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.example.demo.model.Post;

@Service
public class PostService {

    // Поле для хранения постов
    private List<Post> posts;

    // Блок инициализации
    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post("Первый пост"));
        posts.add(new Post("Второй пост"));
        posts.add(new Post("Третий пост"));
    }

    // Метод для получения всех постов
    public List<Post> listAllPosts() {
        return posts;
    }


    public void create(String text) {
        posts.add(new Post(text));
    }
}
