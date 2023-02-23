package ru.netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data// Аннотация, которая применяет сразу несколько аннотаций Lombok
@RequiredArgsConstructor
// Создаёт конструктор с требуемыми аргументами

public class RegistrationUserData {
    private final String login;
    private final String password;
    private final String status;
}


