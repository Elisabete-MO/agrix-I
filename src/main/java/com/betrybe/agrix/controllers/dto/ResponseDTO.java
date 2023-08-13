package com.betrybe.agrix.controllers.dto;

public record ResponseDTO<T>(String message, T data) {
}
