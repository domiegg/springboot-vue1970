package com.entity.model;

import com.entity.LixiangGenjinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目跟进
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LixiangGenjinModel implements Serializable {
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
     * 项目跟进编号
     */
    private String lixiangGenjinUuidNumber;


    /**
     * 跟进标题
     */
    private String lixiangGenjinName;


    /**
     * 项目跟进附件
     */
    private String lixiangGenjinFile;


    /**
     * 跟进地点
     */
    private String lixiangGenjinAddress;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lixiangGenjinTime;


    /**
     * 跟进内容
     */
    private String lixiangGenjinContent;


    /**
     * 跟定结果
     */
    private String lixiangGenjinJieguo;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：项目跟进编号
	 */
    public String getLixiangGenjinUuidNumber() {
        return lixiangGenjinUuidNumber;
    }


    /**
	 * 设置：项目跟进编号
	 */
    public void setLixiangGenjinUuidNumber(String lixiangGenjinUuidNumber) {
        this.lixiangGenjinUuidNumber = lixiangGenjinUuidNumber;
    }
    /**
	 * 获取：跟进标题
	 */
    public String getLixiangGenjinName() {
        return lixiangGenjinName;
    }


    /**
	 * 设置：跟进标题
	 */
    public void setLixiangGenjinName(String lixiangGenjinName) {
        this.lixiangGenjinName = lixiangGenjinName;
    }
    /**
	 * 获取：项目跟进附件
	 */
    public String getLixiangGenjinFile() {
        return lixiangGenjinFile;
    }


    /**
	 * 设置：项目跟进附件
	 */
    public void setLixiangGenjinFile(String lixiangGenjinFile) {
        this.lixiangGenjinFile = lixiangGenjinFile;
    }
    /**
	 * 获取：跟进地点
	 */
    public String getLixiangGenjinAddress() {
        return lixiangGenjinAddress;
    }


    /**
	 * 设置：跟进地点
	 */
    public void setLixiangGenjinAddress(String lixiangGenjinAddress) {
        this.lixiangGenjinAddress = lixiangGenjinAddress;
    }
    /**
	 * 获取：跟进时间
	 */
    public Date getLixiangGenjinTime() {
        return lixiangGenjinTime;
    }


    /**
	 * 设置：跟进时间
	 */
    public void setLixiangGenjinTime(Date lixiangGenjinTime) {
        this.lixiangGenjinTime = lixiangGenjinTime;
    }
    /**
	 * 获取：跟进内容
	 */
    public String getLixiangGenjinContent() {
        return lixiangGenjinContent;
    }


    /**
	 * 设置：跟进内容
	 */
    public void setLixiangGenjinContent(String lixiangGenjinContent) {
        this.lixiangGenjinContent = lixiangGenjinContent;
    }
    /**
	 * 获取：跟定结果
	 */
    public String getLixiangGenjinJieguo() {
        return lixiangGenjinJieguo;
    }


    /**
	 * 设置：跟定结果
	 */
    public void setLixiangGenjinJieguo(String lixiangGenjinJieguo) {
        this.lixiangGenjinJieguo = lixiangGenjinJieguo;
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
