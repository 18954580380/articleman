package cn.koboro.articleman.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author xdw
 */
@Data
@Entity
@Table(name = "koboro_articleman")
public class ArticlemanEntity {

    @Id
    private Integer id;
    private Long cId;
    private Long type;
    private String path;
    private String context;

}
