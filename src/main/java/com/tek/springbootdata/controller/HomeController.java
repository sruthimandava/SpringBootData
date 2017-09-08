package com.tek.springbootdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tek.springbootdata.model.Post;
import com.tek.springbootdata.service.PostService;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private PostService postService;

	@Autowired
	public HomeController(PostService postService) {
		this.postService = postService;
	}

	@RequestMapping("/")
	public String home(Model model) {
		Post latestPost = postService.getLatestPost();
		logger.debug(latestPost.toString());
		model.addAttribute("post", latestPost);
		return "index";
	}

}
