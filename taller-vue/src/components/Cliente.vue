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
        rueda:[]
    }
  },

  methods: {
  },
  props:['usuario'],

    

}
</script>