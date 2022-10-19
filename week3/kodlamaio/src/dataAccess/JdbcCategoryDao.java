package kodlamaio.src.dataAccess;

import kodlamaio.src.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Added to database with JDBC " + category.getCategoryName());
	}

}
