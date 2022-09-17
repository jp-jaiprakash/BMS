package com.example.demo.theatre.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shows")
public class ShowsEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long showid;

   @ManyToOne
   @JoinColumn(name="theatreid", nullable = false)
   private TheatreEntity theaterentity;

   @ManyToOne
   @JoinColumn(name="screenid", nullable = false)
   private ScreenEntity screenentity;

   @ManyToOne
   @JoinColumn(name="movieid", nullable = false)
   private MovieEntity movieentity;

   private String showtimings;
   private String showdate;
}
