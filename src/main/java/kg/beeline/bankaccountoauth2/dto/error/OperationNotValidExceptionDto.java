package kg.beeline.bankaccountoauth2.dto.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperationNotValidExceptionDto {
    private String message;
}
