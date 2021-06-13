<template>
 <div  id=container class="row">
    <div class="row col-12" id="header">
      <div class="col-md-5 col-lg-6" >TireWheels</div>
      <div class="col-md-6 col-md-5 d-flex justify-content-around  align-self-end" id="nav">
        <router-link class="router" to="/">Inicio</router-link> 
        <router-link class="router" to="/presentacion">¿Quiénes somos? </router-link>
        <router-link class="router" to="/cuenta">Mi cuenta</router-link>
        <router-link class="router" to="/gestion">Gestión Taller</router-link>
      </div>
 
   
   </div>
   
  <div class="col-12 d-flex justify-content-around" id="vistas">
    <router-view/>
  </div>
  <div class="col-12 align-self-end" id="footer">
    <Footer/>
  </div>
  
  </div>
</template>
<script>
import Footer from "./components/Footer.vue"
import axios from "axios";
export default {
    components: {
    Footer
    },
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

#container{

  height: 99vh; 
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
  padding-left:50px ;
  height: auto;
  background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );
  font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  font-size: 55px;


}




#nav {
  padding-top: 4%;
  text-align: right;
  font-size:large;
  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  line-height: 30px;
  
 /* border: solid 1px red;*/
}
</style>
