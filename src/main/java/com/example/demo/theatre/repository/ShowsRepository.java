package com.example.demo.theatre.repository;

import com.example.demo.theatre.entity.MovieEntity;
import com.example.demo.theatre.entity.ShowsEntity;
import com.example.demo.theatre.entity.TheatreEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShowsRepository
        extends CrudRepository<ShowsEntity, Long> {
    List<ShowsEntity> findByMovieentityAndTheaterentityIn(MovieEntity movieEntity, List<TheatreEntity> theatreEntity);
//   @Query(nativeQuery = true,value = "select * from shows where movieid = ?1 and showdate = ?2 and theatreid in (?3)")
//   public List<ShowsEntity> findByMovieIdAndTheatreId(Long movieId, String date, List<Long> theatreIds);
}
