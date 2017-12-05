// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'
import routes from './config/routes'
import util from './config/index'

import axios from 'axios'

Vue.use(VueRouter)
Vue.prototype.$axios = axios
Vue.prototype.$util = util

const router = new VueRouter({
  routes
})

new Vue({
  router,
  el: '#app',
  render: (h) => h(App)
})
