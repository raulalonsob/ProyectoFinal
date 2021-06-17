<template>
<div>
    <h1>Resultado de Busqueda:</h1><hr>
  <div class="datos" v-if="rueda.length>0">
    
    <div class="row d-flex justify-content-start"  v-for="(rod,index) in rueda" :key="index">
        <div class="col-3">
        <ul >
        <li> Marca: {{rod.marca}}</li>
        <li> Modelo: {{rod.modelo}}</li>
        <li> Anchura: {{rod.anchura}}</li>
        <li> Perfil: {{rod.perfil}}</li>
        <li> Llanta: {{rod.llanta}}</li>
        <li> Carga: {{rod.carga}}</li>
        <li> Velocidad: {{rod.velocidad}}</li>
        <li> Precio: {{rod.precio}}€</li>

        </ul>
        </div>

        <div class="imagen col-4" v-if="rod.marca=='Michelin'">
            <img  class="logo" src="../assets/Michelin.png">
        </div>
        <div class="imagen col-4" v-if="rod.marca=='Dunlop'">
            <img  class="logo" src="../assets/Dunlop1.png">
        </div>
        <div class="imagen col-4" v-if="rod.marca=='Continental'">
            <img  class="logo" src="../assets/Continental.png">
        </div>
        <div class="imagen col-4 img-responsive" v-if="rod.marca=='Pirelli'">
            <img  class="logo" src="../assets/Pirelli.png">
        </div>

        <form>
          <label for="cantidad">Nº Ruedas: </label>
            <input type="number" name="cantidad" v-model.number="ruedas" required>
          <input type="button" class="boton" id="borrar" value="calcular precio" @click="calcularPrecio(rod.precio)">
        </form>
        
    
   <hr>
    </div><br>

    
  </div><spam v-else><h3>No hay resultados con esas caracteristicas</h3></spam></div>
</template>

<script>
import axios from "axios"
export default {
  name: 'Datos',
    data(){
    return{
        rueda:[],
        ruedas:""
    }
  },

  methods: {
    calcularPrecio(n){
      console.log(n*this.ruedas)
    }
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
  margin-left: 10px;
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
form{
  margin-left: 30px;
  font-size:large;
}
#borrar{
  margin-left: 40px;
}
</style>
