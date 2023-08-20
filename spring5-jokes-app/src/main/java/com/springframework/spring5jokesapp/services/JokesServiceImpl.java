package com.springframework.spring5jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {

	private final ChuckNorrisQuotes quotes;
	
	public JokesServiceImpl() {
		this.quotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJokesQuote() {
		return quotes.getRandomQuote();
	}
}
