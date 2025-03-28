<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="auto"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='qiye'"  label='企业名称' prop="qiyeName">
               <el-input v-model="ruleForm.qiyeName"  placeholder='企业名称' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='qiye'"  label='负责人' prop="qiyeFuzeren">
               <el-input v-model="ruleForm.qiyeFuzeren"  placeholder='负责人' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='qiye'"  label='联系方式' prop="qiyePhone">
               <el-input v-model="ruleForm.qiyePhone"  placeholder='联系方式' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='qiye'"  label='邮箱' prop="qiyeEmail">
               <el-input v-model="ruleForm.qiyeEmail"  placeholder='邮箱' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='qiye'" label='企业logo' prop="qiyeLogoPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.qiyeLogoPhoto?$base.url+ruleForm.qiyeLogoPhoto:''"
                         @change="qiyeLogoPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='qiye'" label='营业执照展示' prop="qiyePhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.qiyePhoto?$base.url+ruleForm.qiyePhoto:''"
                         @change="qiyePhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item v-if="flag=='qiye'"  label="企业介绍" prop="qiyeContent">
                 <editor
                         style="min-width: 200px; max-width: 600px;"
                         v-model="ruleForm.qiyeContent"
                         class="editor"
                         action="file/upload">
                 </editor>
             </el-form-item>
         </el-col>
        <!--<el-col :span="12" v-if="flag=='yonghu'">
            <el-form-item class="select" label="企业" prop="qiyeId">
                <el-select v-model="ruleForm.qiyeId" filterable placeholder="请选择企业" @change="qiyeChange">
                    <el-option
                            v-for="(item,index) in qiyeOptions"
                            v-bind:key="item.id"
                                            :label="item.qiyeName"
                            :value="item.id">
                    </el-option>
                </el-select>
            </el-form-item>
        </el-col>-->
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='企业名称' prop="qiyeName">
                 <el-input v-model="qiyeForm.qiyeName" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='负责人' prop="qiyeFuzeren">
                 <el-input v-model="qiyeForm.qiyeFuzeren" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='联系方式' prop="qiyePhone">
                 <el-input v-model="qiyeForm.qiyePhone" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='邮箱' prop="qiyeEmail">
                 <el-input v-model="qiyeForm.qiyeEmail" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='企业logo' prop="qiyeLogoPhoto">
                 <el-image
                     style="width: 100px; height: 100px"
                     :src="qiyeForm.qiyeLogoPhoto?$base.url+qiyeForm.qiyeLogoPhoto:''"
                     :fit="fit">
                 </el-image>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='营业执照展示' prop="qiyePhoto">
                 <el-image
                     style="width: 100px; height: 100px"
                     :src="qiyeForm.qiyePhoto?$base.url+qiyeForm.qiyePhoto:''"
                     :fit="fit">
                 </el-image>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='账户状态' prop="jinyongTypes">
                 <el-input v-model="qiyeForm.jinyongValue" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='用户编号' prop="yonghuUuidNumber">
               <el-input v-model="ruleForm.yonghuUuidNumber"disabled="true"   placeholder='用户编号' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='用户姓名' prop="yonghuName">
               <el-input v-model="ruleForm.yonghuName"  placeholder='用户姓名' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='用户手机号' prop="yonghuPhone">
               <el-input v-model="ruleForm.yonghuPhone"  placeholder='用户手机号' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='用户身份证号' prop="yonghuIdNumber">
               <el-input v-model="ruleForm.yonghuIdNumber"  placeholder='用户身份证号' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='用户头像' prop="yonghuPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.yonghuPhoto?$base.url+ruleForm.yonghuPhoto:''"
                         @change="yonghuPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='用户邮箱' prop="yonghuEmail">
               <el-input v-model="ruleForm.yonghuEmail"  placeholder='用户邮箱' clearable></el-input>
           </el-form-item>
         </el-col>
         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag!='users' &&( 1==2|| flag=='yonghu')"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
        ruleForm: {},
        flag: '',
        usersFlag: false,
        // sexTypesOptions : [],
// 注册表 用户
    // 注册的类型字段 用户
        // 性别
        sexTypesOptions : [],
        // 账户状态
        jinyongTypesOptions : [],
    // 注册的级联表 用户
        // 企业列表
        qiyeOptions : [],
        qiyeForm:{},
