package com.entity.model;

import com.entity.ZhaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 招标
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhaobiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 企业
     */
    private Integer qiyeId;


    /**
     * 招标编号
     */
    private String zhaobiaoUuidNumber;


    /**
     * 招标标题
     */
    private String zhaobiaoName;


    /**
     * 招标地点
     */
    private String zhaobiaoAddress;


    /**
     * 招标时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhaobiaoTime;


    /**
     * 招标类型
     */
    private Integer zhaobiaoTypes;


    /**
     * 附件
     */
    private String zhaobiaoFile;


    /**
     * 招标介绍
     */
    private String zhaobiaoContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：企业
	 */
    public Integer getQiyeId() {
        return qiyeId;
    }


    /**
	 * 设置：企业
	 */
    public void setQiyeId(Integer qiyeId) {
        this.qiyeId = qiyeId;
    }
    /**
	 * 获取：招标编号
	 */
    public String getZhaobiaoUuidNumber() {
        return zhaobiaoUuidNumber;
    }


    /**
	 * 设置：招标编号
	 */
    public void setZhaobiaoUuidNumber(String zhaobiaoUuidNumber) {
        this.zhaobiaoUuidNumber = zhaobiaoUuidNumber;
    }
    /**
	 * 获取：招标标题
	 */
    public String getZhaobiaoName() {
        return zhaobiaoName;
    }


    /**
	 * 设置：招标标题
	 */
    public void setZhaobiaoName(String zhaobiaoName) {
        this.zhaobiaoName = zhaobiaoName;
    }
    /**
	 * 获取：招标地点
	 */
    public String getZhaobiaoAddress() {
        return zhaobiaoAddress;
    }


    /**
	 * 设置：招标地点
	 */
    public void setZhaobiaoAddress(String zhaobiaoAddress) {
        this.zhaobiaoAddress = zhaobiaoAddress;
    }
    /**
	 * 获取：招标时间
	 */
    public Date getZhaobiaoTime() {
        return zhaobiaoTime;
    }


    /**
	 * 设置：招标时间
	 */
    public void setZhaobiaoTime(Date zhaobiaoTime) {
        this.zhaobiaoTime = zhaobiaoTime;
    }
    /**
	 * 获取：招标类型
	 */
    public Integer getZhaobiaoTypes() {
        return zhaobiaoTypes;
    }


    /**
	 * 设置：招标类型
	 */
    public void setZhaobiaoTypes(Integer zhaobiaoTypes) {
        this.zhaobiaoTypes = zhaobiaoTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getZhaobiaoFile() {
        return zhaobiaoFile;
    }


    /**
	 * 设置：附件
	 */
    public void setZhaobiaoFile(String zhaobiaoFile) {
        this.zhaobiaoFile = zhaobiaoFile;
    }
    /**
	 * 获取：招标介绍
	 */
    public String getZhaobiaoContent() {
        return zhaobiaoContent;
    }


    /**
	 * 设置：招标介绍
	 */
    public void setZhaobiaoContent(String zhaobiaoContent) {
        this.zhaobiaoContent = zhaobiaoContent;
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
