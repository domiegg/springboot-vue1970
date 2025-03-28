package com.entity.model;

import com.entity.LixiangPingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目评审
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LixiangPingshenModel implements Serializable {
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
     * 项目
     */
    private Integer lixiangId;


    /**
     * 项目评审编号
     */
    private String lixiangPingshenUuidNumber;


    /**
     * 项目评审标题
     */
    private String lixiangPingshenName;


    /**
     * 项目评审类型
     */
    private Integer lixiangPingshenTypes;


    /**
     * 评审附件
     */
    private String lixiangPingshenFile;


    /**
     * 项目评审报告
     */
    private String lixiangPingshenContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 项目评审状态
     */
    private Integer lixiangPingshenYesnoTypes;


    /**
     * 审核意见
     */
    private String lixiangPingshenYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lixiangPingshenShenheTime;


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
	 * 获取：项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }


    /**
	 * 设置：项目
	 */
    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
    }
    /**
	 * 获取：项目评审编号
	 */
    public String getLixiangPingshenUuidNumber() {
        return lixiangPingshenUuidNumber;
    }


    /**
	 * 设置：项目评审编号
	 */
    public void setLixiangPingshenUuidNumber(String lixiangPingshenUuidNumber) {
        this.lixiangPingshenUuidNumber = lixiangPingshenUuidNumber;
    }
    /**
	 * 获取：项目评审标题
	 */
    public String getLixiangPingshenName() {
        return lixiangPingshenName;
    }


    /**
	 * 设置：项目评审标题
	 */
    public void setLixiangPingshenName(String lixiangPingshenName) {
        this.lixiangPingshenName = lixiangPingshenName;
    }
    /**
	 * 获取：项目评审类型
	 */
    public Integer getLixiangPingshenTypes() {
        return lixiangPingshenTypes;
    }


    /**
	 * 设置：项目评审类型
	 */
    public void setLixiangPingshenTypes(Integer lixiangPingshenTypes) {
        this.lixiangPingshenTypes = lixiangPingshenTypes;
    }
    /**
	 * 获取：评审附件
	 */
    public String getLixiangPingshenFile() {
        return lixiangPingshenFile;
    }


    /**
	 * 设置：评审附件
	 */
    public void setLixiangPingshenFile(String lixiangPingshenFile) {
        this.lixiangPingshenFile = lixiangPingshenFile;
    }
    /**
	 * 获取：项目评审报告
	 */
    public String getLixiangPingshenContent() {
        return lixiangPingshenContent;
    }


    /**
	 * 设置：项目评审报告
	 */
    public void setLixiangPingshenContent(String lixiangPingshenContent) {
        this.lixiangPingshenContent = lixiangPingshenContent;
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
	 * 获取：项目评审状态
	 */
    public Integer getLixiangPingshenYesnoTypes() {
        return lixiangPingshenYesnoTypes;
    }


    /**
	 * 设置：项目评审状态
	 */
    public void setLixiangPingshenYesnoTypes(Integer lixiangPingshenYesnoTypes) {
        this.lixiangPingshenYesnoTypes = lixiangPingshenYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLixiangPingshenYesnoText() {
        return lixiangPingshenYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setLixiangPingshenYesnoText(String lixiangPingshenYesnoText) {
        this.lixiangPingshenYesnoText = lixiangPingshenYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLixiangPingshenShenheTime() {
        return lixiangPingshenShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setLixiangPingshenShenheTime(Date lixiangPingshenShenheTime) {
        this.lixiangPingshenShenheTime = lixiangPingshenShenheTime;
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
