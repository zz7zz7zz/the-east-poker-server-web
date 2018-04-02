use entertainment;
create table if not exists qaa(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ltk VARCHAR(32),
	level INT,
	coin BIGINT ,
	exp  BIGINT
);

 /* 用户表说明：
  * id 					主键
  * ltk 				MD5(第三方唯一id+第三方来源)生成的唯一值
  * level 				等级
  * coin 				金币
  * exp 				经验值
  *  */
