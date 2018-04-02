use entertainment;
create table if not exists user(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	identity  VARCHAR(32),
	identity_source INT,
	ltk VARCHAR(32),
	name VARCHAR(32),
	portrait VARCHAR(128)
);

 /* 用户表说明：
  * id 					主键
  * identity 			第三方唯一id
  * identity_source 	第三方来源
  * ltk 				MD5(第三方唯一id+第三方来源)生成的唯一值
	name 				昵称
  * portrait            头像
  *  */
