package cn.blmdz.wechat.base;

import java.text.SimpleDateFormat;

/**
 * 常量
 * @author lm
 * @date 2016年12月7日 下午11:46:58
 */
public class Constants {
	
	//############################  [配置]  ###################################
	public final static String ERRORS = "/error/page";
	public final static String PAGE_NOT_FOUND = "/error/404";

	//############################  [时间]  ###################################
	public final static String TIMEZONE = "GMT+08:00";
	public final static String YHS = "yyyyMMddHHmmss.SSS";
	public final static String YH = "yyyy-MM-dd HH:mm:ss";
	public final static String Y = "yyyy-MM-dd";
	public final static String YM = "yyyyMM";
	public final static SimpleDateFormat SDF_YHS = new SimpleDateFormat(YHS);
	public final static SimpleDateFormat SDF_YH = new SimpleDateFormat(YH);
	public final static SimpleDateFormat SDF_Y = new SimpleDateFormat(Y);
	public final static SimpleDateFormat SDF_YM = new SimpleDateFormat(YM);
	
	//############################  [默认]  ###################################
	public final static String COMMA = ",";
	public final static String DEFAULT_SHOW = "-";
	public final static String DEFAULT_LEFT = "[";
	public final static String DEFAULT_RIGHT = "]";
	public final static String DEFAULT_GO = "至";
}
