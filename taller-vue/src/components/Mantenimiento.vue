<template>
<h1>Mantenimientos:</h1>{{matricula}}

<div class="row d-flex justify-content-start" id="resultado"  v-for="(mant,index) in mantenimientos" :key="index">
        <ul class="col-3">
        <h3>{{mant.modelo}}</h3>
        <h5>{{mant.matricula}}</h5>
        </ul>
        <form class="col-5">
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
        matri:""

    }
  },methods:{
    mandarMatricula(matricula){
      console.log(matricula);
    }

  },
    created() {
    console.log(this.mantenimiento)
   /** axios.get("http://localhost:8080/taller/v1/vehiculos?id_users="+this.usuario)
        .then((response) => {
      this.vehiculos=response.data
    })*/ 
  },
  watch:{
      matricula(n){
          this.matri=n
      }
  },

  props:['matricula'],

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