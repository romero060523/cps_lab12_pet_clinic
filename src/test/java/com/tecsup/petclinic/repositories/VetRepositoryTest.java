package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Vet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class VetRepositoryTest {

    @Autowired
    private TestEntityManager em;

    @Test
    public void testFindExistingVetFromDataSql() {
        // data.sql inserts a vet with id=1, first_name='James'
        Vet found = em.find(Vet.class, 1);
        assertThat(found).isNotNull();
        assertThat(found.getFirstName()).isEqualTo("James");
        assertThat(found.getLastName()).isEqualTo("Carter");
    }
}
