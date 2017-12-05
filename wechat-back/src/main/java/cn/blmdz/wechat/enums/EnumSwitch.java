package cn.blmdz.wechat.enums;

/**
 * 开关
 */
public enum EnumSwitch {
    dtalk_remind(1, "钉钉提醒"),
    
    ;
    
	
	private final Long value;
	
	private final String desc;

    public final long value() {
        return value;
    }

    public final String desc() {
        return desc;
    }
	
	EnumSwitch(long value, String desc) {
		this.value = value;
		this.desc = desc;
	}
}
