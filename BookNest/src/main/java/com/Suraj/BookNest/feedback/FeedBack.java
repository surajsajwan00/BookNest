package com.Suraj.BookNest.feedback;

import com.Suraj.BookNest.book.Book;
import com.Suraj.BookNest.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FeedBack extends BaseEntity {
    private double score;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
