package com.Suraj.BookNest.feedback;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedBackResponse {
    private Double score;
    private String comment;
    private boolean ownFeedback;
}
