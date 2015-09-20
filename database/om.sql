
DROP DATABASE IF EXISTS om;
CREATE DATABASE om;
USE om;

-- ----------------------------
-- Table structure for om_customers_info
-- ----------------------------
DROP TABLE IF EXISTS `om_customers_info`;
CREATE TABLE `om_customers_info` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(120) NOT NULL DEFAULT '' COMMENT '客户名称',
  `customer_code` varchar(10) NOT NULL DEFAULT '' COMMENT '客户简称',
  `discount_id` int(10) DEFAULT NULL COMMENT '折扣id',
  `address_line1` varchar(100) DEFAULT NULL,
  `address_line2` varchar(100) DEFAULT NULL,
  `postcode` varchar(15) DEFAULT NULL,
  `port_of_destination` varchar(20) NOT NULL DEFAULT '' COMMENT '目的港名称',
  `shipping_mark` varchar(100) NOT NULL DEFAULT '' COMMENT '唛头',
  `status` varchar(6) NOT NULL DEFAULT '' COMMENT '状态',
  `invoice_group` varchar(20) DEFAULT NULL,
  `payment_term` varchar(120) NOT NULL DEFAULT '' COMMENT '付款方式',
  `price_term1` varchar(100) DEFAULT NULL,
  `price_term2` varchar(100) DEFAULT NULL,
  `markup_name` varchar(20) NOT NULL DEFAULT '低于50片加价5%' COMMENT '通用加价条款',
  PRIMARY KEY (`cust_id`),
  KEY `om_customers_info_ibfk_1` (`discount_id`),
  CONSTRAINT `info_FK_discount` FOREIGN KEY (`discount_id`) REFERENCES `om_cust_discount` (`Discount_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_cust_contactors
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_contactors`;
CREATE TABLE `om_cust_contactors` (
  `cc_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) NOT NULL,
  `MailFrom` varchar(200) DEFAULT NULL,
  `PrePO_Mailto` varchar(200) DEFAULT NULL,
  `PO_Mailto` varchar(200) DEFAULT NULL,
  `OC_PI_Mailto` varchar(200) DEFAULT NULL,
  `INV_Pklist_mailto` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cc_id`),
  KEY `cust_id` (`cust_id`),
  CONSTRAINT `contactors_FK_info` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_cust_discount
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_discount`;
CREATE TABLE `om_cust_discount` (
  `Discount_id` int(11) NOT NULL AUTO_INCREMENT,
  `Discount_name` varchar(20) NOT NULL DEFAULT '101',
  `Type` varchar(20) NOT NULL DEFAULT '',
  `Default` varchar(200) DEFAULT NULL,
  `criterion` varchar(200) DEFAULT NULL,
  `active` varchar(10) DEFAULT NULL,
  `Discount_rate` varchar(20) DEFAULT NULL,
  `Base_qty` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_cust_price_list
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_price_list`;
CREATE TABLE `om_cust_price_list` (
  `pl_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) DEFAULT NULL COMMENT 'cust_info外键',
  `type` varchar(8) NOT NULL DEFAULT 'STD',
  `PL_YH_ITEM` varchar(20) NOT NULL DEFAULT '' COMMENT '价格信息按工厂型号维护',
  `effective_date_form` date DEFAULT NULL,
  `effective_date_to` date DEFAULT NULL,
  `user_def1` varchar(20) DEFAULT NULL,
  `user_def2` varchar(20) DEFAULT NULL,
  `user_def3` varchar(20) DEFAULT NULL,
  `user_def4` varchar(20) DEFAULT NULL,
  `user_def5` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pl_id`),
  KEY `om_cust_price_list_ibfk_1` (`cust_id`),
  CONSTRAINT `price_FK_info` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_cust_price_list_config
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_price_list_config`;
CREATE TABLE `om_cust_price_list_config` (
  `plc_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) NOT NULL,
  `display_name` varchar(30) DEFAULT NULL COMMENT '显示名称',
  `price_list_col` varchar(30) DEFAULT NULL COMMENT 'PL数据库列',
  `EXCEL_col` varchar(30) DEFAULT NULL,
  `activity` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`plc_id`),
  KEY `om_cust_price_list_config_ibfk_1` (`cust_id`),
  CONSTRAINT `config_FK_info` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_normal_discount
-- ----------------------------
DROP TABLE IF EXISTS `om_normal_discount`;
CREATE TABLE `om_normal_discount` (
  `discount_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(30) DEFAULT NULL COMMENT '折扣名称',
  `discount_rate` double NOT NULL DEFAULT '0' COMMENT '折扣率',
  `discount_base` varchar(8) DEFAULT NULL COMMENT '折扣基准',
  `type` varchar(8) DEFAULT NULL COMMENT '类型',
  `base_qty` varchar(8) DEFAULT '' COMMENT '基准数量',
  `activity` varchar(2) NOT NULL DEFAULT '' COMMENT '默认为有效',
  PRIMARY KEY (`discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_special_discount
-- ----------------------------
DROP TABLE IF EXISTS `om_special_discount`;
CREATE TABLE `om_special_discount` (
  `sd_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(30) NOT NULL DEFAULT '' COMMENT '折扣名称',
  `cust_code` varchar(10) DEFAULT '' COMMENT '外键',
  `amount` varchar(15) NOT NULL DEFAULT '' COMMENT '折扣金额',
  `applied_amount` varchar(15) NOT NULL DEFAULT '' COMMENT '已用金额',
  `balance` varchar(15) NOT NULL DEFAULT '' COMMENT '折扣余额',
  `activity` varchar(2) DEFAULT NULL,
  `cust_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`sd_id`),
  KEY `om_special_discount_ibfk_1` (`cust_id`),
  CONSTRAINT `special_FK_info` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for om_special_discount_applied_records
-- ----------------------------
DROP TABLE IF EXISTS `om_special_discount_applied_records`;
CREATE TABLE `om_special_discount_applied_records` (
  `sdar_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(30) NOT NULL DEFAULT '' COMMENT '折扣名称',
  `cust_id` int(11) NOT NULL DEFAULT '0' COMMENT '外键',
  `ADN_identify_num` varchar(30) NOT NULL DEFAULT '' COMMENT '发货单标识号',
  `applied_amount` varchar(30) NOT NULL DEFAULT '' COMMENT '已用金额',
  `applied_date` date NOT NULL DEFAULT '0000-00-00' COMMENT '应用日期',
  `cancel` int(2) DEFAULT NULL,
  `cancel_date` varchar(255) DEFAULT NULL COMMENT '取消日期',
  `cust_code` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sdar_id`),
  KEY `om_special_discount_applied_records_ibfk_1` (`cust_id`),
  CONSTRAINT `applied_records_FK_info` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
