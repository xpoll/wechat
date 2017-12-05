<template>
  <div>
    <xpollHeader></xpollHeader>
    <xpollLeft></xpollLeft>
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
      console.info("水电费2")
    //   v.$axios.get('https://cnodejs.org/api/v1/topics')
    //     .then(r => {
    //       if (r.data.success) {
    //         v.lists = r.data.data
    //       }
    //     })
    //     .catch(error => {
    //       console.log(error);
    //     });
    }
  }
</script>  