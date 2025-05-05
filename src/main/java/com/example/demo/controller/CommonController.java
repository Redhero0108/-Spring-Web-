package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	//完了後,使用リダイレクト重新定位到delete这个URL
	@GetMapping("/complete")
	private String complete() {
		
		return"complete";//展示complete.html画面
	}

}
