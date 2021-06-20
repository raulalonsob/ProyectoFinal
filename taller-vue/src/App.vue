<template>
 <div  id=container class="row">
    <div class="row col-12" id="header">

      <div class="col-md-5 col-lg-6" id="tire" >TireWheels</div>

      <div class="col-md-6 col-md-5 d-flex justify-content-around  align-self-end" id="nav">
        <router-link class="router" to="/">Inicio</router-link> 
        <router-link class="router" to="/contacto">Contacto</router-link>
        <router-link class="router" to="/cuenta">Mi cuenta</router-link>
        <router-link class="router" to="/gestion">Gestión Taller</router-link>
      </div>
      
   </div>
   
  <div class="col-12 d-flex justify-content-around" id="vistas">
    <router-view/>
  </div>
  <div class="col-12 align-self-end" >
    <Footer/>
  </div>
  
  </div>
</template>
<script>
import Footer from "./components/Footer.vue"
export default {
    components: {
    Footer
    },

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
  width: 100%;
  height: 98vh; 
  margin: 0px;
  padding: 0%;

}

#vistas{
  padding-top: 25px;
  padding-bottom: 25px;;


}
#nav a {
  font-weight: bold;
  color: #2c3e50;
  
}
#tire{
   -webkit-text-stroke: 1px rgb(26, 36, 131) ;
   text-shadow: 3px 3px 5px rgba(19, 19, 114, 0.87)

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
}
</style>
