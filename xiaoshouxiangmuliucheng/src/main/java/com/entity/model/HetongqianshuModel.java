package com.entity.model;

import com.entity.HetongqianshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 合同签署
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HetongqianshuModel implements Serializable {
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
     * 合同签署编号
     */
    private String hetongqianshuUuidNumber;


    /**
     * 甲方
     */
    private String hetongqianshuJiafang;


    /**
     * 甲方地址
     */
    private String hetongqianshuJiafangAddress;


    /**
     * 乙方
     */
    private String hetongqianshuYifang;


    /**
     * 乙方地址
     */
    private String hetongqianshuYifangAddress;


    /**
     * 合同文件
     */
    private String hetongqianshuFile;


    /**
     * 签署时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date hetongqianshuTime;


    /**
     * 合同金额(万)
     */
    private Double hetongqianshuJine;


    /**
     * 违约金(万)
     */
    private Double hetongqianshuWeiyueJine;


    /**
     * 合同签署备注
     */
    private String hetongqianshuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 审核状态
     */
    private Integer hetongqianshuYesnoTypes;


    /**
     * 审核回复
     */
    private String hetongqianshuYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date hetongqianshuShenheTime;


    /**
     * 创建时间
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

    }
