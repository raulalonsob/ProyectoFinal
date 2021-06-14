<template>

    <div class="container row align-items-center">

	<form class="form-signin col-sm-12 col-md-5 col-xl-8" v-on:submit.prevent="mandar">
		<h1 class="form-signin-heading text-muted">Inicio Sesión</h1>
		<input type="text" class="form-control" placeholder="Username" required autofocus="" v-model.lazy="usuario.username">
		<input type="password" class="form-control" placeholder="Password" required v-model.lazy="usuario.password">
    <input type="checkbox" id="Si" true-value=1 false-value=0 v-model="usuario.trabajador">
    <label for="si">Soy empleado de TireWheels</label>

        <div v-if="perfil.length==0" class="col-12">
            <span class="error text-danger">Usuario o contraseña incorrectos</span>
        </div>
		<input type="submit" class="btn btn-lg btn-primary btn-block" value="Iniciar">
        <input type="button" class="btn btn-lg btn-primary btn-block" value="Cerrar Sesión" @click="cerrar">	
	</form>
    <div v-if="perfil.length==1" class="col-md-6 col-sm-12">
          <Cliente :usuario="usuar"/>
    </div>
    <div v-else class="col-xl-2 col-md-7 align-self-rigth" id="log" >
      <img alt="log" src="../assets/login.png" id="log">
    </div>



    

</div>
</template>
<script>
import Cliente from "../components/Cliente.vue"
import axios from "axios"
export default {
  name: 'Cuenta',

  data(){
  return{
      perfil:[2,2],
      usuar:"",
      usuario:{
        username: "",
        password: "",
        trabajador:"0",

      },
  } 
  },
  components: {
    Cliente
    },
    methods: {
    mandar(){
        axios.get("http://localhost:8080/taller/v1/users",{
        params: this.usuario
        }
        )
        .then(response => (this.perfil=response.data, this.usuar=this.perfil[0].id_users)// this.perfil= response.data
        );
    },
    cerrar(){
        this.perfil=[2,2],
        this.usuar=""
    }
    }

   
}
</script>

<style scoped>
body {
    padding-top: 120px;
    padding-bottom: 40px;
    background-color: #eee;
  
  }
  .btn 
  {
   outline:0;
   border:none;
   border-top:none;
   border-bottom:none;
   border-left:none;
   margin-left: 1%;
   border-right:none;
   box-shadow:inset 2px -3px rgba(0,0,0,0.15);
  }
  .btn:focus
  {
   outline:0;
   -webkit-outline:0;
   -moz-outline:0;
  }

  .form-signin {
    max-width: 320px;
    padding: 15px;
    margin: 0 auto;
  }
  .form-signin .form-signin-heading, .form-signin {
    margin-bottom: 10px;
  }
  .form-signin .form-control {
    position: relative;
    font-size: 16px;
    height: auto;
    padding: 10px;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
    box-sizing: border-box;
  }
  .form-signin .form-control:focus {
    z-index: 2;
  }
  .form-signin input[type="text"] {
    margin-bottom: -1px;
    border-bottom-left-radius: 0;
    border-bottom-right-radius: 0;
    border-top-style: solid;
    border-right-style: solid;
    border-bottom-style: none;
    border-left-style: solid;
    border-color: #000;
  }
  .form-signin input[type="password"] {
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
    border-top-style: none;
    border-right-style: solid;
    border-bottom-style: solid;
    border-left-style: solid;
    border-color: rgb(0,0,0);
    border-top:1px solid rgba(0,0,0,0.08);
  }
  .form-signin-heading {
    color: #fff;
    text-align: center;
    text-shadow: 0 2px 2px rgba(0,0,0,0.5);
  }
  #log{
    
    min-width: 500px;
  }
  .form-signin input[type="checkbox"]{
    margin-right:5px ;
    margin-left:5px ;
  }
</style>