package custom;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Валерий on 20.07.2016.
 */
public interface PersonRepository extends JpaRepository<Person,Integer>{
    List<Person> findByCompanyNameStartsWithIgnoreCase(String companyName);

}
