<template>
 
  
</template>

<script>
import axios from "axios"
export default {
  name: 'ConsultarRuedas',
    data(){
    return{
      ruedas:[],
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
    }

    
  },

  methods: {
    mandar(){
    axios.get("http://localhost:8080/taller/v1/ruedas",{
      params: this.busqueda
    }
    )
    .then(response => console.log(response));
    },
    limpiar(){
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
    .then(response => {this.ruedas = response.data;})
  }
    
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
form{
	width:500px;
	padding:16px;
	border-radius:10px;
	margin:auto;
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
  margin-left: 30%;
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
