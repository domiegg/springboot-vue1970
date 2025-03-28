package com.entity.model;

import com.entity.XiansuoZhuanhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 线索转化
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiansuoZhuanhuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 线索
     */
    private Integer xiansuoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 线索转化编号
     */
    private String xiansuoZhuanhuaUuidNumber;


    /**
     * 线索转化标题
     */
    private String xiansuoZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xiansuoZhuanhuaTime;


    /**
     * 附件
     */
    private String xiansuoZhuanhuaFile;


    /**
     * 线索转化类型
     */
    private Integer xiansuoZhuanhuaTypes;


    /**
     * 线索转化内容
     */
    private String xiansuoZhuanhuaContent;


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
	 * 获取：线索
	 */
    public Integer getXiansuoId() {
        return xiansuoId;
    }


    /**
	 * 设置：线索
	 */
    public void setXiansuoId(Integer xiansuoId) {
        this.xiansuoId = xiansuoId;
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
	 * 获取：线索转化编号
	 */
    public String getXiansuoZhuanhuaUuidNumber() {
        return xiansuoZhuanhuaUuidNumber;
    }


    /**
	 * 设置：线索转化编号
	 */
    public void setXiansuoZhuanhuaUuidNumber(String xiansuoZhuanhuaUuidNumber) {
        this.xiansuoZhuanhuaUuidNumber = xiansuoZhuanhuaUuidNumber;
    }
    /**
	 * 获取：线索转化标题
	 */
    public String getXiansuoZhuanhuaName() {
        return xiansuoZhuanhuaName;
    }


    /**
	 * 设置：线索转化标题
	 */
    public void setXiansuoZhuanhuaName(String xiansuoZhuanhuaName) {
        this.xiansuoZhuanhuaName = xiansuoZhuanhuaName;
    }
    /**
	 * 获取：转化时间
	 */
    public Date getXiansuoZhuanhuaTime() {
        return xiansuoZhuanhuaTime;
    }


    /**
	 * 设置：转化时间
	 */
    public void setXiansuoZhuanhuaTime(Date xiansuoZhuanhuaTime) {
        this.xiansuoZhuanhuaTime = xiansuoZhuanhuaTime;
    }
    /**
	 * 获取：附件
	 */
    public String getXiansuoZhuanhuaFile() {
        return xiansuoZhuanhuaFile;
    }


    /**
	 * 设置：附件
	 */
    public void setXiansuoZhuanhuaFile(String xiansuoZhuanhuaFile) {
        this.xiansuoZhuanhuaFile = xiansuoZhuanhuaFile;
    }
    /**
	 * 获取：线索转化类型
	 */
    public Integer getXiansuoZhuanhuaTypes() {
        return xiansuoZhuanhuaTypes;
    }


    /**
	 * 设置：线索转化类型
	 */
    public void setXiansuoZhuanhuaTypes(Integer xiansuoZhuanhuaTypes) {
        this.xiansuoZhuanhuaTypes = xiansuoZhuanhuaTypes;
    }
    /**
	 * 获取：线索转化内容
	 */
    public String getXiansuoZhuanhuaContent() {
        return xiansuoZhuanhuaContent;
    }


    /**
	 * 设置：线索转化内容
	 */
    public void setXiansuoZhuanhuaContent(String xiansuoZhuanhuaContent) {
        this.xiansuoZhuanhuaContent = xiansuoZhuanhuaContent;
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
