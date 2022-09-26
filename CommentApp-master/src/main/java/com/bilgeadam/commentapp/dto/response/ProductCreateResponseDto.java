package com.bilgeadam.commentapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductCreateResponseDto {
    private String name;
    private  double price;
    private LocalDate expirationDate;
}
