package cn.blmdz.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SpecialViewController {
	
	private static final String prefix = "/";
	private static final String sufix = ".html";
	
	
	@RequestMapping(value= {"/index", "/"}, method=RequestMethod.GET)
	public String indexView (){
		return prefix + "index" + sufix;
	}
}
