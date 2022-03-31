package com.action.in.taco.cloud.api.controller;

import com.action.in.datastore.domain.Taco;
import com.action.in.datastore.repository.TacoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping(value = "/design", produces = "application/json")
@CrossOrigin(origins="*")
public class DesignTacoController {

    private TacoRepository tacoRepository;

    @Autowired
    EntityLinks entityLinks;

    @Autowired
    public DesignTacoController(TacoRepository tacoRepository) {
        this.tacoRepository = tacoRepository;
    }

    @GetMapping("/recent")
    public Iterable<Taco> recentTacos() {                 //<3>
        PageRequest page = PageRequest.of(
                0, 12, Sort.by("createdAt").descending());
        return tacoRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(Long id) {
        Optional<Taco> taco = tacoRepository.findAllById(id);
        if (taco.isPresent()){
            return new ResponseEntity<>(taco.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
//
//    @GetMapping
//    public String showDesignForm(Model model) {
//        List<Ingredient> ingredients = new ArrayList<>();
//        ingredientRepository.findAll().forEach(i -> ingredients.add(i));
//
//        Type[] types = Type.values();
//        for (Type type : types) {
//            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
//        }
//
//        model.addAttribute("taco", new Taco());
//
//        return "design";
//    }
//
//    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
//        return ingredients
//                .stream()
//                .filter(x -> x.getType().equals(type))
//                .collect(Collectors.toList());
//    }
//
//
//    @ModelAttribute(name = "order")
//    public Order order() {
//        return new Order();
//    }
//
//    @ModelAttribute(name = "taco")
//    public Taco taco() {
//        return new Taco();
//    }
//
//    @PostMapping
//    public String processDesign(@Valid Taco design, Errors errors, @ModelAttribute Order order) {
//        if (errors.hasErrors()) {
//            return "design";
//        }
//
//        Taco saved = tacoRepository.save(design);
//        order.addDesign(saved);
//
//        return "redirect:/orders/current";
//    }
}
