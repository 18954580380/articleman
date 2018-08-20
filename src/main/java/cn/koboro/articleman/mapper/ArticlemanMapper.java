package cn.koboro.articleman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.koboro.articleman.core.IBaseMapper;
import cn.koboro.articleman.model.ArticlemanEntity;
/**
 * @author xdw
 */
public interface ArticlemanMapper extends IBaseMapper<ArticlemanEntity> {
	List<ArticlemanEntity> findArticlemaneByCidAndType(@Param("cId")Long cId, @Param("type")Long type);

}
