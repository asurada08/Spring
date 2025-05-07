package test12Aop;

public interface ArticleDao {
	void insert(Article article);
	//insert만 정의
	void updateReadCount(int id, int i);
}
