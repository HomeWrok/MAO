package datalayer.DaoInterfaces;

import java.sql.Date;
import java.sql.SQLException;

import businessObjects.hr.PeopleContent.SalType;


public interface CustomersDao  {

	 public void add(String address1, String address2, String city, int zipCode, String region, String country,
				Date Rdate  , String name,Date birthday, float employeeID, String phone, String email, int  degree, int trainigProgram  , int paymets,int arriveFrom,int insurance , String notes) 
	            throws ClassNotFoundException, SQLException;
	 
     public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyNameCustomer(String OfficialId ,String name) throws ClassNotFoundException, SQLException ;

	 public void ModidyPhoneCustomer(String OfficialId ,String phone) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyDatebirthdayCustomer(String OfficialId ,Date birthday) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyEmailCustomer(String OfficialId ,String email) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyPhoneCustomer(String OfficialId ,int  degree) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyTrainigProgramCustomer(String OfficialId ,int trainigProgram) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyPaymetsCustomer(String OfficialId ,int paymets) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyArriveFromCustomer(String OfficialId ,int arriveFrom) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyInsuranceCustomer(String OfficialId ,int insurance) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyNotesCustomer(String OfficialId ,String notes) throws ClassNotFoundException, SQLException ;
	 
	 public void ModidyAdressCustomer(String OfficialId, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException;

	
}
