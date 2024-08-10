package com.Suraj.BookNest.history;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory, Integer> {
    @Query("""
           SELECT history
           FROM BookTransactionHistory history
           WHERE history.user.id = :userId
           """)
    Page<BookTransactionHistory> findAllBorrowedBooks(Pageable pageable, Integer userId);

    @Query("""
           SELECT history
           FROM BookTransactionHistory history 
           WHERE history.book.owner.id = :userId
           """)
    Page<BookTransactionHistory> findAllReturnedBooks(Pageable pageable, Integer userId);

    @Query("""
           SELECT (COUNT(*) > 0) isBorrowed
           FROM BookTransactionHistory history 
           WHERE history.user.id = :userId
           AND history.book.id = :bookId
           AND history.returnApproved = false
           """)
    boolean isAlreadyBorrowedByUser(@Param("bookId") Integer bookId, @Param("userId") Integer userId);;

    @Query("""
           SELECT history
           FROM BookTransactionHistory history 
           WHERE history.user.id = :userId
           AND history.book.id = :bookId
           AND history.returned = false
           AND history.returnApproved = false
           """)
    Optional<BookTransactionHistory> findByBookIdAndUserId(@Param("bookId") Integer bookId, @Param("userId") Integer userId);

    @Query("""
           SELECT history
           FROM BookTransactionHistory history 
           WHERE history.book.owner.id = :userId
           AND history.book.id = :bookId
           AND history.returned = true
           AND history.returnApproved = false
           """)
    Optional<BookTransactionHistory> findByBookIdAndOwnerId(@Param("bookId") Integer bookId, @Param("userId") Integer userId);
}
