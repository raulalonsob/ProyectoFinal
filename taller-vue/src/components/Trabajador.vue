<template>
  <div class="container ">
      <div class="row">
        <h4>Usuario: {{usuario}}</h4>
        <form class="col-sm-12 col-md-6">
          <input type="button" class="boton" value="Nuevo Mantenimiento" @click="setActividad(venta)"><br>
          <input type="button" class="boton" value="Introducir Ruedas" @click="setActividad(inserRuedas)"><br>
          <input type="button" class="boton" value="Modificar Ruedas" @click="setActividad(modifRuedas)"><br>
          <input type="button" class="boton" value="Añadir Usuario" @click="setActividad(anadirUser)"><br>
          <input type="button" class="boton" value="Añadir Vehículo" @click="setActividad(anadirVehiculo)"><br>  
        </form>
        <div v-if="actividad=='venta'" class="col-md-5">
            <Venta/>
        </div>
        <div v-else-if="actividad=='insertarRuedas'" class="col-5">
            <CrearRueda/>
        </div>
        <div v-else-if="actividad=='modificarRuedas'" class="col-5">
            /**insertar componente modificarRuedas */
        </div>
        <div v-else-if="actividad=='anadirUsuario'" class="col-5">
            /**insertar componente anadirUser */
        </div>
        <div v-else-if="actividad=='anadirVehiculo'" class="col-5">
            /**insertar componente añadir Vehiculo */
        </div>
 
      </div>
  </div>
  
</template>


<script>
import Venta from "../components/Venta.vue"
import CrearRueda from "../components/CrearRueda.vue"
import axios from "axios"
export default {
  name: 'Trabajador',

  data(){
    return{
      venta:"venta",
      inserRuedas:"insertarRuedas",
      modifRuedas:"modificarRuedas",
      anadirUser:"anadirUsuario",
      anadirVehiculo:"anadirVehiculo",
      actividad:""

    }
  },
  methods:{
    setActividad(nueva){
      this.actividad=nueva;
    }

  },
  components:{
    Venta, CrearRueda
  },


  props:['usuario'],

}
</script>
<style scoped>
.container{
  width: 100%;
}

form input[type="button"]{
  margin-top: 5%;
  width: 250px;
}
.boton{
    text-decoration: none;
    padding: 5px;
    font-weight: 600;
    font-size: 18px;
    color: #fffdfd;
  background-color: #395766;
  border-radius: 6px;
  border: 2px solid #253b4d;
  }
.boton:hover{
    color:#0a6897;
    background-color: #ffffff;
  }


</style>