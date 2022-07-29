package com.echo.infrastructure.external;


import com.echo.domain.entities.dto.DollarCotationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata", name = "PTAX")
public interface PTAX {

    @GetMapping("/CotacaoDolarPeriodo(dataInicial='{dataInicial}',dataFinalCotacao='{dataFinal}')?$format=json")
    DollarCotationDTO getDollarCotation(@PathVariable("dataInicial") String dataInicial, @PathVariable("dataFinal") String dataFinal);
}