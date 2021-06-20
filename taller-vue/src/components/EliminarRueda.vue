<template>
<div>
    <h1>Listado de Neumáticos:</h1><hr>
    <span v-show="ok" class="ok">*Rueda eliminada correctamente</span>
    <span v-show="errMatri" class="error">*Error, por favor intentelo de nuevo</span>
  <div  class="datos" v-if="ruedas.length>0">
    
    <div class="row d-flex justify-content-start" v-for="(rod,index) in ruedas" :key="index">
        <div class="col-6">
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

        <form>
          <input type="button" class="boton" id="calcular" data-toggle="modal" data-target="#miModal" value="Eliminar" @click="enviarRueda(rod.id_ruedas)">
        </form>
            
    
        <!-- div para confirmar borrado-->
        <div class="modal fade" id="miModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">

              <h4>¿Desea Eliminar este Neumático?</h4>				
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <h5 id="rueda" > {{rod.marca}}_{{rod.modelo}}_{{rod.anchura}}/{{rod.perfil}}_{{rod.carga}}{{rod.velocidad}}_{{rod.precio}}</h5>
                <input type="button" class="boton" id="aceptar"  value="Eliminar" data-dismiss="modal" @click="eliminar()">
            </div>
          </div>
        </div>
        </div>

    </div><br>

    
  </div><spam v-else><h3>No hay resultados con esas caracteristicas</h3></spam></div>
</template>

<script>
import axios from "axios"
export default {
  name: 'EliminarRueda',
    data(){
    return{
        rueda:"",
        ruedas:[],
        ok:false,
        errMatri:false
    }
  },

  methods: {
    enviarRueda(ru){
      console.log(ru),
      this.rueda=ru
    },
    eliminar(){
      axios.delete('http://localhost:8080/taller/v1/ruedas/'+this.rueda, console.log(this.rueda))
      .then(response=>{
        this.ok=true,
        this.error=false
        axios.get("http://localhost:8080/taller/v1/ruedas")
        .then(response => {this.ruedas = response.data})
      })
      .catch(error=> {
        this.errMatri=true
        this.ok=false
      })
    }
  },

  created() {
      axios.get("http://localhost:8080/taller/v1/ruedas")
      .then(response => {this.ruedas = response.data})
  }

}

</script>

<style scoped>
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
.error{
  color: red;
  font-size: 20px;
}
.ok{
  color: forestgreen;
  font-size:20px ;
}

</style>
