<template>
  <div class="row justify-content-around" id="vista">
    <div class="img-responsive d-md-none d-xl-block col-lg-3  " id=imagen><img alt="rueda" src="../assets/rueda.png" id="rueda"></div>
 
    <div class="d-flex justify-content-around col-md-12 col-lg-3">
    <form>
      <h2>Elige Tus Neumáticos:</h2>
      <label for="marca">Marca:</label>
        <select id="marca" v-model="busqueda.marca" required>

          <option :value="''" >Todas</option>
          <optgroup label="Principales Marcas">
              <option v-for="(marca,index) in marcas" :key ="index" :value='marca'>{{marca}}</option>
          </optgroup>
                    
        </select>
        <br>
      <label for="anchura">Anchura:</label>
          <select id="marca" v-model.number="busqueda.anchura" required>
            <option :value="''" >Todas</option>
            <option v-for="(anchura,index) in anchuras" :key ="index" :value='anchura'>{{anchura}}</option>
          </select>   
          <br>
      <label for="perfil">Perfil:</label>
          <select id="perfil" v-model.number="busqueda.perfil" required>
            <option :value="''" >Todos</option>
            <option v-for="(perfil,index) in perfiles" :key ="index" :value='perfil'>{{perfil}}</option>
          </select> 
          <br>
      <label for="llanta">Llanta:</label>
          <select id="llanta" v-model.number="busqueda.llanta" required>
            <option :value="''" >Todas</option>
            <option v-for="(llanta,index) in llantas" :key ="index" :value='llanta'>{{llanta}}</option>
          </select> 
        <br>
      <label for="carga">Carga:</label>
          <select id="carga" v-model.number="busqueda.carga" required>
            <option :value="''" >Todas</option>
            <option v-for="(carga,index) in cargas" :key ="index" :value='carga'>{{carga}}</option>
          </select>  
      <br>
      <label for="velocidad">Velocidad:</label>
          <select id="velocidad" v-model="busqueda.velocidad" required>
            <option :value="''" >Todas</option>
            <option v-for="(velocidad,index) in velocidades" :key ="index" :value='velocidad'>{{velocidad}}</option>
          </select> 
      <br>
        <br>
        <div class="d-flex justify-content-around">
        <input type="button" class="boton" @click="mandar" value="Buscar">
          <input type="button" class="boton" @click="limpiar" value="Limpiar">
        </div>
    </form>    

    </div>      
    <div class="row col-md-5" id="resultado" v-show="mostrar">
      <RuedasSelec :filtro="ruedasFiltro" />
    </div>
    <div class="row col-md-5 img-responsive"  >
      <img alt="marcas" src="../assets/marcas.png" id="marcas">
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
      marcas:["Michelin","Dunlop","Continental","Pirelli"],
      anchuras:[135,145,155,165,175,185,195,205,215,225,235,245,255,265,275,285,295,305,315,325,335],
      perfiles:[30,35,40,45,50,55,60,65,70,75],
      llantas:[15,16,17,18,19,20,21,22],
      cargas:[90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120],
      velocidades:["H","R","S","T","V","W","Z",],
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
      mostrar:false
    }
    },

    methods: {
    mandar(){
    this.mostrar=true,
    axios.get("http://localhost:8080/taller/v1/ruedas",{
      params: this.busqueda
    }
    )
    .then(response => this.ruedasFiltro=response.data);
    },
    limpiar(){
        this.mostrar=false,
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
    .then(response => {this.ruedas = response.data, console.log(response)})
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
  width: 80%;
  margin-bottom:2%
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
