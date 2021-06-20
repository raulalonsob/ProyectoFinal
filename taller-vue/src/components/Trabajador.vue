<template>
  <div class="container ">
      <div class="row">
        <h4>Usuario: {{usuario}}</h4>
        <form class="col-sm-12 col-md-6">
          <input type="button" class="boton" value="Nuevo Mantenimiento" @click="setActividad(venta)"><br>
          <input type="button" class="boton" value="Introducir Ruedas" @click="setActividad(inserRuedas)"><br>
          <input type="button" class="boton" value="Eliminar Ruedas" @click="setActividad(elimRuedas)"><br>
          <input type="button" class="boton" value="Añadir Usuario" @click="setActividad(anadirUser)"><br>
          <input type="button" class="boton" value="Añadir Vehículo" @click="setActividad(anadirVehiculo)"><br>  
        </form>
        <div v-if="actividad=='venta'" class="col-md-5 ">
            <Venta/>
        </div>
        <div v-else-if="actividad=='insertarRuedas'" class="col-5">
            <CrearRueda/>
        </div>
        <div v-else-if="actividad=='eliminarRuedas'" class="col-5 resultado">
            <EliminarRueda/>
        </div>
        <div v-else-if="actividad=='anadirUsuario'" class="col-5">
            <NuevoUser/>
        </div>
        <div v-else-if="actividad=='anadirVehiculo'" class="col-5">
            <NuevoVehiculo/>
        </div>
 
      </div>
  </div>
  
</template>


<script>
import Venta from "../components/Venta.vue"
import CrearRueda from "../components/CrearRueda.vue"
import EliminarRueda from "../components/EliminarRueda.vue"
import NuevoUser from"../components/NuevoUser.vue"
import NuevoVehiculo from"../components/NuevoVehiculo.vue"
export default {
  name: 'Trabajador',

  data(){
    return{
      venta:"venta",
      inserRuedas:"insertarRuedas",
      elimRuedas:"eliminarRuedas",
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
    Venta, 
    CrearRueda,
    EliminarRueda, 
    NuevoUser,
    NuevoVehiculo
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

.resultado{
  margin-left: 30px;
  padding-top: 1%;
  min-width: 400px;
  height: 500px;
  overflow-x:hidden ;
  overflow-y:auto;
  border-radius:10px;
  padding-left: 1%;
  background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  }



</style>