package org.bookish.Controller;

import org.bookish.Model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {

    List<Movie> l = Arrays.asList(
            new Movie(1,"Harry Potter","Magic show movie"),
            new Movie(2,"Titanic","Romantic show movie"),
            new Movie(3,"3 Idiots","Comedy show movie")
    );

    @RequestMapping("movies")
    public List<Movie> getMovie(){
        return l;
    }

    @RequestMapping("movies/{id}")
    public Movie getOneMovie(@PathVariable Integer id){
        return l.stream().filter(x-> x.getId() == id).toList().get(0);
    }
}
