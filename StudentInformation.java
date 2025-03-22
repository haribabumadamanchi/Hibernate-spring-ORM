package Com.Madamanchi.Module;

import javax.transaction.Transaction;

import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class StudentInformation {

	public static void main(String[] args) {
		
		Configuration config=;
		Configuration c1=config.;
		Configuration c2=c1.;
		
		SessionFactory sessionfactory=new Configuration()
										.configure()
										.addAnnotatedClass(Studentdetails.class)
										.buildSessionFactory();
		
		Transaction transaction=session.beginTransaction();
		
		
		Studentdetails studentdetails=new Studentdetails( 2,"hari",22,9392256344,"hari@gmail.com","ECE");
		Serializable id=session.save(studentdetails);
		
		System.out.println(id);
	}

}
