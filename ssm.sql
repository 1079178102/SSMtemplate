/*
Navicat MySQL Data Transfer

Source Server         : db_xph
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-09-15 19:14:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '小明', '200');
INSERT INTO `account` VALUES ('2', '小王', '223.2');
INSERT INTO `account` VALUES ('3', '熊大', '132.35');
INSERT INTO `account` VALUES ('65', '熊二', '233.3');
INSERT INTO `account` VALUES ('66', '熊三', '45874.245');
