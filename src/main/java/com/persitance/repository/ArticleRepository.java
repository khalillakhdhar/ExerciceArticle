package com.persitance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persitance.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
	public List<Article>  findByAuteur(String auteur);
	List<Article> findByResumeContaining(String resume);
	List<Article> findByTypeOrAuteur(String type,String auteur);
	List<Article> findByPublication(boolean publication);

}
