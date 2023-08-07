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
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `studentID` int NOT NULL,
  `studentName` varchar(50) NOT NULL,
  `studentAge` int NOT NULL,
  `studentCourse` varchar(50) DEFAULT NULL,
  `courseCode` int NOT NULL,
  `studentAddress` varchar(100) DEFAULT NULL,
  `studentPhoneNo` bigint NOT NULL,
  `studentEmailID` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1001,'Aadarsh Bakshi',22,'Java Programming',1,'Noida, U.P.',9876543210,'Aadarsh22@csr.com'),(1002,'Aaditya Varma',24,'Java Programming',1,'Noida, U.P.',9765432108,'Aaditya24@csr.com'),(1003,'Aahan Yadav',26,'Java Programming',1,'Noida, U.P.',9654321087,'Aahan26@csr.com'),(1004,'Aakash Jain',25,'Java Programming',1,'Noida, U.P.',9543210876,'Aakash25@csr.com'),(1005,'Madhav Modi',20,'Java Programming',1,'Noida, U.P.',9432108765,'Madhav20@csr.com'),(1006,'Madhusudhan Lal',21,'Java Programming',1,'Noida, U.P.',9321087654,'Madhusudhan@csr.com'),(1007,'Rajan Kumar',29,'Java Programming',1,'Noida, U.P.',9210876543,'Rajan29@csr.com'),(1008,'Rachit Ahuja',27,'Java Programming',1,'Noida, U.P.',9108765432,'Rachit27@csr.com'),(1009,'Aachal Joshi',24,'Java Programming',1,'Noida, U.P.',9087654321,'Aachal24@csr.com'),(1010,'Divya Gupta',22,'Java Programming',1,'Noida, U.P.',9012345678,'Divya22@csr.com'),(1011,'Eshana Sharma',23,'Python Programming',2,'Delhi',9012345678,'Eshana23@csr.com'),(1012,'Gauri Singh',20,'Python Programming',2,'Delhi',9012345678,'Gauri20@csr.com'),(1013,'Sarthak Patel ',26,'Python Programming',2,'Delhi',9012345678,'Sarthak26@csr.com'),(1014,'Saatvik Shaan',24,'Python Programming',2,'Delhi',9012345678,'Saatvik24@csr.com'),(1015,'Vishal Kapoor',28,'Python Programming',2,'Delhi',9012345678,'Vishal28@csr.com'),(1016,'Vaibhav Shukla',26,'Python Programming',2,'Delhi',9012345678,'Vaibhav26@csr.com'),(1017,'Amit Shah',29,'Python Programming',2,'Delhi',9012345678,'Amit29@csr.com'),(1018,'Imran Malik',21,'Python Programming',2,'Delhi',9012345678,'Imran21@csr.com'),(1019,'Diljit Kaur',22,'Python Programming',2,'Delhi',9012345678,'Diljit22@csr.com'),(1020,'Pawan Kumar',20,'Python Programming',2,'Delhi',9012345678,'Pawan20@csr.com'),(1021,'Ajay Chopra',29,'C Programming',3,'Rohini, Delhi',9012345678,'Ajay29@csr.com'),(1022,'Anusha Chowdhury',25,'C Programming',3,'Rohini, Delhi',9012345678,'Anusha25@csr.com'),(1023,'Palak Chwala',21,'C Programming',3,'Rohini, Delhi',9012345678,'Palak21@csr.com'),(1024,'Jyoti Agarwal',20,'C Programming',3,'Rohini, Delhi',9012345678,'Jyoti20@csr.com'),(1025,'Aaradya Varma',28,'C Programming',3,'Rohini, Delhi',9012345678,'Aaradhya28@csr.com'),(1026,'Manav Bakshi',22,'C Programming',3,'Rohini, Delhi',9012345678,'Manav22@csr.com'),(1027,'Mayank Agarwal',24,'C Programming',3,'Rohini, Delhi',9012345678,'Mayank24@csr.com'),(1028,'Dinesh Khatri',26,'C Programming',3,'Rohini, Delhi',9012345678,'Dinesh26@csr.com'),(1029,'Megha Jain',23,'C Programming',3,'Rohini, Delhi',9012345678,'Megha23@csr.com'),(1030,'Anant Modi',27,'C Programming',3,'Rohini, Delhi',9012345678,'Anant27@csr.com'),(1031,'Anoop Kumar',21,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Anoop21@csr.com'),(1032,'Deepak Gupta',25,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Deepak25@csr.com'),(1033,'Sagar Ahuja',23,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Sagar23@csr.com'),(1034,'Shubham Kapoor',24,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Shubham24@csr.com'),(1035,'Palak Singh',29,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Palak29@csr.com'),(1036,'Komal Varma',26,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Komal26@csr.com'),(1037,'Kirti Shukla',21,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Kirti21@csr.com'),(1038,'Mitali Raj',28,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Mitali28@csr.com'),(1039,'Nisha Jain',22,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Nisha22@csr.com'),(1040,'Vishawa Jeet',25,'C++ Programming',4,'Rohini-West Delhi',9012345678,'Vishawa25@csr.com'),(1041,'Akshay Kumar',21,'Full Stack Web Development',5,'Mohali',9012345678,'Akshay21@csr.com'),(1042,'Arjun Sharma',24,'Full Stack Web Development',5,'Mohali',9012345678,'Arjun24@csr.com'),(1043,'Karan Gupta',23,'Full Stack Web Development',5,'Mohali',9012345678,'Karan23@csr.com'),(1044,'Bhavana Bakshi',22,'Full Stack Web Development',5,'Mohali',9012345678,'Bhavana22@csr.com'),(1045,'Aniket Varma',29,'Full Stack Web Development',5,'Mohali',9012345678,'Aniket29@csr.com'),(1046,'Aham Yadav',25,'Full Stack Web Development',5,'Mohali',9012345678,'Aham25@csr.com'),(1047,'Rachita Jain',26,'Full Stack Web Development',5,'Mohali',9012345678,'Rachita26@csr.com'),(1048,'Soham Modi',28,'Full Stack Web Development',5,'Mohali',9012345678,'Soham28@csr.com'),(1049,'Mukesh Patil',27,'Full Stack Web Development',5,'Mohali',9012345678,'Mukesh27@csr.com'),(1050,'Janaki Gupta',20,'Full Stack Web Development',5,'Mohali',9012345678,'Janaki20@csr.com'),(1051,'Tanisha Ahuja',24,'Software Engineering',6,'Gujrat',9012345678,'Tanisha24@csr.com'),(1052,'Krishna Kapoor',25,'Software Engineering',6,'Gujrat',9012345678,'Krishna25@csr.com'),(1053,'Aaditya Singh',23,'Software Engineering',6,'Gujrat',9012345678,'Aaditya23@csr.com'),(1054,'Jeevika Varma',26,'Software Engineering',6,'Gujrat',9012345678,'Jeevika26@csr.com'),(1055,'Lakshya Mishra',22,'Software Engineering',6,'Gujrat',9012345678,'Lakshya22@csr.com'),(1056,'Anuj Pal',27,'Software Engineering',6,'Gujrat',9012345678,'Anuj27@csr.com'),(1057,'Aradhya Sharma',21,'Software Engineering',6,'Gujrat',9012345678,'Aradhya21@csr.com'),(1058,'Deep Das',20,'Software Engineering',6,'Gujrat',9012345678,'Deep20@csr.com'),(1059,'Dhawal Kulkarni',28,'Software Engineering',6,'Gujrat',9012345678,'Dhawal28@csr.com'),(1060,'Ritesh Deshmukh',29,'Software Engineering',6,'Gujrat',9012345678,'Ritesh29@csr.com'),(1061,'Shreyash Iyer',26,'Computer Science',7,'Bangalore',9012345678,'Shreyash26@csr.com'),(1062,'Nikita Jain',20,'Computer Science',7,'Bangalore',9012345678,'Nikita20@csr.com'),(1063,'Manan Mahajan',22,'Computer Science',7,'Bangalore',9012345678,'Maman22@csr.com'),(1064,'Anmol Bakshi',29,'Computer Science',7,'Bangalore',9012345678,'Anmol29@csr.com'),(1065,'Ishita Varma',23,'Computer Science',7,'Bangalore',9012345678,'Ishita23@csr.com'),(1066,'Isha Yadav',28,'Computer Science',7,'Bangalore',9012345678,'Isha28@csr.com'),(1067,'Hema Jain',24,'Computer Science',7,'Bangalore',9012345678,'Hema24@csr.com'),(1068,'Garima Modi',27,'Computer Science',7,'Bangalore',9012345678,'Garima27@csr.com'),(1069,'Gayathri Acharya',25,'Computer Science',7,'Bangalore',9012345678,'Gayathri25@csr.com'),(1070,'Harshit Gupta',26,'Computer Science',7,'Bangalore',9012345678,'Harshit26@csr.com'),(1071,'Jay Ahuja',20,'DataBase Management',8,'Mumbai',9012345678,'Jay20@csr.com'),(1072,'Aarav Kapoor',29,'DataBase Management',8,'Mumbai',9012345678,'Aarav29@csr.com'),(1073,'Mohan Mishra',21,'DataBase Management',8,'Mumbai',9012345678,'Mohan21@csr.com'),(1074,'Ankit Joshi',28,'DataBase Management',8,'Mumbai',9012345678,'Ankit28@csr.com'),(1075,'Rahul Sharma',22,'DataBase Management',8,'Mumbai',9012345678,'Rahul22@csr.com'),(1076,'Pawan Kumar',27,'DataBase Management',8,'Mumbai',9012345678,'Pawan27@csr.com'),(1077,'Narendra Das',23,'DataBase Management',8,'Mumbai',9012345678,'Narendra23@csr.com'),(1078,'Rohan Yadav',26,'DataBase Management',8,'Mumbai',9012345678,'Rohan26@csr.com'),(1079,'Kamal Mittal',24,'DataBase Management',8,'Mumbai',9012345678,'Kamal24@csr.com'),(1080,'Anil Kapoor',25,'DataBase Management',8,'Mumbai',9012345678,'Anil25@csr.com'),(1081,'Anamika Ahuja',24,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Anamika24@csr.com'),(1082,'Adarsh Bakshi',25,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Adarsh25@csr.com'),(1083,'Rohit Kumar',26,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Rohit26@csr.com'),(1084,'Nayan Yadav',20,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Nayan20@csr.com'),(1085,'Varun Jain',29,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Varun29@csr.com'),(1086,'Komal Modi',21,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Komal21@csr.com'),(1087,'Rachna Acharya',28,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Rachna28@csr.com'),(1088,'Satwik Gupta',22,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Satwik22@csr.com'),(1089,'Aadi Varma',27,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Aadi27@csr.com'),(1090,'Gagan Deep',23,'Introduction To Web Design',9,'Navi Mumbai',9012345678,'Gagan23@csr.com'),(1091,'Dipti Maurya',25,'Operating Systems',10,'South Delhi',9012345678,'Dipti25@csr.com'),(1092,'Shalini Singh',24,'Operating Systems',10,'South Delhi',9012345678,'Shalini24@csr.com'),(1093,'Arjun Kapoor',26,'Operating Systems',10,'South Delhi',9012345678,'Arjun26@csr.com'),(1094,'Aditi Ahuja',23,'Operating Systems',10,'South Delhi',9012345678,'Aditi23@csr.com'),(1095,'Chandra Gupta',27,'Operating Systems',10,'South Delhi',9012345678,'Chandra27@csr.com'),(1096,'Isha Bakshi',22,'Operating Systems',10,'South Delhi',9012345678,'Isha22@csr.com'),(1097,'Tarun Varma',28,'Operating Systems',10,'South Delhi',9012345678,'Tarun28@csr.com'),(1098,'Umesh Yadav',21,'Operating Systems',10,'South Delhi',9012345678,'Umesh21@csr.com'),(1099,'Ahana Jain',29,'Operating Systems',10,'South Delhi',9012345678,'Ahana29@csr.com'),(1100,'Manan Modi',20,'Operating Systems',10,'South Delhi',9012345678,'Manan20@csr.com');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
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
