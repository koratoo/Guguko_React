package org.zerock.mallapi.domain;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <pre>
 *      작성자 : 김지성
 *      클래스명 : Todo.java
 *      작성일 : 23.12.10
 *      설명 : Todo Entitiy 클래스, Jpa와 연동하여 사용됨
 * </pre>
 */


@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tno;

    private String title;

    private String writer;

    private boolean complete;

    private LocalDate dueDate;
}
