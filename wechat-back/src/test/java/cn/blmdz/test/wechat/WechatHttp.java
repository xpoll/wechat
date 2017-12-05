package cn.blmdz.test.wechat;

import java.util.Map;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.common.collect.Maps;

public class WechatHttp {

	public static String access_token = "ZjtzvVx8s626FJmaqWPImucCTr_7guL0vDe4MjupnIKRz1-bvttAx-vCbGDQFV5llwhiOqc_H50tHrt3inxhMR40gBiNYCJVRoUvqy_AkG19t70aCGEP5aSkdQTC6h3UVDOgAHAIQB";
	public static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token";
	public static String ip_url = "https://api.weixin.qq.com/cgi-bin/getcallbackip";

	public static void main(String[] args) {
		Map<String, String> params = Maps.newHashMap();
		params.put("grant_type", "client_credential");
		params.put("appid", "wxfc4c9f3eabab8a27");
		params.put("secret", "6a16f18b3046a1f859e71b2253488783");
//		get(access_token_url, params);
		
		params.clear();
		params.put("access_token", access_token);
		get(ip_url, params);
	}

	public static void get(String url, Map<String, String> params) {
		HttpRequest request = HttpRequest.get(url, params, false);
		System.out.println(request.ok());
		System.out.println(request.body());
	}
}
