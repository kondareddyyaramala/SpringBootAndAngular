package com.springboot.app.service;

import java.util.Optional;

import com.springboot.app.model.Article;

public interface ArticleService {

	public Optional<Article[]> getArticles(String country, String category);
}
