package ma.enset.customerservice.repository;

import ma.enset.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //pour exposer le web service restfull qui permet de gerer les customers
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
