-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: taller
-- ------------------------------------------------------
-- Server version	8.0.23
Drop database if exists taller;
create database taller;
use taller;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `authorities` (
  `authority` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `fk_authorities_users1_idx` (`username`),
  CONSTRAINT `fk_authorities_users1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorities`
--

LOCK TABLES `authorities` WRITE;
/*!40000 ALTER TABLE `authorities` DISABLE KEYS */;
INSERT INTO `authorities` VALUES ('ROLE_CLIENTE','marcos'),('ROLE_CLIENTE','pedrolito'),('ROLE_EMPLEADO','raul');
/*!40000 ALTER TABLE `authorities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mantenimientos`
--

DROP TABLE IF EXISTS `mantenimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mantenimientos` (
  `id_mantenimientos` int NOT NULL AUTO_INCREMENT,
  `matricula` varchar(10) NOT NULL,
  `fecha` date NOT NULL,
  `kilometros` int NOT NULL,
  `cantidad_ruedas` int NOT NULL,
  `posicion_rueda` varchar(10) DEFAULT NULL,
  `id_ruedas` int NOT NULL,
  `importe` varchar(45) NOT NULL,
  PRIMARY KEY (`id_mantenimientos`),
  KEY `fk_mantenimientos_vehiculos1_idx` (`matricula`),
  KEY `fk_mantenimientos_ruedas1_idx` (`id_ruedas`),
  CONSTRAINT `fk_mantenimientos_ruedas1` FOREIGN KEY (`id_ruedas`) REFERENCES `ruedas` (`id_ruedas`),
  CONSTRAINT `fk_mantenimientos_vehiculos1` FOREIGN KEY (`matricula`) REFERENCES `vehiculos` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mantenimientos`
--

LOCK TABLES `mantenimientos` WRITE;
/*!40000 ALTER TABLE `mantenimientos` DISABLE KEYS */;
INSERT INTO `mantenimientos` VALUES (1,'2610FYR','2021-04-27',115652,4,'todos',7,'124'),(2,'1616LZT','2021-05-31',254621,2,'trasera',3,'89'),(3,'4568BZR','2020-10-31',144631,2,'delantera',2,'98'),(4,'1616LZT','2020-10-31',546321,2,'delantera',2,'175'),(5,'7610BDD','2020-10-31',254621,4,'todos',10,'210');
/*!40000 ALTER TABLE `mantenimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruedas`
--

DROP TABLE IF EXISTS `ruedas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ruedas` (
  `id_ruedas` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `anchura` int NOT NULL,
  `perfil` int NOT NULL,
  `llanta` int NOT NULL,
  `carga` varchar(45) DEFAULT NULL,
  `velocidad` varchar(45) DEFAULT NULL,
  `precio` varchar(45) NOT NULL,
  PRIMARY KEY (`id_ruedas`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruedas`
--

LOCK TABLES `ruedas` WRITE;
/*!40000 ALTER TABLE `ruedas` DISABLE KEYS */;
INSERT INTO `ruedas` VALUES (1,'Michelin','primacy 4',205,55,16,'91','v','70'),(2,'Michelin','primacy 3',215,55,16,'97','Y','105'),(3,'Michelin','primacy 4',215,65,16,'95','v','87'),(4,'Dunlop','sport',175,65,15,'84','h','65'),(5,'Dunlop','sport',205,55,16,'91','v','62,10'),(6,'Dunlop','bluresponse',195,65,15,'91','v','55'),(7,'Continental','ecocontact 6',250,55,16,'91','v','64'),(8,'Continental','premiumcontact 6',225,50,17,'98','y','114'),(9,'Continental','premiumcontact 6',215,55,18,'99','v','112,40'),(10,'Continental','ecocontact 6',215,60,17,'96','h','100'),(11,'Pirelli','pzero',225,50,17,'98','y','85,70'),(12,'Pirelli','pzero',225,40,18,'92','y','74'),(13,'Pirelli','cinturato p7',205,60,16,'96','v','84,50');
/*!40000 ALTER TABLE `ruedas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id_users` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `trabajador` tinyint NOT NULL DEFAULT '0',
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `domicilio` varchar(100) DEFAULT NULL,
  `numero_ruedas` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_users`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `id_users_UNIQUE` (`id_users`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'raul','123',1,'raul','alo','78787878X','alo@alo','nolahay','sala',0),(2,'marcos','456',0,'marcos','becerro','12121212B','ma@be','nolase','madrid',0),(3,'pedrolito','hola',0,'pedro','guti',NULL,NULL,NULL,NULL,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `matricula` varchar(10) NOT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `id_users` int NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `fk_vehiculos_users1_idx` (`id_users`),
  CONSTRAINT `fk_vehiculos_users1` FOREIGN KEY (`id_users`) REFERENCES `users` (`id_users`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES ('1616LZT','prius',2),('2564DTZ','golf',2),('2610FYR','zafira',3),('7610BDD','astra',1);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-08 13:12:03
