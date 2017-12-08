import index from '@/page/index.vue'
import content from '@/page/content.vue'

import Frame from '@/frame/subroute.vue'

import userIndex from '@/page/user/index.vue'
import userInfo from '@/page/user/info.vue'

import specialAtmo from '@/page/special/atmo.vue'
import specialBox from '@/page/special/box.vue'
import specialButton from '@/page/special/button.vue'
import specialFold from '@/page/special/fold.vue'

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
    path: '/sp',
    component: Frame,
    children: [
      {path: 'atmo', component: specialAtmo},
      {path: 'box', component: specialBox},
      {path: 'btn', component: specialButton},
      {path: 'fold', component: specialFold}
    ]
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
