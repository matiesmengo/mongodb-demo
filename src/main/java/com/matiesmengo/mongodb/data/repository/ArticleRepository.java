package com.matiesmengo.mongodb.data.repository;


import com.matiesmengo.mongodb.data.entity.ArticleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<ArticleEntity, String> {

}
