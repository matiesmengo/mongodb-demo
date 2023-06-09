package com.matiesmengo.mongodb;


import com.matiesmengo.mongodb.data.entity.ArticleEntity;
import com.matiesmengo.mongodb.data.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void run(final String... args) {
        ArticleEntity article1 = ArticleEntity.builder()
                .title("article1")
                .content("content article1")
                .build();

        ArticleEntity article2 = ArticleEntity.builder()
                .title("article2")
                .content("content article2")
                .build();


        // Drop all database first
        this.articleRepository.deleteAll();

        // Save all the specified product
        this.articleRepository.saveAll(List.of(article1, article2));

        // Print all titles
        this.articleRepository.findAll().stream()
                .map(ArticleEntity::getTitle)
                .forEach(System.out::println);

    }
}