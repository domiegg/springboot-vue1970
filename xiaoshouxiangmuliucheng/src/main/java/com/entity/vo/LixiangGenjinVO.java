package com.entity.vo;

import com.entity.LixiangGenjinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目跟进
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lixiang_genjin")
public class LixiangGenjinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 立项项目
     */

    @TableField(value = "lixiang_id")
    private Integer lixiangId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 项目跟进编号
     */

    @TableField(value = "lixiang_genjin_uuid_number")
    private String lixiangGenjinUuidNumber;


    /**
     * 跟进标题
     */

    @TableField(value = "lixiang_genjin_name")
    private String lixiangGenjinName;


    /**
     * 项目跟进附件
     */

    @TableField(value = "lixiang_genjin_file")
    private String lixiangGenjinFile;


    /**
     * 跟进地点
     */

    @TableField(value = "lixiang_genjin_address")
    private String lixiangGenjinAddress;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "lixiang_genjin_time")
    private Date lixiangGenjinTime;


    /**
     * 跟进内容
     */

    @TableField(value = "lixiang_genjin_content")
    private String lixiangGenjinContent;


    /**
     * 跟定结果
     */

    @TableField(value = "lixiang_genjin_jieguo")
    private String lixiangGenjinJieguo;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：立项项目
	 */
    public Integer getLixiangId() {
        return lixiangId;
    }


    /**
	 * 获取：立项项目
	 */

    public void setLixiangId(Integer lixiangId) {
        this.lixiangId = lixiangId;
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
	 * 设置：项目跟进编号
	 */
    public String getLixiangGenjinUuidNumber() {
        return lixiangGenjinUuidNumber;
    }


    /**
	 * 获取：项目跟进编号
	 */

    public void setLixiangGenjinUuidNumber(String lixiangGenjinUuidNumber) {
        this.lixiangGenjinUuidNumber = lixiangGenjinUuidNumber;
    }
    /**
	 * 设置：跟进标题
	 */
    public String getLixiangGenjinName() {
        return lixiangGenjinName;
    }


    /**
	 * 获取：跟进标题
	 */

    public void setLixiangGenjinName(String lixiangGenjinName) {
        this.lixiangGenjinName = lixiangGenjinName;
    }
    /**
	 * 设置：项目跟进附件
	 */
    public String getLixiangGenjinFile() {
        return lixiangGenjinFile;
    }


    /**
	 * 获取：项目跟进附件
	 */

    public void setLixiangGenjinFile(String lixiangGenjinFile) {
        this.lixiangGenjinFile = lixiangGenjinFile;
    }
    /**
	 * 设置：跟进地点
	 */
    public String getLixiangGenjinAddress() {
        return lixiangGenjinAddress;
    }


    /**
	 * 获取：跟进地点
	 */

    public void setLixiangGenjinAddress(String lixiangGenjinAddress) {
        this.lixiangGenjinAddress = lixiangGenjinAddress;
    }
    /**
	 * 设置：跟进时间
	 */
    public Date getLixiangGenjinTime() {
        return lixiangGenjinTime;
    }


    /**
	 * 获取：跟进时间
	 */

    public void setLixiangGenjinTime(Date lixiangGenjinTime) {
        this.lixiangGenjinTime = lixiangGenjinTime;
    }
    /**
	 * 设置：跟进内容
	 */
    public String getLixiangGenjinContent() {
        return lixiangGenjinContent;
    }


    /**
	 * 获取：跟进内容
	 */

    public void setLixiangGenjinContent(String lixiangGenjinContent) {
        this.lixiangGenjinContent = lixiangGenjinContent;
    }
    /**
	 * 设置：跟定结果
	 */
    public String getLixiangGenjinJieguo() {
        return lixiangGenjinJieguo;
    }


    /**
	 * 获取：跟定结果
	 */

    public void setLixiangGenjinJieguo(String lixiangGenjinJieguo) {
        this.lixiangGenjinJieguo = lixiangGenjinJieguo;
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
