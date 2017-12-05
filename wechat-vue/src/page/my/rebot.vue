<template>
  <div>
    <xpollHeader></xpollHeader>
    <xpollLeft></xpollLeft>
    <div>
      我是内容
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
      console.info("水电费1")
      var url = 'http://127.0.0.1:8082/api/s/page'
      var page = new Object()
      page.size = 8
      page.num = 1
      v.$axios.post(url, page)
        .then(r => {
            console.info(r)
          if (r.data.success) {
            // v.lists = r.data.data
          }
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
</script>  