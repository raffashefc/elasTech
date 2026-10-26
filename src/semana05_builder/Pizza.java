package semana05_builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pizza {
    private String sabor;
    private boolean temQueijo;
    private String borda;
}