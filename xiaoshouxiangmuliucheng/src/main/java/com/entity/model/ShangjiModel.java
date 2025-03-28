package com.entity.model;

import com.entity.ShangjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商机
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShangjiModel implements Serializable {
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
     * 商机编号
     */
    private String shangjiUuidNumber;


    /**
     * 商机标题
     */
    private String shangjiName;


    /**
     * 商机发现地址
     */
    private String shangjiAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shangjiTime;


    /**
     * 商机等级
     */
    private Integer shangjiDengjiTypes;


    /**
     * 商机类型
     */
    private Integer shangjiTypes;


    /**
     * 附件
     */
    private String shangjiFile;


    /**
     * 商机内容
     */
    private String shangjiContent;


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
	 * 获取：商机编号
	 */
    public String getShangjiUuidNumber() {
        return shangjiUuidNumber;
    }


    /**
	 * 设置：商机编号
	 */
    public void setShangjiUuidNumber(String shangjiUuidNumber) {
        this.shangjiUuidNumber = shangjiUuidNumber;
    }
    /**
	 * 获取：商机标题
	 */
    public String getShangjiName() {
        return shangjiName;
    }


    /**
	 * 设置：商机标题
	 */
    public void setShangjiName(String shangjiName) {
        this.shangjiName = shangjiName;
    }
    /**
	 * 获取：商机发现地址
	 */
    public String getShangjiAddress() {
        return shangjiAddress;
    }


    /**
	 * 设置：商机发现地址
	 */
    public void setShangjiAddress(String shangjiAddress) {
        this.shangjiAddress = shangjiAddress;
    }
    /**
	 * 获取：发现时间
	 */
    public Date getShangjiTime() {
        return shangjiTime;
    }


    /**
	 * 设置：发现时间
	 */
    public void setShangjiTime(Date shangjiTime) {
        this.shangjiTime = shangjiTime;
    }
    /**
	 * 获取：商机等级
	 */
    public Integer getShangjiDengjiTypes() {
        return shangjiDengjiTypes;
    }


    /**
	 * 设置：商机等级
	 */
    public void setShangjiDengjiTypes(Integer shangjiDengjiTypes) {
        this.shangjiDengjiTypes = shangjiDengjiTypes;
    }
    /**
	 * 获取：商机类型
	 */
    public Integer getShangjiTypes() {
        return shangjiTypes;
    }


    /**
	 * 设置：商机类型
	 */
    public void setShangjiTypes(Integer shangjiTypes) {
        this.shangjiTypes = shangjiTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getShangjiFile() {
        return shangjiFile;
    }


    /**
	 * 设置：附件
	 */
    public void setShangjiFile(String shangjiFile) {
        this.shangjiFile = shangjiFile;
    }
    /**
	 * 获取：商机内容
	 */
    public String getShangjiContent() {
        return shangjiContent;
    }


    /**
	 * 设置：商机内容
	 */
    public void setShangjiContent(String shangjiContent) {
        this.shangjiContent = shangjiContent;
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
