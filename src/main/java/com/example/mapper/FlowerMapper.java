package com.example.mapper;

import com.example.entity.Flower;
import com.example.repository.ColorRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class FlowerMapper implements RowMapper<Flower> {

  @Autowired
  private ColorRepository colorRepository;

  @Override
  public Flower mapRow(ResultSet resultSet, int i) throws SQLException {
    return Flower.builder()
        .id(resultSet.getLong("id"))
        .name(resultSet.getString("name"))
        .countOfAvailable(resultSet.getInt("count_of_available"))
        .color(colorRepository.getById(resultSet.getLong("color_id")))
        .build();
  }
}