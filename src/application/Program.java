package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		Department dep = new Department(2, null);
		//Seller newseller = new Seller (null, "Greg Pinto","greg@gmail.com", new Date(), 4000.00, dep);
		//sellerDao.insert(newseller);
		//System.out.println(newseller.getId());
		
		 Seller seller = sellerDao.findById(3);
		 seller.setName("Jacinto Barros do Rego");
		 sellerDao.update(seller);
		 
		List <Seller> list = sellerDao.findAll();
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		

	}

}
