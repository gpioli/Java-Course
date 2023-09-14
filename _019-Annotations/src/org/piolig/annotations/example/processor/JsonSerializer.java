package org.piolig.annotations.example.processor;

import org.piolig.annotations.example.Init;
import org.piolig.annotations.example.JsonAttribute;
import org.piolig.annotations.example.processor.exception.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {

    public static void initializeObject(Object object){

        if (Objects.isNull(object)) {
            throw new JsonSerializerException("The object to serialize cannot be null");
        }
        Method[] methods = object.getClass().getDeclaredMethods();
        Arrays.stream(methods).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        // if the method is present, we invoke it
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializerException("Error serializing object, cannot initialize the object" +
                                e.getMessage());
                    }
                });
    }

    public static String convertJson(Object object) {
        Field[] attributes = object.getClass().getDeclaredFields();

        if (Objects.isNull(object)) {
            throw new JsonSerializerException("The objecto to serialize cannot be null");
        }

        initializeObject(object);

        // if the annotation is present for the field...
        return Arrays.stream(attributes)
                .filter(f -> f.isAnnotationPresent(JsonAttribute.class))
                .map(f -> {
                    // here we use reflection, in order to be able to access the private fields
                    f.setAccessible(true);

                    String name = f.getAnnotation(JsonAttribute.class).name().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAttribute.class).name();
                    try {
                        Object value = f.get(object);
                        if (f.getAnnotation(JsonAttribute.class).capitalize()
                                && value instanceof String) {
                            String newValue = (String) value;
                            newValue = Arrays.stream(newValue.split(" "))
                                    .map(word -> word.substring(0,1).toUpperCase()
                                    + word.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));
                            f.set(object, newValue);

                    }
                    return "\"" + name + "\":\"" + f.get(object) + "\"";
                } catch(IllegalAccessException e){
            throw new JsonSerializerException("Error trying to serialize json " + e.getMessage());
        }
    })
            .

    reduce("{",(a, b) ->

    {
        if ("{".equals(a)) {
            return a + b;
        } else {
            return a + ", " + b;
        }
    }).

    concat("}");
}
}
