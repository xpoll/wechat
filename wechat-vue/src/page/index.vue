<template>
  <div>
    <xpollHeader></xpollHeader>
    <ul class="list">
      <li v-for="item in lists">
        <time v-text="$util.getTime(item.create_at)"></time>
        <router-link :to="'/content/' + item.id">{{item.title}}</router-link>
      </li>
    </ul>
    <xpollFooter></xpollFooter>
  </div>
</template>

<script type="text/javascript">
  import xpollHeader from '@/components/header'
  import xpollFooter from '@/components/footer'

  export default {
    components: { xpollHeader, xpollFooter },
    data() {
      return {
        lists: []
      }
    },
    created() {
      var v = this
      v.$axios.get('https://cnodejs.org/api/v1/topics')
        .then(r => {
          if (r.data.success) {
            v.lists = r.data.data
          }
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
</script>
