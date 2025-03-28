package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhaobiaoToubiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 投标
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhaobiao_toubiao")
public class ZhaobiaoToubiaoView extends ZhaobiaoToubiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 投标状态的值
	*/
	@ColumnInfo(comment="投标状态的字典表值",type="varchar(200)")
	private String zhaobiaoToubiaoYesnoValue;

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
	//级联表 招标
					 
		/**
		* 招标 的 企业
		*/
		@ColumnInfo(comment="企业",type="int(11)")
		private Integer zhaobiaoQiyeId;
		/**
		* 招标编号
		*/

		@ColumnInfo(comment="招标编号",type="varchar(200)")
		private String zhaobiaoUuidNumber;
		/**
		* 招标标题
		*/

		@ColumnInfo(comment="招标标题",type="varchar(200)")
		private String zhaobiaoName;
		/**
		* 招标地点
		*/

		@ColumnInfo(comment="招标地点",type="varchar(200)")
		private String zhaobiaoAddress;
		/**
		* 招标时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="招标时间",type="timestamp")
		private Date zhaobiaoTime;
		/**
		* 招标类型
		*/
		@ColumnInfo(comment="招标类型",type="int(11)")
		private Integer zhaobiaoTypes;
			/**
			* 招标类型的值
			*/
			@ColumnInfo(comment="招标类型的字典表值",type="varchar(200)")
			private String zhaobiaoValue;
		/**
		* 附件
		*/

		@ColumnInfo(comment="附件",type="varchar(200)")
		private String zhaobiaoFile;
		/**
		* 招标介绍
		*/

		@ColumnInfo(comment="招标介绍",type="longtext")
		private String zhaobiaoContent;



	public ZhaobiaoToubiaoView() {

	}

	public ZhaobiaoToubiaoView(ZhaobiaoToubiaoEntity zhaobiaoToubiaoEntity) {
		try {
			BeanUtils.copyProperties(this, zhaobiaoToubiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 投标状态的值
	*/
	public String getZhaobiaoToubiaoYesnoValue() {
		return zhaobiaoToubiaoYesnoValue;
	}
	/**
	* 设置： 投标状态的值
	*/
	public void setZhaobiaoToubiaoYesnoValue(String zhaobiaoToubiaoYesnoValue) {
		this.zhaobiaoToubiaoYesnoValue = zhaobiaoToubiaoYesnoValue;
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
	//级联表的get和set 招标
		/**
		* 获取：招标 的 企业
		*/
		public Integer getZhaobiaoQiyeId() {
			return zhaobiaoQiyeId;
		}
		/**
		* 设置：招标 的 企业
		*/
		public void setZhaobiaoQiyeId(Integer zhaobiaoQiyeId) {
			this.zhaobiaoQiyeId = zhaobiaoQiyeId;
		}

		/**
		* 获取： 招标编号
		*/
		public String getZhaobiaoUuidNumber() {
			return zhaobiaoUuidNumber;
		}
		/**
		* 设置： 招标编号
		*/
		public void setZhaobiaoUuidNumber(String zhaobiaoUuidNumber) {
			this.zhaobiaoUuidNumber = zhaobiaoUuidNumber;
		}

		/**
		* 获取： 招标标题
		*/
		public String getZhaobiaoName() {
			return zhaobiaoName;
		}
		/**
		* 设置： 招标标题
		*/
		public void setZhaobiaoName(String zhaobiaoName) {
			this.zhaobiaoName = zhaobiaoName;
		}

		/**
		* 获取： 招标地点
		*/
		public String getZhaobiaoAddress() {
			return zhaobiaoAddress;
		}
		/**
		* 设置： 招标地点
		*/
		public void setZhaobiaoAddress(String zhaobiaoAddress) {
			this.zhaobiaoAddress = zhaobiaoAddress;
		}

		/**
		* 获取： 招标时间
		*/
		public Date getZhaobiaoTime() {
			return zhaobiaoTime;
		}
		/**
		* 设置： 招标时间
		*/
		public void setZhaobiaoTime(Date zhaobiaoTime) {
			this.zhaobiaoTime = zhaobiaoTime;
		}
		/**
		* 获取： 招标类型
		*/
		public Integer getZhaobiaoTypes() {
			return zhaobiaoTypes;
		}
		/**
		* 设置： 招标类型
		*/
		public void setZhaobiaoTypes(Integer zhaobiaoTypes) {
			this.zhaobiaoTypes = zhaobiaoTypes;
		}


			/**
			* 获取： 招标类型的值
			*/
			public String getZhaobiaoValue() {
				return zhaobiaoValue;
			}
			/**
			* 设置： 招标类型的值
			*/
			public void setZhaobiaoValue(String zhaobiaoValue) {
				this.zhaobiaoValue = zhaobiaoValue;
			}

		/**
		* 获取： 附件
		*/
		public String getZhaobiaoFile() {
			return zhaobiaoFile;
		}
		/**
		* 设置： 附件
		*/
		public void setZhaobiaoFile(String zhaobiaoFile) {
			this.zhaobiaoFile = zhaobiaoFile;
		}

		/**
		* 获取： 招标介绍
		*/
		public String getZhaobiaoContent() {
			return zhaobiaoContent;
		}
		/**
		* 设置： 招标介绍
		*/
		public void setZhaobiaoContent(String zhaobiaoContent) {
			this.zhaobiaoContent = zhaobiaoContent;
		}


	@Override
	public String toString() {
		return "ZhaobiaoToubiaoView{" +
			", zhaobiaoToubiaoYesnoValue=" + zhaobiaoToubiaoYesnoValue +
			", zhaobiaoUuidNumber=" + zhaobiaoUuidNumber +
			", zhaobiaoName=" + zhaobiaoName +
			", zhaobiaoAddress=" + zhaobiaoAddress +
			", zhaobiaoTime=" + DateUtil.convertString(zhaobiaoTime,"yyyy-MM-dd") +
			", zhaobiaoFile=" + zhaobiaoFile +
			", zhaobiaoContent=" + zhaobiaoContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
