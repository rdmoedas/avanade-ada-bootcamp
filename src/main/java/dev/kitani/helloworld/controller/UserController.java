package dev.kitani.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createOneUser(@RequestBody() String userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping("{id}")
    public String getOneUser(@PathVariable String id) {
        return "User " + id;
    }

    @GetMapping
    public String[] getAllUsers(@RequestParam(required = false, value = "filter", defaultValue = "") String filter) {
        return new String[]{ "User 1", "User 2", filter };
    }

    @PutMapping("/{id}")
    public String editUser(@PathVariable String id) {
        return "Edited user " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        return "Deleted user " + id;
    }
}
