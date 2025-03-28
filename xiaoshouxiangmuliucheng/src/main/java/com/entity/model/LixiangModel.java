package com.entity.model;

import com.entity.LixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目立项
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LixiangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 立项编号
     */
    private String lixiangUuidNumber;


    /**
     * 项目名称
     */
    private String lixiangName;


    /**
     * 项目类型
     */
    private Integer lixiangTypes;


    /**
     * 项目地址
     */
    private String lixiangAddress;


    /**
     * 附件
     */
    private String lixiangFile;


    /**
     * 立项内容
     */
    private String lixiangContent;


    /**
     * 立项时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 立项状态
     */
    private Integer lixiangYesnoTypes;


    /**
     * 审核意见
     */
    private String lixiangYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lixiangShenheTime;


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
	 * 获取：立项编号
	 */
    public String getLixiangUuidNumber() {
        return lixiangUuidNumber;
    }


    /**
	 * 设置：立项编号
	 */
    public void setLixiangUuidNumber(String lixiangUuidNumber) {
        this.lixiangUuidNumber = lixiangUuidNumber;
    }
    /**
	 * 获取：项目名称
	 */
    public String getLixiangName() {
        return lixiangName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setLixiangName(String lixiangName) {
        this.lixiangName = lixiangName;
    }
    /**
	 * 获取：项目类型
	 */
    public Integer getLixiangTypes() {
        return lixiangTypes;
    }


    /**
	 * 设置：项目类型
	 */
    public void setLixiangTypes(Integer lixiangTypes) {
        this.lixiangTypes = lixiangTypes;
    }
    /**
	 * 获取：项目地址
	 */
    public String getLixiangAddress() {
        return lixiangAddress;
    }


    /**
	 * 设置：项目地址
	 */
    public void setLixiangAddress(String lixiangAddress) {
        this.lixiangAddress = lixiangAddress;
    }
    /**
	 * 获取：附件
	 */
    public String getLixiangFile() {
        return lixiangFile;
    }


    /**
	 * 设置：附件
	 */
    public void setLixiangFile(String lixiangFile) {
        this.lixiangFile = lixiangFile;
    }
    /**
	 * 获取：立项内容
	 */
    public String getLixiangContent() {
        return lixiangContent;
    }


    /**
	 * 设置：立项内容
	 */
    public void setLixiangContent(String lixiangContent) {
        this.lixiangContent = lixiangContent;
    }
    /**
	 * 获取：立项时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：立项时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：立项状态
	 */
    public Integer getLixiangYesnoTypes() {
        return lixiangYesnoTypes;
    }


    /**
	 * 设置：立项状态
	 */
    public void setLixiangYesnoTypes(Integer lixiangYesnoTypes) {
        this.lixiangYesnoTypes = lixiangYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangYesnoText() {
        return lixiangYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setLixiangYesnoText(String lixiangYesnoText) {
        this.lixiangYesnoText = lixiangYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangShenheTime() {
        return lixiangShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setLixiangShenheTime(Date lixiangShenheTime) {
        this.lixiangShenheTime = lixiangShenheTime;
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
