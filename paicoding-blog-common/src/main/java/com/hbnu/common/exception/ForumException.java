package com.hbnu.common.exception;
import com.hbnu.common.vo.Status;
import com.hbnu.common.vo.constants.StatusEnum;
import lombok.Getter;

/**
 * 业务异常
 *
 * @author YiHui
 * @date 2022/9/2
 */
public class ForumException extends RuntimeException {
    @Getter
    private Status status;

    public ForumException(Status status) {
        this.status = status;
    }

    public ForumException(int code, String msg) {
        this.status = Status.newStatus(code, msg);
    }

    public ForumException(StatusEnum statusEnum, Object... args) {
        this.status = Status.newStatus(statusEnum, args);
    }

}
