package damoyeo.server.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommonException extends RuntimeException {
    private final ErrorCode errorCode;

    @Override
    public String getMessage() {
        return this.errorCode.getMessage();
    }

    public static CommonException from(ErrorCode errorCode) {
        return new CommonException(errorCode);
    }

}