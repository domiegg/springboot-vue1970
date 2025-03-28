package com.entity.model;

import com.entity.LixiangyanshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目验收
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LixiangyanshouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 立项项目
     */
    private Integer lixiangId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 项目验收编号
     */
    private String lixiangyanshouUuidNumber;


    /**
     * 验收标题
     */
    private String lixiangyanshouName;


    /**
     * 项目验收附件
     */
    private String lixiangyanshouFile;


    /**
     * 验收地点
     */
    private String lixiangyanshouAddress;


    /**
     * 验收时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lixiangyanshouTime;


    /**
     * 验收内容
     */
    private String lixiangyanshouContent;


    /**
     * 验收结果
     */
    private String lixiangyanshouJieguo;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 审核状态
     */
    private Integer lixiangyanshouYesnoTypes;


    /**
     * 审核意见
     */
    private String lixiangyanshouYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lixiangyanshouShenheTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：立项项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }


    /**
	 * 设置：立项项目
	 */
    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
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
	 * 获取：项目验收编号
	 */
    public String getLixiangyanshouUuidNumber() {
        return lixiangyanshouUuidNumber;
    }


    /**
	 * 设置：项目验收编号
	 */
    public void setLixiangyanshouUuidNumber(String lixiangyanshouUuidNumber) {
        this.lixiangyanshouUuidNumber = lixiangyanshouUuidNumber;
    }
    /**
	 * 获取：验收标题
	 */
    public String getLixiangyanshouName() {
        return lixiangyanshouName;
    }


    /**
	 * 设置：验收标题
	 */
    public void setLixiangyanshouName(String lixiangyanshouName) {
        this.lixiangyanshouName = lixiangyanshouName;
    }
    /**
	 * 获取：项目验收附件
	 */
    public String getLixiangyanshouFile() {
        return lixiangyanshouFile;
    }


    /**
	 * 设置：项目验收附件
	 */
    public void setLixiangyanshouFile(String lixiangyanshouFile) {
        this.lixiangyanshouFile = lixiangyanshouFile;
    }
    /**
	 * 获取：验收地点
	 */
    public String getLixiangyanshouAddress() {
        return lixiangyanshouAddress;
    }


    /**
	 * 设置：验收地点
	 */
    public void setLixiangyanshouAddress(String lixiangyanshouAddress) {
        this.lixiangyanshouAddress = lixiangyanshouAddress;
    }
    /**
	 * 获取：验收时间
	 */
    public Date getLixiangyanshouTime() {
        return lixiangyanshouTime;
    }


    /**
	 * 设置：验收时间
	 */
    public void setLixiangyanshouTime(Date lixiangyanshouTime) {
        this.lixiangyanshouTime = lixiangyanshouTime;
    }
    /**
	 * 获取：验收内容
	 */
    public String getLixiangyanshouContent() {
        return lixiangyanshouContent;
    }


    /**
	 * 设置：验收内容
	 */
    public void setLixiangyanshouContent(String lixiangyanshouContent) {
        this.lixiangyanshouContent = lixiangyanshouContent;
    }
    /**
	 * 获取：验收结果
	 */
    public String getLixiangyanshouJieguo() {
        return lixiangyanshouJieguo;
    }


    /**
	 * 设置：验收结果
	 */
    public void setLixiangyanshouJieguo(String lixiangyanshouJieguo) {
        this.lixiangyanshouJieguo = lixiangyanshouJieguo;
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
	 * 获取：审核状态
	 */
    public Integer getLixiangyanshouYesnoTypes() {
        return lixiangyanshouYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setLixiangyanshouYesnoTypes(Integer lixiangyanshouYesnoTypes) {
        this.lixiangyanshouYesnoTypes = lixiangyanshouYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangyanshouYesnoText() {
        return lixiangyanshouYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setLixiangyanshouYesnoText(String lixiangyanshouYesnoText) {
        this.lixiangyanshouYesnoText = lixiangyanshouYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangyanshouShenheTime() {
        return lixiangyanshouShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setLixiangyanshouShenheTime(Date lixiangyanshouShenheTime) {
        this.lixiangyanshouShenheTime = lixiangyanshouShenheTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
