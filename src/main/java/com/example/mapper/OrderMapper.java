package com.example.mapper;

import com.example.entity.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements RowMapper<Order> {

  @Override
  public Order mapRow(ResultSet resultSet, int i) throws SQLException {
    return null; //todo
  }
}
