package com.example.entity;

import java.time.LocalDateTime;
import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Order {
  private Long id;
  private LocalDateTime dateTime;
  private Map<Bouquet, Integer> bouquets;
}
