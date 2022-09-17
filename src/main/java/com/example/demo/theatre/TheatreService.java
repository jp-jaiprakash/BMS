package com.example.demo.theatre;

import com.example.demo.theatre.entity.MovieEntity;
import com.example.demo.theatre.entity.ScreenEntity;
import com.example.demo.theatre.entity.ShowsEntity;
import com.example.demo.theatre.entity.TheatreEntity;
import com.example.demo.theatre.model.Movie;
import com.example.demo.theatre.model.Screen;
import com.example.demo.theatre.model.Theatre;
import com.example.demo.theatre.repository.MovieRepository;
import com.example.demo.theatre.repository.ScreenRepository;
import com.example.demo.theatre.repository.ShowsRepository;
import com.example.demo.theatre.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Component
public class TheatreService {

   @Autowired
   MovieRepository movieRepository;

   @Autowired
   ShowsRepository showsRepository;

   @Autowired
   TheatreRepository theatreRepository;

   @Autowired
   ScreenRepository screenRepository;


   public List<Theatre> getTheatres(String city, String movieName, String date) {


      MovieEntity movieEntity = movieRepository.findByName(movieName);
      List<TheatreEntity> theatreEntity = theatreRepository.findByCity(city);
      List<ShowsEntity> showsEntity = showsRepository.findByMovieentityAndTheaterentityIn(movieEntity, theatreEntity);

      List<Theatre> lst = new ArrayList<>();
      Map<TheatreEntity, List<ShowsEntity>> map = showsEntity.stream()
              .collect(groupingBy(ShowsEntity::getTheaterentity));

      for(Map.Entry<TheatreEntity, List<ShowsEntity>> k: map.entrySet()){
         List<ScreenEntity> ls = k.getValue().stream().map(x-> x.getScreenentity()).collect(Collectors.toList());
         Theatre theatre = Theatre.builder()
                 .name(k.getKey().getTheatrename())
                 .area(k.getKey().getArea())
                 .screens(ls)
                 .city(k.getKey().getCity())
                 .theaterId(k.getKey().getTheatreid())
                 .build();
         lst.add(theatre);
      }
     

      return lst;
   }
}
