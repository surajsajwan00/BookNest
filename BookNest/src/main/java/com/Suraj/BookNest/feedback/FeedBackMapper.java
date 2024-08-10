package com.Suraj.BookNest.feedback;

import com.Suraj.BookNest.book.Book;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class FeedBackMapper {
    public FeedBack toFeedBack(FeedBackRequest request) {
        return FeedBack.builder()
                .score(request.score())
                .comment(request.comment())
                .book(Book.builder().id(request.bookId()).build())
                .build();
    }

    public FeedBackResponse toFeedbackResponse(FeedBack feedback, Integer id) {
        return FeedBackResponse.builder()
                .score(feedback.getScore())
                .comment(feedback.getComment())
                .ownFeedback(Objects.equals(feedback.getCreatedBy(), id))
                .build();
    }
}
