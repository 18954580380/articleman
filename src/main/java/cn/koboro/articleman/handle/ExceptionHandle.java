package cn.koboro.articleman.handle;

import cn.koboro.articleman.core.exception.ArticleException;
import cn.koboro.articleman.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 *
 * @author xdw
 */
@Slf4j
@ControllerAdvice("cn.koboro.articleman.controller")
public class ExceptionHandle {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        if (e instanceof ArticleException) {
            ArticleException exception = (ArticleException) e;
            return ResultVO.error(exception.getCode(), exception.getMessage());
        } else {
            log.error("【系统异常 develop version】{}", e);
            return ResultVO.error(-1, "未知错误");
        }
    }

}
