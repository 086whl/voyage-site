/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : voyage

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 17/11/2021 21:24:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tab_admin
-- ----------------------------
DROP TABLE IF EXISTS `tab_admin`;
CREATE TABLE `tab_admin`  (
  `adminid` int NOT NULL AUTO_INCREMENT,
  `admin` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `message` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_admin
-- ----------------------------
INSERT INTO `tab_admin` VALUES (1, 'root', 'root', '12345678901', '123@qq.com', '你好，我是管理员用户');

SET FOREIGN_KEY_CHECKS = 1;
