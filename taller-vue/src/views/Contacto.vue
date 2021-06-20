<template>
<div class="row container col-12">

    <div class="col-12 align-items-center" id="sup">

        <h1>¿CÓMO PODEMOS AYUDARTE?</h1>
        <h3>PONGASE EN CONTACTO CON NOSOTROS</h3>

    </div>
  <div class="row col-12 ">
    
    <div class="col-sm-12 col-md-5" id="contact">

        <img alt="marcas" src="../assets/tel.png" class="logo"><spam class="contact">923 99 99 99</spam><br>
        <img alt="marcas" src="../assets/wha.png" class="logo"><spam class="contact">633 33 33 33</spam><br>
        <img alt="marcas" src="../assets/mail.png" class="logo"><spam class="contact">consulta@infoTireWheels.com</spam>
    
    </div>   

    <div class="row col-sm-12 col-md-7">

        <div class="col-sm-12 col-md-5" id="direcc">
            <h4>Ven a Visitarnos:</h4>
            <p class="direcc">Tirewheels<br>
                Calle Medina, 44<br> 37184<br> Villares de la Reina<br> Salamanca</p>
        </div>

        <div class="col-sm-12 col-lg-7 ">
              <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3011.60749343531!2d-5.639646284586527!3d40.990074879302696!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd3f2fbc6aec230b%3A0x188c80efaca1f202!2sTirewheels!5e0!3m2!1ses!2ses!4v1624119790163!5m2!1ses!2ses" height="300px" width="100%" allowfullscreen="" loading="lazy"></iframe>
        </div>
    </div>
  </div> 

  </div>

</template>

<script>

export default {
  name: 'Contacto',
}
</script>

<style scoped>
#sup{
    padding: 1%;
    text-align: center;
    background-color: rgba(28, 54, 109, 0.096);
    margin-bottom: 1%;

   text-shadow: 2px 2px 5px rgba(19, 19, 114, 0.651)

}
.container{
    margin: 0px;
    padding: 0px;
}
.logo{
    width: 50px;
    height: 35px;
    margin-right: 25px;
    margin-bottom: 5%;
}
.contact{
    font-size: larger;
}
#direcc{
    min-width: 150px;
}
#contact{
    padding-left: 5%;
}
</style>