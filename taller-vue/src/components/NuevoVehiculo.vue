<template>
<div>
    <form v-on:submit.prevent="aceptar">

    <h2>Insertar Usuario:</h2>

    <label for="matricula" >Matrícula:</label>
        <input type="text" name="matricula" v-model="nuevo.matricula" required pattern="[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}|[A-Z]{2}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{1}|[A-Z]{2}[0-9]{4}[A-Z]{1}|[A-Z]{3}[0-9]{4}[A-Z]{2}|[A-Z]{3}[0-9]{1,4}[A-Z]{1}|" >
      <br>

    <label for="modelo">Modelo:</label>
        <input type="text" name="modelo" v-model="nuevo.modelo" required>
      <br>

    <label for="usuario">Propietario:</label>
    <select id="marca" v-model.number="nuevo.id_users" required>
        <option v-for="(user,index) in usuarios" :key ="index" :value='user.id_users'>{{user.username}}</option>
    </select>
      
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
  name: 'NuevoVehiculo',
    data(){
        return{
            usuarios:[],
            ok:false,
            errMatri:false,
            nuevo:{
                matricula:"",
                modelo:"",
                id_users:"",
            }   
        }
    },

    methods: {
        aceptar(){
            console.log(this.nuevo)
        axios.post('http://localhost:8080/taller/v1/vehiculos', {  
            "matricula":this.nuevo.matricula,
            "modelo":this.nuevo.modelo,
            "id_users":this.nuevo.id_users})
            .then(response=>{this.ok=true, this.errMatri=false}).
            catch(error=> {
                console.log(error.message)
                this.errMatri=true,
                this.ok=false
            })
            
        },
        cancelar(){
            this.matricula="",
            this.modelo="",
            this.id_users="",
            this.errMatri=false,
            this.ok=false
        }
        },

    created(){
        axios.get("http://localhost:8080/taller/v1/users")
        .then(response => {this.usuarios = response.data}).
        catch(error=> {
            console.log(error.message)
        } )
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