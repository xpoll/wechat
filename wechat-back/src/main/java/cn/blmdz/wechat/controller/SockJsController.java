package cn.blmdz.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import cn.blmdz.wechat.model.vo.WebChat;

@Controller
public class SockJsController {

	@Autowired SimpMessagingTemplate template;
	
	@MessageMapping("/say")
	public void greeting(WebChat webChat) {
		
		template.convertAndSend("/simple/greetings" + webChat.getId(), webChat);
	}
}