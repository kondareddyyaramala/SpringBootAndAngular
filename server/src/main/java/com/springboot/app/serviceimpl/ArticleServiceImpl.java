package com.springboot.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.app.constants.Constants;
import com.springboot.app.model.Article;
import com.springboot.app.model.ArticleResponse;
import com.springboot.app.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Optional<Article[]> getArticles(String country, String category) {
		String url = "https://newsapi.org/v2/top-headlines?country=" + country + "&category=" + category + "&apiKey="
				+ Constants.apiKey;
		ResponseEntity<ArticleResponse> response = restTemplate.getForEntity(url, ArticleResponse.class);
		Optional<Article[]> optionalResp = Optional.of(response.getBody().getArticles());
		return optionalResp.isPresent() ? optionalResp : Optional.empty();
	}

}
