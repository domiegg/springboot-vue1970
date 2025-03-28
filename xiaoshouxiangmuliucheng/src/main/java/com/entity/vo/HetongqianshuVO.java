package com.entity.vo;

import com.entity.HetongqianshuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 合同签署
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hetongqianshu")
public class HetongqianshuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 合同签署编号
     */

    @TableField(value = "hetongqianshu_uuid_number")
    private String hetongqianshuUuidNumber;


    /**
     * 甲方
     */

    @TableField(value = "hetongqianshu_jiafang")
    private String hetongqianshuJiafang;


    /**
     * 甲方地址
     */

    @TableField(value = "hetongqianshu_jiafang_address")
    private String hetongqianshuJiafangAddress;


    /**
     * 乙方
     */

    @TableField(value = "hetongqianshu_yifang")
    private String hetongqianshuYifang;


    /**
     * 乙方地址
     */

    @TableField(value = "hetongqianshu_yifang_address")
    private String hetongqianshuYifangAddress;


    /**
     * 合同文件
     */

    @TableField(value = "hetongqianshu_file")
    private String hetongqianshuFile;


    /**
     * 签署时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "hetongqianshu_time")
    private Date hetongqianshuTime;


    /**
     * 合同金额(万)
     */

    @TableField(value = "hetongqianshu_jine")
    private Double hetongqianshuJine;


    /**
     * 违约金(万)
     */

    @TableField(value = "hetongqianshu_weiyue_jine")
    private Double hetongqianshuWeiyueJine;


    /**
     * 合同签署备注
     */

    @TableField(value = "hetongqianshu_content")
    private String hetongqianshuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 审核状态
     */

    @TableField(value = "hetongqianshu_yesno_types")
    private Integer hetongqianshuYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "hetongqianshu_yesno_text")
    private String hetongqianshuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "hetongqianshu_shenhe_time")
    private Date hetongqianshuShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：合同签署编号
	 */
    public String getHetongqianshuUuidNumber() {
        return hetongqianshuUuidNumber;
    }


    /**
	 * 获取：合同签署编号
	 */

    public void setHetongqianshuUuidNumber(String hetongqianshuUuidNumber) {
        this.hetongqianshuUuidNumber = hetongqianshuUuidNumber;
    }
    /**
	 * 设置：甲方
	 */
    public String getHetongqianshuJiafang() {
        return hetongqianshuJiafang;
    }


    /**
	 * 获取：甲方
	 */

    public void setHetongqianshuJiafang(String hetongqianshuJiafang) {
        this.hetongqianshuJiafang = hetongqianshuJiafang;
    }
    /**
	 * 设置：甲方地址
	 */
    public String getHetongqianshuJiafangAddress() {
        return hetongqianshuJiafangAddress;
    }


    /**
	 * 获取：甲方地址
	 */

    public void setHetongqianshuJiafangAddress(String hetongqianshuJiafangAddress) {
        this.hetongqianshuJiafangAddress = hetongqianshuJiafangAddress;
    }
    /**
	 * 设置：乙方
	 */
    public String getHetongqianshuYifang() {
        return hetongqianshuYifang;
    }


    /**
	 * 获取：乙方
	 */

    public void setHetongqianshuYifang(String hetongqianshuYifang) {
        this.hetongqianshuYifang = hetongqianshuYifang;
    }
    /**
	 * 设置：乙方地址
	 */
    public String getHetongqianshuYifangAddress() {
        return hetongqianshuYifangAddress;
    }


    /**
	 * 获取：乙方地址
	 */

    public void setHetongqianshuYifangAddress(String hetongqianshuYifangAddress) {
        this.hetongqianshuYifangAddress = hetongqianshuYifangAddress;
    }
    /**
	 * 设置：合同文件
	 */
    public String getHetongqianshuFile() {
        return hetongqianshuFile;
    }


    /**
	 * 获取：合同文件
	 */

    public void setHetongqianshuFile(String hetongqianshuFile) {
        this.hetongqianshuFile = hetongqianshuFile;
    }
    /**
	 * 设置：签署时间
	 */
    public Date getHetongqianshuTime() {
        return hetongqianshuTime;
    }


    /**
	 * 获取：签署时间
	 */

    public void setHetongqianshuTime(Date hetongqianshuTime) {
        this.hetongqianshuTime = hetongqianshuTime;
    }
    /**
	 * 设置：合同金额(万)
	 */
    public Double getHetongqianshuJine() {
        return hetongqianshuJine;
    }


    /**
	 * 获取：合同金额(万)
	 */

    public void setHetongqianshuJine(Double hetongqianshuJine) {
        this.hetongqianshuJine = hetongqianshuJine;
    }
    /**
	 * 设置：违约金(万)
	 */
    public Double getHetongqianshuWeiyueJine() {
        return hetongqianshuWeiyueJine;
    }


    /**
	 * 获取：违约金(万)
	 */

    public void setHetongqianshuWeiyueJine(Double hetongqianshuWeiyueJine) {
        this.hetongqianshuWeiyueJine = hetongqianshuWeiyueJine;
    }
    /**
	 * 设置：合同签署备注
	 */
    public String getHetongqianshuContent() {
        return hetongqianshuContent;
    }


    /**
	 * 获取：合同签署备注
	 */

    public void setHetongqianshuContent(String hetongqianshuContent) {
        this.hetongqianshuContent = hetongqianshuContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getHetongqianshuYesnoTypes() {
        return hetongqianshuYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setHetongqianshuYesnoTypes(Integer hetongqianshuYesnoTypes) {
        this.hetongqianshuYesnoTypes = hetongqianshuYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getHetongqianshuYesnoText() {
        return hetongqianshuYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setHetongqianshuYesnoText(String hetongqianshuYesnoText) {
        this.hetongqianshuYesnoText = hetongqianshuYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getHetongqianshuShenheTime() {
        return hetongqianshuShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setHetongqianshuShenheTime(Date hetongqianshuShenheTime) {
        this.hetongqianshuShenheTime = hetongqianshuShenheTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
