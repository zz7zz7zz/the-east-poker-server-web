use entertainment;
create table if not exists user(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	identity  VARCHAR(32),
	identity_source INT,
	ltk VARCHAR(32),
	name VARCHAR(32),
	portrait VARCHAR(128)
);

 /* �û���˵����
  * id 					����
  * identity 			������Ψһid
  * identity_source 	��������Դ
  * ltk 				MD5(������Ψһid+��������Դ)���ɵ�Ψһֵ
	name 				�ǳ�
  * portrait            ͷ��
  *  */
