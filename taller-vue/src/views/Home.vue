<template>
  <div id=imagen><img alt="rueda" src="../assets/rueda.png" id="rueda"></div>
  <div class="home">
   <Formulario msg="Introduzca los filtros"/>
  </div>
</template>


<script>
 
 import Formulario from '@/components/Formulario.vue'

export default {
  name: 'Home',
  components: {
    Formulario
  }
}
</script>
<style scoped>
 #imagen{
  float: left;
  width: 20%;
}
#rueda{
  width: 80%
}

</style>
