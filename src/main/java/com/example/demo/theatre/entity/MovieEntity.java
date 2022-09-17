package com.example.demo.theatre.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "movie")
public class MovieEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long movieid;
   private String name;

//   @OneToMany(mappedBy = "movieentity")
//   private List<ShowsEntity> shows;

}
