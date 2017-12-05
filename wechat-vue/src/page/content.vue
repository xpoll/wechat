<template>
  <div>
    <xpollHeader></xpollHeader>
    <h2 v-text="data.title"></h2>
    <p>作者: {{data.author ? data.author.loginname : ''}}&nbsp;&nbsp;发表于: {{$util.getTime(data.create_at)}}</p>
    <article v-html="data.content"></article>
    <h4>网友回复:</h4>
    <ul>
      <li v-for="item in data.replies">
        <p>评论者: {{item.author.loginname}}</p>
        <article v-html="item.content"></article>
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
        id: this.$route.params.id,
        data: {def: ''}
      }
    },
    created() {
      var v = this
      v.$axios.get('https://cnodejs.org/api/v1/topic/' + this.id)
        .then(r => {
          if (r.data.success) {
            v.data = r.data.data
          }
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
</script>  