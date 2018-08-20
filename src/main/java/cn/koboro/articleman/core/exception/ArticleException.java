package cn.koboro.articleman.core.exception;

/**
 * 自定义运行时异常
 *
 * @author xdw
 */
public class ArticleException extends RuntimeException {

    private Integer code;

    public ArticleException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
