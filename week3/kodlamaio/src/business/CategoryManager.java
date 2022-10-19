package kodlamaio.src.business;

import java.util.List;

import kodlamaio.src.core.logging.Logger;
import kodlamaio.src.dataAccess.CategoryDao;
import kodlamaio.src.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private List<Category> categories;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category categoryName : categories) {
			if(categoryName.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception ("This category name already exists.");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	
	}

}
