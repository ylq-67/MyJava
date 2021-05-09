CREATE TABLE t_order_status_tbl (
  name varchar(50) NOT NULL COMMENT '订单状态',
  color varchar(50) NOT NULL COMMENT '描述',
  create_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '创建时间',
  create_by varchar(50) COMMENT '创建人',
  update_date timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '更新时间',
  update_by varchar(50) COMMENT '更新人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单状态基表';