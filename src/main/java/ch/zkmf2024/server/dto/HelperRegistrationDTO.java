package ch.zkmf2024.server.dto;

import javax.validation.constraints.NotNull;

public record HelperRegistrationDTO(@NotNull Long id,
                                    @NotNull String name,
                                    @NotNull String email,
                                    boolean availableFriday,
                                    boolean availableSaturday,
                                    boolean availableSunday,
                                    String comment) {
}