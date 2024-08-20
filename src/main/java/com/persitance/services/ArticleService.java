package com.persitance.services;

import java.util.List;

import com.persitance.entities.Article;

public interface ArticleService {
public List<Article> getAllArticles();
public Article getOneArticle(int id);
public Article saveOneArticle(Article article);
public void deleteOneArticle(int id);
}
