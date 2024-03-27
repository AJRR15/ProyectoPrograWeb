<<<<<<< Updated upstream
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: catalogojuegos
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `juego`
--

DROP TABLE IF EXISTS `juego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `juego` (
  `id_juego` int NOT NULL AUTO_INCREMENT,
  `imagen` varchar(1024) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `empresa` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`id_juego`),
  UNIQUE KEY `id_juego_UNIQUE` (`id_juego`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juego`
--

LOCK TABLES `juego` WRITE;
/*!40000 ALTER TABLE `juego` DISABLE KEYS */;
INSERT INTO `juego` VALUES (1,'https://metodologic.net/wp-content/uploads/2017/11/Mario_Odyssey_portada.jpg','Super Mario Odyssey','Nintendo',59.99,'Aventura',1),(2,'https://media.vandal.net/i/1440x1080/5-2023/20235223395250_1.jpg','The Legend of Zelda: Breath of the Wild','Nintendo',59.99,'Aventura',1),(3,'https://e1.pngegg.com/pngimages/517/222/png-clipart-grand-theft-auto-v-game-icon-gta-5-7-gta-v-game-cover-thumbnail.png','Grand Theft Auto V','Rockstar Games',29.99,'Acción',1),(4,'https://futbolete.com/apuestas/wp-content/uploads/2021/09/FIFA-22-Esta-es-la-valoracion-de-Kylian-Mbappe-portada-del-juego-1200x900.jpg','FIFA 22','EA Sports',49.99,'Deportes',1),(5,'https://img.zonared.com/images/noticias/portada/47000/47269-h2.jpg','Minecraft','Mojang Studios',29.99,'Aventura',1),(6,'https://media.vandal.net/i/640x360/12-2022/202212111754215_1.jpg','The Witcher 3: Wild Hunt','CD Projekt',39.99,'RPG',1),(7,'https://i.blogs.es/88d2ec/cod_mw/450_1000.webp','Call of Duty: Modern Warfare','Activision',59.99,'Acción',1),(8,'https://peru21.pe/resizer/Fa-Svhhk_AnTXXhCNXXaBit9nlQ=/1200x900/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/EBZX3XFTAZAUVO4CVX3RZJ6JY4.jpg','Assassin\'s Creed Valhalla','Ubisoft',49.99,'Acción',1),(9,'https://fs-prod-cdn.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_download_software_1/H2x1_NSwitchDS_AmongUs_image1600w.jpg','Among Us','InnerSloth',4.99,'Puzzle',1),(10,'https://e00-marca.uecdn.es/assets/multimedia/imagenes/2023/08/29/16933298615638.jpg','League of Legends','Riot Games',0,'Estrategia',1);
/*!40000 ALTER TABLE `juego` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-11 19:36:49
=======
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: catalogojuegos
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `juego`
--

DROP TABLE IF EXISTS `juego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `juego` (
  `id_juego` int NOT NULL AUTO_INCREMENT,
  `imagen` varchar(1024) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `empresa` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `activo` tinyint NOT NULL,
  PRIMARY KEY (`id_juego`),
  UNIQUE KEY `id_juego_UNIQUE` (`id_juego`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juego`
--

LOCK TABLES `juego` WRITE;
/*!40000 ALTER TABLE `juego` DISABLE KEYS */;
INSERT INTO `juego` VALUES (1,'https://metodologic.net/wp-content/uploads/2017/11/Mario_Odyssey_portada.jpg','Super Mario Odyssey','Nintendo',59.99,'Aventura',1),(2,'https://media.vandal.net/i/1440x1080/5-2023/20235223395250_1.jpg','The Legend of Zelda: Breath of the Wild','Nintendo',59.99,'Aventura',1),(3,'https://e1.pngegg.com/pngimages/517/222/png-clipart-grand-theft-auto-v-game-icon-gta-5-7-gta-v-game-cover-thumbnail.png','Grand Theft Auto V','Rockstar Games',29.99,'Acción',1),(4,'https://futbolete.com/apuestas/wp-content/uploads/2021/09/FIFA-22-Esta-es-la-valoracion-de-Kylian-Mbappe-portada-del-juego-1200x900.jpg','FIFA 22','EA Sports',49.99,'Deportes',1),(5,'https://img.zonared.com/images/noticias/portada/47000/47269-h2.jpg','Minecraft','Mojang Studios',29.99,'Aventura',1),(6,'https://media.vandal.net/i/640x360/12-2022/202212111754215_1.jpg','The Witcher 3: Wild Hunt','CD Projekt',39.99,'RPG',1),(7,'https://i.blogs.es/88d2ec/cod_mw/450_1000.webp','Call of Duty: Modern Warfare','Activision',59.99,'Acción',1),(8,'https://peru21.pe/resizer/Fa-Svhhk_AnTXXhCNXXaBit9nlQ=/1200x900/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/EBZX3XFTAZAUVO4CVX3RZJ6JY4.jpg','Assassin\'s Creed Valhalla','Ubisoft',49.99,'Acción',1),(9,'https://fs-prod-cdn.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_download_software_1/H2x1_NSwitchDS_AmongUs_image1600w.jpg','Among Us','InnerSloth',4.99,'Puzzle',1),(10,'https://e00-marca.uecdn.es/assets/multimedia/imagenes/2023/08/29/16933298615638.jpg','League of Legends','Riot Games',0,'Estrategia',1);
/*!40000 ALTER TABLE `juego` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-11 19:36:49
>>>>>>> Stashed changes
