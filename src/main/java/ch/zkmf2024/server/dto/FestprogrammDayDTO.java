package ch.zkmf2024.server.dto;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public record FestprogrammDayDTO(@NotNull String day,
                                 @NotNull List<FestprogrammEntryDTO> entries) {
}
