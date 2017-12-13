package cn.blmdz.wechat.manager.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.kevinsawicki.http.HttpRequest;

import cn.blmdz.wechat.config.ThirdConfiguration;
import cn.blmdz.wechat.manager.ThirdManager;
import cn.blmdz.wechat.model.third.ThirdUser;
import cn.blmdz.wechat.model.third.wechat.WechatUserInfoRequest;
import cn.blmdz.wechat.model.third.wechat.WechatUserTokenRequest;
import cn.blmdz.wechat.model.third.wechat.WechatUserTokenResponse;
import cn.blmdz.wechat.properties.OtherProperties;
import cn.blmdz.wechat.util.JsonMapper;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component("wechatThirdManager")
public class WechatThirdManager implements ThirdManager {
    
    @Autowired
    private OtherProperties properties;

	@Override
	public ThirdUser getThirdUserId(String authCode, ThirdUser tuser) {
		HttpRequest reqToken = HttpRequest.get(ThirdConfiguration.WECHAT_USER_TOKEN_URL, false, new WechatUserTokenRequest(properties, authCode));
		if (reqToken.ok()) {
			WechatUserTokenResponse tokenResponse = JsonMapper.nonEmptyMapper().fromJson(reqToken.body(), WechatUserTokenResponse.class);
			if (StringUtils.isBlank(tokenResponse.getErrcode())) {
				HttpRequest reqInfo = HttpRequest.get(ThirdConfiguration.WECHAT_USER_INFO_URL, false, new WechatUserInfoRequest(tokenResponse.getAccess_token(), tokenResponse.getOpenid()));
			}
		}
		log.error("token: {}", reqToken.body());
		reqToken.body();

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
