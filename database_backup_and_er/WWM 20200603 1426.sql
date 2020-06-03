-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema wije_wadi_manage
--

CREATE DATABASE IF NOT EXISTS wije_wadi_manage;
USE wije_wadi_manage;

--
-- Definition of table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` int(11) NOT NULL auto_increment,
  `name` varchar(45) default NULL,
  `commission` double default NULL,
  `added_date` varchar(45) default NULL,
  `added_time` varchar(45) default NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`item_id`),
  KEY `fk_item_user1_idx` (`user_id`),
  CONSTRAINT `fk_item_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `item`
--

/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` (`item_id`,`name`,`commission`,`added_date`,`added_time`,`user_id`,`status`) VALUES 
 (1,'Kibula Banis',5,'2020-06-02','11:18 PM',1,1),
 (2,'Maalu Banis',6,'2020-06-02','11:20 PM',1,1);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;


--
-- Definition of table `save_wadi`
--

DROP TABLE IF EXISTS `save_wadi`;
CREATE TABLE `save_wadi` (
  `save_wadi_id` int(11) NOT NULL auto_increment,
  `wadi_id` int(11) NOT NULL,
  `saved_date` varchar(45) default NULL,
  `saved_time` varchar(45) default NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`save_wadi_id`),
  KEY `fk_save_wadi_user1_idx` (`user_id`),
  KEY `fk_save_wadi_wadi1_idx` (`wadi_id`),
  CONSTRAINT `fk_save_wadi_wadi1` FOREIGN KEY (`wadi_id`) REFERENCES `wadi` (`wadi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_save_wadi_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `save_wadi`
--

/*!40000 ALTER TABLE `save_wadi` DISABLE KEYS */;
/*!40000 ALTER TABLE `save_wadi` ENABLE KEYS */;


--
-- Definition of table `save_wadi_items`
--

