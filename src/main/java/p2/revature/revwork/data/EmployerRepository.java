package p2.revature.revwork.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import p2.revature.revwork.models.data.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {
	
	public List<Employer> findByName(String username);
	


}
