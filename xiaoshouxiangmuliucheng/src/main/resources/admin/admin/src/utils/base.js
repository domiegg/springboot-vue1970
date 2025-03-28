const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoshouxiangmuliucheng/",
            name: "xiaoshouxiangmuliucheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoshouxiangmuliucheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "销售项目流程化管理系统"
        } 
    }
}
export default base
