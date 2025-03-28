package com.entity.model;

import com.entity.XiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 线索
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiansuoModel implements Serializable {
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
     * 线索编号
     */
    private String xiansuoUuidNumber;


    /**
     * 线索标题
     */
    private String xiansuoName;


    /**
     * 线索发现地址
     */
    private String xiansuoAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiansuoTime;


    /**
     * 线索等级
     */
    private Integer xiansuoDengjiTypes;


    /**
     * 线索类型
     */
    private Integer xiansuoTypes;


    /**
     * 附件
     */
    private String xiansuoFile;


    /**
     * 线索内容
     */
    private String xiansuoContent;


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
	 * 获取：线索编号
	 */
    public String getXiansuoUuidNumber() {
        return xiansuoUuidNumber;
    }


    /**
	 * 设置：线索编号
	 */
    public void setXiansuoUuidNumber(String xiansuoUuidNumber) {
        this.xiansuoUuidNumber = xiansuoUuidNumber;
    }
    /**
	 * 获取：线索标题
	 */
    public String getXiansuoName() {
        return xiansuoName;
    }


    /**
	 * 设置：线索标题
	 */
    public void setXiansuoName(String xiansuoName) {
        this.xiansuoName = xiansuoName;
    }
    /**
	 * 获取：线索发现地址
	 */
    public String getXiansuoAddress() {
        return xiansuoAddress;
    }


    /**
	 * 设置：线索发现地址
	 */
    public void setXiansuoAddress(String xiansuoAddress) {
        this.xiansuoAddress = xiansuoAddress;
    }
    /**
	 * 获取：发现时间
	 */
    public Date getXiansuoTime() {
        return xiansuoTime;
    }


    /**
	 * 设置：发现时间
	 */
    public void setXiansuoTime(Date xiansuoTime) {
        this.xiansuoTime = xiansuoTime;
    }
    /**
	 * 获取：线索等级
	 */
    public Integer getXiansuoDengjiTypes() {
        return xiansuoDengjiTypes;
    }


    /**
	 * 设置：线索等级
	 */
    public void setXiansuoDengjiTypes(Integer xiansuoDengjiTypes) {
        this.xiansuoDengjiTypes = xiansuoDengjiTypes;
    }
    /**
	 * 获取：线索类型
	 */
    public Integer getXiansuoTypes() {
        return xiansuoTypes;
    }


    /**
	 * 设置：线索类型
	 */
    public void setXiansuoTypes(Integer xiansuoTypes) {
        this.xiansuoTypes = xiansuoTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getXiansuoFile() {
        return xiansuoFile;
    }


    /**
	 * 设置：附件
	 */
    public void setXiansuoFile(String xiansuoFile) {
        this.xiansuoFile = xiansuoFile;
    }
    /**
	 * 获取：线索内容
	 */
    public String getXiansuoContent() {
        return xiansuoContent;
    }


    /**
	 * 设置：线索内容
	 */
    public void setXiansuoContent(String xiansuoContent) {
        this.xiansuoContent = xiansuoContent;
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
