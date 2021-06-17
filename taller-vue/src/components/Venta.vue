<template>
<div>
    <form v-on:submit.prevent="aceptar">
      <h2>Nuevo Manteniemiento:</h2>
    <label for="matricula">Matrícula:</label>
        <input type="text" name="matricula" v-model="mantenimiento.matricula" required pattern="[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}|[A-Z]{2}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{2}|[A-Z]{1}[0-9]{4}[A-Z]{1}|[A-Z]{2}[0-9]{4}[A-Z]{1}|[A-Z]{3}[0-9]{4}[A-Z]{2}|[A-Z]{3}[0-9]{1,4}[A-Z]{1}|">
      <br>
    <label for="fecha">Fecha:</label>
        <input type="date" name="fecha" v-model.lazy="mantenimiento.fecha" required>
      <br>
    <label for="kilometros">kilómetros:</label>
        <input type="text" name="kilometros" v-model.number="mantenimiento.kilometros" required pattern="[0-9]{1,7}">
      <br>
    <label for="cantidad">Nº Ruedas:</label>
        <input type="number" min="0" name="cantidad" v-model.number="mantenimiento.cantidad_ruedas" required>
      <br>
    <label for="posicion">Posición:</label><br>
        
            <input type="radio" name="posicion" value="delanteras" v-model="mantenimiento.posicion_rueda" required>Delantera
            <input type="radio" name="posicion" value="traseras" v-model="mantenimiento.posicion_rueda" required>Trasera
            <input type="radio" name="posicion" value="todas" v-model="mantenimiento.posicion_rueda" required>Todas  

      <br>
    <label for="marca">Rueda:</label>
      <select id="marca" v-model.number="mantenimiento.id_ruedas" required>
        <option v-for="(rueda,index) in ruedas" :key ="index" :value='rueda.id_ruedas'>{{rueda.marca}}_{{rueda.modelo}}_{{rueda.anchura}}/{{rueda.perfil}}_{{rueda.carga}}{{rueda.velocidad}}</option>
      </select>


      <br>

    <div class="d-flex justify-content-around">
        <input type="submit" class="boton" value="Aceptar">
        <input type="button" class="boton"  value="Cancelar" @click="cancelar">
    </div>
    <span v-show="ok" class="ok">*Manteniemiento guardado correctamente</span>
    <span v-show="errMatri" class="error">Matricula no registrada en el sistema</span>
    <span v-show="error">Error, por favor intentelo de nuevo</span>
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
        vehiculos:[],
        ok:false,
        errMatri:false,
        mantenimiento:{
            matricula:"",
            fecha:"",
            kilometros:"",
            cantidad_ruedas:"",
            posicion_rueda:"",
            id_ruedas:"",
        }
    }
  },

    methods: {
    aceptar(){
      axios.post('http://localhost:8080/taller/v1/mantenimiento', {
        //json.stringify(this.mantenimiento) da error  
        "matricula":this.mantenimiento.matricula,
        "fecha":this.mantenimiento.fecha,
        "kilometros":this.mantenimiento.kilometros,
        "cantidad_ruedas":this.mantenimiento.cantidad_ruedas,
        "posicion_rueda":this.mantenimiento.posicion_rueda,
        "id_ruedas":this.mantenimiento.id_ruedas})

          .then(response=>{this.ok=true}).
          catch(error=> {
            this.errMatri=true
          } )
        
    },
    cancelar(){
        this.mantenimiento.matricula="",
        this.mantenimiento.fecha="",
        this.mantenimiento.kilometros="",
        this.mantenimiento.cantidad_ruedas="",
        this.mantenimiento.posicion_rueda="",
        this.mantenimiento.id_ruedas=""
        
    }
    },

  created() {
    axios.get("http://localhost:8080/taller/v1/ruedas")
    .then(response => {this.ruedas = response.data;}),
    
    axios.get("http://localhost:8080/taller/v1/vehiculos").then((result) => { this.vehiculos = result.data})
  
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
.error{
  color: red;
  font-size: 20px;
}
.ok{
  color: forestgreen;
  font-size:20px ;
}
</style>
