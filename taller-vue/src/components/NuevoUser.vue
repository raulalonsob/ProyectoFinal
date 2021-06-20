<template>
<div>
    <form v-on:submit.prevent="aceptar">
      <h2>Insertar Usuario:</h2>
    <label for="username">Username:</label>
        <input type="text" name="username" v-model="nuevo.username" required>
      <br>
    <label for="contraseña">Contraseña:</label>
        <input type="text" name="contraseña" v-model="nuevo.password" required>
      <br>
    <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" v-model="nuevo.nombre" required>
        <br>
    <label for="apellidos">Apellidos:</label>
        <input type="text" name="apellidos" v-model="nuevo.apellidos" required>
        <br>
    <label for="dni">DNI:</label>
        <input type="text" name="dni" v-model="nuevo.dni" pattern="[0-9]{8}[A-Z]{1}" >
        <br>
    <label for="email">Email:</label>
        <input type="mail" name="email:" v-model="nuevo.email" >
        <br>
    <label for="direccion">Direccion:</label>
        <input type="text" name="direccion" v-model="nuevo.direccion" >
    <br>
    <label for="domicilio">Domicilio:</label>
        <input type="text" name="domicilio" v-model="nuevo.domicilio" >
        <br>
    <label for="trabajador">Empleado</label>
        <input type="checkbox" name="trabajador" true-value=1 false-value=0 v-model.number="nuevo.trabajador">
    
    <div class="d-flex justify-content-around">
        <input type="submit" class="boton" value="Aceptar">
        <input type="button" class="boton"  value="Cancelar" @click="cancelar">
    </div>
    <span v-show="ok" class="ok">*Usuario guardado correctamente</span>
    <span v-show="errMatri" class="error">Error, el usuario ya existe</span>
    
    </form> 
</div>   
</template>
<script>
import axios from "axios"
export default {
  name: 'NuevoUser',
    data(){
    return{

        ok:false,
        errMatri:false,
        nuevo:{
            username:"",
            password:"",
            trabajador:0,
            nombre:"",
            apellidos:"",
            dni:"",
            email:"",
            direccion:"",
            domicilio:""
        }

        
    }
  },

    methods: {
    aceptar(){
        console.log(this.nuevo)
      axios.post('http://localhost:8080/taller/v1/users', {  
        "username":this.nuevo.username,
        "password":this.nuevo.password,
        "trabajador":this.nuevo.trabajador,
        "nombre":this.nuevo.nombre,
        "apellidos":this.nuevo.apellidos,
        "dni":this.nuevo.dni,
        "email":this.nuevo.email,
        "direccion":this.nuevo.direccion,
        "domicilio":this.nuevo.domicilio
        })
        .then(response=>{this.ok=true}).
        catch(error=> {
            this.errMatri=true
          } )
        
    },
    cancelar(){
        this.username="",
        this.password="",
        this.trabajador="",
        this.nombre="",
        this.apellidos="",
        this.dni="",
        this.email="",
        this.direccion="",
        this.domicilio="",
        this.errMatri=false,
        this.ok=false
    }
    }
    

}
</script>
<style scoped>

form{
  min-width: 300px;
	padding:16px;
	border-radius:10px;
	margin:auto;
	background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  margin-bottom:3%;
  
}
input[type="radio"]{
  margin-left: 5%;
}
input[type="text"]{
  width:200px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}
input[type="mail"]{
  width:200px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;
}
input[type="date"]{
  width:200px;
	padding:3px 10px;
	border:1px solid #f6f6f6;
	border-radius:3px;
	background-color:#f6f6f6;
	margin:8px 0;
	display:inline-block;

}

form label{
	width:100px;
  font: bold;

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




input[type="number"]{
  width: 50px;
  margin-bottom: 10px;
  border:1px solid #f6f6f6;
  border-radius: 6px;
  padding: 5px;
  font-weight: 50;
  font-size: 15px;
}
.boton{
  text-decoration: none;
  padding: 5px;
  font-weight: 50;
  font-size: 15px;
  color: #fffdfd;
  background-color: #395766;
  border-radius: 6px;
  border: 2px solid #253b4d;
  margin-bottom: 1%;
}
.boton:hover{
  color:#0a6897;
  background-color: #ffffff;
}

#borrar{
  margin-left: 40px;
}
.error{
  color: red;
  font-size: 20px;
}
.ok{
  color: forestgreen;
  font-size:20px ;
}
</style>