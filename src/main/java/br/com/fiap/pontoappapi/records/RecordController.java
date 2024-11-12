package br.com.fiap.pontoappapi.records;

import br.com.fiap.pontoappapi.records.dto.RecordRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
public class RecordController {

    private final RecordRepository recordRepository;

    public RecordController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Record create(@RequestBody @Valid RecordRequest recordRequest) {
        return recordRepository.save(recordRequest.toModel());
    }

}
