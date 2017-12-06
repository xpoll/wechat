package cn.blmdz.wechat.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import cn.blmdz.wechat.base.Constants;
import lombok.Data;

/**
 * 机器人
 * @author yongzongyang
 * @date 2017年12月4日
 */
@Data
public class XpollRebot {

    private Long id;
    private Integer type;
    private Integer groups;
    private String link;
    @JsonIgnore
    private String remark;
    @JsonIgnore
    private Boolean status;
    @JsonFormat(pattern = Constants.YH, timezone = Constants.TIMEZONE)
    private Date updateTime;
    @JsonFormat(pattern = Constants.YH, timezone = Constants.TIMEZONE)
    private Date createTime;
}
