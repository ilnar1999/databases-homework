package com.example.repository;

import com.example.entity.Flower;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class FlowerRepository {

  public Flower getById(Long id) {
    return null; //todo
  }

  public Map<Flower, Integer> getFlowersWithCountsByBouquetId(Long bouquetId) {
    return null; //todo
  }
}
