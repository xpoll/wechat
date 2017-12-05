package cn.blmdz.wechat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.blmdz.wechat.dao.SwitchDao;
import cn.blmdz.wechat.model.XpollSwitch;
import lombok.Getter;

@Service
public class SwitchService extends BaseService<XpollSwitch> {

	@Getter
	@Autowired
	SwitchDao baseDao; 
	
}