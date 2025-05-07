package test12Aop;

public class WriteArticleServiceImpl implements WriteArticleService{

	private ArticleDao articleDao;
	public WriteArticleServiceImpl() {
	}
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void write(Article article) {
		System.out.println("WriteArticleService.write() 실행...");
		articleDao.insert(article);
		
	}


}
