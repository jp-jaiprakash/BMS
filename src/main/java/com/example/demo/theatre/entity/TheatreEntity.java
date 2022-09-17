package com.example.demo.theatre.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "theatre")
public class TheatreEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long theatreid;
   private String theatrename;
   private String city;
   private String pincode;
   private String area;

//   @OneToMany(mappedBy = "theaterentity")
//   private Set<ScreenEntity> screens;
//
//   @OneToMany(mappedBy = "theaterentity")
//   private List<ShowsEntity> shows;
}
