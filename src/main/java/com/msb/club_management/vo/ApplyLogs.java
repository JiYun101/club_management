package com.msb.club_management.vo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 数据实体类
 * 申请记录
 */
@TableName(value = "apply_logs")
public class ApplyLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录ID
     */
    @TableId(value = "id")
    private String id;

    /**
     * 处理状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 申请时间
     */
    @TableField(value = "create_time")
    private String createTime;

    /**
     * 申请社团
     */
    @TableField(value = "team_id")
    private String teamId;

    /**
     * 申请用户
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private String updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ApplyLogs{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", teamId='" + teamId + '\'' +
                ", userId='" + userId + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
