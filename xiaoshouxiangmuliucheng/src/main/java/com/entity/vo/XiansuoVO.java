package com.entity.vo;

import com.entity.XiansuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 线索
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiansuo")
public class XiansuoVO implements Serializable {
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
     * 线索编号
     */

    @TableField(value = "xiansuo_uuid_number")
    private String xiansuoUuidNumber;


    /**
     * 线索标题
     */

    @TableField(value = "xiansuo_name")
    private String xiansuoName;


    /**
     * 线索发现地址
     */

    @TableField(value = "xiansuo_address")
    private String xiansuoAddress;


    /**
     * 发现时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiansuo_time")
    private Date xiansuoTime;


    /**
     * 线索等级
     */

    @TableField(value = "xiansuo_dengji_types")
    private Integer xiansuoDengjiTypes;


    /**
     * 线索类型
     */

    @TableField(value = "xiansuo_types")
    private Integer xiansuoTypes;


    /**
     * 附件
     */

    @TableField(value = "xiansuo_file")
    private String xiansuoFile;


    /**
     * 线索内容
     */

    @TableField(value = "xiansuo_content")
    private String xiansuoContent;


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
	 * 设置：线索编号
	 */
    public String getXiansuoUuidNumber() {
        return xiansuoUuidNumber;
    }


    /**
	 * 获取：线索编号
	 */

    public void setXiansuoUuidNumber(String xiansuoUuidNumber) {
        this.xiansuoUuidNumber = xiansuoUuidNumber;
    }
    /**
	 * 设置：线索标题
	 */
    public String getXiansuoName() {
        return xiansuoName;
    }


    /**
	 * 获取：线索标题
	 */

    public void setXiansuoName(String xiansuoName) {
        this.xiansuoName = xiansuoName;
    }
    /**
	 * 设置：线索发现地址
	 */
    public String getXiansuoAddress() {
        return xiansuoAddress;
    }


    /**
	 * 获取：线索发现地址
	 */

    public void setXiansuoAddress(String xiansuoAddress) {
        this.xiansuoAddress = xiansuoAddress;
    }
    /**
	 * 设置：发现时间
	 */
    public Date getXiansuoTime() {
        return xiansuoTime;
    }


    /**
	 * 获取：发现时间
	 */

    public void setXiansuoTime(Date xiansuoTime) {
        this.xiansuoTime = xiansuoTime;
    }
    /**
	 * 设置：线索等级
	 */
    public Integer getXiansuoDengjiTypes() {
        return xiansuoDengjiTypes;
    }


    /**
	 * 获取：线索等级
	 */

    public void setXiansuoDengjiTypes(Integer xiansuoDengjiTypes) {
        this.xiansuoDengjiTypes = xiansuoDengjiTypes;
    }
    /**
	 * 设置：线索类型
	 */
    public Integer getXiansuoTypes() {
        return xiansuoTypes;
    }


    /**
	 * 获取：线索类型
	 */

    public void setXiansuoTypes(Integer xiansuoTypes) {
        this.xiansuoTypes = xiansuoTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getXiansuoFile() {
        return xiansuoFile;
    }


    /**
	 * 获取：附件
	 */

    public void setXiansuoFile(String xiansuoFile) {
        this.xiansuoFile = xiansuoFile;
    }
    /**
	 * 设置：线索内容
	 */
    public String getXiansuoContent() {
        return xiansuoContent;
    }


    /**
	 * 获取：线索内容
	 */

    public void setXiansuoContent(String xiansuoContent) {
        this.xiansuoContent = xiansuoContent;
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
