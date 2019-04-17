package com.wedding.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.wedding.daos.SubCategoryDao;
import com.wedding.models.SubCategory;
import com.wedding.utility.ConnectionProvider;

public class SubCategoryDaoImpl implements SubCategoryDao {

	@Override
	public boolean addSubCategory(SubCategory subCategoryObj) {
		// TODO Auto-generated method stub
		try {
			Connection conn=ConnectionProvider.getConnection();
			PreparedStatement ps=conn.prepareStatement
					("insert into SubCategory values(subcatseq.nextval,?)");
			ps.setString(1,subCategoryObj.getSubCategoryName());
			int i=ps.executeUpdate();
			
			if(i!=0)
				return true;
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean deleteSubCategory(int subCatId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSubCategory(SubCategory subCategoryObj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SubCategory getSubCategoryById(int subCatId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubCategory> getAllSubCategories(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

}
