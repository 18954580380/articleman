package cn.koboro.articleman.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.koboro.articleman.mapper.ArticlemanMapper;
import cn.koboro.articleman.model.ArticlemanEntity;
import cn.koboro.articleman.service.ArticlemanService;
@Service
@Transactional
public class ArticlemanServiceImpl implements ArticlemanService{
	@Resource 
	private ArticlemanMapper articlemanMapper ;
   /**
    * 根据ciD和文章类型查询上传记录
    */
	@Override
	public List<ArticlemanEntity> findArticlemaneByCidAndType(Long cId, Long type) {
		return articlemanMapper.findArticlemaneByCidAndType(cId,type);
	}
	/**
	 * 处理数据，删除已经存在的记录，新增新上传的记录
	 */
	@Override
	public int processingData(ArticlemanEntity articlemanEntity, List<ArticlemanEntity> articlemanEntitys) {
		 for (ArticlemanEntity article : articlemanEntitys) {
			 articlemanMapper.delete(article);
	 	}
		 int count=articlemanMapper.insertSelective(articlemanEntity);
		 return count;
	}

}
