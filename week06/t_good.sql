CREATE TABLE t_good (
  systemid bigint(20) unsigned NOT NULL auto_increment COMMENT '商品流水号',
  id varchar(50) NOT NULL COMMENT '商品编码',
  name varchar(50) NOT NULL COMMENT '商品名称',
  color varchar(10) NOT NULL COMMENT '颜色',
  specification varchar(50) NOT NULL COMMENT '款式',
  price float NOT NULL COMMENT '价格',
  is_avaliable varchar(1) NOT NULL COMMENT '是否有货(Y-有货，N或空-无货)',
  create_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  create_by varchar(10) COMMENT '创建人',
  update_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  update_by varchar(10) COMMENT '更新人',
  PRIMARY KEY  (systemid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表';