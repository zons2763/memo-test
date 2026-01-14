package com.example.memotest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "memos")
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
}
