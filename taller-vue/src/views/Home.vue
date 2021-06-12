<template>
  <div class="row justify-content-around" id="vista">
    <div class="align-items-center d-md-none d-xl-block col-lg-2  " id=imagen><img alt="rueda" src="../assets/rueda.png" id="rueda"></div>
 
    <div class="d-flex justify-content-around col-md-12 col-lg-3">
      <form>
      <h2>Elige tus neumaticos:</h2>
    <label for="marca">Marca:</label>
      <select id="marca" v-model.lazy="busqueda.marca">
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.marca" >{{rueda.marca}}</option>
      </select>
      <br>
        <label for="anchura">Anchura</label>
      <select id="anchura" v-model.lazy="busqueda.anchura" >
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.anchura" >{{rueda.anchura}}</option>
      </select>
      <br>
        <label for="perfil">Perfil</label>
      <select id="perfil" v-model.lazy="busqueda.perfil">
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.perfil" >{{rueda.perfil}}</option>
      </select>
      <br>
        <label for="llanta">Llanta</label>
      <select id="llanta" v-model.lazy="busqueda.llanta" >
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.llanta" >{{rueda.llanta}}</option>
      </select>
      <br>
      <label for="carga">Carga</label>
      <select id="carga" v-model.lazy="busqueda.carga">
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.carga" >{{rueda.carga}}</option>
      </select>
        <br>
        <label for="velocidad">Velocidad</label>
      <select id="velocidad" v-model.lazy="busqueda.velocidad" >
        <option v-for="(rueda,index) in ruedas" :key ="index" :value="rueda.velocidad" >{{rueda.velocidad}}</option>
      </select>
      <br>
      <div class="d-flex justify-content-around">
      <input type="button" class="boton" @click="mandar" value="Buscar">
        <input type="button" class="boton" @click="limpiar" value="Limpiar">
      </div>
      </form>    

    </div>      
    <div class="row col-md-4" id="resultado" v-show="busqueda">
      <RuedasSelec :filtro="ruedasFiltro" />
    </div>
  </div>

</template>


<script>
 

import axios from "axios"
import RuedasSelec from "../components/RuedasSelect.vue"
export default {
  name: 'Home',
  components: {
    RuedasSelec
    },
  data(){
  return{
      ruedas:[],
      ruedasFiltro:[],
      busqueda:{
        marca: "",
        modelo: "",
        anchura: "",
        perfil: "",
        llanta: "",
        carga: "",
        velocidad: "",
        precio: "",
      }
    }
    },

    methods: {
    mandar(){
    axios.get("http://localhost:8080/taller/v1/ruedas",{
      params: this.busqueda
    }
    )
    .then(response => this.ruedasFiltro=response.data);
    },
    limpiar(){
        this.busqueda.marca = "",
        this.busqueda.anchura="",
        this.busqueda.perfil= "",
        this.busqueda.llanta= "",
        this.busqueda.carga= "",
        this.busqueda.velocidad=""

    },
  },
  created() {
    axios.get("http://localhost:8080/taller/v1/ruedas")
    .then(response => {this.ruedas = response.data;})
  }
}
</script>
<style scoped>



#resultado{
  margin-left: 30px;
  padding-top: 1%;
  min-width: 530px;
  height: 500px;
  overflow-x:hidden ;
  overflow-y:auto;
	border-radius:10px;
  padding-left: 1%;

background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  

}

#rueda{
  width: 80%
}
form{
  min-width: 400px;
  height: 500px;
	padding-right: 50px;
	padding:16px;
	border-radius:10px;
	margin-bottom: 30px;
	background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  
}

form label{
	width:150px;
	font-weight:bold;
	display:inline-block;
}
form select{
	width:150px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}

form input[type="button"]{
  margin-top: 5%;
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
