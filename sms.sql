/*
Navicat MySQL Data Transfer

Source Server         : abc
Source Server Version : 50560
Source Host           : 520-081:3306
Source Database       : sms

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2018-07-17 16:46:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for que
-- ----------------------------
DROP TABLE IF EXISTS `que`;
CREATE TABLE `que` (
  `id` varchar(11) NOT NULL,
  `question` varchar(255) DEFAULT NULL,
  `A` varchar(255) DEFAULT NULL,
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `D` varchar(255) DEFAULT NULL,
  `ans` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of que
-- ----------------------------
INSERT INTO `que` VALUES ('1', '1+1=', '2', '1', '0', '-1', 'A');
INSERT INTO `que` VALUES ('2', '1+0=', '1', '0', '2', '3', 'A');
INSERT INTO `que` VALUES ('3', '1+2=', '3', '1', '0', '2', 'A');
INSERT INTO `que` VALUES ('4', '1+3=', '4', '1', '2', '5', 'A');

-- ----------------------------
-- Table structure for studentscore
-- ----------------------------
DROP TABLE IF EXISTS `studentscore`;
CREATE TABLE `studentscore` (
  `id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(5) DEFAULT NULL,
  `dept` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `score` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of studentscore
-- ----------------------------
