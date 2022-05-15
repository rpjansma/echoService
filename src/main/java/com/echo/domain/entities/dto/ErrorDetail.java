package com.echo.domain.entities.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetail {
    private String requestDateTime;
    private String detail;
    private String title;
    private String code;
}
