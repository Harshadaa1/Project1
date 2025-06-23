-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: flight
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_register`
--

DROP TABLE IF EXISTS `user_register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_register` (
  `fname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `cpass` varchar(50) DEFAULT NULL,
  `cnumber` bigint(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_register`
--

LOCK TABLES `user_register` WRITE;
/*!40000 ALTER TABLE `user_register` DISABLE KEYS */;
INSERT INTO `user_register` VALUES ('Vallari Prasad Gawade','vallu88@gmail.com','vallu','vallu',9875896899,'Sangali',1),('Ananya vishnu Bhosale','anu2215@gmail.com','anu22','anu22',7896858944,'Kolhapur',2),('Shreesha Vijay Divate','shreesha92@gmail.com','shreesha','shreesha',8998752997,'Panhala,kolhapur',3),('Rani Umesh Hodage','rani72@gmail.com','rani72','rani72',7058499134,'Amravati',4),('Prachi Vishal Kasarkar','prachi65@gmail.com','prachi65','prachi65',2525352633,'Mumbai',5),('Samruddhi Jaywant Bhosale','samruddhi75@gmail.com','samu88','samu88',9564565655,'Pune',6),('Suyog Anil Mane','suyog12@gmail.com','suyog12','suyog12',9365985958,'Vashi',7),('Riya Ravindra Pavle','riya11@gmail.com','riya11','riya11',9587965222,'Shrinagar',8),('Rahul Ramesh Rathod','rahul33@gmail.com','rahul33','rahul33',7589632222,'Belgaum',9),('Arayan Pravin Deshpande','arayan356@gmail.com','arayan356','arayan356',9565622232,'Thane',10);
/*!40000 ALTER TABLE `user_register` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-02 13:28:36
