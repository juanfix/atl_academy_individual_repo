package atl.academy.atl_academy_individual_repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {
    /* host + /search/{word} */
    @GetMapping("/search/{word}")
    public List<String> getWordsAutocomplete (@PathVariable String word) {
        String[] commonResult = {"java bootcamp", "java course 2023", "java the best", "curso de c++", "python"};
        List<String> searchResults = new ArrayList<>();
        for (String result: commonResult) {
            if(result.toLowerCase().contains(word.toLowerCase())){
                searchResults.add(result);
            }
        }
        return searchResults;
    }
}
