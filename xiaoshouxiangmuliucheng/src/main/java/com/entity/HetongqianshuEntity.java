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
 * 合同签署
 *
 * @author 
 * @email
 */
@TableName("hetongqianshu")
public class HetongqianshuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongqianshuEntity() {

	}

	public HetongqianshuEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 合同签署编号
     */
    @ColumnInfo(comment="合同签署编号",type="varchar(200)")
    @TableField(value = "hetongqianshu_uuid_number")

    private String hetongqianshuUuidNumber;


    /**
     * 甲方
     */
    @ColumnInfo(comment="甲方",type="varchar(200)")
    @TableField(value = "hetongqianshu_jiafang")

    private String hetongqianshuJiafang;


    /**
     * 甲方地址
     */
    @ColumnInfo(comment="甲方地址",type="varchar(200)")
    @TableField(value = "hetongqianshu_jiafang_address")

    private String hetongqianshuJiafangAddress;


    /**
     * 乙方
     */
    @ColumnInfo(comment="乙方",type="varchar(200)")
    @TableField(value = "hetongqianshu_yifang")

    private String hetongqianshuYifang;


    /**
     * 乙方地址
     */
    @ColumnInfo(comment="乙方地址",type="varchar(200)")
    @TableField(value = "hetongqianshu_yifang_address")

    private String hetongqianshuYifangAddress;


    /**
     * 合同文件
     */
    @ColumnInfo(comment="合同文件",type="varchar(200)")
    @TableField(value = "hetongqianshu_file")

    private String hetongqianshuFile;


    /**
     * 签署时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="签署时间",type="timestamp")
    @TableField(value = "hetongqianshu_time")

    private Date hetongqianshuTime;


    /**
     * 合同金额(万)
     */
    @ColumnInfo(comment="合同金额(万)",type="decimal(10,2)")
    @TableField(value = "hetongqianshu_jine")

    private Double hetongqianshuJine;


    /**
     * 违约金(万)
     */
    @ColumnInfo(comment="违约金(万)",type="decimal(10,2)")
    @TableField(value = "hetongqianshu_weiyue_jine")

    private Double hetongqianshuWeiyueJine;


    /**
     * 合同签署备注
     */
    @ColumnInfo(comment="合同签署备注",type="longtext")
    @TableField(value = "hetongqianshu_content")

    private String hetongqianshuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 审核状态
     */
    @ColumnInfo(comment="审核状态",type="int(11)")
    @TableField(value = "hetongqianshu_yesno_types")

    private Integer hetongqianshuYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "hetongqianshu_yesno_text")

    private String hetongqianshuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "hetongqianshu_shenhe_time")

    private Date hetongqianshuShenheTime;


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
	 * 获取：合同签署编号
	 */
    public String getHetongqianshuUuidNumber() {
        return hetongqianshuUuidNumber;
    }
    /**
	 * 设置：合同签署编号
	 */

    public void setHetongqianshuUuidNumber(String hetongqianshuUuidNumber) {
        this.hetongqianshuUuidNumber = hetongqianshuUuidNumber;
    }
    /**
	 * 获取：甲方
	 */
    public String getHetongqianshuJiafang() {
        return hetongqianshuJiafang;
    }
    /**
	 * 设置：甲方
	 */

    public void setHetongqianshuJiafang(String hetongqianshuJiafang) {
        this.hetongqianshuJiafang = hetongqianshuJiafang;
    }
    /**
	 * 获取：甲方地址
	 */
    public String getHetongqianshuJiafangAddress() {
        return hetongqianshuJiafangAddress;
    }
    /**
	 * 设置：甲方地址
	 */

    public void setHetongqianshuJiafangAddress(String hetongqianshuJiafangAddress) {
        this.hetongqianshuJiafangAddress = hetongqianshuJiafangAddress;
    }
    /**
	 * 获取：乙方
	 */
    public String getHetongqianshuYifang() {
        return hetongqianshuYifang;
    }
    /**
	 * 设置：乙方
	 */

    public void setHetongqianshuYifang(String hetongqianshuYifang) {
        this.hetongqianshuYifang = hetongqianshuYifang;
    }
    /**
	 * 获取：乙方地址
	 */
    public String getHetongqianshuYifangAddress() {
        return hetongqianshuYifangAddress;
    }
    /**
	 * 设置：乙方地址
	 */

    public void setHetongqianshuYifangAddress(String hetongqianshuYifangAddress) {
        this.hetongqianshuYifangAddress = hetongqianshuYifangAddress;
    }
    /**
	 * 获取：合同文件
	 */
    public String getHetongqianshuFile() {
        return hetongqianshuFile;
    }
    /**
	 * 设置：合同文件
	 */

    public void setHetongqianshuFile(String hetongqianshuFile) {
        this.hetongqianshuFile = hetongqianshuFile;
    }
    /**
	 * 获取：签署时间
	 */
    public Date getHetongqianshuTime() {
        return hetongqianshuTime;
    }
    /**
	 * 设置：签署时间
	 */

    public void setHetongqianshuTime(Date hetongqianshuTime) {
        this.hetongqianshuTime = hetongqianshuTime;
    }
    /**
	 * 获取：合同金额(万)
	 */
    public Double getHetongqianshuJine() {
        return hetongqianshuJine;
    }
    /**
	 * 设置：合同金额(万)
	 */

    public void setHetongqianshuJine(Double hetongqianshuJine) {
        this.hetongqianshuJine = hetongqianshuJine;
    }
    /**
	 * 获取：违约金(万)
	 */
    public Double getHetongqianshuWeiyueJine() {
        return hetongqianshuWeiyueJine;
    }
    /**
	 * 设置：违约金(万)
	 */

    public void setHetongqianshuWeiyueJine(Double hetongqianshuWeiyueJine) {
        this.hetongqianshuWeiyueJine = hetongqianshuWeiyueJine;
    }
    /**
	 * 获取：合同签署备注
	 */
    public String getHetongqianshuContent() {
        return hetongqianshuContent;
    }
    /**
	 * 设置：合同签署备注
	 */

    public void setHetongqianshuContent(String hetongqianshuContent) {
        this.hetongqianshuContent = hetongqianshuContent;
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
	 * 获取：审核状态
	 */
    public Integer getHetongqianshuYesnoTypes() {
        return hetongqianshuYesnoTypes;
    }
    /**
	 * 设置：审核状态
	 */

    public void setHetongqianshuYesnoTypes(Integer hetongqianshuYesnoTypes) {
        this.hetongqianshuYesnoTypes = hetongqianshuYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getHetongqianshuYesnoText() {
        return hetongqianshuYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setHetongqianshuYesnoText(String hetongqianshuYesnoText) {
        this.hetongqianshuYesnoText = hetongqianshuYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getHetongqianshuShenheTime() {
        return hetongqianshuShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setHetongqianshuShenheTime(Date hetongqianshuShenheTime) {
        this.hetongqianshuShenheTime = hetongqianshuShenheTime;
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
        return "Hetongqianshu{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", hetongqianshuUuidNumber=" + hetongqianshuUuidNumber +
            ", hetongqianshuJiafang=" + hetongqianshuJiafang +
            ", hetongqianshuJiafangAddress=" + hetongqianshuJiafangAddress +
            ", hetongqianshuYifang=" + hetongqianshuYifang +
            ", hetongqianshuYifangAddress=" + hetongqianshuYifangAddress +
            ", hetongqianshuFile=" + hetongqianshuFile +
            ", hetongqianshuTime=" + DateUtil.convertString(hetongqianshuTime,"yyyy-MM-dd") +
            ", hetongqianshuJine=" + hetongqianshuJine +
            ", hetongqianshuWeiyueJine=" + hetongqianshuWeiyueJine +
            ", hetongqianshuContent=" + hetongqianshuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", hetongqianshuYesnoTypes=" + hetongqianshuYesnoTypes +
            ", hetongqianshuYesnoText=" + hetongqianshuYesnoText +
            ", hetongqianshuShenheTime=" + DateUtil.convertString(hetongqianshuShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
