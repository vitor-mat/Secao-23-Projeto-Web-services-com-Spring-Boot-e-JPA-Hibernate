package com.educandoweb.course.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resoucer not found. Id" + id);
    }
}