// 注册表 企业
    // 注册的类型字段 企业
        // 账户状态
        jinyongTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
// 注册表 用户
    // 注册的级联表 用户
        if(table == 'yonghu'){
            this.qiyeChange(this.ruleForm.qiyeId);
        }
// 注册表 企业
      } else {
        this.$message.error(data.msg);
      }
    });

// 注册表 用户 的级联表
    // 注册的级联表 用户
        // 企业列表
    this.$http({
        url: `qiye/page?page=1&limit=100`,
        method: "get"
    }).then(({ data }) => {
        if (data && data.code === 0) {
        this.qiyeOptions = data.data.list;
        }else{
            this.$message.error(data.msg);
        }
    });
// 注册表 企业 的级联表

      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
              this.sexTypesOptions = data.data.list;
          } else {
              this.$message.error(data.msg);
          }
      });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=jinyong_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.jinyongTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=jinyong_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.jinyongTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
  },
  methods: {
    chongzhi() {
      this.$router.replace({ path: "/pay" });
    },
    tixian() {
      let _this=this;
      this.$confirm(`确定要提现么?`, "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
      }).then(() => {
          _this.ruleForm.newMoney=0;
          _this.$http({
              url: `${this.$storage.get("sessionTable")}/update`,
              method: "post",
              data: this.ruleForm
          }).then(({ data }) => {
              if (data && data.code === 0) {
                  _this.$message({message: "提现成功",type: "success",duration: 1500,onClose: () => {}});
              } else {this.$message.error(data.msg);}
          });
      });
    },
    qiyeLogoPhotoUploadChange(fileUrls) {
        this.ruleForm.qiyeLogoPhoto = fileUrls;
    },
    qiyePhotoUploadChange(fileUrls) {
        this.ruleForm.qiyePhoto = fileUrls;
    },
    yonghuPhotoUploadChange(fileUrls) {
        this.ruleForm.yonghuPhoto = fileUrls;
    },
// 注册表的级联表
    qiyeChange(id){
        this.$http({
            url: `qiye/info/`+id,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.qiyeForm = data.data;
            }
        });
    },


    onUpdateHandler() {
                         if((!this.ruleForm.qiyeName)&& 'qiye'==this.flag){
                             this.$message.error('企业名称不能为空');
                             return
                         }

                         if((!this.ruleForm.qiyeFuzeren)&& 'qiye'==this.flag){
                             this.$message.error('负责人不能为空');
                             return
                         }

                         if((!this.ruleForm.qiyePhone)&& 'qiye'==this.flag){
                             this.$message.error('联系方式不能为空');
                             return
                         }

                             if( 'qiye' ==this.flag && this.ruleForm.qiyeEmail&&(!isEmail(this.ruleForm.qiyeEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.qiyeLogoPhoto)&& 'qiye'==this.flag){
                             this.$message.error('企业logo不能为空');
                             return
                         }

                         if((!this.ruleForm.qiyePhoto)&& 'qiye'==this.flag){
                             this.$message.error('营业执照展示不能为空');
                             return
                         }

                         if((!this.ruleForm.qiyeContent)&& 'qiye'==this.flag){
                             this.$message.error('企业介绍不能为空');
                             return
                         }

                         if((!this.ruleForm.jinyongTypes)&& 'qiye'==this.flag){
                             this.$message.error('账户状态不能为空');
                             return
                         }

                         if((!this.ruleForm.qiyeId)&& 'yonghu'==this.flag){
                             this.$message.error('企业不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuUuidNumber)&& 'yonghu'==this.flag){
                             this.$message.error('用户编号不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuName)&& 'yonghu'==this.flag){
                             this.$message.error('用户姓名不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuPhone&&(!isMobile(this.ruleForm.yonghuPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.yonghuIdNumber)&& 'yonghu'==this.flag){
                             this.$message.error('用户身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhoto)&& 'yonghu'==this.flag){
                             this.$message.error('用户头像不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuEmail&&(!isEmail(this.ruleForm.yonghuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.jinyongTypes)&& 'yonghu'==this.flag){
                             this.$message.error('账户状态不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes) && (1==2|| this.flag=='yonghu')){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
