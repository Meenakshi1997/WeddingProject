package com.wedding.daos;

import java.util.List;

import com.wedding.models.SubCategory;

public interface SubCategoryDao {
	public boolean addSubCategory(SubCategory subCategoryObj);
	public boolean deleteSubCategory(int subCatId);
	public boolean updateSubCategory(SubCategory subCategoryObj);
	public SubCategory getSubCategoryById(int subCatId);
	public List<SubCategory> getAllSubCategories(int cId);

}
