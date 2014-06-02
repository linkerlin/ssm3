/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2013-12-17 17:56:31
*/

SET FOREIGN_KEY_CHECKS = 0;
-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id`   INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) DEFAULT NULL,
  `sex`  CHAR(1) DEFAULT NULL,
  `edu`  CHAR(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO role VALUES ('1', '超级管理员', '1', '4');
INSERT INTO role VALUES ('2', '系统管理员', '2', '1');
INSERT INTO role VALUES ('3', '业务管理员', '1', '0');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`       INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) DEFAULT NULL,
  `role_id`  INT(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'aaa', '1');
INSERT INTO user VALUES ('2', '李四', '2');
INSERT INTO user VALUES ('3', '王五', '1');
