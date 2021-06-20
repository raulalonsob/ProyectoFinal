#Dockerfile para crear una imagen basada en mysql
FROM mysql

#Se copian los scripts desde la carpeta en la que estén al directorio dentro del contenedor
#En este ejemplo no se va a mapear mediante volúmenes ni a bindear la bbdd.
COPY ./scriptSQL/ /docker-entrypoint-initdb.d/

#En el arranque del contenedor habrá que indicar los datos referidos a la bbdd como variables de entorno
#Por ejemplo:
#docker network create red_proyecto
#docker build -t raulalonsob/basedatos .
#docker run -d --network red_proyecto --name mi_mysql -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=taller -e MYSQL_PASSWORD=1234 -p 3307:3306 raulalonsob/basedatos