package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 * @date 2019/11/2 12:22
 */
@RestController
public class ArticleController {

    @GetMapping("/article/{articleId}")
    public Map<String, Integer> get(
            @PathVariable int articleId) {
        Map<String, Integer> article = new HashMap<>();
        article.put("articleId", articleId);
        return article;
    }

    @GetMapping("/articles")
    public ResponseEntity<List<Integer>> list() {
        List<Integer> articles =new ArrayList<>();
        articles.add(1);
        articles.add(11);
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }

}
