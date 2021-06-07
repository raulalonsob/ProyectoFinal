<template>
 <div id=container>
    <div id="header">
      <div id="header2">TireWheels</div>
      <div id="nav">
        <router-link class="router" to="/">Inicio</router-link> 
        <router-link class="router" to="/presentacion">Quienes somos </router-link>
        <router-link class="router" to="/cuenta">Mi cuenta</router-link>
        <router-link class="router" to="/gestion">Gestion Taller</router-link>
      </div>
    </div>
   

   
  <div id="vistas">
    <router-view/>
  </div>
  
  </div>
</template>
<script>
import axios from "axios";
export default {
  created() {
    axios.get("http://localhost:8080/taller/v1/vehiculos").then((result) => {
      console.log(result.data);
    })
  }
};
</script>

<style>

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  
  color: #2c3e50;
}


#vistas{
  padding-top: 25px;
}
#nav a {
  font-weight: bold;
  color: #2c3e50;
  
}

#nav a.router-link-exact-active {
  color: #0a69e6;
}

#header{
  height: 100px;
  background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  padding: 1em;
  margin-bottom: 10px;
  font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  font-size: 55px;
  padding: 10px;
}
#header2{
  float: left;
  width: 40%;
  padding-top: 1%;
}
.router{
  margin-right: 25px;
}



#nav {
  padding-top: 4%;
  width: 50%;
  float: right;
  text-align: right;
  font-size:large;
  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  line-height: 30px;
  
  min-width: 140px;
 /* border: solid 1px red;*/
}
</style>
