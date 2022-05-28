package ru.learnup.bookStore.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private int year;

    @Column
    private int countPage;

    @ManyToOne ()
    @JoinColumn(name ="author_id")
    private Author author;

    @Column
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", countPage=" + countPage +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}
