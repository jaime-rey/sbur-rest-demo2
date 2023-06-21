package com.monokepos.sburrestdemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Type;

import java.util.UUID;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
public class Coffee {
    @Id
    private final String id;
    private String name;

    public Coffee(String name){
        this(UUID.randomUUID().toString(), name);
    }
}
