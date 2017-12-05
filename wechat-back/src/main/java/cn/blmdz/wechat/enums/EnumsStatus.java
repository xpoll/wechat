package cn.blmdz.wechat.enums;

/**
 * 通用状态
 * @author yangyz
 * @date 2016年12月2日下午5:25:03
 */
public enum EnumsStatus {
    
    /**
     * 不可用
     */
    NOT_ACTIVATE(false),
    
    /**
     * 正常
     */
    NORMAL(true);
	
	private final boolean value;
	
    public final boolean value() {
        return value;
    }
	
	EnumsStatus(boolean value) {
		this.value = value;
	}
}
