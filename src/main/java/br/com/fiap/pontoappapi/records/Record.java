package br.com.fiap.pontoappapi.records;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    
    @Id
    private UUID id = UUID.randomUUID();
    private String userId;
    private LocalDateTime datetime;
    private Double latitude;
    private Double longitude;
    
}
