package com.entity.vo;

import com.entity.XiansuoGenjinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 线索跟进
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiansuo_genjin")
public class XiansuoGenjinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 线索
     */

    @TableField(value = "xiansuo_id")
    private Integer xiansuoId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 线索跟进编号
     */

    @TableField(value = "xiansuo_genjin_uuid_number")
    private String xiansuoGenjinUuidNumber;


    /**
     * 线索跟进标题
     */

    @TableField(value = "xiansuo_genjin_name")
    private String xiansuoGenjinName;


    /**
     * 跟进时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xiansuo_genjin_time")
    private Date xiansuoGenjinTime;


    /**
     * 附件
     */

    @TableField(value = "xiansuo_genjin_file")
    private String xiansuoGenjinFile;


    /**
     * 线索跟进类型
     */

    @TableField(value = "xiansuo_genjin_types")
    private Integer xiansuoGenjinTypes;


    /**
     * 线索跟进详情
     */

    @TableField(value = "xiansuo_genjin_content")
    private String xiansuoGenjinContent;


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
	 * 设置：线索
	 */
    public Integer getXiansuoId() {
        return xiansuoId;
    }


    /**
	 * 获取：线索
	 */

    public void setXiansuoId(Integer xiansuoId) {
        this.xiansuoId = xiansuoId;
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
	 * 设置：线索跟进编号
	 */
    public String getXiansuoGenjinUuidNumber() {
        return xiansuoGenjinUuidNumber;
    }


    /**
	 * 获取：线索跟进编号
	 */

    public void setXiansuoGenjinUuidNumber(String xiansuoGenjinUuidNumber) {
        this.xiansuoGenjinUuidNumber = xiansuoGenjinUuidNumber;
    }
    /**
	 * 设置：线索跟进标题
	 */
    public String getXiansuoGenjinName() {
        return xiansuoGenjinName;
    }


    /**
	 * 获取：线索跟进标题
	 */

    public void setXiansuoGenjinName(String xiansuoGenjinName) {
        this.xiansuoGenjinName = xiansuoGenjinName;
    }
    /**
	 * 设置：跟进时间
	 */
    public Date getXiansuoGenjinTime() {
        return xiansuoGenjinTime;
    }


    /**
	 * 获取：跟进时间
	 */

    public void setXiansuoGenjinTime(Date xiansuoGenjinTime) {
        this.xiansuoGenjinTime = xiansuoGenjinTime;
    }
    /**
	 * 设置：附件
	 */
    public String getXiansuoGenjinFile() {
        return xiansuoGenjinFile;
    }


    /**
	 * 获取：附件
	 */

    public void setXiansuoGenjinFile(String xiansuoGenjinFile) {
        this.xiansuoGenjinFile = xiansuoGenjinFile;
    }
    /**
	 * 设置：线索跟进类型
	 */
    public Integer getXiansuoGenjinTypes() {
        return xiansuoGenjinTypes;
    }


    /**
	 * 获取：线索跟进类型
	 */

    public void setXiansuoGenjinTypes(Integer xiansuoGenjinTypes) {
        this.xiansuoGenjinTypes = xiansuoGenjinTypes;
    }
    /**
	 * 设置：线索跟进详情
	 */
    public String getXiansuoGenjinContent() {
        return xiansuoGenjinContent;
    }


    /**
	 * 获取：线索跟进详情
	 */

    public void setXiansuoGenjinContent(String xiansuoGenjinContent) {
        this.xiansuoGenjinContent = xiansuoGenjinContent;
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
