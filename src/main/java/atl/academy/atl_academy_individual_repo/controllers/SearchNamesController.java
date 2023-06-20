package atl.academy.atl_academy_individual_repo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SearchNamesController {

    List<String> peopleList = new ArrayList<>(Arrays.asList("Juan Jose Ceballos Navia",
            "Valentina Garcia Ortiz",
            "Emilio Alberto Valencia Valencia",
            "Maria Claudia Velez Roman"));

    /* host + /searchNames/getAll */
    @GetMapping("/searchNames/getAll")
    public List<String> getAllPeopleNames () {
        return peopleList;
    }

    /* host + /searchNames/getOne/{word} */
    @GetMapping("/searchNames/getOne/{word}")
    public List<String> getPeopleNames (@PathVariable String word) {
        List<String> searchResults = new ArrayList<>();
        for (String result: peopleList) {
            if(result.toLowerCase().contains(word.toLowerCase())){
                searchResults.add(result);
            }
        }
        return searchResults;
    }

    /* host + /searchNames/{word} */
    @PostMapping("/searchNames/{word}")
    public List<String> createPeopleNames (@PathVariable String word) {
        peopleList.add(word);
        return peopleList;
    }

    /* host + /searchNames/{word} */
    @DeleteMapping("/searchNames/{word}")
    public List<String> deletePeopleNames (@PathVariable String word) {
        peopleList.remove(word);
        return peopleList;
    }

}
