package com.persitance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persitance.entities.Article;
import com.persitance.services.ArticleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("articles")
@RequiredArgsConstructor
public class ArticleController {
	
final	ArticleService articleService;
	@GetMapping
	public List<Article> findAllArticles()
	{
		return articleService.getAllArticles();
	}
	@PostMapping
	public Article addOne(@RequestBody Article article)
	{
		return articleService.saveOneArticle(article);
	}

}
