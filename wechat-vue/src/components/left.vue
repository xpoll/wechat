<template>
  <div>
    <ul class="list">
      <li v-for="item in auths">
        <router-link :to="item.url">{{item.name}}</router-link>
      </li>
    </ul>
  </div>
</template>

<script type="text/javascript">
  export default {
    data() {
      return {
        auths: []
      }
    },
    created() {
      var v = this
      this.auths = [
        {
          id: 1,
          name: '我的机器人',
          url: '/my/rebot'
        },
        {
          id: 2,
          name: '我的提醒',
          url: '/my/remind'
        }
      ]
    }
  }
</script>  