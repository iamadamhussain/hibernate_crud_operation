package com.adam.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp {
public static void main(String[] args) {
//	
//	
//	
//	//step1:
//	Person person=new Person();
//	//person.setPid(pid); its auto generate
//	person.setName("adam");
//	person.setAddress("rajaji nagar");
//	
//	//step2:
//	Configuration configuration=new Configuration();
//	configuration.configure("raja.xml");
////	//step3:
//	SessionFactory factory=configuration.buildSessionFactory();
////	//step4:
//	Session session=factory.openSession();
//	
////	//step5
//	Transaction transaction=session.beginTransaction();
////	//step6
//	session.save(person);//it will insert the value in table
////	//step7
//	transaction.commit();
//	session.close();
////	
	
Person p=	getById(2);


	
	//loadById(2);
	
//deleteById(1);
	
	
}


public static void updateById(Person p)

{
	
	//step2:
	Configuration configuration=new Configuration();
	configuration.configure("raja.xml");
//	//step3:
	SessionFactory factory=configuration.buildSessionFactory();
//	//step4:
	Session session=factory.openSession();
	
//	//step5
	Transaction transaction=session.beginTransaction();
//	//step6

session.update(p);
//	//step7
	transaction.commit();
	session.close();
	
}



public static void deleteById(int id)

{
	
	//step2:
	Configuration configuration=new Configuration();
	configuration.configure("raja.xml");
//	//step3:
	SessionFactory factory=configuration.buildSessionFactory();
//	//step4:
	Session session=factory.openSession();
	
//	//step5
	Transaction transaction=session.beginTransaction();
//	//step6
Person p=	(Person) session.load(Person.class,id);


session.delete(p);
System.out.println(" information deleted----");
//	//step7
	transaction.commit();
	session.close();
	
}


public static Person getById(int id)

{
	
	//step2:
	Configuration configuration=new Configuration();
	configuration.configure("raja.xml");
//	//step3:
	SessionFactory factory=configuration.buildSessionFactory();
//	//step4:
	Session session=factory.openSession();
	
//	//step5
	Transaction transaction=session.beginTransaction();
//	//step6
Person p=	(Person) session.get(Person.class,2);
System.out.println("--------------infor-------"+p);
System.out.println("--------------second session-------");
Session session2=factory.openSession();


Person p1=	(Person) session2.get(Person.class,2);
System.out.println("-----------2nd time---read by different id-------"+p1);


//	//step7
	transaction.commit();
	session2.close();
	session.close();
	return p1;
}


public static void loadById(int id)

{
	
	//step2:
	Configuration configuration=new Configuration();
	configuration.configure("raja.xml");
//	//step3:
	SessionFactory factory=configuration.buildSessionFactory();
//	//step4:
	Session session=factory.openSession();
	
//	//step5
	Transaction transaction=session.beginTransaction();
//	//step6
Person p=	(Person) session.load(Person.class,id);
System.out.println("--------------ID-------"+p.getPid());
System.out.println("--------------Name-------"+p.getName());

System.out.println("--------------Address-------"+p.getAddress());

//	//step7
	transaction.commit();
	session.close();
	
}
}
