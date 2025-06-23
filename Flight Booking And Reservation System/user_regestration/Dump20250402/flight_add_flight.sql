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
-- Table structure for table `add_flight`
--

DROP TABLE IF EXISTS `add_flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `add_flight` (
  `flight_id` int(11) NOT NULL AUTO_INCREMENT,
  `flight_name` varchar(50) DEFAULT NULL,
  `arritime` varchar(50) DEFAULT NULL,
  `departime` varchar(50) DEFAULT NULL,
  `gst` varchar(50) DEFAULT NULL,
  `totalamount` varchar(50) DEFAULT NULL,
  `arrival_airport` varchar(50) DEFAULT NULL,
  `departure_airport` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `airfare` float DEFAULT NULL,
  PRIMARY KEY (`flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_flight`
--

LOCK TABLES `add_flight` WRITE;
/*!40000 ALTER TABLE `add_flight` DISABLE KEYS */;
INSERT INTO `add_flight` VALUES (1,'Indigo','05:52','06:50','7','2675','Mumbai','Pune','2025-03-10',2500),(2,'AirIndia','08:14','10:00','12','3136','Pune','Mumbai','2025-03-14',2800),(3,'Spice jet','19:10','23:57','8','5400','Goa','Bangalore','2025-03-12',5000),(4,'Vistara','02:40','04:20','9','4360','Bangalore','Pune','2025-07-10',4000),(5,'Akasa Air','00:30','18:10','12','7840','Chennai','Delhi','2025-05-29',7000),(6,'Qatar Airways','06:30','08:31','15','11500','Delhi','Kolkata','2025-12-20',10000),(7,'Swiss','18:29','20:30','13','9040','Pune','Delhi','2025-05-12',8000),(8,'Star Air','16:32','21:33','10','9900','Delhi','Goa','2025-03-15',9000),(9,'Club On Air','19:34','21:34','7','12840','Jaypur','Mumbai','2025-10-16',12000),(10,'Thai Airways','20:30','22:30','8','15120','Chennai','Mumbai','2025-11-22',14000);
/*!40000 ALTER TABLE `add_flight` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-02 13:28:35
