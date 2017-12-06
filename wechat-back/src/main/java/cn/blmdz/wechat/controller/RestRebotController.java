package cn.blmdz.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.blmdz.wechat.base.BasePage;
import cn.blmdz.wechat.base.Response;
import cn.blmdz.wechat.model.XpollRebot;
import cn.blmdz.wechat.service.RebotService;


@RestController
@RequestMapping("/api/r")
public class RestRebotController {
    
    @Autowired
    private RebotService rebotService;
    
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Response<BasePage<?, XpollRebot>> page(@RequestBody BasePage<?, XpollRebot> base) {
        
        return Response.build(rebotService.page(base));
    }
}
