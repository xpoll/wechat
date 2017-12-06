package cn.blmdz.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blmdz.wechat.dao.RebotDao;
import cn.blmdz.wechat.model.XpollRebot;
import lombok.Getter;

@Service
public class RebotService extends BaseService<XpollRebot> {

	@Getter
	@Autowired
	RebotDao baseDao; 
	
}