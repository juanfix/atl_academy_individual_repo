package atl.academy.atl_academy_individual_repo.controllers;

import atl.academy.atl_academy_individual_repo.entities.Category;
import atl.academy.atl_academy_individual_repo.entities.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/trivia/getCategories")
    public ArrayList<Category> getCategories(){
        ArrayList<Category> listCategories = new ArrayList<>();

        listCategories.add(new Category("Cultura", "Preguntas relacionadas con arte, literatura, música y otras expresiones culturales."));
        listCategories.add(new Category("Deportes", "Preguntas relacionadas con diversos deportes y eventos deportivos."));
        listCategories.add(new Category("Arte", "Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística."));
        listCategories.add(new Category("Cine", "Preguntas relacionadas con películas, directores, actores y otros aspectos del cine."));
        listCategories.add(new Category("Historia", "Preguntas relacionadas con eventos históricos, personajes y períodos importantes."));
        listCategories.add(new Category("Ciencia", "Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos."));

        return listCategories;
    }

    @GetMapping("/trivia/getQuestion/{category}")
    public Question getQuestion(@PathVariable String category){
        List<String> listOptions = new ArrayList<>(Arrays.asList("Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, sal, tabasco y lima/limón"));
        return new Question(category, "¿Qué ingredientes se necesitan para hacer una michelada?", listOptions, 0, "\"La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.\"");
    }

}
