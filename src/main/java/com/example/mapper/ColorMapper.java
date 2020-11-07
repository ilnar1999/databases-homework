package com.example.mapper;

import com.example.entity.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class ColorMapper implements RowMapper<Color> {

  @Override
  public Color mapRow(ResultSet resultSet, int i) throws SQLException {
    return Color.builder().
        id(resultSet.getLong("id"))
        .name(resultSet.getString("name"))
        .build();
  }
}
