package dev.jda.model.library;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    @Size(max = 40)
    @Schema(title = "NAME",requiredMode = Schema.RequiredMode.REQUIRED, description = "A private string variable named name")
    private String name;

}
