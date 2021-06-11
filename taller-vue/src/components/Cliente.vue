<template>

    <h1>vehiculos</h1><hr>
  {{usuario}}
</template>

<script>
import axios from "axios"
export default {
  name: 'Cliente',
    data(){
    return{
        user:"1"


    }
  },
    created() {
    
    axios.get("http://localhost:8080/taller/v1/vehiculos?id_users="+this.usuario,{

        } )
        .then((result) => {
      console.log(result.data);
    })
  },
  methods: {
},
  props:['usuario'],

}
</script>