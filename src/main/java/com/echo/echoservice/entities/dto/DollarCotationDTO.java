package com.echo.echoservice.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DollarCotationDTO {

    public DecimalFormat cotacaoCompra;
    public DecimalFormat cotacaoVenda;
    public LocalDateTime dataHoraCotacao;

}
