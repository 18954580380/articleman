package cn.koboro.articleman.service;

import java.util.List;

import cn.koboro.articleman.model.ArticlemanEntity;

public interface ArticlemanService {
	  List<ArticlemanEntity> findArticlemaneByCidAndType(Long cId,Long type);
	  int  processingData(ArticlemanEntity articlemanEntity,List<ArticlemanEntity>articlemanEntitys);

}
