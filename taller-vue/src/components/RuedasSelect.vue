<template>
<div>
    <h1>Resultado de Busqueda:</h1><hr>
  <div class="datos" v-if="rueda.length>0">
    
    <div  v-for="(rod,index) in rueda" :key="index">
        <div class="lista">
        <ul >
        <li> Marca: {{rod.marca}}</li>
        <li> Anchura: {{rod.anchura}}</li>
        <li> Perfil: {{rod.perfil}}</li>
        <li> Llanta: {{rod.llanta}}</li>
        <li> Carga: {{rod.carga}}</li>
        <li> Velocidad: {{rod.velocidad}}</li>
        <li> Precio: {{rod.precio}}€</li>

        </ul>
        </div>

        <div class="imagen" v-if="rod.marca=='Michelin'">
            <img  class="logo" src="../assets/Michelin.png">
        </div>
        <div class="imagen" v-if="rod.marca=='Dunlop'">
            <img  class="logo" src="../assets/Dunlop1.png">
        </div>
        <div class="imagen" v-if="rod.marca=='Continental'">
            <img  class="logo" src="../assets/Continental.png">
        </div>
        <div class="imagen" v-if="rod.marca=='Pirelli'">
            <img  class="logo" src="../assets/Pirelli.png">
        </div>

        <form>
            <input type="button" class="boton" id="borrar" value="Añadir a la cesta" @click="borrarJugador(jugador.id)">
        </form>
        
    
   <hr>
    </div><br>

    
  </div><spam v-else><h3>El no tiene jugadores</h3></spam></div>
</template>

<script>
import axios from "axios"
export default {
  name: 'Datos',
    data(){
    return{
        rueda:[]
    }
  },

  methods: {
  },
  props:['filtro'],
  watch:{
    filtro(n){
      this.rueda=n;
    }
  }
    

}
</script>
<style >
.logo{
    height: 160px;
}
.lista{
    float: left;
    width: 29%;
}
.imagen{
    float: left;
    width: 49%;
}

.datos{

  font-weight: 50px;  
      
  width: 150%;
  text-align: left;  
	padding-top: 20px;
    padding-left: 2%;
  padding-bottom: 20px;

}
input[type="number"]{
  width: 50px;
  margin-bottom: 10px;
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
}
.boton:hover{
  color:#0a6897;
  background-color: #ffffff;
}
form{
  margin-left: 30px;
  font-size:large;
}
#borrar{
  margin-left: 40px;
}
</style>
