package com.ecommerce.karina.controller;

import com.ecommerce.karina.model.Category;
import com.ecommerce.karina.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping(value = "/all")
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @GetMapping(value = "/get")
    public Category get(@RequestParam("id") int id) {
        return categoryRepository.findById(id).get();
    }

    @PostMapping(value = "/add")
    public List<Category> persist(@RequestBody final Category category) {
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    @DeleteMapping(value = "/delete")
    public List<Category> delete(@PathVariable int id) {
        categoryRepository.deleteById(id);
        return categoryRepository.findAll();
    }

    @PutMapping(value = "/put/{id}")
    public List<Category> put(@PathVariable int id, @RequestBody Category category) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            categoryRepository.save(category);
        }

        return categoryRepository.findAll();
    }
}
