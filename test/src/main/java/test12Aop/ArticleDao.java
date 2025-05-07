package test12Aop;

public interface ArticleDao {
	void insert(Article article);
	
	void updateReadCount(int id, int i);
}
