package com.example.mapper;

import com.example.entity.Bouquet;
import com.example.repository.FlowerRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class BouquetMapper implements RowMapper<Bouquet> {

  @Autowired
  private FlowerRepository flowerRepository;

  private Long bouquetId;


  @Override
  public Bouquet mapRow(ResultSet resultSet, int i) throws SQLException {
    bouquetId = resultSet.getLong("id");

    return Bouquet.builder()
        .id(bouquetId)
        .name(resultSet.getString("name"))
        .flowers(flowerRepository.getFlowersWithCountsByBouquetId(bouquetId))
        .build();
  }
}