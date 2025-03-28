import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
    // 解决多次点击左侧菜单报错问题
    const VueRouterPush = VueRouter.prototype.push
    VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
    }
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import beifen from '@/views/modules/databaseBackup/beifen'
import huanyuan from '@/views/modules/databaseBackup/huanyuan'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import hetongqianshu from '@/views/modules/hetongqianshu/list'
    import lixiang from '@/views/modules/lixiang/list'
    import lixiangGenjin from '@/views/modules/lixiangGenjin/list'
    import lixiangPingshen from '@/views/modules/lixiangPingshen/list'
    import lixiangyanshou from '@/views/modules/lixiangyanshou/list'
    import qiye from '@/views/modules/qiye/list'
    import shangji from '@/views/modules/shangji/list'
    import shangjiGenjin from '@/views/modules/shangjiGenjin/list'
    import shangjiZhuanhua from '@/views/modules/shangjiZhuanhua/list'
    import xiansuo from '@/views/modules/xiansuo/list'
    import xiansuoGenjin from '@/views/modules/xiansuoGenjin/list'
    import xiansuoZhuanhua from '@/views/modules/xiansuoZhuanhua/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhaobiao from '@/views/modules/zhaobiao/list'
    import zhaobiaoToubiao from '@/views/modules/zhaobiaoToubiao/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryHetongqianshuYesno from '@/views/modules/dictionaryHetongqianshuYesno/list'
    import dictionaryJinyong from '@/views/modules/dictionaryJinyong/list'
    import dictionaryLixiang from '@/views/modules/dictionaryLixiang/list'
    import dictionaryLixiangPingshen from '@/views/modules/dictionaryLixiangPingshen/list'
    import dictionaryLixiangPingshenYesno from '@/views/modules/dictionaryLixiangPingshenYesno/list'
    import dictionaryLixiangYesno from '@/views/modules/dictionaryLixiangYesno/list'
    import dictionaryLixiangyanshouYesno from '@/views/modules/dictionaryLixiangyanshouYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangji from '@/views/modules/dictionaryShangji/list'
    import dictionaryShangjiDengji from '@/views/modules/dictionaryShangjiDengji/list'
    import dictionaryShangjiGenjin from '@/views/modules/dictionaryShangjiGenjin/list'
    import dictionaryShangjiZhuanhua from '@/views/modules/dictionaryShangjiZhuanhua/list'
    import dictionaryXiansuo from '@/views/modules/dictionaryXiansuo/list'
    import dictionaryXiansuoDengji from '@/views/modules/dictionaryXiansuoDengji/list'
    import dictionaryXiansuoGenjin from '@/views/modules/dictionaryXiansuoGenjin/list'
    import dictionaryXiansuoZhuanhua from '@/views/modules/dictionaryXiansuoZhuanhua/list'
    import dictionaryZhaobiao from '@/views/modules/dictionaryZhaobiao/list'
    import dictionaryZhaobiaoToubiaoYesno from '@/views/modules/dictionaryZhaobiaoToubiaoYesno/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }, {
        path: '/huanyuan',
        name: '数据还原',
        component: huanyuan
    }, {
        path: '/beifen',
        name: '数据备份',
        component: beifen
    }, {
        path: '/users',
        name: '管理信息',
        component: users
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryHetongqianshuYesno',
        name: '审核状态',
        component: dictionaryHetongqianshuYesno
    }
    ,{
        path: '/dictionaryJinyong',
        name: '账户状态',
        component: dictionaryJinyong
    }
    ,{
        path: '/dictionaryLixiang',
        name: '项目类型',
        component: dictionaryLixiang
    }
    ,{
        path: '/dictionaryLixiangPingshen',
        name: '项目评审类型',
        component: dictionaryLixiangPingshen
    }
    ,{
        path: '/dictionaryLixiangPingshenYesno',
        name: '项目评审状态',
        component: dictionaryLixiangPingshenYesno
    }
    ,{
        path: '/dictionaryLixiangYesno',
        name: '立项状态',
        component: dictionaryLixiangYesno
    }
    ,{
        path: '/dictionaryLixiangyanshouYesno',
        name: '审核状态',
        component: dictionaryLixiangyanshouYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangji',
        name: '商机类型',
        component: dictionaryShangji
    }
    ,{
        path: '/dictionaryShangjiDengji',
        name: '商机等级',
        component: dictionaryShangjiDengji
    }
    ,{
        path: '/dictionaryShangjiGenjin',
        name: '商机跟进类型',
        component: dictionaryShangjiGenjin
    }
    ,{
        path: '/dictionaryShangjiZhuanhua',
        name: '商机转化类型',
        component: dictionaryShangjiZhuanhua
    }
    ,{
        path: '/dictionaryXiansuo',
        name: '线索类型',
        component: dictionaryXiansuo
    }
    ,{
        path: '/dictionaryXiansuoDengji',
        name: '线索等级',
        component: dictionaryXiansuoDengji
    }
    ,{
        path: '/dictionaryXiansuoGenjin',
        name: '线索跟进类型',
        component: dictionaryXiansuoGenjin
    }
    ,{
        path: '/dictionaryXiansuoZhuanhua',
        name: '线索转化类型',
        component: dictionaryXiansuoZhuanhua
    }
    ,{
        path: '/dictionaryZhaobiao',
        name: '招标类型',
        component: dictionaryZhaobiao
    }
    ,{
        path: '/dictionaryZhaobiaoToubiaoYesno',
        name: '投标状态',
        component: dictionaryZhaobiaoToubiaoYesno
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/hetongqianshu',
        name: '合同签署',
        component: hetongqianshu
      }
    ,{
        path: '/lixiang',
        name: '项目立项',
        component: lixiang
      }
    ,{
        path: '/lixiangGenjin',
        name: '项目跟进',
        component: lixiangGenjin
      }
    ,{
        path: '/lixiangPingshen',
        name: '项目评审',
        component: lixiangPingshen
      }
    ,{
        path: '/lixiangyanshou',
        name: '项目验收',
        component: lixiangyanshou
      }
    ,{
        path: '/qiye',
        name: '企业',
        component: qiye
      }
    ,{
        path: '/shangji',
        name: '商机',
        component: shangji
      }
    ,{
        path: '/shangjiGenjin',
        name: '商机跟进',
        component: shangjiGenjin
      }
    ,{
        path: '/shangjiZhuanhua',
        name: '商机转化',
        component: shangjiZhuanhua
      }
    ,{
        path: '/xiansuo',
        name: '线索',
        component: xiansuo
      }
    ,{
        path: '/xiansuoGenjin',
        name: '线索跟进',
        component: xiansuoGenjin
      }
    ,{
        path: '/xiansuoZhuanhua',
        name: '线索转化',
        component: xiansuoZhuanhua
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/zhaobiao',
        name: '招标',
        component: zhaobiao
      }
    ,{
        path: '/zhaobiaoToubiao',
        name: '投标',
        component: zhaobiaoToubiao
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
