CREATE TABLE t_order (
  systemid bigint(20) unsigned NOT NULL auto_increment COMMENT '订单流水号',
  client_id varchar(50) NOT NULL COMMENT '客户ID',
  good_id varchar(50) NOT NULL COMMENT '商品编码',
  good_number int(10) NOT NULL COMMENT '数量',
  order_date timestamp default CURRENT_TIMESTAMP NOT NULL COMMENT '下单日期',
  status varchar(2) NOT NULL COMMENT '订单状态',
  create_date timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '创建时间',
  create_by varchar(50) COMMENT '创建人',
  update_date timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '更新时间',
  update_by varchar(50) COMMENT '更新人',
  PRIMARY KEY  (systemid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';