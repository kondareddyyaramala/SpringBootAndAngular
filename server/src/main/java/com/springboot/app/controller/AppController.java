package com.springboot.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Article;
import com.springboot.app.service.ArticleService;

@RestController
@RequestMapping("/")
public class AppController {
	private ArticleService articleService;

	public AppController(final ArticleService articleService) {
		this.articleService = articleService;
	}

	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public ResponseEntity<Article[]> getArticles() {
		Optional<Article[]> response = Optional.empty();
		response = articleService.getArticles("us", "");
		return new ResponseEntity<Article[]>(response.get(), HttpStatus.OK);
	}

}
