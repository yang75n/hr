/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 60010
Source Host           : localhost:3306
Source Database       : hr

Target Server Type    : MYSQL
Target Server Version : 60010
File Encoding         : 65001

Date: 2018-03-30 13:10:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume` (
  `update_date` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `education` varchar(255) DEFAULT NULL,
  `entry_date` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
