package study.querydsl.controller.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Hello {

    @Id
    @GeneratedValue
    public Long id;
}
