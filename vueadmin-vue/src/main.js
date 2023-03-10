import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import axios from "./axios";

import global from './globalFun'

Vue.prototype.$axios = axios //全局使用
Vue.config.productionTip = false

// require("./mock") //引入mock数据，关闭则注释该行

Vue.use(ElementUI)

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
