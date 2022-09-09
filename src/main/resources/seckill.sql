CREATE DATABASE `seckilldemo` ;

USE `seckilldemo`;

/*Table structure for table `seckill_user` */

DROP TABLE IF EXISTS `seckill_user`;

CREATE TABLE `seckill_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` bigint(20) NOT NULL COMMENT '手机号码',
  `nick_name` varchar(255) NOT NULL COMMENT '昵称',
  `user_pass` varchar(30) DEFAULT NULL COMMENT '密码(MD5(MD5(明文pass+固定salt)+ 随机salt))',
  `head` varchar(128) DEFAULT '/img/defaulthead.jpg' COMMENT '头像',
  `salt` varchar(255) DEFAULT NULL COMMENT '盐',
  `register_time` datetime NOT NULL COMMENT '注册时间',
  `last_login_time` datetime NOT NULL COMMENT '最后登录时间',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
