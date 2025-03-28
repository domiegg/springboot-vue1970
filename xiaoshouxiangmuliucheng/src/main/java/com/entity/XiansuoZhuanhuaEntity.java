package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 线索转化
 *
 * @author 
 * @email
 */
@TableName("xiansuo_zhuanhua")
public class XiansuoZhuanhuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiansuoZhuanhuaEntity() {

	}

	public XiansuoZhuanhuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 线索
     */
    @ColumnInfo(comment="线索",type="int(11)")
    @TableField(value = "xiansuo_id")

    private Integer xiansuoId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 线索转化编号
     */
    @ColumnInfo(comment="线索转化编号",type="varchar(200)")
    @TableField(value = "xiansuo_zhuanhua_uuid_number")

    private String xiansuoZhuanhuaUuidNumber;


    /**
     * 线索转化标题
     */
    @ColumnInfo(comment="线索转化标题",type="varchar(200)")
    @TableField(value = "xiansuo_zhuanhua_name")

    private String xiansuoZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="转化时间",type="timestamp")
    @TableField(value = "xiansuo_zhuanhua_time")

    private Date xiansuoZhuanhuaTime;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "xiansuo_zhuanhua_file")

    private String xiansuoZhuanhuaFile;


    /**
     * 线索转化类型
     */
    @ColumnInfo(comment="线索转化类型",type="int(11)")
    @TableField(value = "xiansuo_zhuanhua_types")

    private Integer xiansuoZhuanhuaTypes;


    /**
     * 线索转化内容
     */
    @ColumnInfo(comment="线索转化内容",type="longtext")
    @TableField(value = "xiansuo_zhuanhua_content")

    private String xiansuoZhuanhuaContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "XiansuoZhuanhua{" +
            ", id=" + id +
            ", xiansuoId=" + xiansuoId +
            ", yonghuId=" + yonghuId +
            ", xiansuoZhuanhuaUuidNumber=" + xiansuoZhuanhuaUuidNumber +
            ", xiansuoZhuanhuaName=" + xiansuoZhuanhuaName +
            ", xiansuoZhuanhuaTime=" + DateUtil.convertString(xiansuoZhuanhuaTime,"yyyy-MM-dd") +
            ", xiansuoZhuanhuaFile=" + xiansuoZhuanhuaFile +
            ", xiansuoZhuanhuaTypes=" + xiansuoZhuanhuaTypes +
            ", xiansuoZhuanhuaContent=" + xiansuoZhuanhuaContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
