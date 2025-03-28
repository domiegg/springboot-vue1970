package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangjiGenjinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商机跟进
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangji_genjin")
public class ShangjiGenjinView extends ShangjiGenjinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 商机跟进类型的值
	*/
	@ColumnInfo(comment="商机跟进类型的字典表值",type="varchar(200)")
	private String shangjiGenjinValue;

	//级联表 商机
					 
		/**
		* 商机 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer shangjiYonghuId;
		/**
		* 商机编号
		*/

		@ColumnInfo(comment="商机编号",type="varchar(200)")
		private String shangjiUuidNumber;
		/**
		* 商机标题
		*/

		@ColumnInfo(comment="商机标题",type="varchar(200)")
		private String shangjiName;
		/**
		* 商机发现地址
		*/

		@ColumnInfo(comment="商机发现地址",type="varchar(200)")
		private String shangjiAddress;
		/**
		* 发现时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="发现时间",type="timestamp")
		private Date shangjiTime;
		/**
		* 商机等级
		*/
		@ColumnInfo(comment="商机等级",type="int(11)")
		private Integer shangjiDengjiTypes;
			/**
			* 商机等级的值
			*/
			@ColumnInfo(comment="商机等级的字典表值",type="varchar(200)")
			private String shangjiDengjiValue;
		/**
		* 商机类型
		*/
		@ColumnInfo(comment="商机类型",type="int(11)")
		private Integer shangjiTypes;
			/**
			* 商机类型的值
			*/
			@ColumnInfo(comment="商机类型的字典表值",type="varchar(200)")
			private String shangjiValue;
		/**
		* 附件
		*/

		@ColumnInfo(comment="附件",type="varchar(200)")
		private String shangjiFile;
		/**
		* 商机内容
		*/

		@ColumnInfo(comment="商机内容",type="longtext")
		private String shangjiContent;
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



	public ShangjiGenjinView() {

	}

	public ShangjiGenjinView(ShangjiGenjinEntity shangjiGenjinEntity) {
		try {
			BeanUtils.copyProperties(this, shangjiGenjinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 商机跟进类型的值
	*/
	public String getShangjiGenjinValue() {
		return shangjiGenjinValue;
	}
	/**
	* 设置： 商机跟进类型的值
	*/
	public void setShangjiGenjinValue(String shangjiGenjinValue) {
		this.shangjiGenjinValue = shangjiGenjinValue;
	}


	//级联表的get和set 商机
		/**
		* 获取：商机 的 用户
		*/
		public Integer getShangjiYonghuId() {
			return shangjiYonghuId;
		}
		/**
		* 设置：商机 的 用户
		*/
		public void setShangjiYonghuId(Integer shangjiYonghuId) {
			this.shangjiYonghuId = shangjiYonghuId;
		}

		/**
		* 获取： 商机编号
		*/
		public String getShangjiUuidNumber() {
			return shangjiUuidNumber;
		}
		/**
		* 设置： 商机编号
		*/
		public void setShangjiUuidNumber(String shangjiUuidNumber) {
			this.shangjiUuidNumber = shangjiUuidNumber;
		}

		/**
		* 获取： 商机标题
		*/
		public String getShangjiName() {
			return shangjiName;
		}
		/**
		* 设置： 商机标题
		*/
		public void setShangjiName(String shangjiName) {
			this.shangjiName = shangjiName;
		}

		/**
		* 获取： 商机发现地址
		*/
		public String getShangjiAddress() {
			return shangjiAddress;
		}
		/**
		* 设置： 商机发现地址
		*/
		public void setShangjiAddress(String shangjiAddress) {
			this.shangjiAddress = shangjiAddress;
		}

		/**
		* 获取： 发现时间
		*/
		public Date getShangjiTime() {
			return shangjiTime;
		}
		/**
		* 设置： 发现时间
		*/
		public void setShangjiTime(Date shangjiTime) {
			this.shangjiTime = shangjiTime;
		}
		/**
		* 获取： 商机等级
		*/
		public Integer getShangjiDengjiTypes() {
			return shangjiDengjiTypes;
		}
		/**
		* 设置： 商机等级
		*/
		public void setShangjiDengjiTypes(Integer shangjiDengjiTypes) {
			this.shangjiDengjiTypes = shangjiDengjiTypes;
		}


			/**
			* 获取： 商机等级的值
			*/
			public String getShangjiDengjiValue() {
				return shangjiDengjiValue;
			}
			/**
			* 设置： 商机等级的值
			*/
			public void setShangjiDengjiValue(String shangjiDengjiValue) {
				this.shangjiDengjiValue = shangjiDengjiValue;
			}
		/**
		* 获取： 商机类型
		*/
		public Integer getShangjiTypes() {
			return shangjiTypes;
		}
		/**
		* 设置： 商机类型
		*/
		public void setShangjiTypes(Integer shangjiTypes) {
			this.shangjiTypes = shangjiTypes;
		}


			/**
			* 获取： 商机类型的值
			*/
			public String getShangjiValue() {
				return shangjiValue;
			}
			/**
			* 设置： 商机类型的值
			*/
			public void setShangjiValue(String shangjiValue) {
				this.shangjiValue = shangjiValue;
			}

		/**
		* 获取： 附件
		*/
		public String getShangjiFile() {
			return shangjiFile;
		}
		/**
		* 设置： 附件
		*/
		public void setShangjiFile(String shangjiFile) {
			this.shangjiFile = shangjiFile;
		}

		/**
		* 获取： 商机内容
		*/
		public String getShangjiContent() {
			return shangjiContent;
		}
		/**
		* 设置： 商机内容
		*/
		public void setShangjiContent(String shangjiContent) {
			this.shangjiContent = shangjiContent;
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
		return "ShangjiGenjinView{" +
			", shangjiGenjinValue=" + shangjiGenjinValue +
			", shangjiUuidNumber=" + shangjiUuidNumber +
			", shangjiName=" + shangjiName +
			", shangjiAddress=" + shangjiAddress +
			", shangjiTime=" + DateUtil.convertString(shangjiTime,"yyyy-MM-dd") +
			", shangjiFile=" + shangjiFile +
			", shangjiContent=" + shangjiContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
