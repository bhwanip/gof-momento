import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gof.momento.EmpMomento;
import com.gof.momento.EmpOriginator;
import com.gof.momento.MomentoManager;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class MomentoManagerTest {

	private static final Logger logger = LoggerFactory.getLogger(MomentoManagerTest.class);

	@Test
	public void test() {
		logger.info("Creating Object First...");
		EmpOriginator emp = new EmpOriginator(100, "Rocky", "9999", "Champion");
		EmpMomento momento = emp.saveToMomento();
		MomentoManager.get().addMomento(momento);
		logger.info(emp.toString());
		
		logger.info("Updating Designation...");
		emp.setEmpDesignation("Looser");
		momento = emp.saveToMomento();
		MomentoManager.get().addMomento(momento);
		logger.info(emp.toString());
		
		logger.info("Rolling back changes...");
		emp.recoverFromMomento(MomentoManager.get().getLatestMomento());
		emp.recoverFromMomento(MomentoManager.get().getLatestMomento());
		logger.info(emp.toString());
		assertThat(emp, is(new EmpOriginator(100, "Rocky", "9999", "Champion")));
	}

}
