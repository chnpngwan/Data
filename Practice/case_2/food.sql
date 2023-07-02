/*
 Navicat Premium Data Transfer

 Source Server         : 2
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : connet

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 01/12/2022 22:09:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `cuisine` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `foodName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` decimal(5, 2) NULL DEFAULT NULL,
  `memberPrice` decimal(5, 2) NULL DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (1, '云南菜', '富源猪脚', 28.00, 20.00, '美味很贵');
INSERT INTO `food` VALUES (2, '粤菜', '小郑', 2.00, 2.00, '12');
INSERT INTO `food` VALUES (3, '云南菜', '辣子鸡', 12.00, 10.00, '非常好吃');
INSERT INTO `food` VALUES (9, '云南菜', '哈哈哈', 34.00, 23.00, '好吃美味假的');
INSERT INTO `food` VALUES (10, '云南菜', '小鸡炖蘑菇', 288.00, 200.00, '辣的很啊');
INSERT INTO `food` VALUES (12, '粤菜', '火腿', 245.00, 230.00, '咸得很');
INSERT INTO `food` VALUES (16, '粤菜', '米线不要米', 245.00, 45.00, '好吃很贵');
INSERT INTO `food` VALUES (18, '川菜', '汽锅鸡', 888.00, 8.00, '牛');
INSERT INTO `food` VALUES (19, '粤菜', '卫生费', 4.00, 5.00, '说的可好吃vaws');
INSERT INTO `food` VALUES (24, '3', '小郑', 345.00, 23.00, '哎！');

SET FOREIGN_KEY_CHECKS = 1;
