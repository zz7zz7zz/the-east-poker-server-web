use entertainment;
create table if not exists qaa(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ltk VARCHAR(32),
	level INT,
	coin BIGINT ,
	exp  BIGINT
);

 /* �û���˵����
  * id 					����
  * ltk 				MD5(������Ψһid+��������Դ)���ɵ�Ψһֵ
  * level 				�ȼ�
  * coin 				���
  * exp 				����ֵ
  *  */
