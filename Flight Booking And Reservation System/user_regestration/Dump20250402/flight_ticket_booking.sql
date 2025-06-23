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
-- Table structure for table `ticket_booking`
--

DROP TABLE IF EXISTS `ticket_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_booking` (
  `depart_airport` varchar(50) DEFAULT NULL,
  `depart_date` date DEFAULT NULL,
  `flight_class` varchar(50) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `contactno` bigint(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `adult` bigint(11) DEFAULT NULL,
  `child` bigint(11) DEFAULT NULL,
  `arrival_airport` varchar(60) DEFAULT NULL,
  `contact` bigint(10) DEFAULT NULL,
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `stats` varchar(45) DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_booking`
--

LOCK TABLES `ticket_booking` WRITE;
/*!40000 ALTER TABLE `ticket_booking` DISABLE KEYS */;
INSERT INTO `ticket_booking` VALUES ('Pune','2025-03-11','Economy','Vallari Prasad Gawade','2019-06-15',9757255556,'FEMALE','vallu88@gmail.com',1,1,'Mumbai',9875896899,1,NULL,NULL),('Pune','2025-03-11','Economy','Trisha Ajay Jadhav','2018-02-07',9875987559,'FEMALE','trisha659@gmail.com',1,1,'Mumbai',9875896899,2,'Cancel','Another plan for that day'),('Pune','2025-03-11','Economy','Aditya Dattatray Parit','2005-06-23',8597328825,'MALE','adityA23@gmail.com',1,1,'Mumbai',9875896899,3,NULL,NULL),('Delhi','2025-03-29','Economy','Ananya vishnu Bhosale','2013-07-25',8975698789,'FEMALE','anu2215@gmail.com',1,0,'Chennai',7896858944,4,NULL,NULL),('Pune','2025-03-20','Economy','Shreesha Vijay Divate','2012-08-08',7898579568,'FEMALE','shreesha92@gmail.com',2,1,'Bangalore',8998752997,5,'Cancel','Traffic Accident!!'),('Kolkata','2025-12-20','Economy','Rani Umesh Hodage','2025-02-26',7054913498,'FEMALE','rani72@gmail.com',2,0,'Delhi',7058499134,6,NULL,NULL),('Mumbai','2025-03-27','Economy','Prachi Vishal Kasarkar','2025-02-27',9752352635,'FEMALE','prachi65@gmail.com',1,2,'Pune',2525352633,7,NULL,NULL),('Pune','2025-06-25','Economy','Samruddhi Jaywant Bhosale','2025-02-23',7256592559,'FEMALE','samruddhi75@gmail.com',2,1,'Bangalore',9564565655,8,NULL,NULL),('Pune','2025-02-27','Economy','Suyog Anil Mane','2008-07-10',2698569865,'MALE','suyog12@gmail.com',1,2,'Bangalore',9365985958,9,NULL,NULL),('Mumbai','2025-04-17','Economy','Riya Ravindra Pavle','2004-02-11',8569254226,'FEMALE','riya11@gmail.com',0,2,'Jaypur',9587965222,10,'Cancel','Natural Disaster'),('Delhi','2025-10-27','Economy','Rahul Ramesh Rathod','2012-01-30',7522121515,'MALE','rahul33@gmail.com',2,1,'Pune',7589632222,11,'Cancel','Death or hospitalization of relative.'),('Bangalore','2025-09-12','Economy','Arayan Pravin Deshpande','2007-11-22',7659895256,'MALE','arayan356@gmail.com',2,3,'Goa',9565622232,12,NULL,NULL),('Bangalore','2025-09-12','Economy','Arayan Pravin Deshpande','2007-11-22',7659895256,'MALE','arayan356@gmail.com',2,3,'Goa',9565622232,13,NULL,NULL),('Bangalore','2025-09-12','Economy','Arayan Pravin Deshpande','2006-11-22',7656562565,'MALE','arayan356@gmail.com',2,3,'Goa',9565622232,14,'Cancel','Financial Problem'),('Mumbai','2025-03-28','Economy','Vallari Prasad Gawade','2018-07-15',9865799586,'FEMALE','vallu88@gmail.com',1,1,'Chennai',9875896899,15,'Cancel','Natural Disaster.');
/*!40000 ALTER TABLE `ticket_booking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-02 13:28:34
