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
@Table(name = "screen")
public class ScreenEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long screenid;
   private int screennum;
   private int capacity;

   @ManyToOne
   @JoinColumn(name="theatreid", nullable = false)
   private TheatreEntity theaterentity;

//   @OneToMany(mappedBy = "screenentity")
//   private List<ShowsEntity> shows;
}
