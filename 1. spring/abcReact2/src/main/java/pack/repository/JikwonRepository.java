package pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pack.entity.Jikwon;

public interface JikwonRepository extends JpaRepository<Jikwon, Integer>{

	@Query("SELECT j FROM Jikwon j JOIN j.buser b WHERE b.busername = ?1 ")
	List<Jikwon> getJikwonWithBusername(String busername);
}
