package com.entity.vo;

import com.entity.LixiangPingshenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目评审
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lixiang_pingshen")
public class LixiangPingshenVO implements Serializable {
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
     * 项目
     */

    @TableField(value = "lixiang_id")
    private Integer lixiangId;


    /**
     * 项目评审编号
     */

    @TableField(value = "lixiang_pingshen_uuid_number")
    private String lixiangPingshenUuidNumber;


    /**
     * 项目评审标题
     */

    @TableField(value = "lixiang_pingshen_name")
    private String lixiangPingshenName;


    /**
     * 项目评审类型
     */

    @TableField(value = "lixiang_pingshen_types")
    private Integer lixiangPingshenTypes;


    /**
     * 评审附件
     */

    @TableField(value = "lixiang_pingshen_file")
    private String lixiangPingshenFile;


    /**
     * 项目评审报告
     */

    @TableField(value = "lixiang_pingshen_content")
    private String lixiangPingshenContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 项目评审状态
     */

    @TableField(value = "lixiang_pingshen_yesno_types")
    private Integer lixiangPingshenYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "lixiang_pingshen_yesno_text")
    private String lixiangPingshenYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lixiang_pingshen_shenhe_time")
    private Date lixiangPingshenShenheTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }


    /**
	 * 获取：项目
	 */

    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
    }
    /**
	 * 设置：项目评审编号
	 */
    public String getLixiangPingshenUuidNumber() {
        return lixiangPingshenUuidNumber;
    }


    /**
	 * 获取：项目评审编号
	 */

    public void setLixiangPingshenUuidNumber(String lixiangPingshenUuidNumber) {
        this.lixiangPingshenUuidNumber = lixiangPingshenUuidNumber;
    }
    /**
	 * 设置：项目评审标题
	 */
    public String getLixiangPingshenName() {
        return lixiangPingshenName;
    }


    /**
	 * 获取：项目评审标题
	 */

    public void setLixiangPingshenName(String lixiangPingshenName) {
        this.lixiangPingshenName = lixiangPingshenName;
    }
    /**
	 * 设置：项目评审类型
	 */
    public Integer getLixiangPingshenTypes() {
        return lixiangPingshenTypes;
    }


    /**
	 * 获取：项目评审类型
	 */

    public void setLixiangPingshenTypes(Integer lixiangPingshenTypes) {
        this.lixiangPingshenTypes = lixiangPingshenTypes;
    }
    /**
	 * 设置：评审附件
	 */
    public String getLixiangPingshenFile() {
        return lixiangPingshenFile;
    }


    /**
	 * 获取：评审附件
	 */

    public void setLixiangPingshenFile(String lixiangPingshenFile) {
        this.lixiangPingshenFile = lixiangPingshenFile;
    }
    /**
	 * 设置：项目评审报告
	 */
    public String getLixiangPingshenContent() {
        return lixiangPingshenContent;
    }


    /**
	 * 获取：项目评审报告
	 */

    public void setLixiangPingshenContent(String lixiangPingshenContent) {
        this.lixiangPingshenContent = lixiangPingshenContent;
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
	 * 设置：项目评审状态
	 */
    public Integer getLixiangPingshenYesnoTypes() {
        return lixiangPingshenYesnoTypes;
    }


    /**
	 * 获取：项目评审状态
	 */

    public void setLixiangPingshenYesnoTypes(Integer lixiangPingshenYesnoTypes) {
        this.lixiangPingshenYesnoTypes = lixiangPingshenYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getLixiangPingshenYesnoText() {
        return lixiangPingshenYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setLixiangPingshenYesnoText(String lixiangPingshenYesnoText) {
        this.lixiangPingshenYesnoText = lixiangPingshenYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getLixiangPingshenShenheTime() {
        return lixiangPingshenShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setLixiangPingshenShenheTime(Date lixiangPingshenShenheTime) {
        this.lixiangPingshenShenheTime = lixiangPingshenShenheTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
