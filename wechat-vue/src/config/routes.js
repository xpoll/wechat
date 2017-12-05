import index from '@/page/index.vue'
import content from '@/page/content.vue'

import Frame from '@/frame/subroute.vue'

import userIndex from '@/page/user/index.vue'
import userInfo from '@/page/user/info.vue'

import myRebot from '@/page/my/rebot.vue'
import myRemind from '@/page/my/remind.vue'

export default [
  {
    path: '/',
    component: index
  },
  {
    path: '/index',
    component: index
  },
  {
    path: '/content/:id',
    component: content
  },


  {
    path: '/my',
    component: Frame,
    children: [
      {path: 'rebot', component: myRebot},
      {path: 'remind', component: myRemind}
    ]
  },
  {
    path: '/user',
    component: Frame,
    children: [
      {path: '', component: userIndex},
      {path: 'index', component: userIndex},
      {path: 'info', component: userInfo}
    ]
  }
]
