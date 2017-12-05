package cn.blmdz.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.blmdz.wechat.base.BasePage;
import cn.blmdz.wechat.base.Response;
import cn.blmdz.wechat.model.XpollSwitch;
import cn.blmdz.wechat.service.SwitchService;


@RestController
@RequestMapping("/api/s")
public class RestSwitchController {
    
    @Autowired
    private SwitchService switchService;
    
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Response<BasePage<?, XpollSwitch>> page(@RequestBody BasePage<?, XpollSwitch> base) {
        
        return Response.build(switchService.page(base));
    }
}
