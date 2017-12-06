<template>
  <div>
    <xpollHeader></xpollHeader>
    <xpollLeft></xpollLeft>
    <div class="rebot">
      <table>
        <tr>
          <th>ID</th><th>类型</th><th>组</th><th>创建时间</th><th>更新时间</th>
        </tr>
        <tr v-for="item in lists">
          <td v-text="item.id"></td>
          <td v-text="item.type"></td>
          <td v-text="item.groups"></td>
          <td v-text="item.createTime"></td>
          <td v-text="item.updateTime"></td>
        </tr>
      </table>
    </div>
    <xpollFooter></xpollFooter>
  </div>
</template>

<script type="text/javascript">
  import xpollHeader from '@/components/header'
  import xpollFooter from '@/components/footer'
  import xpollLeft from '@/components/left'

  export default {
    components: { xpollHeader, xpollFooter, xpollLeft },
    data() {
      return {
        lists: []
      }
    },
    created() {
      var v = this
      var url = 'http://127.0.0.1:8082/api/r/page'
      var page = new Object()
      page.size = 8
      page.num = 1
      v.$axios.post(url, page)
        .then(r => {
          if (r.data.success) {
            v.lists = r.data.data.data
          }
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
</script>
<style type="text/css" lang="scss">
  .rebot {
    width: 85%;
    float: right;
    table {
      width: 80%;
    }
  } 
</style>