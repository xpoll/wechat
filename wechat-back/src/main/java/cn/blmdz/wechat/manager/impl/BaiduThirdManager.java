package cn.blmdz.wechat.manager.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.common.collect.Maps;

import cn.blmdz.wechat.config.ThirdConfiguration;
import cn.blmdz.wechat.manager.ThirdManager;
import cn.blmdz.wechat.model.third.ThirdUser;
import cn.blmdz.wechat.properties.OtherProperties;
import cn.blmdz.wechat.util.JsonMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("baiduThirdManager")
public class BaiduThirdManager implements ThirdManager {
    
    @Autowired
    private OtherProperties properties;
    
	@Override
	@SuppressWarnings("unchecked")
	public ThirdUser getThirdUserId(String authCode, ThirdUser tuser) {
		
		Map<String, String> values = Maps.newHashMap();
		values.put("client_id", properties.getThird().getBaidu().getAppKey());
		values.put("client_secret", properties.getThird().getBaidu().getAppSecret());
		values.put("grant_type", "authorization_code");
		values.put("code", authCode);
		values.put("redirect_uri", properties.getThird().getBaidu().getRedirectUrl());
		HttpRequest reqToken = HttpRequest.post(ThirdConfiguration.BAIDU_USER_TOKEN_URL);
		reqToken.form(values);
		if (reqToken.ok()) {
			values.clear();
			values = JsonMapper.nonEmptyMapper().fromJson(reqToken.body(), Map.class);
			String accessToken = values.get("access_token");
			values = Maps.newHashMap();
			values.put("access_token", accessToken);
			HttpRequest reqInfo = HttpRequest.post(ThirdConfiguration.BAIDU_USER_INFO);
			reqInfo.form(values);
			if (reqInfo.ok()) {

				values = Maps.newHashMap();
				values = JsonMapper.nonEmptyMapper().fromJson(reqInfo.body(), Map.class);
				tuser.setNick(values.get("uname"));
				tuser.setAvatar(ThirdConfiguration.BAIDU_AVATAR_PREFIX + values.get("portrait") + ThirdConfiguration.BAIDU_AVATAR_SUFFIX);
				tuser.setThirdUserId(values.get("uid"));
				return tuser;
			}
		}
        log.error("error get user.");
		return null;
	}

    @Override
    public void card(String requestId, String templateId, String authCode) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String cardLink() {
        // TODO Auto-generated method stub
        return null;
    }

}
