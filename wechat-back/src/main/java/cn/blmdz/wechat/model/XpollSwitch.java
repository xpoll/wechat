package cn.blmdz.wechat.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.blmdz.wechat.base.Constants;
import cn.blmdz.wechat.serialize.FlagSerializer;
import lombok.Data;

/**
 * 开关
 * @author yongzongyang
 * @date 2017年12月4日
 */
@Data
public class XpollSwitch {
    private Long id;
    private Boolean value;
    @JsonIgnore
    private String remark;
    @JsonIgnore
    private Boolean status;
    @JsonFormat(pattern = Constants.YH, timezone = Constants.TIMEZONE)
    private Date updateTime;
//    @DateTimeFormat(pattern = Constants.Y)
//    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(pattern = Constants.YH, timezone = Constants.TIMEZONE)
    private Date createTime;
    
    /** 前端 */
    @JsonSerialize(using = FlagSerializer.class)
    public Boolean getValueDesc() {
        return this.value;
    }
}
