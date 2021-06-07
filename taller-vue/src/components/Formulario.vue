<template>
 
  <div class="formulario">
    <form>
    <h2>Elige tus neumaticos:</h2>
   <label for="marca">Marca:</label>
    <select id="marca" v-model="busqueda.marca">
      <option v-for="(rueda,index) in ruedas" :key ="index" :value="busqueda.marca" >{{rueda.marca}}</option>
    </select>
    <br>
       <label for="anchura">Anchura</label>
    <select id="anchura"  v-model="busqueda.anchura" >
      <option v-for="(ruedas,index) in ruedas" :key ="index" :value="busqueda.anchura" >{{ruedas.anchura}}</option>
    </select>
    <br>
       <label for="perfil">Perfil</label>
    <select id="perfil" v-model="busqueda.perfil">
      <option v-for="(ruedas,index) in ruedas" :key ="index" :value="busqueda.perfil" >{{ruedas.perfil}}</option>
    </select>
    <br>
       <label for="llanta">Llanta</label>
    <select id="llanta" v-model="busqueda.llanta" >
      <option v-for="(ruedas,index) in ruedas" :key ="index" :value="busqueda.llanta" >{{ruedas.llanta}}</option>
    </select>
    <br>
     <label for="carga">Carga</label>
    <select id="carga" v-model="busqueda.carga">
      <option v-for="(ruedas,index) in ruedas" :key ="index" :value="busqueda.carga" >{{ruedas.carga}}</option>
    </select>
      <br>
      <label for="velocidad">Velocidad</label>
    <select id="velocidad" v-model="busqueda.velocidad" >
      <option v-for="(ruedas,index) in ruedas" :key ="index" :value="busqueda.velocidad" >{{ruedas.velocidad}}</option>
    </select>
    <br>
    </form>
  </div>
</template>

<script>
import axios from "axios"
export default {
  name: 'ConsultarRuedas',
    data(){
    return{
      ruedas:[],
      busqueda:{
        marca: "",
        modelo: "",
        anchura: "",
        perfil: "",
        llanta: "",
        carga: "",
        velocidad: "",
        precio: "",
      },
    }

    
  },

  methods: {
    
  },
  created() {
    axios.get("http://localhost:8080/taller/v1/ruedas")
    .then(response => {this.ruedas = response.data;})
  }
    
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
form{
	width:500px;
	padding:16px;
	border-radius:10px;
	margin:auto;
	background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  
}
#sinput{
  width:180px;
  font-size: 15px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}
form label{
	width:150px;
	font-weight:bold;
	display:inline-block;
}
form select{
	width:200px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}

form input[type="text"]{
	width:180px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}
form input[type="number"]{
  width:50px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}
form input[type="button"]{
  margin-top: 5%;
  margin-left: 30%;
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
