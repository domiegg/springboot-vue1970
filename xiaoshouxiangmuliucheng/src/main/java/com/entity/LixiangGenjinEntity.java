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
 * 项目跟进
 *
 * @author 
 * @email
 */
@TableName("lixiang_genjin")
public class LixiangGenjinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LixiangGenjinEntity() {

	}

	public LixiangGenjinEntity(T t) {
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
     * 立项项目
     */
    @ColumnInfo(comment="立项项目",type="int(11)")
    @TableField(value = "lixiang_id")

    private Integer lixiangId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 项目跟进编号
     */
    @ColumnInfo(comment="项目跟进编号",type="varchar(200)")
    @TableField(value = "lixiang_genjin_uuid_number")

    private String lixiangGenjinUuidNumber;


    /**
     * 跟进标题
     */
    @ColumnInfo(comment="跟进标题",type="varchar(200)")
    @TableField(value = "lixiang_genjin_name")

    private String lixiangGenjinName;


    /**
     * 项目跟进附件
     */
    @ColumnInfo(comment="项目跟进附件",type="varchar(200)")
    @TableField(value = "lixiang_genjin_file")

    private String lixiangGenjinFile;


    /**
     * 跟进地点
     */
    @ColumnInfo(comment="跟进地点",type="varchar(200)")
    @TableField(value = "lixiang_genjin_address")

    private String lixiangGenjinAddress;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="跟进时间",type="timestamp")
    @TableField(value = "lixiang_genjin_time")

    private Date lixiangGenjinTime;


    /**
     * 跟进内容
     */
    @ColumnInfo(comment="跟进内容",type="longtext")
    @TableField(value = "lixiang_genjin_content")

    private String lixiangGenjinContent;


    /**
     * 跟定结果
     */
    @ColumnInfo(comment="跟定结果",type="varchar(200)")
    @TableField(value = "lixiang_genjin_jieguo")

    private String lixiangGenjinJieguo;


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
        return "LixiangGenjin{" +
            ", id=" + id +
            ", lixiangId=" + lixiangId +
            ", yonghuId=" + yonghuId +
            ", lixiangGenjinUuidNumber=" + lixiangGenjinUuidNumber +
            ", lixiangGenjinName=" + lixiangGenjinName +
            ", lixiangGenjinFile=" + lixiangGenjinFile +
            ", lixiangGenjinAddress=" + lixiangGenjinAddress +
            ", lixiangGenjinTime=" + DateUtil.convertString(lixiangGenjinTime,"yyyy-MM-dd") +
            ", lixiangGenjinContent=" + lixiangGenjinContent +
            ", lixiangGenjinJieguo=" + lixiangGenjinJieguo +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
