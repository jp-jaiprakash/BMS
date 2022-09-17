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
import java.util.stream.Collectors;

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


   public List<TheatreEntity> getTheatres(String city, String movieName, String date) {


      MovieEntity movieEntity = movieRepository.findByName(movieName);
      List<TheatreEntity> theatreEntity = theatreRepository.findByCity(city);
      List<ShowsEntity> showsEntity = showsRepository.findByMovieentityAndTheaterentityIn(movieEntity, theatreEntity);

      List<TheatreEntity> lst = new ArrayList<>();
              showsEntity.stream().forEach(
              t-> {
                 lst.add(t.getScreenentity().getTheaterentity());
              }
      );

      return lst;
   }
}
