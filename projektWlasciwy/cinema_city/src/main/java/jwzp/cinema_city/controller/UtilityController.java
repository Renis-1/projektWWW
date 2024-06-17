package jwzp.cinema_city.controller;

import jwzp.cinema_city.models.Movie;
import jwzp.cinema_city.models.UserEntity;
import jwzp.cinema_city.service.MovieService;
import jwzp.cinema_city.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UtilityController {

    @Autowired
    private MovieService movieService;
    @GetMapping("/")
    public String home(Model model){
        List<Movie> movies = movieService.findAllMovies();
        model.addAttribute("movies", movies);
        return "home";
    }

    @GetMapping("/panel")
    public String admin(){
        return "admin";
    }
}
