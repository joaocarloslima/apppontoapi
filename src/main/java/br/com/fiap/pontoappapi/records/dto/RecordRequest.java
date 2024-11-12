package br.com.fiap.pontoappapi.records.dto;

import br.com.fiap.pontoappapi.records.Record;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public record RecordRequest(
        String userId,
        Double latitude,
        Double longitude
) {
    public Record toModel() {
        return Record.builder()
                .id(UUID.randomUUID())
                .userId(userId)
                .datetime(LocalDateTime.now())
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}
