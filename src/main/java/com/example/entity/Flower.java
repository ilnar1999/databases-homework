package com.example.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Flower {
  private Long id;
  private String name;
  private Integer countOfAvailable;
  private Color color;
}
