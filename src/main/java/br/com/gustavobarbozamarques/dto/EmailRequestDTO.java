package br.com.gustavobarbozamarques.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequestDTO {

    @NotBlank(message = "Recipient cannot be blank.")
    private String to;

    @NotBlank(message = "Subject cannot be blank.")
    private String subject;

    @NotBlank(message = "Body cannot be blank.")
    private String body;
}
