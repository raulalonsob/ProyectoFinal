<template>
 <div id=container>
   <div id=header><img alt="rueda" src="./assets/rueda.png" id="rueda"><div id="header2">TireWeels</div></div>
   <div id="nav">
    <router-link to="/">Inicio</router-link> <hr>
    <router-link to="/clasificacion">Clasificacion</router-link><br>
    <router-link to="/jornadas">Jornadas</router-link><br>
    <router-link to="/nuevoPartido">Nuevo Partido</router-link><br>
    <router-link to="/equipos">Equipos</router-link><br>
    <router-link to="/jugadores">Jugadores</router-link><br>
    <router-link to="/nuevoJugador">Nuevo Jugador</router-link><br>
    <router-link to="/eliminarJugador">Eliminar Jugador</router-link><br>
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

#nav {
  padding: 30px;
  padding-left: 40px;
  text-align: left;
  font-size:large;
  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
  line-height: 30px;
  float: left;
  width: 15%;
  min-width: 140px;
 /* border: solid 1px red;*/
}
#vistas{
  float: right;
  width: 75%;
}
#nav a {
  font-weight: bold;
  color: #2c3e50;
  
}

#nav a.router-link-exact-active {
  color: #0a69e6;
}
#header{
  height: 70px;
  background:linear-gradient(15deg, #b5b6bbad 10%, #e8eeee );

  padding: 1em;
  margin-bottom: 10px;
}
#header2{
  font-family:'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
  float: left;
  text-shadow: 5px 4px 12px #424242;
  font-size: 55px;
  padding: 10px;
  
}
#rueda{
  float: left;
  height: 100%;
  margin: 2px;
}
</style>
