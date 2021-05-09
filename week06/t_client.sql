CREATE TABLE t_client(
  systemid bigint(20) unsigned NOT NULL auto_increment COMMENT '客户记录号',
  client_id varchar(50) NOT NULL COMMENT '客户ID',
  client_name varchar(50) NOT NULL COMMENT '客户名称',
  is_vip varchar(50) NOT NULL COMMENT '是否会员（Y-是会员，非Y-非会员）',
  create_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '创建时间',
  create_by varchar(50) COMMENT '创建人',
  update_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '更新时间',
  update_by varchar(50) COMMENT '更新人',
  PRIMARY KEY  (systemid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='客户表';
