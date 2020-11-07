package com.example.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class User {
  private Long id;
  private String name;
  private String phone;
}
