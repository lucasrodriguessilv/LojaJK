package com.example.lojaJK.tenis;

public record TenisResponseDTO(Long id, String title, String image, Integer price) {
    public TenisResponseDTO(Tenis tenis){
        this(tenis.getId(), tenis.getTitle(),tenis.getImage(), tenis.getPrice());
    }
}
