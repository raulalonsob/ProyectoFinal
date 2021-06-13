<template>
<h1>Tus vehículos:</h1>
<div v-if="vehiculos.length>0">
<div  class="row d-flex justify-content-start" id="resultado"  v-for="(coche,index) in vehiculos" :key="index">
        <ul class="col-3">
        <h3>{{coche.modelo}}</h3>
        <h5>{{coche.matricula}}</h5>
        </ul>
        <form class="col-5">
            <input type="button" class="boton" id="borrar" value="Historial" @click="mandarMatricula(coche.matricula)">
        </form>
</div>
<div v-if="matricula!=''" >
  <Manteniemiento :matricula="matricula"/>
</div></div>
<span v-else>No hay vehiculos para este usuario</span>
</template>

<script>
import Manteniemiento from "../components/Mantenimiento.vue"
import axios from "axios"
export default {
  name: 'Cliente',
  components: {
    Manteniemiento
  },
  data(){
    return{
        vehiculos:[],
        matricula:""

    }
  },
  methods:{
    mandarMatricula(new_matricula){
      console.log(new_matricula);
      this.matricula=new_matricula
    }

  },
    created() {
    
    axios.get("http://localhost:8080/taller/v1/vehiculos?id_users="+this.usuario)
        .then((response) => {
      this.vehiculos=response.data
    })
  },

  props:['usuario'],

}
</script>
<style scoped>
#resultado{
  
  padding-top: 1%;
  margin-top: 1%;
  border-radius:10px;
  padding-left: 1%;
  margin-bottom: 5%;
  min-width: 300px;

background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
}
.boton{
    margin-top:10% ;

}
</style>