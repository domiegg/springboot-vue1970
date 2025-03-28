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
 * 商机转化
 *
 * @author 
 * @email
 */
@TableName("shangji_zhuanhua")
public class ShangjiZhuanhuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShangjiZhuanhuaEntity() {

	}

	public ShangjiZhuanhuaEntity(T t) {
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
     * 商机
     */
    @ColumnInfo(comment="商机",type="int(11)")
    @TableField(value = "shangji_id")

    private Integer shangjiId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 商机转化编号
     */
    @ColumnInfo(comment="商机转化编号",type="varchar(200)")
    @TableField(value = "shangji_zhuanhua_uuid_number")

    private String shangjiZhuanhuaUuidNumber;


    /**
     * 商机转化标题
     */
    @ColumnInfo(comment="商机转化标题",type="varchar(200)")
    @TableField(value = "shangji_zhuanhua_name")

    private String shangjiZhuanhuaName;


    /**
     * 转化时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="转化时间",type="timestamp")
    @TableField(value = "shangji_zhuanhua_time")

    private Date shangjiZhuanhuaTime;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "shangji_zhuanhua_file")

    private String shangjiZhuanhuaFile;


    /**
     * 商机转化类型
     */
    @ColumnInfo(comment="商机转化类型",type="int(11)")
    @TableField(value = "shangji_zhuanhua_types")

    private Integer shangjiZhuanhuaTypes;


    /**
     * 商机转化内容
     */
    @ColumnInfo(comment="商机转化内容",type="longtext")
    @TableField(value = "shangji_zhuanhua_content")

    private String shangjiZhuanhuaContent;


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
        return "ShangjiZhuanhua{" +
            ", id=" + id +
            ", shangjiId=" + shangjiId +
            ", yonghuId=" + yonghuId +
            ", shangjiZhuanhuaUuidNumber=" + shangjiZhuanhuaUuidNumber +
            ", shangjiZhuanhuaName=" + shangjiZhuanhuaName +
            ", shangjiZhuanhuaTime=" + DateUtil.convertString(shangjiZhuanhuaTime,"yyyy-MM-dd") +
            ", shangjiZhuanhuaFile=" + shangjiZhuanhuaFile +
            ", shangjiZhuanhuaTypes=" + shangjiZhuanhuaTypes +
            ", shangjiZhuanhuaContent=" + shangjiZhuanhuaContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
