FROM tomcat:9.0.24

EXPOSE 8080

RUN rm -rf /usr/local/tomcat/webapps/

#incluimos el war generado en la carpeta correspondiente del servidor tomcat
ADD ./demo.war /usr/local/tomcat/webapps/

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]

#docker build -t raulalonsob/demo .
#docker run --network red_proyecto --name demo_back -p 8080:8080 raulalonsob/demo