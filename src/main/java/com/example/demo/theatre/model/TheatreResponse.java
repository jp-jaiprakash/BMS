package com.example.demo.theatre.model;

import com.example.demo.theatre.entity.TheatreEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TheatreResponse {
   private List<TheatreEntity> theatres;
}