DROP TABLE IF EXISTS `save_wadi_items`;
CREATE TABLE `save_wadi_items` (
  `save_wadi_items_id` int(11) NOT NULL auto_increment,
  `qty` int(11) default NULL,
  `commission_per_item` double default NULL,
  `total_commission` double default NULL COMMENT 'qty *  commission_per_item',
  `rate` int(11) default NULL,
  `item_id` int(11) NOT NULL,
  `save_wadi_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`save_wadi_items_id`),
  KEY `fk_save_wadi_items_item1_idx` (`item_id`),
  KEY `fk_save_wadi_items_save_wadi1_idx` (`save_wadi_id`),
  CONSTRAINT `fk_save_wadi_items_item1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_save_wadi_items_save_wadi1` FOREIGN KEY (`save_wadi_id`) REFERENCES `save_wadi` (`save_wadi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `save_wadi_items`
--

/*!40000 ALTER TABLE `save_wadi_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `save_wadi_items` ENABLE KEYS */;


--
-- Definition of table `save_wadi_payment`
--

DROP TABLE IF EXISTS `save_wadi_payment`;
CREATE TABLE `save_wadi_payment` (
  `save_wadi_payment_id` int(11) NOT NULL auto_increment,
  `amount_total` double default NULL,
  `save_wadi_worker_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`save_wadi_payment_id`),
  KEY `fk_save_wadi_payment_save_wadi_worker1_idx` (`save_wadi_worker_id`),
  CONSTRAINT `fk_save_wadi_payment_save_wadi_worker1` FOREIGN KEY (`save_wadi_worker_id`) REFERENCES `save_wadi_worker` (`save_wadi_worker_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `save_wadi_payment`
--

/*!40000 ALTER TABLE `save_wadi_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `save_wadi_payment` ENABLE KEYS */;


--
-- Definition of table `save_wadi_worker`
--

DROP TABLE IF EXISTS `save_wadi_worker`;
CREATE TABLE `save_wadi_worker` (
  `save_wadi_worker_id` int(11) NOT NULL auto_increment,
  `save_wadi_id` int(11) NOT NULL,
  `workers_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`save_wadi_worker_id`),
  KEY `fk_save_wadi_worker_save_wadi1_idx` (`save_wadi_id`),
  KEY `fk_save_wadi_worker_workers1_idx` (`workers_id`),
  CONSTRAINT `fk_save_wadi_worker_save_wadi1` FOREIGN KEY (`save_wadi_id`) REFERENCES `save_wadi` (`save_wadi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_save_wadi_worker_workers1` FOREIGN KEY (`workers_id`) REFERENCES `workers` (`workers_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `save_wadi_worker`
--

/*!40000 ALTER TABLE `save_wadi_worker` DISABLE KEYS */;
/*!40000 ALTER TABLE `save_wadi_worker` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `name` varchar(45) default NULL,
  `username` varchar(45) default NULL,
  `password` varchar(45) default NULL,
  `added_date` varchar(45) default NULL,
  `added_time` varchar(45) default NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`name`,`username`,`password`,`added_date`,`added_time`,`status`) VALUES 
 (1,'Kokila Ekanayake','admin','123','2020-05-31','08:55 PM',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `wadi`
--

DROP TABLE IF EXISTS `wadi`;
CREATE TABLE `wadi` (
  `wadi_id` int(11) NOT NULL auto_increment,
  `name` varchar(45) default NULL,
  `added_date` varchar(45) default NULL,
  `added_time` varchar(45) default NULL,
  `status` int(11) default NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY  (`wadi_id`),
  KEY `fk_wadi_user_idx` (`user_id`),
  CONSTRAINT `fk_wadi_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `wadi`
--

/*!40000 ALTER TABLE `wadi` DISABLE KEYS */;
INSERT INTO `wadi` (`wadi_id`,`name`,`added_date`,`added_time`,`status`,`user_id`) VALUES 
 (1,'Wadi No1','2020-06-01','10:23 PM',1,1);
/*!40000 ALTER TABLE `wadi` ENABLE KEYS */;


--
-- Definition of table `wadi_items`
--

DROP TABLE IF EXISTS `wadi_items`;
CREATE TABLE `wadi_items` (
  `wadi_items_id` int(11) NOT NULL auto_increment,
  `item_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`wadi_items_id`),
  KEY `fk_wadi_items_item1_idx` (`item_id`),
  KEY `fk_wadi_items_user1_idx` (`user_id`),
  CONSTRAINT `fk_wadi_items_item1` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_wadi_items_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `wadi_items`
--

/*!40000 ALTER TABLE `wadi_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `wadi_items` ENABLE KEYS */;


--
-- Definition of table `wadi_user`
--

DROP TABLE IF EXISTS `wadi_user`;
CREATE TABLE `wadi_user` (
  `wadi_user_id` int(11) NOT NULL auto_increment,
  `wadi_id` int(11) NOT NULL,
  `workers_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`wadi_user_id`),
  KEY `fk_wadi_user_wadi1_idx` (`wadi_id`),
  KEY `fk_wadi_user_workers1_idx` (`workers_id`),
  CONSTRAINT `fk_wadi_user_wadi1` FOREIGN KEY (`wadi_id`) REFERENCES `wadi` (`wadi_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_wadi_user_workers1` FOREIGN KEY (`workers_id`) REFERENCES `workers` (`workers_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `wadi_user`
--

/*!40000 ALTER TABLE `wadi_user` DISABLE KEYS */;
INSERT INTO `wadi_user` (`wadi_user_id`,`wadi_id`,`workers_id`,`status`) VALUES 
 (1,1,1,1),
 (2,1,2,1);
/*!40000 ALTER TABLE `wadi_user` ENABLE KEYS */;


--
-- Definition of table `worker_commission_pay`
--

DROP TABLE IF EXISTS `worker_commission_pay`;
CREATE TABLE `worker_commission_pay` (
  `worker_commission_pay_id` int(11) NOT NULL auto_increment,
  `workers_id` int(11) NOT NULL,
  `pay_date` varchar(45) default NULL,
  `pay_time` varchar(45) default NULL,
  `amount` double default NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`worker_commission_pay_id`),
  KEY `fk_worker_commission_pay_user1_idx` (`user_id`),
  KEY `fk_worker_commission_pay_workers1_idx` (`workers_id`),
  CONSTRAINT `fk_worker_commission_pay_workers1` FOREIGN KEY (`workers_id`) REFERENCES `workers` (`workers_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_worker_commission_pay_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `worker_commission_pay`
--

/*!40000 ALTER TABLE `worker_commission_pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `worker_commission_pay` ENABLE KEYS */;


--
-- Definition of table `workers`
--

DROP TABLE IF EXISTS `workers`;
CREATE TABLE `workers` (
  `workers_id` int(11) NOT NULL auto_increment,
  `name` varchar(45) default NULL,
  `added_date` varchar(45) default NULL,
  `added_time` varchar(45) default NULL,
  `payble_amount` double default NULL,
  `type` int(11) default NULL COMMENT '1 = Permanent\r\n2 = Temporary\n',
  `user_id` int(11) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`workers_id`),
  KEY `fk_workers_user1_idx` (`user_id`),
  CONSTRAINT `fk_workers_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `workers`
--

/*!40000 ALTER TABLE `workers` DISABLE KEYS */;
INSERT INTO `workers` (`workers_id`,`name`,`added_date`,`added_time`,`payble_amount`,`type`,`user_id`,`status`) VALUES 
 (1,'Namal','2020-06-01','10:00 PM',0,1,1,1),
 (2,'Chandrakumara','2020-06-01','10:05 PM',0,1,1,1),
 (3,'Lal','2020-06-01','10:10 PM',0,2,1,1);
/*!40000 ALTER TABLE `workers` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
