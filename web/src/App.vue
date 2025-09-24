<template>
  <div>
    <div>Bot Name: {{ bot_name }}</div>
    <div>Bot Rating: {{ bot_rating }}</div>
  </div>
  <router-view></router-view>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue'
export default {
  name: 'App',
  setup() {
    let bot_name = ref("");
    let bot_rating = ref("");

    $.ajax({
      url: "http://127.0.0.1:3001/pk/getbotinfo",
      method: "GET",
      success: (response) => {
        console.log(response);
        bot_name.value = response.name;
        bot_rating.value = response.rating;
      }
    });
    
    return {
      bot_name,
      bot_rating
    }
  }
}
</script>

<style>

body {
  background-image: url("@/assets/background.png");
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
  height: 100vh;
  width: 100vw;
}
</style>
