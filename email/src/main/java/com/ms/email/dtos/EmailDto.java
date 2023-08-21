package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto  {

    @NotBlank(message = "Autor obrigatório")
    private String ownerRef;
    @NotBlank(message = "Remetente obrigatório")
    private String emailFrom;
    @NotBlank(message = "Destinátario obrigatório")
    @Email
    private String emailTo;
    @NotBlank(message = "Título do e-mail obrigatório")
    private String subject;
    @NotBlank(message = "Corpo do e-mail é obrigatório")
    private String text;
}
