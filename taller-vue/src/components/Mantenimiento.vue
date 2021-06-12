<template>
<h1>Mantenimientos:</h1>{{matricula}}

<div class="row d-flex justify-content-start" id="resultado"  v-for="(mant,index) in mantenimientos" :key="index">
        <ul class="col-12">
        <li>Fecha: {{mant.fecha}}</li>
        <li>Posición: {{mant.posicion_rueda}}</li>
        <li>Kilómetros: {{mant.kilometros}} km</li>
        <li>Rueda: {{mant.marca}} {{mant.modelo}}</li>
        </ul>
        <form >
            <input type="button" class="boton" id="borrar" value="Ver factura" @click="mandarMatricula(coche.matricula)">
        </form>
</div>
<div>
  
</div>
</template>

<script>
import axios from "axios"
export default {
  name: 'Mantenimiento',

    data(){
    return{
        mantenimientos:[],

    }
  },    
  created() {
    axios.get("http://localhost:8080/taller/v1/mantenimiento?matricula="+this.matricula)
        .then((response) => {
      this.mantenimientos=response.data
      console.log(this.mantenimientos)}
  
        )

  },

  watch:{

      matricula(matri){
      axios.get("http://localhost:8080/taller/v1/mantenimiento?matricula="+matri)
        .then((response) => {
      this.mantenimientos=response.data
      console.log(this.mantenimientos)}
  
        )
      },

  },

  props:['matricula'],

}
</script>
<style scoped>
#resultado{
  
  padding-top: 1%;
  margin-top: 1%;
  border-radius:10px;
  padding-left: 20px;
  margin-bottom: 5%;
  min-width: 300px;

background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
}
.boton{
    margin-bottom:15px;

}
</style>