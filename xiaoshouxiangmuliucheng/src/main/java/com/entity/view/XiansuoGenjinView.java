package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XiansuoGenjinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 线索跟进
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xiansuo_genjin")
public class XiansuoGenjinView extends XiansuoGenjinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 线索跟进类型的值
	*/
	@ColumnInfo(comment="线索跟进类型的字典表值",type="varchar(200)")
	private String xiansuoGenjinValue;

	//级联表 线索
					 
		/**
		* 线索 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer xiansuoYonghuId;
		/**
		* 线索编号
		*/

		@ColumnInfo(comment="线索编号",type="varchar(200)")
		private String xiansuoUuidNumber;
		/**
		* 线索标题
		*/

		@ColumnInfo(comment="线索标题",type="varchar(200)")
		private String xiansuoName;
		/**
		* 线索发现地址
		*/

		@ColumnInfo(comment="线索发现地址",type="varchar(200)")
		private String xiansuoAddress;
		/**
		* 发现时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="发现时间",type="timestamp")
		private Date xiansuoTime;
		/**
		* 线索等级
		*/
		@ColumnInfo(comment="线索等级",type="int(11)")
		private Integer xiansuoDengjiTypes;
			/**
			* 线索等级的值
			*/
			@ColumnInfo(comment="线索等级的字典表值",type="varchar(200)")
			private String xiansuoDengjiValue;
		/**
		* 线索类型
		*/
		@ColumnInfo(comment="线索类型",type="int(11)")
		private Integer xiansuoTypes;
			/**
			* 线索类型的值
			*/
			@ColumnInfo(comment="线索类型的字典表值",type="varchar(200)")
			private String xiansuoValue;
		/**
		* 附件
		*/

		@ColumnInfo(comment="附件",type="varchar(200)")
		private String xiansuoFile;
		/**
		* 线索内容
		*/

		@ColumnInfo(comment="线索内容",type="longtext")
		private String xiansuoContent;
	//级联表 用户
					 
		/**
		* 用户 的 企业
		*/
		@ColumnInfo(comment="企业",type="int(11)")
		private Integer yonghuQiyeId;
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public XiansuoGenjinView() {

	}

	public XiansuoGenjinView(XiansuoGenjinEntity xiansuoGenjinEntity) {
		try {
			BeanUtils.copyProperties(this, xiansuoGenjinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 线索跟进类型的值
	*/
	public String getXiansuoGenjinValue() {
		return xiansuoGenjinValue;
	}
	/**
	* 设置： 线索跟进类型的值
	*/
	public void setXiansuoGenjinValue(String xiansuoGenjinValue) {
		this.xiansuoGenjinValue = xiansuoGenjinValue;
	}


	//级联表的get和set 线索
		/**
		* 获取：线索 的 用户
		*/
		public Integer getXiansuoYonghuId() {
			return xiansuoYonghuId;
		}
		/**
		* 设置：线索 的 用户
		*/
		public void setXiansuoYonghuId(Integer xiansuoYonghuId) {
			this.xiansuoYonghuId = xiansuoYonghuId;
		}

		/**
		* 获取： 线索编号
		*/
		public String getXiansuoUuidNumber() {
			return xiansuoUuidNumber;
		}
		/**
		* 设置： 线索编号
		*/
		public void setXiansuoUuidNumber(String xiansuoUuidNumber) {
			this.xiansuoUuidNumber = xiansuoUuidNumber;
		}

		/**
		* 获取： 线索标题
		*/
		public String getXiansuoName() {
			return xiansuoName;
		}
		/**
		* 设置： 线索标题
		*/
		public void setXiansuoName(String xiansuoName) {
			this.xiansuoName = xiansuoName;
		}

		/**
		* 获取： 线索发现地址
		*/
		public String getXiansuoAddress() {
			return xiansuoAddress;
		}
		/**
		* 设置： 线索发现地址
		*/
		public void setXiansuoAddress(String xiansuoAddress) {
			this.xiansuoAddress = xiansuoAddress;
		}

		/**
		* 获取： 发现时间
		*/
		public Date getXiansuoTime() {
			return xiansuoTime;
		}
		/**
		* 设置： 发现时间
		*/
		public void setXiansuoTime(Date xiansuoTime) {
			this.xiansuoTime = xiansuoTime;
		}
		/**
		* 获取： 线索等级
		*/
		public Integer getXiansuoDengjiTypes() {
			return xiansuoDengjiTypes;
		}
		/**
		* 设置： 线索等级
		*/
		public void setXiansuoDengjiTypes(Integer xiansuoDengjiTypes) {
			this.xiansuoDengjiTypes = xiansuoDengjiTypes;
		}


			/**
			* 获取： 线索等级的值
			*/
			public String getXiansuoDengjiValue() {
				return xiansuoDengjiValue;
			}
			/**
			* 设置： 线索等级的值
			*/
			public void setXiansuoDengjiValue(String xiansuoDengjiValue) {
				this.xiansuoDengjiValue = xiansuoDengjiValue;
			}
		/**
		* 获取： 线索类型
		*/
		public Integer getXiansuoTypes() {
			return xiansuoTypes;
		}
		/**
		* 设置： 线索类型
		*/
		public void setXiansuoTypes(Integer xiansuoTypes) {
			this.xiansuoTypes = xiansuoTypes;
		}


			/**
			* 获取： 线索类型的值
			*/
			public String getXiansuoValue() {
				return xiansuoValue;
			}
			/**
			* 设置： 线索类型的值
			*/
			public void setXiansuoValue(String xiansuoValue) {
				this.xiansuoValue = xiansuoValue;
			}

		/**
		* 获取： 附件
		*/
		public String getXiansuoFile() {
			return xiansuoFile;
		}
		/**
		* 设置： 附件
		*/
		public void setXiansuoFile(String xiansuoFile) {
			this.xiansuoFile = xiansuoFile;
		}

		/**
		* 获取： 线索内容
		*/
		public String getXiansuoContent() {
			return xiansuoContent;
		}
		/**
		* 设置： 线索内容
		*/
		public void setXiansuoContent(String xiansuoContent) {
			this.xiansuoContent = xiansuoContent;
		}
	//级联表的get和set 用户
		/**
		* 获取：用户 的 企业
		*/
		public Integer getYonghuQiyeId() {
			return yonghuQiyeId;
		}
		/**
		* 设置：用户 的 企业
		*/
		public void setYonghuQiyeId(Integer yonghuQiyeId) {
			this.yonghuQiyeId = yonghuQiyeId;
		}

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "XiansuoGenjinView{" +
			", xiansuoGenjinValue=" + xiansuoGenjinValue +
			", xiansuoUuidNumber=" + xiansuoUuidNumber +
			", xiansuoName=" + xiansuoName +
			", xiansuoAddress=" + xiansuoAddress +
			", xiansuoTime=" + DateUtil.convertString(xiansuoTime,"yyyy-MM-dd") +
			", xiansuoFile=" + xiansuoFile +
			", xiansuoContent=" + xiansuoContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
