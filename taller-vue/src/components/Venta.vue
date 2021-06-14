<template>
<div>
    <form v-on:submit.prevent="aceptar">
      <h2>Nuevo Manteniemiento:</h2>
    <label for="matricula">Matrícula:</label>
        <input type="text" name="matricula" v-model.lazy="mandar.matricula" required pattern="[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}|[A-Z]{2}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{1}|[A-Z]{2}[0-9]{4}[A-Z]{1}|[A-Z]{3}[0-9]{4}[A-Z]{2}|[A-Z]{3}[0-9]{1,4}[A-Z]{1}|">
      <br>
    <label for="fecha">Fecha:</label>
        <input type="date" name="fecha" v-model.lazy="mandar.fecha" required>
      <br>
    <label for="matricula">kilómetros:</label>
        <input type="text" name="matricula" v-model.lazy="mandar.kilometros" required pattern="[0-9]{1,7}">
      <br>
    <label for="cantidad">Nº Ruedas:</label>
        <input type="number" name="cantidad" v-model.lazy="mandar.cantidad_ruedas" required>
      <br>
    <label for="posicion">Posición:</label><br>
        
            <input type="radio" name="posicion" value="delanteras" v-model.lazy="mandar.posicion_rueda" required>Delantera
            <input type="radio" name="posicion" value="traseras" v-model.lazy="mandar.posicion_rueda" required>Trasera
            <input type="radio" name="posicion" value="todas" v-model.lazy="mandar.posicion_rueda" required>Todas  

      <br>
    <label for="marca">Rueda:</label>
      <select id="marca" v-model.lazy="mandar.id_ruedas" required>
        <option v-for="(rueda,index) in ruedas" :key ="index" :value='rueda.id_ruedas'>{{rueda.marca}}_{{rueda.modelo}}_{{rueda.anchura}}/{{rueda.perfil}}_{{rueda.carga}}{{rueda.velocidad}}</option>
      </select>


      <br>

    <div class="d-flex justify-content-around">
        <input type="submit" class="boton" value="Aceptar">
        <input type="button" class="boton"  value="Cancelar" @click="cancelar">
    </div>
    </form> 
</div>   
</template>
<script>
import axios from "axios"
export default {
  name: 'Venta',
    data(){
    return{
        ruedas:[],
        mandar:{
            matricula:"",
            fecha:"",
            kilometros:"",
            cantidad_ruedas:"",
            posicion_rueda:"",
            id_ruedas:""
        }
    }
  },

    methods: {
    aceptar(){
        /**axios.get("http://localhost:8080/taller/v1/users",{
        params: this.usuario
        }
        )
        .then(response => (this.perfil=response.data, this.usuar=this.perfil[0].id_users)// this.perfil= response.data
        );*/
        console.log(this.mandar);
    },
    cancelar(){
        this.mandar.matricula="",
        this.mandar.fecha="",
        this.mandar.kilometros="",
        this.mandar.cantidad_ruedas="",
        this.mandar.posicion_rueda="",
        this.mandar.id_ruedas=""
        
    }
    },

  created() {
    axios.get("http://localhost:8080/taller/v1/ruedas")
    .then(response => {this.ruedas = response.data;})
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
</style>
