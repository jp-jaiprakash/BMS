package com.example.demo.theatre.model;

import com.example.demo.theatre.entity.ScreenEntity;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Theatre {
   private Long theaterId;
   private String name;
   private String city;
   private String area;
   private List<ScreenEntity> screens;
}
