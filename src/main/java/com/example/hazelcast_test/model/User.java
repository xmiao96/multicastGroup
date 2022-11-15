package com.example.hazelcast_test.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    private String id;
    @Field
    private String nickname;
}
