package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String categoryId;

    @Column(name = "category_title", length = 60, nullable = false)
    private String title;

    @Column(name = "category_desc", length = 50)
    private String description;

    @Column(name = "cover_image")
    private String coverImage;
}
