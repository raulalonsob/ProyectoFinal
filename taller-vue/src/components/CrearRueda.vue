<template>
<div>
    <form v-on:submit.prevent="aceptar">
      <h2>Insertar nueva rueda:</h2>
    <label for="marca">Marca:</label>
        <select id="marca" v-model="nueva.marca" required>
            <option v-for="(marca,index) in marcas" :key ="index" :value='marca'>{{marca}}</option>
      </select>
      <br>
    <label for="modelo">Modelo:</label>
        <input type="text" name="modelo" v-model="nueva.modelo" required>
      <br>
    <label for="anchura">Anchura:</label>
        <select id="marca" v-model.number="nueva.anchura" required>
            <option v-for="(anchura,index) in anchuras" :key ="index" :value='anchura'>{{anchura}}</option>
        </select>   
        <br>
    <label for="perfil">Perfil:</label>
        <select id="perfil" v-model.number="nueva.perfil" required>
            <option v-for="(perfil,index) in perfiles" :key ="index" :value='perfil'>{{perfil}}</option>
        </select> 
         <br>
    <label for="llanta">Llanta:</label>
        <select id="llanta" v-model.number="nueva.llanta" required>
            <option v-for="(llanta,index) in llantas" :key ="index" :value='llanta'>{{llanta}}´´</option>
        </select> 
      <br>
    <label for="carga">Carga:</label>
        <select id="carga" v-model.number="nueva.carga" required>
            <option v-for="(carga,index) in cargas" :key ="index" :value='carga'>{{carga}}</option>
        </select>  
    <br>
    <label for="velocidad">Velocidad:</label>
        <select id="velocidad" v-model="nueva.velocidad" required>
            <option v-for="(velocidad,index) in velocidades" :key ="index" :value='velocidad'>{{velocidad}}</option>
        </select> 
    <br>
    <label for="importe">Precio:</label>
        <input type="text" name="importe" v-model="nueva.importe" required>

    <br>

    <div class="d-flex justify-content-around">
        <input type="submit" class="boton" value="Aceptar">
        <input type="button" class="boton"  value="Cancelar" @click="cancelar">
    </div>
    <span v-show="ok" class="ok">*Rueda guardada correctamente</span>
    <span v-show="errMatri" class="error">Error, por favor intentelo de nuevo</span>
    
    </form> 
</div>   
</template>
<script>
import axios from "axios"
export default {
  name: 'CrearRueda',
    data(){
    return{
        ruedas:[],
        marcas:["Michelin","Dunlop","Continental","Pirelli"],
        anchuras:[135,145,155,165,175,185,195,205,215,225,235,245,255,265,275,285,295,305,315,325,335],
        perfiles:[30,35,40,45,50,55,60,65,70,75],
        llantas:[15,16,17,18,19,20,21,22],
        cargas:[90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120],
        velocidades:["H","R","S","T","V","W","Z",],
        vehiculos:[],
        ok:false,
        errMatri:false,
        nueva:{
            marca:"",
            modelo:"",
            anchura:"",
            perfil:"",
            llanta:"",
            carga:"",
            velocidad:"",
            precio:""
        }
    }
  },

    methods: {
    aceptar(){
      axios.post('http://localhost:8080/taller/v1/ruedas', {  
        "marca":this.nueva.marca,
        "modelo":this.nueva.modelo,
        "anchura":this.nueva.anchura,
        "perfil":this.nueva.perfil,
        "llanta":this.nueva.llanta,
        "carga":this.nueva.carga,
        "velocidad":this.nueva.velocidad,
        "precio":this.nueva.precio
        })
        .then(response=>{this.ok=true}).
        catch(error=> {
            this.errMatri=true
          } )
        
    },
    cancelar(){
        this.nueva.marca="",
        this.nueva.modelo="",
        this.nueva.anchura="",
        this.nueva.perfil="",
        this.nueva.llanta="",
        this.nueva.carga="",
        this.nueva.velocidad="",
        this.nueva.importe=""
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
