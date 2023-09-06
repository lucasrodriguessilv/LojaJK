package com.example.lojaJK.tenis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "teniss")
@Entity(name = "teniss")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tenis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer price;
    private String image;

    public Tenis(TenisResponseDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

}
