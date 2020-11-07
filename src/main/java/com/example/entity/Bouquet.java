package com.example.entity;

import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Bouquet {
  private Long id;
  private String name;
  private Map<Flower, Integer> flowers;
}
