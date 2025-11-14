package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Vet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class VetRepositoryTest {

    @Autowired
    private TestEntityManager em;

    @Autowired
    private VetRepository vetRepository;

    @Test
    public void testFindExistingVetFromDataSql() {
        // data.sql inserts a vet with id=1, first_name='James'
        Vet found = em.find(Vet.class, 1);
        assertThat(found).isNotNull();
        assertThat(found.getFirstName()).isEqualTo("James");
        assertThat(found.getLastName()).isEqualTo("Carter");
    }

    @Test
    public void testFindByFirstNameUsingRepository() {
        // Using the repository method
        List<Vet> vets = vetRepository.findByFirstName("James");
        assertThat(vets).isNotEmpty();
        Vet v = vets.get(0);
        assertThat(v.getLastName()).isEqualTo("Carter");
    }

}
