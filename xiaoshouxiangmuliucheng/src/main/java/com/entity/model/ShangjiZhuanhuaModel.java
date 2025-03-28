package com.entity.model;

import com.entity.ShangjiZhuanhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商机转化
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangjiZhuanhuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商机
     */
    private Integer shangjiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 商机转化编号
     */
    private String shangjiZhuanhuaUuidNumber;


    /**
     * 商机转化标题
     */
    private String shangjiZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shangjiZhuanhuaTime;


    /**
     * 附件
     */
    private String shangjiZhuanhuaFile;


    /**
     * 商机转化类型
     */
    private Integer shangjiZhuanhuaTypes;


    /**
     * 商机转化内容
     */
    private String shangjiZhuanhuaContent;


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
	 * 获取：商机
	 */
    public Integer getShangjiId() {
        return shangjiId;
    }


    /**
	 * 设置：商机
	 */
    public void setShangjiId(Integer shangjiId) {
        this.shangjiId = shangjiId;
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
	 * 获取：商机转化编号
	 */
    public String getShangjiZhuanhuaUuidNumber() {
        return shangjiZhuanhuaUuidNumber;
    }


    /**
	 * 设置：商机转化编号
	 */
    public void setShangjiZhuanhuaUuidNumber(String shangjiZhuanhuaUuidNumber) {
        this.shangjiZhuanhuaUuidNumber = shangjiZhuanhuaUuidNumber;
    }
    /**
	 * 获取：商机转化标题
	 */
    public String getShangjiZhuanhuaName() {
        return shangjiZhuanhuaName;
    }


    /**
	 * 设置：商机转化标题
	 */
    public void setShangjiZhuanhuaName(String shangjiZhuanhuaName) {
        this.shangjiZhuanhuaName = shangjiZhuanhuaName;
    }
    /**
	 * 获取：转化时间
	 */
    public Date getShangjiZhuanhuaTime() {
        return shangjiZhuanhuaTime;
    }


    /**
	 * 设置：转化时间
	 */
    public void setShangjiZhuanhuaTime(Date shangjiZhuanhuaTime) {
        this.shangjiZhuanhuaTime = shangjiZhuanhuaTime;
    }
    /**
	 * 获取：附件
	 */
    public String getShangjiZhuanhuaFile() {
        return shangjiZhuanhuaFile;
    }


    /**
	 * 设置：附件
	 */
    public void setShangjiZhuanhuaFile(String shangjiZhuanhuaFile) {
        this.shangjiZhuanhuaFile = shangjiZhuanhuaFile;
    }
    /**
	 * 获取：商机转化类型
	 */
    public Integer getShangjiZhuanhuaTypes() {
        return shangjiZhuanhuaTypes;
    }


    /**
	 * 设置：商机转化类型
	 */
    public void setShangjiZhuanhuaTypes(Integer shangjiZhuanhuaTypes) {
        this.shangjiZhuanhuaTypes = shangjiZhuanhuaTypes;
    }
    /**
	 * 获取：商机转化内容
	 */
    public String getShangjiZhuanhuaContent() {
        return shangjiZhuanhuaContent;
    }


    /**
	 * 设置：商机转化内容
	 */
    public void setShangjiZhuanhuaContent(String shangjiZhuanhuaContent) {
        this.shangjiZhuanhuaContent = shangjiZhuanhuaContent;
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
