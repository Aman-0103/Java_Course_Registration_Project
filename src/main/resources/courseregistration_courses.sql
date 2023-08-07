-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: courseregistration
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseID` int NOT NULL,
  `courseCode` int NOT NULL,
  `courseName` varchar(100) NOT NULL,
  `courseInstructor` varchar(50) NOT NULL,
  `courseLocation` varchar(20) NOT NULL,
  `maxStudents` int NOT NULL,
  `currentStudents` int NOT NULL,
  `duration` varchar(10) NOT NULL,
  `price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (101,1,'Java Programming','Ankit Kumar','Noida, U.P.',20,10,'6 Months',40000),(102,2,'Python Programming','Ajay Kumar','Delhi',20,10,'6 Months',40000),(103,3,'C Programming','Shalini Yadav','Rohini, Delhi',20,10,'6 Months',30000),(104,4,'C++ Programming','Rohit Singh','Rohini-West Delhi',20,10,'6 Months',30000),(105,5,'Full Stack Web Development','Jayant Yadav','Mohali',20,10,'8 Months',60000),(106,6,'Software Engineering','Shubham Sharma','Gujrat',20,10,'8 Months',60000),(107,7,'Computer Science','Anmol Sharma','Bangalore',20,10,'10 Months',80000),(108,8,'DataBase Management','Surya Kumar','Mumbai',20,10,'3 Months',30000),(109,9,'Introduction To Web Design','Hardik Tripathi','Navi Mumbai',20,10,'4 Months',25000),(110,10,'Operating Systems','Virat kashyap','South Delhi',20,10,'3 Months',20000);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-07 20:15:14
