package com.persitance.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.persitance.entities.Article;
import com.persitance.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
final ArticleRepository articleRepository;
	
	
	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public Article getOneArticle(int id) {
		// TODO Auto-generated method stub
		if(articleRepository.existsById(id))
			return articleRepository.findById(id).get();
		else
		return null;
	}

	@Override
	public Article saveOneArticle(Article article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

	@Override
	public void deleteOneArticle(int id) {
		// TODO Auto-generated method stub
		
		if(articleRepository.existsById(id))
			articleRepository.deleteById(id);
	}

}
