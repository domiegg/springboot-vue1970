package com.entity.model;

import com.entity.ZhaobiaoToubiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 投标
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaobiaoToubiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 招标
     */
    private Integer zhaobiaoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 投标编号
     */
    private String zhaobiaoToubiaoUuidNumber;


    /**
     * 投标文件
     */
    private String zhaobiaoToubiaoFile;


    /**
     * 投标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhaobiaoToubiaoTime;


    /**
     * 投标备注
     */
    private String zhaobiaoToubiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 投标状态
     */
    private Integer zhaobiaoToubiaoYesnoTypes;


    /**
     * 投标评分
     */
    private Double zhaobiaoToubiaoPingfen;


    /**
     * 投标回复
     */
    private String zhaobiaoToubiaoYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhaobiaoToubiaoShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：招标
	 */
    public Integer getZhaobiaoId() {
        return zhaobiaoId;
    }


    /**
	 * 设置：招标
	 */
    public void setZhaobiaoId(Integer zhaobiaoId) {
        this.zhaobiaoId = zhaobiaoId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：投标编号
	 */
    public String getZhaobiaoToubiaoUuidNumber() {
        return zhaobiaoToubiaoUuidNumber;
    }


    /**
	 * 设置：投标编号
	 */
    public void setZhaobiaoToubiaoUuidNumber(String zhaobiaoToubiaoUuidNumber) {
        this.zhaobiaoToubiaoUuidNumber = zhaobiaoToubiaoUuidNumber;
    }
    /**
	 * 获取：投标文件
	 */
    public String getZhaobiaoToubiaoFile() {
        return zhaobiaoToubiaoFile;
    }


    /**
	 * 设置：投标文件
	 */
    public void setZhaobiaoToubiaoFile(String zhaobiaoToubiaoFile) {
        this.zhaobiaoToubiaoFile = zhaobiaoToubiaoFile;
    }
    /**
	 * 获取：投标时间
	 */
    public Date getZhaobiaoToubiaoTime() {
        return zhaobiaoToubiaoTime;
    }


    /**
	 * 设置：投标时间
	 */
    public void setZhaobiaoToubiaoTime(Date zhaobiaoToubiaoTime) {
        this.zhaobiaoToubiaoTime = zhaobiaoToubiaoTime;
    }
    /**
	 * 获取：投标备注
	 */
    public String getZhaobiaoToubiaoContent() {
        return zhaobiaoToubiaoContent;
    }


    /**
	 * 设置：投标备注
	 */
    public void setZhaobiaoToubiaoContent(String zhaobiaoToubiaoContent) {
        this.zhaobiaoToubiaoContent = zhaobiaoToubiaoContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：投标状态
	 */
    public Integer getZhaobiaoToubiaoYesnoTypes() {
        return zhaobiaoToubiaoYesnoTypes;
    }


    /**
	 * 设置：投标状态
	 */
    public void setZhaobiaoToubiaoYesnoTypes(Integer zhaobiaoToubiaoYesnoTypes) {
        this.zhaobiaoToubiaoYesnoTypes = zhaobiaoToubiaoYesnoTypes;
    }
    /**
	 * 获取：投标评分
	 */
    public Double getZhaobiaoToubiaoPingfen() {
        return zhaobiaoToubiaoPingfen;
    }


    /**
	 * 设置：投标评分
	 */
    public void setZhaobiaoToubiaoPingfen(Double zhaobiaoToubiaoPingfen) {
        this.zhaobiaoToubiaoPingfen = zhaobiaoToubiaoPingfen;
    }
    /**
	 * 获取：投标回复
	 */
    public String getZhaobiaoToubiaoYesnoText() {
        return zhaobiaoToubiaoYesnoText;
    }


    /**
	 * 设置：投标回复
	 */
    public void setZhaobiaoToubiaoYesnoText(String zhaobiaoToubiaoYesnoText) {
        this.zhaobiaoToubiaoYesnoText = zhaobiaoToubiaoYesnoText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getZhaobiaoToubiaoShenheTime() {
        return zhaobiaoToubiaoShenheTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setZhaobiaoToubiaoShenheTime(Date zhaobiaoToubiaoShenheTime) {
        this.zhaobiaoToubiaoShenheTime = zhaobiaoToubiaoShenheTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
