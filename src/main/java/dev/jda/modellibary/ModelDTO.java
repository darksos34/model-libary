package dev.jda.modellibary;

import jakarta.validation.constraints.Null;
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
public class ModelDTO {

    @Null
    private String url;

    @Null
    private String uuid;

    @Size(max = 40)
    private String name;

    @Size(max = 15)
    private String code;

}
