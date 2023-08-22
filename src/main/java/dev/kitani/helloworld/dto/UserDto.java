package dev.kitani.helloworld.dto;

public record UserDto(
    String nome,
    String document,
    String email,
    String phone
) {

}
