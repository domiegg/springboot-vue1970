package com.entity.vo;

import com.entity.ShangjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商机
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangji")
public class ShangjiVO implements Serializable {
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
     * 商机编号
     */

    @TableField(value = "shangji_uuid_number")
    private String shangjiUuidNumber;


    /**
     * 商机标题
     */

    @TableField(value = "shangji_name")
    private String shangjiName;


    /**
     * 商机发现地址
     */

    @TableField(value = "shangji_address")
    private String shangjiAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangji_time")
    private Date shangjiTime;


    /**
     * 商机等级
     */

    @TableField(value = "shangji_dengji_types")
    private Integer shangjiDengjiTypes;


    /**
     * 商机类型
     */

    @TableField(value = "shangji_types")
    private Integer shangjiTypes;


    /**
     * 附件
     */

    @TableField(value = "shangji_file")
    private String shangjiFile;


    /**
     * 商机内容
     */

    @TableField(value = "shangji_content")
    private String shangjiContent;


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
	 * 设置：商机编号
	 */
    public String getShangjiUuidNumber() {
        return shangjiUuidNumber;
    }


    /**
	 * 获取：商机编号
	 */

    public void setShangjiUuidNumber(String shangjiUuidNumber) {
        this.shangjiUuidNumber = shangjiUuidNumber;
    }
    /**
	 * 设置：商机标题
	 */
    public String getShangjiName() {
        return shangjiName;
    }


    /**
	 * 获取：商机标题
	 */

    public void setShangjiName(String shangjiName) {
        this.shangjiName = shangjiName;
    }
    /**
	 * 设置：商机发现地址
	 */
    public String getShangjiAddress() {
        return shangjiAddress;
    }


    /**
	 * 获取：商机发现地址
	 */

    public void setShangjiAddress(String shangjiAddress) {
        this.shangjiAddress = shangjiAddress;
    }
    /**
	 * 设置：发现时间
	 */
    public Date getShangjiTime() {
        return shangjiTime;
    }


    /**
	 * 获取：发现时间
	 */

    public void setShangjiTime(Date shangjiTime) {
        this.shangjiTime = shangjiTime;
    }
    /**
	 * 设置：商机等级
	 */
    public Integer getShangjiDengjiTypes() {
        return shangjiDengjiTypes;
    }


    /**
	 * 获取：商机等级
	 */

    public void setShangjiDengjiTypes(Integer shangjiDengjiTypes) {
        this.shangjiDengjiTypes = shangjiDengjiTypes;
    }
    /**
	 * 设置：商机类型
	 */
    public Integer getShangjiTypes() {
        return shangjiTypes;
    }


    /**
	 * 获取：商机类型
	 */

    public void setShangjiTypes(Integer shangjiTypes) {
        this.shangjiTypes = shangjiTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getShangjiFile() {
        return shangjiFile;
    }


    /**
	 * 获取：附件
	 */

    public void setShangjiFile(String shangjiFile) {
        this.shangjiFile = shangjiFile;
    }
    /**
	 * 设置：商机内容
	 */
    public String getShangjiContent() {
        return shangjiContent;
    }


    /**
	 * 获取：商机内容
	 */

    public void setShangjiContent(String shangjiContent) {
        this.shangjiContent = shangjiContent;
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
