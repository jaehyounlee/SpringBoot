<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <h3 v-for="(user,index) in users" :key="user.id">
      <router-link :to="{name: 'DetailUser', params: {id:index}}"> {{user.name}} : {{user.phone}}</router-link>
    </h3>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      users: []
    }
  },
  created () {
    this.$http.get('/api/users').then((resp) => {
      this.users = resp.data.response
    })
  }
}
</script>
